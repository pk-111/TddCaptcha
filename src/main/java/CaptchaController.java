/**
 * Created by prakolkijkanjanapa on 7/19/2017 AD.
 */
public class CaptchaController {
    private Cho cho;
    public int pattern = 0;
    public int left = 0;
    public int right = 0;
    public int operator = 0;

    public CaptchaController(Cho cho){
        this.cho = cho;
    }

    public String getCaptcha(){
        this.pattern = this.cho.getPattern();
        this.left = this.cho.getOperand();
        this.operator = this.cho.getOperator();
        this.right = this.cho.getOperand();
        return new Captcha(pattern,left,operator,right).toString();
    }

}
