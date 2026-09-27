public class Animal
{ 
String name; 
void show() 
{ 
System.out.println("Animal Name is"+name); 
} 
} 
class Dog extends Animal 
{ 
void bark() 
{ 
System.out.println("Mother Dog Barking..."); 
} 
} 
class BabyDog extends Dog 
{ 
void weep() 
{ 
System.out.println("Baby Dog weeping"); 
} 
} 
