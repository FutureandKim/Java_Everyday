package Bronze.Bronze5;
import java.util.Scanner;

public class B5_20492 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int get1 = (int)(N*0.78);
        int get2 = (int)(N*0.8 + N*0.2*0.78);
        System.out.println(get1 + " " + get2);
        sc.close();
    }
}
