package wheel.play.transport;


import wheel.play.dto.RpcRequest;

public interface RpcRequestTransport {
    Object sendRpcRequest(RpcRequest request);
}
