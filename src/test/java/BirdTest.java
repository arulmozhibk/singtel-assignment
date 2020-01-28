import com.java.singtel.Bird;
import com.java.singtel.Chicken;
import com.java.singtel.Duck;
import com.java.singtel.Rooster;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    Bird bird=new Bird();
    Bird duck =  new Duck();
    Bird chicken =  new Chicken();
    Rooster rooster =  new Rooster();
    @Test
    public void birdSing(){
        Assert.assertTrue(bird.sing());
    }
    /*A.1.2*/
    @Test
    public void duckSing()
    {
        Assert.assertTrue(duck.sing());
    }
    @Test
    public void duckSwim()
    {
        Assert.assertTrue(duck.swim());
    }
    @Test
    public void chickenSing()
    {
        Assert.assertTrue(chicken.sing());
    }
    @Test
    public void chickenFly()
    {
        Assert.assertFalse(chicken.fly());
    }
/*A.1.3*/
    @Test
    public void roosterSing()
    {
        Assert.assertTrue(rooster.sing());
    }
    @Test
    public void roosterFly()
    {
        Assert.assertFalse(rooster.fly());
    }



}
