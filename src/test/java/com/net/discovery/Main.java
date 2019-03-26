package com.net.discovery;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.extra.downloader.httpclient.HttpClientDownloader;

/**
 * Created by tony on 2018/2/2.
 */
public class Main {

    public static void main(String[] args) {

//        Spider.create()
//                .name("tony")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Googlebot")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Baiduspider")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Chrome")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Firefox")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Mozilla")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Opera")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Safari")
//                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Edge")
//                .parser(new UAParser())
//                .pipeline(new FilePipeline())
//                .run();


//        //目标任务的网页地址，可以拷贝到浏览器去查看
//        String url = "http://www.szrc.cn/HrMarket/WLZP/ZP/0/%e9%94%80%e5%94%ae";
//
//        //依靠NetDiscovery，我们只需要写一个parser类就可以实现基本的爬虫功能了
//        Spider.create()
//                .name("spider-1")         //名字随便起
//                .url(url)
//                .parser(new TestParser())  //parser类
//                .run();


        String eosUrl = "https://www.feixiaohao.com/currencies/eos/";

        long periodTime = 1000 * 2;

        Spider.create()
                .name("EOS")
                .repeatRequest(periodTime, eosUrl)
        //下面这行代码要注意，要设置>=periodTime，想了解具体作用，可以去分析源代码
                .initialDelay(periodTime)
                .parser(new EosParser())
                .downloader(new HttpClientDownloader())
                .run();


    }
}
