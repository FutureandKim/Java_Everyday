package week1;
import java.util.*;

public class Math_2609 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gcd(n,m));
        System.out.println(lcm(n,m));
        sc.close();
    }

    static int gcd(int n, int m){
        if(n<m){
            int temp = n;
            n = m;
            m = temp;
        }
        while(m != 0){
            int r = n%m;
            n = m;
            m = r;
        }
        return n;
    }
        
    static int lcm(int n, int m){
        return n*m/gcd(n,m);
    }
}
