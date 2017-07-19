import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kei on 7/18/2017.
 */
public class OperatorTest {
    @Test
    public void OperatorShouldBePlus(){
        Operator operator = new Operator(1);
        Assert.assertEquals("+", operator.toString());
    }
    @Test
    public void OperatorShouldBeMultiply(){
        Operator operator = new Operator(2);
        Assert.assertEquals("*",operator.toString());
    }
    @Test
    public void OperatorShouldBeMinus(){
        Operator operator = new Operator(3);
        Assert.assertEquals("-",operator.toString());
    }
}
