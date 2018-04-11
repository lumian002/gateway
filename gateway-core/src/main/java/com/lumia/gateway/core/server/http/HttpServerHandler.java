package com.lumia.gateway.core.server.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;

public class HttpServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

    /**
     * messageReceived(ChannelHandlerContext, I)} in 5.0
     *
     * @param ctx
     * @param _request
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest _request) throws Exception {
        DefaultFullHttpRequest request = (DefaultFullHttpRequest)_request;
        if(request.decoderResult().isSuccess()) {
            System.out.print("===============" + request.uri());
        }
    }
}
