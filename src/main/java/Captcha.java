
public class Captcha {
    private Operand left;
    private Operand right;
    private Operator operator;
    static final int STRING_FIRST_PATTERN = 1;
    static final int STRING_SECOND_PATTERN = 2;

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = OperandFactory.createLeft(pattern, left);
        this.right = OperandFactory.createRight(pattern, right);
        this.operator = new Operator(operator);
    }

    public Operand getLeft() {
        return this.left;
    }

    public Operand getRight() {
        return this.right;
    }

    public Operator getOperator() {
        return this.operator;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getLeft(), getOperator(), getRight());
    }
}

