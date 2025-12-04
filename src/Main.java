import java.util.*;
abstract class Human{
    String name;
    int age;
    Human(String nm,int ag){    //constructor
        name=nm;
        age=ag;
    }
    abstract void prnt();
}
abstract class Student extends Human{
    String college;
    Student(String nm,int ag,String clg){
        super(nm,ag);
        college=clg;
    }

    void prnt() {
        System.out.println(name+" "+age+" "+college);
    }
}
class Demo extends Student{
  Demo(){
      super("Kamal",22,"LPU");
  }
@Override
  void prnt() {
      System.out.println("Demo class");
  }

}
public class Main {
    public static void main(String[] args) {
       System.out.println("Java Program Started");
       Human obj=new Demo();
       obj.prnt();
    }
}
