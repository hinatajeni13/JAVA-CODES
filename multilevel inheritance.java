class mygrandpa{
    void display(){
        System.out.println("my grandfather is a farmer");
    }
}
class mydaddy extends mygrandpa{
    void show(){
        System.out.println("my father is a painter");
    }
}
class me extends mydaddy{
    void display(){
        System.out.println("i am a student");
    }
}
public class inheritance{
    public static void main(String[]args){
        me obj=new me();
        obj.display();
        obj.show();
        obj.display();
    }
}
