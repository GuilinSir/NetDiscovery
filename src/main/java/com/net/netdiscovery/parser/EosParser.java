package com.net.netdiscovery.parser;

import com.cv4j.netdiscovery.core.domain.Page;
import com.cv4j.netdiscovery.core.parser.AnnotationParser;
import com.cv4j.netdiscovery.core.parser.Parser;
import com.cv4j.netdiscovery.core.parser.annotation.ExtractBy;

public class EosParser extends AnnotationParser {
    @ExtractBy.XPath("//*[@id=\"__layout\"]/section/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/span/span/text()")
    private String marketPrice;

    @Override
    public void process(Page page) {
        super.process(page);
//        String xpathStr = "//*[@id=\"__layout\"]/section/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/span/span/text()";
//        String marketPrice = page.getHtml().xpath(xpathStr).get();
//        System.out.println("marketPrice=" + marketPrice);
    }

}
