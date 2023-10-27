import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "banana"};
        List<String> resultList = new ArrayList<>(new HashSet<>(Arrays.asList(array)));
        String mergedString = String.join(" ", resultList);
        System.out.println("Массив после удаления дубликатов: " + resultList);
    }
}