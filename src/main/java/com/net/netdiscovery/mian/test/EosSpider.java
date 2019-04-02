package com.net.netdiscovery.mian.test;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.extra.downloader.httpclient.HttpClientDownloader;
import com.net.netdiscovery.parser.test.EosParser;
import com.net.netdiscovery.pipeline.test.EosPipeline;

/**
 * Created by tony on 2018/2/2.
 */
public class EosSpider {

    public static void main(String[] args) {

        String eosUrl = "https://www.feixiaohao.com/currencies/eos/";

        long periodTime = 1000 * 3;

        Spider.create()
                .name("EOS")
                .repeatRequest(periodTime, eosUrl)
                //下面这行代码要注意，要设置>=periodTime，想了解具体作用，可以去分析源代码
                .initialDelay(periodTime)
                .parser(new EosParser())
                .pipeline(new EosPipeline())
                .downloader(new HttpClientDownloader())
                .run();

    }
}
