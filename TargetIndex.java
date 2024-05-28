import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TargetIndex {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        System.out.print("Enter the value to target : ");
        int target = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target || arr[i] > target) {
                System.out.println("Target index : " + i);
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Target index : " + arr.length);
            }
        }
    }
}
