import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class KthLargestElement {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        System.out.print("Enter the value of k : ");
        int k = Integer.parseInt(bufferedReader.readLine());
        KthLargestElement kthLargestElement = new KthLargestElement();
        System.out.println(kthLargestElement.findKthLargest(h, k));
    }
    int findKthLargest(List<Integer> nums, int k) {
        Set<Integer> set = new LinkedHashSet<>(nums);
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(list.size() - k);
    }
}