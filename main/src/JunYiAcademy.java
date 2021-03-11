import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JunYiAcademy {
    //均一平台教育基金會工程師遠端筆試
    public static void main(String[] args) {
        //A1-A:
        System.out.println("Reversed String: " + reverseString("junyiacademy"));
        //A1-B:
        System.out.println("Reversed Sentence: " + reverseSentence("flipped class room is important"));
        //A2:
        System.out.println("Removed Multiples and Count: " + removeMultiples(15,3,5).size());

        //Q3: 房間裡有三個袋子...你只能選一個袋子，拿出裡面一支筆，看是鉛筆還是原子筆，然後你要推論出這三 個袋子分別的情況。
        //A3:

    }
    //Q1-A:
    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    //Q1-B:
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i --) {
            stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString();
    }
    //Q2:
    public static List<Integer> removeMultiples(int integer, int multiple1, int multiple2) {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                                      .limit(integer)
                                      .filter(number-> number % multiple1 != 0 && number % multiple2 != 0)
                                      .collect(Collectors.toList());
        numbers.add(integer);
        return numbers;
    }
}
