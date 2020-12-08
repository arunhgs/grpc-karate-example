package com.grpcsample.passbook;
import com.sample.grpcsample.passbookService.PassbookRequest;

import com.sample.grpcsample.passbookService.PassbookResponseResponse;
import com.sample.grpcsample.passbookService.PassbookServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class PassbookServiceTest {

    //@GrpcClient("passbook-service")
    private PassbookServiceGrpc.PassbookServiceBlockingStub  passbookServiceBlockingStub;

    //@Test
    public void passbookService() throws Exception {

        System.out.println("Hello.....");

        PassbookRequest passbookRequest = PassbookRequest.newBuilder().setUserId("1").build();

        PassbookResponseResponse passbookResponseResponse =
                this.passbookServiceBlockingStub.getTransactionHistory(passbookRequest);
        passbookResponseResponse.getPassbookDTOCount();
        assertNotNull(passbookResponseResponse);
        assertEquals(1,passbookResponseResponse.getPassbookDTOList().size());


    }
}
