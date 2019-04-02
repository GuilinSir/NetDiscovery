package com.net.netdiscovery.mian.test;

import com.cv4j.netdiscovery.core.Spider;
import com.net.netdiscovery.parser.test.UAParser;
import com.net.netdiscovery.pipeline.test.FilePipeline;

/**
 * Created by tony on 2018/2/2.
 */
public class UASpider {

    public static void main(String[] args) {

        Spider.create()
                .name("tony")
                .url("https://www.baidu.com/1111")
                .url("https://www.baidu.com/2222")
                .url("https://www.baidu.com/3333")
                .url("https://www.baidu.com/4444")
                .url("https://www.baidu.com/5555")
                .url("https://www.baidu.com/6666")
                .url("https://www.baidu.com/7777")
                .url("https://www.baidu.com/8888")
                .parser(new UAParser())
                //.pipeline(new FilePipeline())
                .run();



    }
}
