package com.net.discovery;

import com.cv4j.netdiscovery.core.domain.Page;
import com.cv4j.netdiscovery.core.parser.Parser;

public class EosParser implements Parser {
    @Override
    public void process(Page page) {
        //String xpathStr = "//div[@class='coinprice']/text()";
        String xpathStr = "*[@id=\"__layout\"]/section/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/span/span/text()";
        
        String marketPrice = page.getHtml().xpath(xpathStr).get();
        System.out.println("marketPrice=" + marketPrice);
    }
}
