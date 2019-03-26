package com.net.netdiscovery.mian;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.extra.downloader.httpclient.HttpClientDownloader;
import com.net.netdiscovery.parser.EosParser;
import com.net.netdiscovery.parser.TestParser;

/**
 * Created by tony on 2018/2/2.
 */
public class TestSpider {

    public static void main(String[] args) {

        //目标任务的网页地址，可以拷贝到浏览器去查看
        String url = "http://www.szrc.cn/HrMarket/WLZP/ZP/0/%e9%94%80%e5%94%ae";

        //依靠NetDiscovery，我们只需要写一个parser类就可以实现基本的爬虫功能了
        Spider.create()
                .name("spider-1")         //名字随便起
                .url(url)
                .parser(new TestParser())  //parser类
                .run();



    }
}
