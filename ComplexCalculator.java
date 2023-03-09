package Application;
import java.util.*;

public class ComplexCalculator {

	public static void main(String[] argss) {
		System.out.println("Hello"+" enter ");
//		 String input ="1 fish 2 fish 3 fish 4";
		 Scanner sc = new Scanner(System.in).useDelimiter("\\sfish\\s ");
		 System.out.println(sc.nextInt()+" "+sc.nextInt()+" "+sc.nextInt()+" "+sc.nextInt());
		 sc.close();
//		 System.out.println(sc.next());
//		 System.out.println(sc.next());
//		 System.out.println(sc.next());

}}
