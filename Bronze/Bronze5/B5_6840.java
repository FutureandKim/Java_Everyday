package Bronze.Bronze5;
import java.util.*;

public class B5_6840 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(1));
        sc.close();
    }
}
