import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private String ownerName;
    private String expected;

    public AccountTest (String ownerName, String expected) {

        this.ownerName = ownerName;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][] {
                { "Ти", "false"},
                { " Тимоти Шаламе", "false"},
                { "Тимоти Шаламе ", "false"},
                { "Тимоти  Шаламе", "false"},
                { "ТимотиШаламе", "false"},
                { "Тимоти Шаламеeeeeeee", "false"},
                { null, "false"},
                { "", "false"},
                { "Т и", "true"},
                { "Тимоти Шаламеeeeeee", "true"},
                { "Тимоти Шаламе", "true"},
        };
    }

    @Test
    public void checkNameToEmboss() {

        Account account = new Account(ownerName);
        String actual = String.valueOf(account.checkNameToEmboss());
        assertEquals(expected, actual);

    }
}