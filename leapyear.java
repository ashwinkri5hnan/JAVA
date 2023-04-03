import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the starting and ending year");
        int start=read.nextInt();
        int end=read.nextInt();
        System.out.println("The leap years are: ");
        for(int i=start;i<=end;i++){
            if((i%400==0 && i%100==0)||(i%4==0 && i%100!=0)){
                System.out.println(i);
            }
        }
    }   
}