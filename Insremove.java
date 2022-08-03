public class Insremove {
	static final int MAX=1000;
	int  top;
	int a[]= new int[MAX];
	
	boolean isEmpty() {
		
		return top<0;
		
	}
	
	public Insremove() {
		top=-1;
	}
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stackis Overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+" Pushed insto stack");
			return true;
		}
	}

	int pop() {
		
		if(top<0) {
			System.out.println("Stack  is UNDERFLOW");
			return 0;
		}
		else {
			int x= a[top--];
			return x;
		}
		
	}
	
	public static void main(String[] args) {
		Insremove s=  new Insremove();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s.pop()+ ":Poped Out from stack");
	}


}