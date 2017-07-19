import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CaptchaTest {
    @Test
    @Parameters({
            "1,1,1,9,   One + 9",
            "2,8,3,3,   8 - Three"
    })
    public void itShouldBeOnePlus9(int pattern, int left, int operator, int right, String expected) {
        Captcha captcha = new Captcha(pattern, left, operator, right);
        Assert.assertEquals(expected, captcha.toString());
    }
}
