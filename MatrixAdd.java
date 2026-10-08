import java.util.*;
public class MatrixAdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[] a=new int[n1*m1];

        for(int i=0;i<n1*m1;i++){
            a[i]=sc.nextInt();
        }

        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int[] b=new int[n2*m2];

        for(int i=0;i<n2*m2;i++){
            b[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            System.out.print((a[i]+b[i])+" ");
        }


    }
    
}
