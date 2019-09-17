package com.net.netdiscovery.pipeline.test;

import com.cv4j.netdiscovery.core.domain.ResultItems;
import com.cv4j.netdiscovery.core.pipeline.Pipeline;

public class TestPipeline implements Pipeline {
    @Override
    public void process(ResultItems resultItems) {
        System.out.println((String) resultItems.get("bdz1"));

    }
}
