import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the marks of science,maths,English,physics and chemistry(each subject out of 100):");
        int [] array=new int [5];
        for(int i=0;i<5;i++)
        {
            
            array[i]=read.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("The sum of marks is:"+sum);
        System.out.println("The total percentage is:"+(0.2*sum)+"%");
        
    }
}