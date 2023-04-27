package wheel.play.transport.netty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ChannelProvider {
    private final Map<String, Channel> channelMap;

    public ChannelProvider() {
        channelMap = new ConcurrentHashMap<>();
    }

    public Channel get(Bootstrap bootstrap, EventLoopGroup eventLoopGroup) {

        return null;
    }
}
