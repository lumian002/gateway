package com.lumia.gateway.core;

import com.lumia.gateway.core.server.http.HttpServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) throws Exception {
        new HttpServer(8080).run();
    }
}
