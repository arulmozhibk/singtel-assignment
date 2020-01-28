import com.java.singtel.Bird;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
Bird bird=new Bird();

    @Test
    public void sing(){
        Assert.assertTrue(bird.sing());
    }



}
