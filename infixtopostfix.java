package Stack;
import java.util.Scanner;
import java.util.Stack;
public class InfixToPostfix 
{
	public static void main(String args[])
	{
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	       System.out.println(InfixToPostfixUtil(str));
	}
    static String InfixToPostfixUtil(String s)
    {
    	String res = "";
    	Stack<Character> st = new Stack<>(); 
    	 for(int i=0;i<s.length();i++)
    	 {
    		    	char ch = s.charAt(i);
                    if(Character.isDigit(ch))
    	            {
    	                	res = res + ch;
    	            }
                   else
                   {
                    	  while(!st.isEmpty()  &&  prec(st.peek()) >= prec(ch))
                         {
                        	    res = res + st.pop();	
                         }
                    	  st.push(ch);
                  }
    	 }
        while(!st.isEmpty())
        {
             	   res = res + st.pop();
        }
        return res;
    }
    static int prec(char c)
    {
    	if(c == '+' || c == '-')
    		return 1;
    	if(c == '/' || c == '*')
    		return 2; 	
    	return 0;
    }
}