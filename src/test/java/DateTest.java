import chapter4.Date;
import org.junit.Test;

public class DateTest {

    @Test
    public void printAmericanTest(){
        //given
        String day = "Friday";
        String month = "December";
        int date = 17;
        int year = 1999;
        //when
        String actual = day + ", " + month + " " + date + ", " + year;
        Date.printAmerican(day,date,month,year);
        //then
       // Assert.assertTrue(chapter4.Date.printAmerican(day, date,month,year), actual);

    }
}
