interface Printable{
    void print();
}
interface Sannable{
    void scan();
}
class PrintScanner implements Printable,Sannable{
    public void print(){
        System.out.println("Printing Document....");
    }
    public void scan(){
        System.out.println("Scanning Document...");
    }
}
class Multiple {
    public static void main(String[] args) {
        PrintScanner p=new PrintScanner();
        p.print();
        p.scan();
    }

    
}