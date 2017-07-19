/**
 * Created by kei on 7/18/2017.
 */
public class NumberOperand extends Operand{
    public NumberOperand(int number) {
        super(number);
    }
    public String toString(){
        return String.valueOf(super.operand);
    }
}
