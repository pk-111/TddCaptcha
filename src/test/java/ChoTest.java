import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by prakolkijkanjanapa on 7/19/2017 AD.
 */
public class ChoTest {
    @Test
    public void verifyThatNextIntHasBeenCalledOnceInGetPatternWithParameterEqualTo2() {
        //Arrange
        SpyRandom jason = new SpyRandom();
        Cho cho = new Cho(jason);
        //Act
        cho.getPattern();
        //Assert
        Assert.assertTrue(jason.verifyThatNextIntHasBeenCalledOnceWithParameterEqualTo2());

    }

    @Test
    public void verifyThatNextIntHasBeenCalledOnceInGetOperandWithParameterEqualTo9(){
        //Arrange
        SpyRandom jason = new SpyRandom();
        Cho cho = new Cho(jason);
        //Act
        cho.getOperand();
        //Assert
        Assert.assertTrue(jason.verifyThatNextIntHasBeenCalledOnceInGetOperandWithParameterEqualTo9());

    }
    @Test
    public void verifyThatNextIntHasBeenCalledOnceInGetOperatorWithParameterEqualTo3(){
        //Arrange
        SpyRandom jason = new SpyRandom();
        Cho cho = new Cho(jason);
        //Act
        cho.getOperator();
        //Assert
        Assert.assertTrue(jason.verifyThatNextIntHasBeenCalledOnceInGetOperatorWithParameterEqualTo3());

    }




    class SpyRandom extends Random{
        int signal = 0;
        int bound = 0;
        public int nextInt(int bound){
            this.signal++;
            this.bound = bound;
            return 0;
        }

        public boolean verifyThatNextIntHasBeenCalledOnceWithParameterEqualTo2(){
            return signal==1 && bound==2;
        }

        public boolean verifyThatNextIntHasBeenCalledOnceInGetOperandWithParameterEqualTo9() {
            return signal==1 && bound==9;
        }

        public boolean verifyThatNextIntHasBeenCalledOnceInGetOperatorWithParameterEqualTo3(){
            return signal==1 && bound==3;
        }
    }
}
