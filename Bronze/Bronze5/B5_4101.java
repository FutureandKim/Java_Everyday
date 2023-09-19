package Bronze.Bronze5;
import java.util.Scanner;

// 첫 번째 수가 두번째 수보다 큰지 구하는 프로그램
// 0 0이 들어오면 종료

public class B5_4101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a!=0 && b!=0){
            if(a>b)
                System.out.println("Yes");
            else
                System.out.println("No");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        sc.close();
    }
}
