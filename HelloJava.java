import java.util.*;

public class HelloJava
{
	public static void main( String args[] ){

		System.out.println("hello Java!") ;
		System.out.println(new Date());
		
		DataOnly d = new DataOnly();
		d.i = 5 ;
		d.f = 5.5f;
		d.c = 'c';
		d.b = true;
		d.s = "the string" ;
		System.out.println( d.i + ", " + d.f + ", "+ d.c + ", " + d.b + ", " + d.s) ; 
		System.out.println("The string length is : "+ d.storage(d.s));
	
		StaticTest st1 = new StaticTest();
		StaticTest.i++;
		st1.i++ ;
		System.out.println ("the static i  can  be called by both types : "+ st1.i + " or " + StaticTest.i) ;
	
		StaticFun.incr();
		System.out.println("The Static i of static test is incremented by StaticFun class method incr : "+ StaticTest.i );
	
	}


	
	
}

class DataOnly{
	int i ;
	float f ;
	char c ;
	boolean b ;
	String s ; 
	int storage(String s){
		return (s.length());
	}

}

class StaticFun {

	static void incr (){
		StaticTest.i++ ;
	}

} 

class StaticTest {
	static int i = 47;
}