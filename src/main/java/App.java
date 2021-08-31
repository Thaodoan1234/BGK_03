import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng = ");
        int n = sc.nextInt();

        int day, month;
        if (n > 0 && n <13) {
            if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
                System.out.format("Tháng %d có 31 ngày\n", n);
            }
            if (n == 2) {
                System.out.println("Tháng %d có 28 hoặc 29 ngày\n");
            }
            if (n == 4 || n == 6 || n == 9 || n == 11) {
                System.out.format("Tháng %d có 30 ngày\n", n);
            }
        }
        else
            System.out.println("Tháng vừa nhập không hợp lệ\n");
    }

}
