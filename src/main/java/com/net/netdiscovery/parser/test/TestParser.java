package com.net.netdiscovery.parser.test;

import com.cv4j.netdiscovery.core.domain.Page;
import com.cv4j.netdiscovery.core.domain.ResultItems;
import com.cv4j.netdiscovery.core.parser.AnnotationParser;
import com.cv4j.netdiscovery.core.parser.Parser;
import com.cv4j.netdiscovery.core.parser.annotation.ExtractBy;
import com.cv4j.netdiscovery.core.parser.selector.Selectable;

import java.util.List;

public class TestParser extends AnnotationParser {
    @ExtractBy.XPath("//html/body/footer/div/div/a[1]/text()")
    private String bdz1;//表地址
    @Override
    public void process(Page page) {
        super.process(page);
//        ResultItems resultItems = page.getResultItems();
//
////        String xpathStr = "//*[@id=\"list-container\"]/ul/li";
//////        List<Selectable> trList = page.getHtml().xpath(xpathStr).nodes();
//////        System.out.println("trList:" + trList.size());
//////        for (Selectable tr : trList) {
//////            String title = tr.xpath("//div/a/text()").get();
//////            //String name = tr.xpath("//text()").get();
//////            //resultItems.put(name, title);
//////            if (null != title ) {
//////                System.out.println("title:" + title);
//////            }
//////        }
//        String xpathStr = "";
//        String marketPrice = page.getHtml().xpath(xpathStr).get();
//        System.out.println("marketPrice:" + marketPrice);
    }
}
