class parent{
    void display(){
    System.out.println("this is the parent");
}
}
class child extends parent{
    void show(){
        System.out.println("this is the child class");
    }
}
public class inheritance{
    public static void main(String[] args){
        child obj=new child();
        obj.display();
        obj.show();
    }
}
