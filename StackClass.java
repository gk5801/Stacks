package Stack;
import java.util.*; //mandatory for Stack class

public class StackClass
{
	public static void main(String args[])
	{
         Stack<Integer> s = new Stack<>();
         System.out.println(s.isEmpty( ));
         s.push(10);
         s.push(20);
         s.push(30);
         s.push(40);
         s.push(50);
         
         System.out.println(s);
	   
         s.pop();
         s.pop();
         
         System.out.println(s);
         System.out.println(s.isEmpty());
         System.out.println();
         
         Stack<Character> s1 = new Stack();
         System.out.println(s1.isEmpty( ));
         s1.push('a');
         s1.push('b');
         s1.push('c');
         s1.push('d');
         s1.push('e');
         
         System.out.println(s1);
	   
         s1.pop();
         s1.pop();
         
         System.out.println(s1);
         System.out.println(s1.isEmpty());
         System.out.println();
         
    //     Stack<Node> s2 = new Stack();
         Stack<String> s2 = new Stack();
         System.out.println(s2.isEmpty( ));
         s2.push("Hey");
         s2.push("Ok");
         s2.push("c u");
         s2.push("bye");
         s2.push("tata");
         
         System.out.println(s2);
	   
         s2.pop();
         s2.pop();
         
         System.out.println(s2);
         System.out.println(s2.isEmpty());
	}   
}
