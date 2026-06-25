import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTests {
    private final String sex;
    private final boolean expectedMane;

    public LionParameterizedTests(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }
    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void shouldCreateLionWithCorrectMane() throws Exception{
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(expectedMane, lion.doesHaveMane());
    }
}
