package sealed_classes_package;

public non-sealed class ClassB extends ClassA  implements Itest{
   public void methodB() {
	   System.out.println("=====methodB()====");
   }
   public void display() {
	   System.out.println("====Itest()====");
   }
}
