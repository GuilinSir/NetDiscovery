package com.net.netdiscovery.mian.power;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.core.SpiderEngine;
import com.cv4j.netdiscovery.core.config.Constant;
import com.cv4j.netdiscovery.core.domain.HttpRequestBody;
import com.cv4j.netdiscovery.core.domain.Request;
import com.net.netdiscovery.parser.power.PowerParser;
import io.vertx.core.http.HttpMethod;
import org.apache.kafka.common.metrics.stats.Max;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class PowerSpider2 {

    public static void main(String[] args) {
        final long timeInterval = 1000 * 10;

        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {

                    SpiderEngine spiderEngine = SpiderEngine.create();
                    String[] assetNoList = {"1510664582"};
                    String url = "http://www.100ghouse.com/yonghu//app/users/user/pass_code";
                    //String url = "http://10.134.78.59:7001/aueic/collMeterData/loadMeterEventView.action";
                    //String url = "http://10.134.78.59:7001/aueic/collMeterData/getAllDataResultOne.action";
                    for (String assetNo : assetNoList) {
                        Map<String, Object> postParams = new HashMap<>();
                        postParams.put("collMeter.assetNo", assetNo);
                        postParams.put("collMeter.allDataItemNums", "431500");
                        Request request = new Request(url)
                                .httpMethod(HttpMethod.POST)
                                .httpRequestBody(HttpRequestBody.form(postParams, Constant.UTF_8));
                        Spider spider = Spider.create()
                                .name("Power" + assetNo)
                                .request(request)
                                .parser(new PowerParser());
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
