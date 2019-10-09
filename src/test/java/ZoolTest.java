import chapter4.ZoolMethod;
import org.junit.Assert;
import org.junit.Test;

public class ZoolTest {
    ZoolMethod zool = new ZoolMethod();
    @Test
    public void zoolTest(){
        //given
        int  num = 11;
        String one = "Snow";
        String two = "Calle principal";

        //when
        zool.zool(num,one,two);
        //then
        Assert.assertEquals(num , zool);

    }

}
