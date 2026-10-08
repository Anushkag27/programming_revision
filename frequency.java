import java.util.*;
public class frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] x=new int[t];
        for(int i=0;i<t;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
            if(x[i]>=67 && x[i]<=45000 ){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }

    }
    
}
