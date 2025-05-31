class MyThread implements Runnable{
    public void run(){
    for(int i=1;i<=5;i++){
                    System.out.println(Thread.currentThread().getName() + ": " + i);

        try {
    Thread.sleep(1000);  // pause 1 second
} catch (InterruptedException e) {
    e.printStackTrace();
}

    }
}
}
 public class Multi {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj,"Thread 1");
        Thread t2=new Thread(obj,"Thread 2");
        t1.start();
        t2.start();
        
    }
    
}
