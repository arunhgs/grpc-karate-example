package karate.passbook;

import com.intuit.karate.junit5.Karate;
import karate.TestBase;

class PassbookTestRunner extends TestBase {
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}