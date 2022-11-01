import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n;
        int i;
        int sum4=1;
        int sum5=1;
        int total=0;
        System.out.print("Input a number : ");
        n=input.nextInt();
        System.out.println(sum4);

        do{
            for(i=0;n>=sum4&&n>=sum5;i++)
            {sum4*=4;
            if(sum4<=n){
            System.out.println(sum4);}
            sum5*=5;
            if(sum5<=n){
            System.out.println(sum5);}                
            total=sum4+sum5;}
        }
            while(n>=sum4&&n>=sum5);
        
            System.out.println("\nSum of Forces : "+total);
                        
        
    }
    
}
