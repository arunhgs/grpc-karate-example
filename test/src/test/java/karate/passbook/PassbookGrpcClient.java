package karate.passbook;

import com.google.gson.Gson;
import com.sample.grpcsample.passbookService.PassBookDTO;
import com.sample.grpcsample.passbookService.PassbookRequest;
import com.sample.grpcsample.passbookService.PassbookResponseResponse;
import com.sample.grpcsample.passbookService.PassbookServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PassbookGrpcClient {

    PassbookServiceGrpc.PassbookServiceBlockingStub passbookServiceBlockingStub;

    public static PassbookGrpcClient create(String host, int port){
        return new PassbookGrpcClient(host, port);
    }

    private PassbookGrpcClient(String host, int port){
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress(host, port).usePlaintext().build();
        passbookServiceBlockingStub = PassbookServiceGrpc.newBlockingStub(managedChannel);
    }

    public String getTransactionHistory(String userId){
        System.out.print("Hello " + userId);
        PassbookRequest passbookRequest = PassbookRequest.newBuilder().setUserId(userId).build();
        PassbookResponseResponse passbookResponse =
                this.passbookServiceBlockingStub.getTransactionHistory(passbookRequest);
        return new Gson().toJson(passbookResponse.getPassbookDTOList());
    }

}



