import java.util.Scanner;

public class PascalTriangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter R : ");
        int r = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();
        if(c > r) {
            System.out.println("Invalid input. C should be less than or equal to R");
            return;
        }
        int[][] pascalTriangle = new int[r][];
        for (int i = 0; i < r; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        System.out.println("Pascal Triangle element at (" + r + ", " + c + ") : " + pascalTriangle[r - 1][c - 1]);
    }
}