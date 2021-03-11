import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JunYiAcademy {

    public static void main(String[] args) {
        System.out.println("Reversed String: " + reverseString("junyiacademy"));
        System.out.println("Reversed Sentence: " + reverseSentence("flipped class room is important"));
        System.out.println("Removed Multiples and Count: " + removeMultiples(15,3,5).size());
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

    public static List<Integer> removeMultiples(int integer, int multiple1, int multiple2) {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                                      .limit(integer)
                                      .filter(number-> number % multiple1 != 0 && number % multiple2 != 0)
                                      .collect(Collectors.toList());
        numbers.add(integer);
        return numbers;
    }
}
