package com.net.netdiscovery.parser.power;

import com.cv4j.netdiscovery.core.domain.Page;
import com.cv4j.netdiscovery.core.parser.AnnotationParser;
import com.cv4j.netdiscovery.core.parser.annotation.ExtractBy;

public class PowerParser extends AnnotationParser {
//    @ExtractBy.XPath("")
//    private String DY_YHBH;//低压用户编号
    @ExtractBy.XPath("")
    private String BDZ;//表地址
    @ExtractBy.XPath("")
    private String SJLX;//事件类别
    @ExtractBy.XPath("")
    private String TDKSSJ;//停电开始时间
    @ExtractBy.XPath("")
    private String KSSJZXYGDN;//开始时刻正向有功电能
    @ExtractBy.XPath("")
    private String TDJSSJ;//停电结束时间
    @ExtractBy.XPath("")
    private String JSSJZXYGDN;//结束时刻正向有功电能


    @Override
    public void process(Page page) {
        super.process(page);

    }

}
