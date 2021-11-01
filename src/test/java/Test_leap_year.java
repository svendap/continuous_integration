import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Test_leap_year {
    private final LeapYear leapYear = new LeapYear();

    @Test
    public void year_is_leapyear_when_divisibleBy4_but_not_DivisibleBy100() {
        boolean leap = leapYear.isLeapYear(2004);
        assertTrue(leap);
    }

    @Test
    public void year_is_leapyear_when_divisibleBy4_100_400() {
        boolean leap = leapYear.isLeapYear(2000);
        assertTrue(leap);
    }

    @Test
    public void year_is_not_leapYear_when_not_DivisibleBy4() {
        boolean leap = leapYear.isLeapYear(1997);
        assertFalse(leap);
    }

    @Test
    public void year_is_not_leapyear_when_divisibleBy4_and_100_but_not_400() {
        boolean leap = leapYear.isLeapYear(2000);
        assertFalse(leap);
    }
}
