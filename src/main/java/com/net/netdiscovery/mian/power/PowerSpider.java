package com.net.netdiscovery.mian.power;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.core.SpiderEngine;
import com.cv4j.netdiscovery.core.config.Constant;
import com.cv4j.netdiscovery.core.domain.Request;
import com.net.netdiscovery.parser.power.PowerParser;
import com.net.netdiscovery.pipeline.power.PowerPipeline;
import io.vertx.core.http.HttpMethod;


public class PowerSpider {

    public static void main(String[] args) {

        String[] DBBM_List = {"111", "222", "333", "444", "555", "666", "777", "888"};//电表编码列表
        long periodTime = 1000 * 3;//暂停时间
        String url = "http://www.100ghouse.com/yonghu//app/users/user/pass_code";//路径

        SpiderEngine engine = SpiderEngine.create();//引擎

        for (int i = 0; i < DBBM_List.length; i++) {
            Spider spider = Spider.create()
                    .name("Power[" + i + "]")
                    //.repeatRequest(periodTime, new Request(url).httpMethod(HttpMethod.POST).charset(Constant.UTF_8).spiderName("Power"))
                    .initialDelay(periodTime)
                    .parser(new PowerParser())
                    .pipeline(new PowerPipeline(DBBM_List[i]));
            engine.addSpider(spider);
        }
        engine.httpd(8080);
        engine.run();
    }
}
