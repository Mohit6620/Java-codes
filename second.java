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
    
