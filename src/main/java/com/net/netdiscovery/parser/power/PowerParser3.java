package com.net.netdiscovery.parser.power;

import com.cv4j.netdiscovery.core.config.Constant;
import com.cv4j.netdiscovery.core.domain.Page;
import com.cv4j.netdiscovery.core.parser.AnnotationParser;
import com.cv4j.netdiscovery.core.parser.Parser;
import com.cv4j.netdiscovery.core.parser.annotation.ExtractBy;

public class PowerParser3 extends AnnotationParser {
    @ExtractBy.XPath("//*[@id=\"thisBody\"]/title/text()")
    private String cssj;//测试数据
    @ExtractBy.XPath("//*[@id=\"bdz1\"]/text()")
    private String bdz1;//表地址
    @ExtractBy.XPath("//*[@id=\"xb1\"]/text()")
    private String xb1;//相别
    @ExtractBy.XPath("//*[@id=\"sjlb1\"]/text()")
    private String sjlb1;//事件类别
    @ExtractBy.XPath("//*[@id=\"kssk1\"]/text()")
    private String kssk1;//开始时间
    @ExtractBy.XPath("//*[@id=\"ksskdn1\"]/text()")
    private String ksskdn1;//开始时刻电能
    @ExtractBy.XPath("//*[@id=\"jssk1\"]/text()")
    private String jssk1;//结束时刻
    @ExtractBy.XPath("//*[@id=\"jsskdn1\"]/text()")
    private String jsskdn1;//结束时刻电能

    @Override
    public void process(Page page) {
        super.process(page);

    }

}
