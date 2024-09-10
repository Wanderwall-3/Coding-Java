package day2;   //not completed
import java.util.*;
public class combination_using_bit_manipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sl=s.length();
        int r=(1<<sl);
        for(int i=1;i<r;i++){                //IT WORKS ONLY Z POWER N -1 FOR PRINT ALL THE COMBINATIONS.
            int w=i;
            for(int j=0;j<sl;j++){
                if((1&(w>>j))==1){            //iDENTIFY THE ONE BIT AND PRINT THAT PARTICULAR CHARACTER CORREPONDING TO IT.
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
