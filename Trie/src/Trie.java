public class Trie {
    class Node {
        Node[] children;
        boolean endOfWord;

        Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    Node root = new Node();
    public void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) -  'a';
            if(curr.children[index]==null){
                curr.children[index] = new Node();
            }
            if(i == word.length()-1){
                curr.children[index].endOfWord = true;
            }
            curr = curr.children[index];
        }
    }

    public boolean search(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index]==null){
                return false;
            }
            if(i==word.length()-1 && !curr.children[index].endOfWord){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
}
