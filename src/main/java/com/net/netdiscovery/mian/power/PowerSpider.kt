package com.net.netdiscovery.mian.power

import com.cv4j.netdiscovery.core.Spider
import com.cv4j.netdiscovery.core.SpiderEngine
import com.cv4j.netdiscovery.core.config.Constant
import com.cv4j.netdiscovery.core.domain.Request
import com.net.netdiscovery.parser.power.PowerParser
import com.net.netdiscovery.pipeline.power.PowerPipeline
import io.vertx.core.http.HttpMethod


object PowerSpider {

    fun main(args: Array<String>) {

        val DBBM_List = arrayOf("111", "222", "333", "444", "555", "666", "777", "888")//电表编码列表
        val periodTime = (1000 * 3).toLong()//暂停时间
        val url = "http://www.100ghouse.com/yonghu//app/users/user/pass_code"//路径

        val engine = SpiderEngine.create()//引擎

        for (i in DBBM_List.indices) {
            val spider = Spider.create()
                    .name("Power[$i]")
                    //.repeatRequest(periodTime, new Request(url).httpMethod(HttpMethod.POST).charset(Constant.UTF_8).spiderName("Power"))
                    .initialDelay(periodTime)
                    .parser(PowerParser())
                    .pipeline(PowerPipeline(DBBM_List[i]))
            engine.addSpider(spider)
        }
        
        engine.httpd(8080)
        engine.run()

    }
}
