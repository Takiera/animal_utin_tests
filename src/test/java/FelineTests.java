import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTests {

    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }


    @Test
    public void shouldReturnCorrectFoodList() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void shouldReturnCorrectFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void shouldReturnCorrectKittensCountWithArguments() {
        Assert.assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void shouldReturnCorrectKittensCountWithNoArguments() {
        Assert.assertEquals(1, feline.getKittens());
    }
}
