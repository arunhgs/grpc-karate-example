package karate;

//import com.grpcsample.passbook.PassbookApplication;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(classes = PassbookApplication.class)
public class KarateRunner {

    //
    //
    // @Test
    public void contextLoads() throws Exception {
        System.out.println("Hello.....");
    }

    //@Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }


}
