package sample;


public class Adder {
    double[] vector1 = new double[2];
    double[] vector2 = new double[2];

    public Adder(double value1, double value2, double value3, double value4) {
        this.vector1[0] = value1;
        this.vector1[1] = value2;
        this.vector2[0] = value3;
        this.vector2[1] = value4;
    }

    public double[] calculate(){
        MyThread myThread1 = new MyThread("Thread 1", vector1[0],vector2[0]);
        MyThread myThread2 = new MyThread("Thread 2", vector1[1],vector2[1]);
        myThread1.start();
        myThread2.start();
        double[] vector = new double[2];
        vector[0] = myThread1.calculate();
        vector[1] = myThread2.calculate();
        return vector;
    }
}
