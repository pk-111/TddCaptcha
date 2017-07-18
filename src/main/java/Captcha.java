
public class Captcha {
    private int left;
    private int right;
    private int operator;
    private int pattern;
    static final int STRING_FIRST_PATTERN = 1;
    static final int STRING_SECOND_PATTERN = 2;
    private String[] numberString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.pattern = pattern;
    }


    public String getLeft() {
        if (pattern == 1)
            return numberString[this.left - 1];
        if (pattern == 2)
            return String.valueOf(left);
        return "Error: Invalid pattern";
    }


    public String getRight() {
        if (pattern == 1)
            return String.valueOf(right);
        if (pattern == 2)
            return numberString[this.right - 1];
        return "Error: Invalid pattern";
    }

    public String getOperator() {
        String[] operatorString = {"+", "*", "-"};
        return operatorString[this.operator - 1];
    }
}

