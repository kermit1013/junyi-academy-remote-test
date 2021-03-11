public class JunYiAcademy {
    public static void main(String[] args) {
        System.out.println("Reversed String: " + reverseString("junyiacademy"));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
