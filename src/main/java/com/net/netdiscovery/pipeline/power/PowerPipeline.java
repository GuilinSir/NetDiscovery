package com.net.netdiscovery.pipeline.power;

import com.cv4j.netdiscovery.core.domain.ResultItems;
import com.cv4j.netdiscovery.core.parser.annotation.ExtractBy;
import com.cv4j.netdiscovery.core.pipeline.Pipeline;

public class PowerPipeline implements Pipeline {
    private String DBBM;

    public PowerPipeline(String DBBM) {
        this.DBBM = DBBM;
    }

    @Override
    public void process(ResultItems resultItems) {
        //电表编码直接传过来 DBBM
        //根据字段名取相应结果处理

        System.out.println(DBBM);
        System.out.println("测试数据：cssj=" + (String) resultItems.get("cssj"));
        System.out.println("表地址1：bdz1=" + (String) resultItems.get("bdz1"));
        System.out.println("相别1：xb1=" + (String) resultItems.get("xb1"));
    }

}
