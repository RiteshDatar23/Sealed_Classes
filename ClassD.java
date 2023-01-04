package sealed_classes_package;

public sealed class ClassD extends ClassA implements Itest permits ClassE{
    public void methodD() {
    	System.out.println("====methodD====");
    }
    public void display() {
    	System.out.println("====Itest()====");
    }
}
