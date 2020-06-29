package com.shulian.goods.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author jiaxun
 * @date 2020-06-17
 * @time 15:48
 */

@RestController
@RequestMapping("v1")
@RefreshScope
@Slf4j
public class GoodsController {


    @Value("${user.useLocalCache}")
    private boolean useLocalCache;

    @Value("${user.name}")
        private String name;

    @GetMapping("/get")
    @SentinelResource(value = "protected-resource", blockHandler = "handleBlock")
    public String test() throws Exception{
        log.info("request come ....");
        return name;
    }

    public String handleBlock(BlockException e) {

        return "限流";
    }


}
