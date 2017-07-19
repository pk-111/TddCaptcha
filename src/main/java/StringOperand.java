/**
 * Created by kei on 7/18/2017.
 */
public class StringOperand extends Operand {
    private String[] numberString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public StringOperand(int operand) {
        super(operand);
    }
    public String toString() {
        return numberString[super.operand -1];
    }
}
