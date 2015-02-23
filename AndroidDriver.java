/* created by Thaddeus Albert
  code for the Android.java 
Cmp112 test 1 */ 

public class AndroidDriver {
	public static void main(String[] args) {
		
		Brand samsung = new Brand();
		samsung.model = "S5";
		System.out.println(samsung.toString("S5"));

		Brand lg = new Brand();
		lg.model = "G3";
		System.out.println(lg.toString("G3"));

		Brand blackberry = new Brand();
		blackberry.model = "bold";
		System.out.println(blackberry.toString("bold"));
}
}
 
