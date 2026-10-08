import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTests {

    Feline feline;
    Cat cat;

    @Before
    public void setUp() {
        feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void catSayMeow (){
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catGetFoodEqualsFelineEatMeat() throws Exception {
        Assert.assertEquals(feline.eatMeat(), cat.getFood());
    }
}
