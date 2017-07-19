import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by prakolkijkanjanapa on 7/19/2017 AD.
 */
public class CaptchaControllerTest {
    @Test
    public void verifyThatGetPatternHasBeenCalledOnce() {
        //Arrange
        Random ran = new Random();
        SpyCho spycho = new SpyCho(ran);
        CaptchaController captchacontroller = new CaptchaController(spycho);
        //Act
        String captcha = captchacontroller.getCaptcha();
        System.out.println(captcha);
        //Assert
        Assert.assertTrue(spycho.verifyThatGetPatternHasBeenCalledOnce());
    }

    @Test
    public void verifyThatGetOperandHasBeenCalledTwice() {
        //Arrange
        Random ran = new Random();
        SpyCho spycho = new SpyCho(ran);
        CaptchaController captchacontroller = new CaptchaController(spycho);
        //Act
        String captcha = captchacontroller.getCaptcha();
        System.out.println(captcha);
        //Assert
        Assert.assertTrue(spycho.verifyThatGetOperandHasBeenCalledTwice());
    }

    @Test
    public void verifyThatGetOperatorHasBeenCalledOnce() {
        //Arrange
        Random ran = new Random();
        SpyCho spycho = new SpyCho(ran);
        CaptchaController captchacontroller = new CaptchaController(spycho);
        //Act
        String captcha = captchacontroller.getCaptcha();
        System.out.println(captcha);
        //Assert
        Assert.assertTrue(spycho.verifyThatGetOperatorHasBeenCalledOnce());
    }

    class SpyCho extends Cho {
        int countPattern = 0;
        int countOperand = 0;
        int countOperator = 0;

        public SpyCho(Random random) {
            super(random);
        }

        public int getPattern()
        {
            countPattern++;
            return 1;
        }
        public int getOperand()
        {
            countOperand++;
            return 1;
        }
        public int getOperator()
        {
            countOperator++;
            return 1;
        }

        public boolean verifyThatGetPatternHasBeenCalledOnce(){
            return countPattern==1;
        }

        public boolean verifyThatGetOperandHasBeenCalledTwice(){
            return countOperand==2;
        }

        public boolean verifyThatGetOperatorHasBeenCalledOnce(){
            return countOperator==1;
        }
    }

}
