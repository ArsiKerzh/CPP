package sample;

public class MyThread extends Thread {
    private double number1;
    private double number2;

    public MyThread(String name, double number1, double number2) {
        super(name);
        this.number1=number1;
        this.number2=number2;
    }


    public void run(){
        System.out.printf("%s started...\n", Thread.currentThread().getName());
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.err.printf("%s was interrupted..\n", Thread.currentThread().getName());
        }
        System.out.printf("%s finished..\n", Thread.currentThread().getName());
    }

    double calculate(){
        return number1+number2;
    }
}
