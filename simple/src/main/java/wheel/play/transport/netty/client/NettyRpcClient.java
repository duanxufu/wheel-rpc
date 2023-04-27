package wheel.play.transport.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import lombok.Data;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import wheel.play.dto.RpcRequest;
import wheel.play.dto.RpcResponse;
import wheel.play.transport.RpcRequestTransport;

import java.util.concurrent.CompletableFuture;


@Data
@Slf4j
public class NettyRpcClient implements RpcRequestTransport {
    private final UnprocessedRequests unprocessedRequests;
    private final ChannelProvider channelProvider;
    private final Bootstrap bootstrap;
    private final EventLoopGroup eventLoopGroup;

    @SneakyThrows
    public Channel doConnect() {
        CompletableFuture<Channel> completableFuture = new CompletableFuture<>();
        return null;
    }
    @Override
    public Object sendRpcRequest(RpcRequest request) {
        CompletableFuture<RpcResponse<Object>> resultFuture = new CompletableFuture<>();

        return null;
    }
}
