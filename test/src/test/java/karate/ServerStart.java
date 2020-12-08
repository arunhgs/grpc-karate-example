package karate;

import com.grpcsample.passbook.PassbookApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ServerStart {

    private static final Logger logger = LoggerFactory.getLogger(ServerStart.class);

    private MonitorThread monitor;

    public void start(String[] args) throws IOException, InterruptedException {
        PassbookApplication.main(args);
        logger.warn("Started server on port...");
        monitor = new MonitorThread(50051);
        monitor.start();
        monitor.join();
    }

    @Test
    public void startServer() throws Exception {
        start(new String[]{"test"});
    }
}

