//types of inheritance
// Single Inheritance
// Multilevel Inheritance
// Hierarchical Inheritance
// Multiple Inheritance
//Hybrid Inheritance
public class third {
    public static void main(String[] args) {
        apple a1=new apple();
        a1.single();
        a1.original();
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
class kashmir_apple extends apple {
    void multi (){
        System.out.println("this is multi level  inheritance");// also example of hiearchical level 

    }
}
class shimla_apple extends apple {
    void multi (){
        System.out.println("this is Hierarchical level  inheritance"); // two or more class extending from  a single class

    }
}
// in multiple inheritance a single class is extended by two or more classes
// in hybrid inheritance "A" class is extended by another  "B" class and "B" is extended by "C"and "C" is extended by "A" 
