package Bronze.Bronze5;
import java.util.Scanner;

public class B5_26545 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            int b = sc.nextInt();
            a += b;
        }
        System.out.println(a);
        sc.close();
    }   
}
