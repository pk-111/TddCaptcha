/**
 * Created by kei on 7/18/2017.
 */
public class Operator {
    private int operator;

    public Operator(int operator) {
        this.operator = operator;
    }

    public String toString() {
        if (operator == 2)
            return "*";
        if (operator==3)
            return "-";
        return "+";

    }
}
