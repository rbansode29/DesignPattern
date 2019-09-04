/******************************************************************************
Java 8 - Functional Programming - Parameterizing the behavior

- below is sample program where functional programming concept is explaied.
- strategy Design Pattern = define a family of algorithms, encapsulate each algorithm (called a strategy), and select an algorithm at run-time
- Multiple behaviors, one parameter
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    //normal approch
		Propose l_proposeWithRose = new ProposeWithRose();
		makeMyPropose(l_proposeWithRose);
		
		//approch using lambda
		Propose p = () -> System.out.println("Dear.... this Ring is for you !!!!!!");
		makeMyPropose(p);
		
		//approch using lambda
		makeMyPropose(()->System.out.println("Dear.... this Dark cholate is for you !!!!!!"));
		
	}
	public static void makeMyPropose(Propose p_propose){
	    p_propose.doPropose();
	}
}
