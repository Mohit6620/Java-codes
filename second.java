public class second { 
    public static void main(String[] args) {
        bank obj=new bank();
        obj.credit();//withouth parrameters

        rectangle rec=new rectangle();
        rec.area(10,20);//parameterized 
        rec.perimeter(12.2,14.2 );

        student sc=new student();
        sc.details(1,"ram" , "mca");
        sc.average(76,83,59);

        //data hiding
        hiding h1=new hiding();
        h1.setone(40); //setting one value
        h1.settwo(50);//setting two value 
        h1.add();

    
    }    
}
class bank {
    int total_balance=4000;
    void credit(){
        System.out.println("your total balance is "+total_balance);
        int credit_amount=500;
         int total=total_balance+credit_amount;
        System.out.println("your total balance  after credit is  "+total);

    }    
}
class rectangle {
    double length;
    double breadth;

    double area(double length,double breadth){
        double x=length*breadth;
        System.out.println("area of rectangle is"+x);
        return x;
    }
    double perimeter (double length,double breadth){
        double y=2*(length+breadth);
        System.out.println("perimeter  of rectangle is"+y);
        return y;
    }
}
class student {
        int roll;
        String name;
        String Course;
        double m1,m2,m3;

    void details(int roll,String name,String course){
        System.out.println("your roll  is"+roll);
        System.out.println("your name  is"+name);
        System.out.println("your course  is"+course);
    }

    double average (double m1,double m2,double m3){
        double avg=(m1+m2+m3)/3;
        System.out.println("your average score  is"+avg);

        return avg;
    }
}    
//Data hiding - means allow access only those date on which user needed 
class hiding {
    private int one;
    private int two;
    
    //just another way to passing the date in the method 
    int getone (){  //this method allows us to read the property 
        return one;
    }
    void setone (int o){ //this set method allows us to write the property   
    one =o;  // when we use this two methods with the same properties then we can read and write the given value 
    }
    int gettwo (){
        return two;
    }
    void settwo (int t){
    two=t;
    }
    int add(){
        int cal=one+two;
        System.out.println(cal);
        return one+two;
    }
} 
// CONSTRUCTOR 