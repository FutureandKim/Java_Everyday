package Bronze.Bronze5;
import java.util.Scanner;

public class B5_11021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = 1;

        while(n<=T){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + n + ": " +(A+B));
            n++;
        }
        sc.close();
    }
}
