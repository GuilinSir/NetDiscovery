package com.net.netdiscovery.mian;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.extra.downloader.httpclient.HttpClientDownloader;
import com.net.netdiscovery.parser.EosParser;

/**
 * Created by tony on 2018/2/2.
 */
public class EosSpider {

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

        String eosUrl = "https://www.feixiaohao.com/currencies/eos/";

        long periodTime = 1000 * 3;

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
