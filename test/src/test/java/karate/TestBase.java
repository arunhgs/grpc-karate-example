package karate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    private static ServerStart server;

    @BeforeAll
    public static void beforeClass() throws Exception {
        if (server == null) {
            server = new ServerStart();
        }
        server.startServer();
    }

    @AfterAll
    public static void afterClass() {

    }
}
