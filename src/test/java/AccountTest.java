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
                { "Тимоти Шаламеeeeeeeee", "false"},
                { " Тимоти Шаламе", "false"},
                { "Тимоти Шаламе ", "false"},
                { "Тимоти  Шаламе", "false"},
                { "ТимотиШаламе", "false"},
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