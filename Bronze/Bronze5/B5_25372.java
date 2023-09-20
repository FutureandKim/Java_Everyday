package Bronze.Bronze5;
import java.util.Scanner;

public class B5_25372 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String pw = sc.nextLine();
        
        while(N>0){
            pw = sc.nextLine();
            if(pw.length()>=6 && pw.length()<=9)
                System.out.println("yes");
            else
                System.out.println("no");
            N--;
        }
        sc.close();
    }
}
