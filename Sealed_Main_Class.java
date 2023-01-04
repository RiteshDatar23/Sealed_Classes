package Sealed_classes_MainClass;

import java.lang.instrument.ClassDefinition;

import sealed_classes_package.ClassA;
import sealed_classes_package.ClassB;
import sealed_classes_package.ClassC;
import sealed_classes_package.ClassD;
import sealed_classes_package.ClassE;

public class Sealed_Main_Class {

	public static void main(String[] args) {
	System.out.println("*****nonsealed class****");
	 ClassB obj1=new ClassB();
	 obj1.methodA();
	 obj1.display();
	 obj1.methodB();
     System.out.println("*****final Class*****");
	 ClassC obj2=new ClassC();
	 obj2.methodA();
	 obj2.methodC();
	 obj2.display();
	 System.out.println("****sealed Class*****");
	 ClassD obj3 =new ClassD();
	 obj3.methodD();
	 obj3.methodA();
	 obj3.display();
     System.out.println("*****non-sealed Class*****");
	 ClassE obj4=new ClassE();
	 obj4.methodE();
	 obj4.methodD();
	 obj4.display();

	}

}
