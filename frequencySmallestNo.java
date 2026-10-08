import java.util.*;
public class frequencySmallestNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        int xc=0,yc=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                xc++;
            }if(arr[i]==y){
                yc++;
            }
        }
        if(xc==yc){
            if(x<y){
                System.out.println(x);
            }else{
                System.out.println(y);
            }
        }else if(xc>yc){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
