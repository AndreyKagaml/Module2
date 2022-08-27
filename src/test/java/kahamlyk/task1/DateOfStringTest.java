package kahamlyk.task1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DateOfStringTest {

    @Test
    public void outputDate() {
        List<String> inputDates = new ArrayList<>();
        DateOfString.fillOutList(inputDates);
        List<String> actual = DateOfString.outputDate(inputDates);
        List<String> expected = List.of("20220812", "20220812", "20220812", "20200523", "20200802");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void formatDate() {
     String actual = DateOfString.formatDate("2022/08/12");
     String expected = "2022-08-12";
     Assert.assertEquals(expected, actual);
    }
}