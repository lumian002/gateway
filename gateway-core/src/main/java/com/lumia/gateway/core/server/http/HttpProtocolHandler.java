package com.lumia.gateway.core.server.http;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

/**
 * Http协议处理
 */
public interface HttpProtocolHandler {

    /**
     * 重路由
     *
     * @param request
     * @return
     */
    HttpResponse reRouting(HttpRequest request);

    /**
     * Url重写
     *
     * @param url
     * @return
     */
    String uriRewrite(String url);

    /**
     * 结果重写
     * @param response
     */
    void responseRewrite(HttpResponse response);
}
