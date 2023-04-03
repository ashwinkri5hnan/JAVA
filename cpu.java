import java.util.Scanner;

class Cpu{
	double price;
	String name;
	Cpu(int p,String na){
		this.price=p;
		this.name=na;
	}
	
	class Processor{
		int nocores;
		String manufacturor;
		Processor(int n,String m)
		{
			this.nocores=n;
			this.manufacturor=m;		
		}	
	}
	
	protected class Ram{
		String manufacturer;
		Ram(String m)
		{
			this.manufacturer=m;		
		}	
	}
	
	public static void main(String[] args){
	Cpu a=new Cpu(5000,"HAHA");
	Cpu.Processor pro=a.new Processor(8,"HAHAUHU");
	Cpu.Ram r=a.new Ram("KOO");
	System.out.println("The name of the cpu is: "+a.name+" and the price of the cpu is: "+a.price);
	System.out.println("The processor has "+pro.nocores+" and is manufactured by "+pro.manufacturor);
	System.out.println("The ram is manufactured by:"+r.manufacturer);
	}
}
