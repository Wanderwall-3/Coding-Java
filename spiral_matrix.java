package zoho;       //SUCCESSES MY UNIQ SOLUTION FOR SPIRAL MATRIX
                    //TIME COMPLEXCITY IS "O(N)"
import java.util.*;
public class spiral_matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12}
                };
        List<Integer> a1=new ArrayList<>();             //USING LIST ARRAY TO OMIT SOME ERROR
        int s=0;
        int e=(a.length-1)/2;                           //THE ENDING OF THE WHILE LOOP
        while(s<=e){                                    //WE RETURN THE FOR LOOP FOR TRAVERSE ALL THE SIDES IN MATRIX
            for(int i=s;i<a[0].length;i++){
                if(i>s-1 && i<a[0].length-s){
                a1.add(a[s][i]);
                }
            }
            for(int i=s+1;i<a.length;i++){
                if(i>s-1 && i<a.length-s){
                a1.add(a[i][(a[0].length-1)-s]);
                }
            }
            for(int i=a[0].length-2-s;i>=s;i--){
                if(i>s-1 && i<a[0].length-s){
                a1.add(a[(a.length-1)-s][i]);
                }
            }
            for(int i=(a.length-2)-s;i>s;i--){
                if(i>s-1 && i<a[0].length-s){
                a1.add(a[i][s]);
                }
            }
            s++;
        }
        for(int i=0;i<a.length*a[0].length;i++){
            System.out.print(a1.get(i)+" ");
        }
        sc.close();
    }
}
