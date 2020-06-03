package pack1;

public abstract class AbstractComplex<T extends Number> extends Number {
    public abstract T addFunc(T number1, T number2);
    public abstract T subFunc(T number1, T number2);
    public abstract T mulFunc(T number1, T number2);
    public abstract T divFunc(T number1, T number2);
}
