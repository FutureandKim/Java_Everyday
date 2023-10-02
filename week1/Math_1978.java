package week1;
import java.util.*;

public class Math_1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for(int i=0;i<N;i++){

            boolean ifprime = true;
            int num = sc.nextInt();

            if(num==1) //1은 소수가 아님 유의
                cnt--;

            for(int j=2;j*j<=num;j++)
                if(num%j==0){
                    ifprime = false;
                    break;
                }
            if(ifprime)
                cnt++;
                
        }
        System.out.println(cnt);
        sc.close();
    }
}
