//types of inheritance
// Single Inheritance
// Multilevel Inheritance
// Hierarchical Inheritance
// Multiple Inheritance
//Hybrid Inheritance
public class third {
    public static void main(String[] args) {
        apple a1=new apple();
        System.out.println("Calling fruit class into apple"a1.single());

    }
}
class fruit {
    void original (){
        System.out.println("this is the first fruit class ");
    }
}
class apple extends fruit  {
    void single (){
        System.out.println("this is single level inheritance");
    }
}
