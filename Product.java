import java.util.Scanner;
class Product{
	String pcode;
	String pname;
	int price;
	Product(String a,String b,int c)
	{
		pcode=a;
		pname=b;
		price=c;
	}
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the code,name and price of the first product:");
		String a=read.next();
		String b=read.next();
		int c=read.nextInt();
		Product product1=new Product(a,b,c);
		System.out.println("Enter the code,name and price of the second product:");
		String d=read.next();
		String e=read.next();
		int f=read.nextInt();
		Product product2=new Product(d,e,f);
		System.out.println("Enter the code,name and price of the third product:");
		String g=read.next();
		String h=read.next();
		int i=read.nextInt();
		Product product3=new Product(g,h,i);
		if(product1.price>product2.price && product1.price>product3.price)
		{
			System.out.println("The price of the first product is greater.");
		}
		else if(product2.price>product1.price && product2.price>product3.price)
		{
			System.out.println("The price of the second product is greater.");
		}
		else
		{
			System.out.println("The price of the third product is greater.");		
		}
		
	}
		
}

