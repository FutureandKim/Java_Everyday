package week1;
import java.util.*;

//DFS(깊이우선탐색)
public class Math_15649 {

    public static boolean[] visit;
    public static int[] arr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        visit = new boolean[N];
        arr = new int[M];

        dfs(N,M,0);
        sc.close();
        
    }

    public static void dfs(int N, int M, int depth){
        if(depth == M){
            for(int val:arr){
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }
        for(int i =0;i<N;i++){
            if(visit[i]==false){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(N, M, depth+1);
                
                visit[i] = false;
            }
        }
    }
}
