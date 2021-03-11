public class JunYiAcademy {
    public static void main(String[] args) {
        System.out.println("Reversed String: " + reverseString("junyiacademy"));
        System.out.println("Reversed Sentence: " + reverseSentence("flipped class room is important"));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i --) {
            stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}
