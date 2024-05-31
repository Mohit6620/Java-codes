
public class first {
    public static void main(String[] args) {
        engineer e1=new engineer();
        System.out.println("benfits are"+e1.benfits);
        
    }
    
}
class employee{
    int salary=60000;
}
class engineer extends employee{
    int benfits=10000;
}