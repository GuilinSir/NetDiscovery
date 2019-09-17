package com.net.netdiscovery.mian.test;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.core.domain.Request;
import com.net.netdiscovery.parser.test.TestParser;
import com.net.netdiscovery.pipeline.test.TestPipeline;

/**
 * Created by tony on 2018/2/2.
 */
public class TestSpider {

    public static void main(String[] args) {

        //目标任务的网页地址，可以拷贝到浏览器去查看
        String url = "https://www.jianshu.com/";
        //依靠NetDiscovery，我们只需要写一个parser类就可以实现基本的爬虫功能了
        Request request = new Request(url);
        request.saveCookie(true).addCookie("__yadk_uid=EeRs75qWLvs7KKwWP7KVvEmCh6taSIIQ");
        Spider.create()
                .name("spider-1")         //名字随便起
                .request(request)
                .parser(new TestParser())  //parser类
                .pipeline(new TestPipeline())
                .run();


    }
}
