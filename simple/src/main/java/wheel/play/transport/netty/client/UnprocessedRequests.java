package wheel.play.transport.netty.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wheel.play.dto.RpcResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class UnprocessedRequests {
    private static final Map<String, CompletableFuture<RpcResponse<Object>>>  UNPROCESSED_RESPONSE_FUTURES  = new ConcurrentHashMap<>();
    public void put(String requestId, CompletableFuture<RpcResponse<Object>> future) {
        UNPROCESSED_RESPONSE_FUTURES.put(requestId, future);
    }

    public void complete(RpcResponse<Object> rpcResponse) {
        CompletableFuture<RpcResponse<Object>> future = UNPROCESSED_RESPONSE_FUTURES.remove(rpcResponse.getRequestId());
        if (Objects.nonNull(future)) {
            future.complete(rpcResponse);
        } else {
            throw new IllegalStateException();
        }
    }

}
