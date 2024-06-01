public class first {
    public static void main(String[] args) {
        int a = 20, b = 10, c;
        c = max(a, b);//formal parameters
        System.out.println(c);
        first obj=new first(); //creating object for the class first
        System.out.println(obj.ave(a, b)); // calling method with the object
        int A[]={2,3,4,5,61};
        update(A); //passing object as parameter in the method 
        System.out.println("changed index of a "+A[0]);

        //calling method overloading
        first obj_1=new first();
        System.out.println(obj_1.min(10,20));
        System.out.println(obj_1.min(1.2, 5.02));
        System.out.println(obj_1.min(10,20,30));

        //calculating are of rectangle and circle by using methos overloading
        System.out.println(obj.area(5));
        System.out.println(obj.area(5,12));
        System.out.println(obj.area(5,12,22));

        //calling variable arguments
        show();
        show(1,2,3,5);
       


        
    }
//creating a method and passing it into the main method
    static int max(int x, int y){ //formal parameter
        if (x > y) {
            System.out.println( " greater is ");
            return x;
        } else {
            System.out.println( " greater is ");
            return y;
        }
    }

//another method for finding average withouth making it static method
     int  ave(int x, int y){
        int z=x+y;
        int ans=z/2;
        System.out.print("the averge of two numbers are"+ans);
        return ans;
    }

//passing objects as parrameter 
    static void update(int a[])
    {
        a[0]=25;
    }
    
//METHOD OVERLOADING - write more than one method with the same name but different type of parameters

   int min(int a,int b){
        if (a<b){
            System.out.println(a+"a is less ");
            return a; 
        }else 
        {
            return b;
        }
   }
   double min(double a,double b){
    if (a<b){
        System.out.println(a+"a is less ");
        return a; 
    }else 
    {
        return b;
    }
}
int min(int a,int b,int d){
    if (a<b && a<d){
        System.out.println(a+"a is less ");
        return a; 
    }else if(b<a && b<d)
    {
        System.out.println(b+"a is less ");
        return b;

    }else{
        return d;
    }
}
double area (int a,int b){
    double rect=a*b;
    System.out.println("area of rectangle is ");
    return rect;
}
double area(int a){
    double circle=Math.PI*a*a;
    System.out.println("area of circle is ");
    return circle;
}
double area (int a,int b,int c){
    double rect= 0.5*((a+b)*c);
    System.out.println("area of trapazium is ");
    return rect;
}

//variable arguments  - in this type we can give multiple arguments with no limit
 static void show (int...x){
    for (int i:x){
        System.out.println("values are in argument are "+i);
       
    } 
}

}
//actual parameter will not be modified if the value of formal parameter will change
//contains of actual parameters are copied in formal parameters
//return type is not considering for comparing two methods only name and parameter list is checked 
