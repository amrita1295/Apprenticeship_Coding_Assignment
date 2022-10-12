import java.util.ArrayList;
import java.util.Scanner;

public class Combination {
    public static void addOperators(ArrayList<String>result, String nums, String t, long l, long m, int target)
    {
        if(nums.length()==0)
        {
            if(m==target)
            result.add(t);
            return;
        }
        for(int i=1;i<=nums.length();i++)
        {
            String num=nums.substring(0, i);
            if(num.length()>1 && num.charAt(0)=='0')
            return; 
            String nextnum=nums.substring(i);
            if(t.length()>0)
            {
                addOperators(result, nextnum, t + "+" + num, Long.parseLong(num),m+ Long.parseLong(num),target);
                addOperators(result, nextnum, t + "-" + num, -Long.parseLong(num),m- Long.parseLong(num),target);
            }
            else{
                addOperators(result, nextnum, num, Long.parseLong(num),Long.parseLong(num),target);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();         //123456789"
        System.out.println("Enter the target:");
        int target=sc.nextInt();         //100
        ArrayList<String>ans=new ArrayList<>();
        addOperators(ans, s, "", 0, 0, target);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
        sc.close();
    }
}
