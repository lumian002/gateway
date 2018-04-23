package com.lumia.gateway.core.server.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

public class HttpServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> implements HttpProtocolHandler {

    /**
     * messageReceived(ChannelHandlerContext, I)} in 5.0
     *
     * @param ctx
     * @param _request
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest _request) throws Exception {
        DefaultFullHttpRequest request = (DefaultFullHttpRequest) _request;
        if (request.decoderResult().isSuccess()) {
            request.setUri(this.uriRewrite(request.uri()));
            HttpResponse response = this.reRouting(request);
            this.responseRewrite(response);
        } else {
            System.err.println(String.format("Decode request failure: {}", request.toString()));
        }
    }

    /**
     * 请求重定向
     *
     * @param request
     * @return
     */
    public HttpResponse reRouting(HttpRequest request) {
        return null;
    }

    /**
     * URI重写
     *
     * @param url
     * @return
     */
    public String uriRewrite(String url) {
        return "/hello/world";
    }

    /**
     * 响应重写
     *
     * @param response
     */
    public void responseRewrite(HttpResponse response) {

    }
}
