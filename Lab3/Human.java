package pack1;

public class Human {
    private String name;

    public void setName(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void calculateExpression(){
        Expression expression = new Expression();
        //expression.calculate();
    }
}
