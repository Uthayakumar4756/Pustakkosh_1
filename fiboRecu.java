package simple;

public class fiboRecu {

	static int a = 0;
	static int b = 1;
	static int s;
	int n = 30;
	//adding methods
	static void fiboRecu(int n)
	{
		if(n>0){
		s=a+b;
		a=b;
		b=s;
		System.out.print(" "+s);
		fiboRecu(n-1);
		}
	}
	public static void main(String[] args) {

		int n=10;
		System.out.print(a+" "+b);
		fiboRecu(n);
	}

}
