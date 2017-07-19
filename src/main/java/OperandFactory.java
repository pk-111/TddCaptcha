/**
 * Created by kei on 7/18/2017.
 */
public class OperandFactory {
    public static Operand createLeft(int pattern, int value) {
        if(pattern == 2)
            return new NumberOperand(value);
        return new StringOperand(value);
    }

    public static Operand createRight(int pattern, int value) {
        if(pattern == 2)
            return new StringOperand(value);
        return new NumberOperand(value);
    }

}
