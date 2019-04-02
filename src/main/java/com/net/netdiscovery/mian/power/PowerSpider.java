package com.net.netdiscovery.mian.power;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.core.SpiderEngine;
import com.net.netdiscovery.parser.power.PowerParser;
import com.net.netdiscovery.pipeline.power.PowerPipeline;


public class PowerSpider {

    public static void main(String[] args) {

        String[] DBBM_List = {"111", "222", "333", "444", "555", "666", "777", "888"};//电表编码列表
        long periodTime = 1000 * 10;//暂停时间
        String url = "https://www.baidu.com/";//路径

        SpiderEngine engine = SpiderEngine.create();//引擎

        for (int i = 0; i < DBBM_List.length; i++) {
            Spider spider = Spider.create()
                    .name("Power[" + i + "]")
                    .repeatRequest(periodTime, url + DBBM_List[i])
                    .initialDelay(periodTime);
            //.parser(new PowerParser())
            //.pipeline(new PowerPipeline(DBBM));
            engine.addSpider(spider);
        }
        engine.runWithRepeat();
    }
}
