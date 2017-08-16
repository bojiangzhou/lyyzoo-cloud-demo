package com.lyyzoo.demo.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 消息生产者
 *
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-15 15:35
 */
@Component
public class Sender {

    /**
     * AmqpTemplate接口定义了一套针对AMQP协议的基础操作。在Spring Boot中会根据配置来注入其具体实现。
     */
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 在该生产者，我们会产生一个字符串，并发送到名为datetime的队列中。
     */
    public void sendTime(){
        String context = "now is " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("**************************************************************************");
        System.out.println("Sender " + context);
        System.out.println("**************************************************************************");

        //发送到名为 datetime 的队列中
        amqpTemplate.convertAndSend("datetime", context);
    }

}
