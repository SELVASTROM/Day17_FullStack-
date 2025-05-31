interface Mobile{
    void call();
     default void message(){
        System.out.println("Sending the text message..");
     }
     static void BatteryStatus(){
        System.out.println("The Battery percentage is 85 %...");
     }
}
class Smartphone implements Mobile{
    public void call(){
        System.out.println("Calling from smartphone..");
    }
}
public class Usable {
    public static void main(String[] args) {
        Smartphone p=new Smartphone();
        p.call();
        p.message();
        Mobile.BatteryStatus();
    }
    
}
