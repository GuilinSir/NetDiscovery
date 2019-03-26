package com.net.netdiscovery.mian;

import com.cv4j.netdiscovery.core.Spider;
import com.cv4j.netdiscovery.extra.downloader.httpclient.HttpClientDownloader;
import com.net.netdiscovery.parser.EosParser;
import com.net.netdiscovery.parser.UAParser;
import com.net.netdiscovery.pipeline.FilePipeline;

/**
 * Created by tony on 2018/2/2.
 */
public class UASpider {

    public static void main(String[] args) {

        Spider.create()
                .name("tony")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Googlebot")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Baiduspider")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Chrome")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Firefox")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Mozilla")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Opera")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Safari")
                .url("http://www.useragentstring.com/pages/useragentstring.php?name=Edge")
                .parser(new UAParser())
                .pipeline(new FilePipeline())
                .run();



    }
}
