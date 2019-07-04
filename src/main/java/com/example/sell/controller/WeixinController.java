package com.example.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * WeixinController
 * author Administrator
 * Date 2019/5/1722:37
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法。。。");
        log.info("code{}", code);
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx3f9cbaac2538c60a&secret=b3972397da4133ee03763ea8b9ae1d98&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response{}", response);
        //拿到openid
        String openid = "oZVSe1Z8VNYtr6Kpf11ahYNg3TwY";
    }
}
