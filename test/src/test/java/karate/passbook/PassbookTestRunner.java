package karate.passbook;

import com.intuit.karate.junit5.Karate;

class PassbookTestRunner {
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}