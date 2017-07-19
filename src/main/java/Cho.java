import java.util.Random;

/**
 * Created by prakolkijkanjanapa on 7/19/2017 AD.
 */
public class Cho {
    private Random random;
    public Cho(Random random){
        this.random = random;
    }

    public  int getPattern() {
        return this.random.nextInt(2)+1;
    }

    public int getOperand() {
        return this.random.nextInt(9)+1;
    }

    public int getOperator() {
        return this.random.nextInt(3)+1;
    }
}
