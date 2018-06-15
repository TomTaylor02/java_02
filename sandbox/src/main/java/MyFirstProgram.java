public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Yuriy");

    double v = 5;
    System.out.println("Пощадь квадрата со стороной " + v + " = " + area(v));


    double a = 4;
    double b = 6;
		System.out.println("Пощадь прямоугольника со сторонами "+a +" и "+ b +" = " + area(a, b));
  }

	public static void hello (String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

	public static double area(double len) {
    return len * len;
  }

	public static double area(double a, double b) {
    return a * b;
  }
}