package com.shulian.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author jiaxun
 * @date 2020-06-19
 * @time 17:40
 */
@Slf4j
@Component
public class TokenFilter implements GlobalFilter , Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("************** Token  Filter **************");
        //TODO Add Authority certification

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
