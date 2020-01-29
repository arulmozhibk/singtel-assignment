import com.java.singtel.*;
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
    Parrot parrot=new Parrot();
    /*A.1.4
    * A.1.5
    * A.1.6
    * */
    @Test
    public void parrotDogSing()
    {
        Assert.assertTrue( parrot.sing( "Dog" ));
    }
    @Test
    public void parrotCatSing()
    {
        Assert.assertTrue( parrot.sing( "Cat" ));
    }
    @Test
    public void parrotRoosterSing()
    {
        Assert.assertTrue( parrot.sing( "Rooster" ));
    }
    @Test
    public void parrotDuckSing()
    {
        Assert.assertTrue( parrot.sing( "Duck" ));
    }



}
