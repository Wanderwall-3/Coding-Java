package day2;   //not completed
import java.util.*;
public class combination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sl=s.length();
        int r=(1<<sl);
        for(int i=1;i<r;i++){
            int w=i;
            for(int j=0;j<sl;j++){
                if((1&(w>>j))==1){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
