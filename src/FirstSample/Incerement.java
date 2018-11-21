package FirstSample;

public class Incerement {

	public static void main(String[] args) {
		int a = 12;
		int b = 10;
		int x = 12 * a++;// in here a = 13 , a incerement  by 1 this is called postfix 
		int m = 6 * ++b;// in here b is = 11 , this is called prefix 
		int y = --a; // not changing 
		int z = b--;// this will be decrement by 1 .
		int w = 1 ;
		w += 4;
		System.out.println(y);
		System.out.println(z);
		System.out.println(x +  m );
		System.out.println(x);
		System.out.println(m);
		System.out.println(w);

	}

}
