class animal{
    void sound(){
        System.out.println("animal make a sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("cat meows");
    }
}
public class main{
    public static void main(String[] args){
        animal a=new dog();
        a.sound();  
        animal a1=new cat();
        a1.sound();  
    }
}
