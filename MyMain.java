interface Shape{
    void Draw();
}
class Circle implements Shape {
    public void Draw(){
        System.out.println("Drawing Circle...");
    }
} class Rectangle implements Shape{
   public  void Draw(){
        System.out.println("Drawing Rectangle...");
    }
}
class MyMain {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
             s.Draw();

        s=new Rectangle();
        s.Draw();
    }
    
}
