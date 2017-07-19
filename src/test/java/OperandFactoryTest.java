import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kei on 7/18/2017.
 */
public class OperandFactoryTest {
    @Test
    public void firstPatternLeftShouldBeStringOperand(){
        Assert.assertTrue(OperandFactory.createLeft(1,1) instanceof  StringOperand);
    }

    @Test
    public void secondPatternLeftShouldBeNumberOperand(){
        Assert.assertTrue(OperandFactory.createLeft(2,1) instanceof  NumberOperand);
    }
    @Test
    public void firstPatternRightShouldBeNumberOperand(){
        Assert.assertTrue(OperandFactory.createRight(1,1) instanceof NumberOperand);
    }
    @Test
    public void secondPatternRightShouldBeStringOperand(){
        Assert.assertTrue(OperandFactory.createRight(2,1) instanceof StringOperand);
    }
}
