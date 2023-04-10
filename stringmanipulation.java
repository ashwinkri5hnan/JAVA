import java.util.*;

class StringA{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the string.");
        String word=reader.nextLine();
        System.out.println("The length of the entered string is:"+word.length());
        System.out.println("The character at the first position:"+word.charAt(0));
        System.out.println("UPPERCASE:"+word.toUpperCase());
        System.out.println("LOWERCASE:"+word.toLowerCase());
        System.out.println("Enter the characters you want to replace and the character you want to replace with:");
        String ss=reader.nextLine();
        String dd=reader.nextLine();
        System.out.println("Replaced string:"+word.replace(ss,dd));
        StringBuffer str2=new StringBuffer(word);
        System.out.println("Enter the string you want to add to "+str2);
        String h=reader.next();
        System.out.println("The new string is:"+str2.append(h));
        System.out.println("Capacity of the string:"+str2.capacity());
        System.out.println("The reversed string is:"+str2.reverse());
        System.out.println("The concatenated strng is:"+word.concat(h));
    }

}