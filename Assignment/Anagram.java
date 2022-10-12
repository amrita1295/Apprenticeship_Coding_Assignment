import java.util.Scanner;
class Anagram
{
    public static boolean anagram(String s1, String s2)
    {
        if(s1.length() != s2.length())
           return false;

        //by default the array contains all zeroes;
        int frequency[]=new int[26];
        
        
        for(int i=0;i<s1.length();i++)
        {
            //getting the index of the character's count in the array.
            frequency[s1.charAt(i)-'a']+=1;  
        }
        for(int i=0;i<s1.length();i++)
        {
            frequency[s2.charAt(i)-'a']-=1;
        }
        for(int i=0;i<26;i++)
        {
            if(frequency[i] != 0)
                return false;
        }
        return true;

    }

    //main functon created 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first and second string :");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(anagram(s1,s2));
        sc.close();

    }
}
    