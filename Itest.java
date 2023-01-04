package sealed_classes_package;

public sealed interface Itest permits ClassB,ClassC,ClassD{
 public abstract void display();
}
