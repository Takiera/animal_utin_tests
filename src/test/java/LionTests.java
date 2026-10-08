import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    Lion lion;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самка", feline);
    }

    @Test
    public void shouldThrowExceptionWhenSexIsUnknown() {
        Exception exception = Assert.assertThrows(
                Exception.class,
                () -> new Lion("Неизвестный пол", feline)
        );

        Assert.assertEquals(
                "Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage()
        );
    }

    @Test
    public void shouldReturnCorrectKittensCount() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void shouldReturnCorrectFoodList() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
