import java.util.*;
public class prime {
    Scanner s = new Scanner(System.in);
    int arr[], n;

    void input() {
        System.out.print("Enter Array Size : ");
        n = s.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array Element : ");
            arr[i] = s.nextInt();
        }
    }

    void calculate() {
        System.out.println("Prime numbers are :");

        for (int i = 0; i < n; i++) {
            int count = 0;

            if (arr[i] < 2)
                continue;

            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(arr[i]);
            }   
           }
    }

    public static void main(String args[]) {
        prime ob = new prime();
        ob.input();
        ob.calculate();
    }
}
