package Bronze.Bronze5;
import java.util.Scanner;

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
