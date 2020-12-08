package protobuff;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ChannelFactory {

    public static ManagedChannel create(String host, int port) {
        return ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
    }
}
