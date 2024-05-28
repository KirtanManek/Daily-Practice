import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrintElementFromArray {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        printElement(arr);
    }
    public static void printElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int threshold = arr.length / 3;
        for (int i : arr) {
            if (count(arr, i) > threshold && !list.contains(i)) {
                list.add(i);
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
    public static int count(int[] arr, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count;
    }
}