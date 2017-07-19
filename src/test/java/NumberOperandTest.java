import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kei on 7/18/2017.
 */
public class NumberOperandTest {
    @Test
    public void itShouldBe1(){
        NumberOperand numberOperand = new NumberOperand(1);
        Assert.assertEquals("1",numberOperand.toString());
    }
}
