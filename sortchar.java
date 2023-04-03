import java.util.*;

class sortstrings{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the string to be sorted");
		String a = read.nextLine();
		String words[]=a.split(" ");
		Arrays.sort(words);
		String space="";
		for(int i=0;i<words.length;i++)
		{
			space+=words[i]+" ";	
		}
		System.out.println(space);
	}
}
