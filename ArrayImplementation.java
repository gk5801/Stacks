package Stack;
class MyStack
{
	int top = -1;
	final int size = 10;
	int arr[] = new int[size];
	boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	}
	int peek()
	{
		if(this.isEmpty())
		{		
			System.out.println("Stack is Empty! ");
			return -1;
		}
		return arr[top];
	}
	void push(int data)
	{
	    if(top == size-1) 
			System.out.println("Overflow, couldn't push !");
	//	top = top + 1;
	//	arr[top] = data; OR :-
		arr[++top] = data;
		System.out.println(arr[top]);
	}
	int pop()
	{
	//	if(top==-1)  OR
		if(this.isEmpty())
		{
			System.out.print("Underflow,couldn't delete! ");
			return -1;
		}
		return arr[top--];
	}
}
public class ArrayImplementation 
{
   public static void main(String args[])
   {
	   MyStack s = new MyStack();
	   System.out.println(s.isEmpty());
	   s.push(5);
	   s.push(10);
	   System.out.println(s.isEmpty());
	   System.out.println("Top = " + s.peek());
	   System.out.println("Value popped = " + s.pop());
	   System.out.println("Top = " + s.peek());
   }
}
