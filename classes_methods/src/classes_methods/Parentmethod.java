package classes_methods;

public class Parentmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("testing header of the page");

		Childmethod m = new Childmethod();
		m.Headervalidation();

		Childmethod.Footervalidation();
		
//		Childmethod.Headervalidation();

	}

}
