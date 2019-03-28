package com.net.netdiscovery.parser;

import com.cv4j.netdiscovery.core.domain.Page;
import com.cv4j.netdiscovery.core.domain.ResultItems;
import com.cv4j.netdiscovery.core.parser.Parser;
import com.cv4j.netdiscovery.core.parser.selector.Selectable;

import java.util.List;

public class TestParser implements Parser {
    @Override
    public void process(Page page) {
        ResultItems resultItems = page.getResultItems();
        String xpathStr = "/html/body/div[1]/div[1]/div[2]/ul/li";
        List<Selectable> trList = page.getHtml().xpath(xpathStr).nodes();
        for (Selectable tr : trList) {
            String title = tr.xpath("//a/text()").get();
            String name = tr.xpath("//child::*").get();
            resultItems.put(name, title);
            if (null != title && null != name) {
                System.out.println("title:" + title + "----name:" + name);
            }
        }
    }
}
