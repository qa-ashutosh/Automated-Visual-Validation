import base.BaseTests;
import com.applitools.eyes.MatchLevel;
import org.testng.annotations.Test;

public class DynamicTest extends BaseTests {

    @Test
    public void testDynamicContent(){
        driver.get(System.getProperty("site.dynamic.url"));
        eyesManager.getEyes().setMatchLevel(MatchLevel.LAYOUT);
        eyesManager.validateWindow();
    }
}
