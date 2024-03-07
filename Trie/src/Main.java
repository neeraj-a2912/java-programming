public class Main {
    public static void main(String[] args) {
        Trie tr = new Trie();
        String[] words = {"the", "a", "there", "their", "any"};
        for(int i=0; i<words.length; i++){
            tr.insert(words[i]);
        }
        System.out.println(tr.search("the")); // true
        System.out.println(tr.search("teir")); // false
        System.out.println(tr.search("their")); // true
    }
}