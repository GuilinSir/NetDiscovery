package com.net.netdiscovery.mian.power;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.core.SpiderEngine;
import com.cv4j.netdiscovery.core.config.Constant;
import com.cv4j.netdiscovery.core.domain.HttpRequestBody;
import com.cv4j.netdiscovery.core.domain.Request;
import com.net.netdiscovery.parser.power.PowerParser;
import com.net.netdiscovery.pipeline.power.PowerPipeline;
import io.vertx.core.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;


public class PowerSpider3 {

    public static void main(String[] args) {
        final long timeInterval = 1000 * 10;

        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {

                    SpiderEngine spiderEngine = SpiderEngine.create();
                    String[] assetNoList = {"1510664582"};
                    String url = "https://www.feixiaohao.com/currencies/eos/";
                    for (String assetNo : assetNoList) {
                        Spider spider = Spider.create()
                                .name("Power" + assetNo)
                                .url(url)
                                .parser(new PowerParser())
                                .pipeline(new PowerPipeline("测试"))
                                ;
                        spiderEngine.addSpider(spider);
                    }
                    spiderEngine.run();
                    try {
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }

}
