package sealed_classes_package;

public sealed class ClassA permits ClassB,ClassC,ClassD{
 public void methodA()
{
	 System.out.println("====PClass methodA()====");
	 }
}
