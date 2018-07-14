
public class RelOperators {
public static int myNumberA = 1;
public static int myNumberB = 1;
	public static void main(String[] args) {
		
		if(myNumberA > myNumberB) {
			System.out.println(myNumberA + " est plus grand que " + myNumberB);
		}
		else if(myNumberA < myNumberB) { 
			System.out.println(myNumberA + " est plus petit que " + myNumberB);
		}
		else {
			System.out.println(myNumberA + " est égale à " + myNumberB);
		}
	}

}
