import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kei on 7/18/2017.
 */
public class StringOperandTest {

    @Test
    public void itShouldBeOne(){
        Operand operand = new StringOperand(1);
        Assert.assertEquals("One", operand.toString());

    }

    @Test
    public void itShouldBeFive(){
        Operand operand = new StringOperand(5);
        Assert.assertEquals("Five", operand.toString());
    }

    @Test
    public void itShouldBeNine(){
        Operand operand = new StringOperand(9);
        Assert.assertEquals("Nine", operand.toString());
    }
}
