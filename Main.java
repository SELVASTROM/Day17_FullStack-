import java.util.*;
 interface Vechicle{
    void StartEngine();
}
 class car implements Vechicle {
    public void StartEngine(){
        System.out.println("The car engine is started!");
    }
}
public class Main {
    public static void main(String[] args) {
        Vechicle v=new car();
        v.StartEngine();
    }
}