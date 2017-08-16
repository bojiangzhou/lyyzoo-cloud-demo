package com.lyyzoo.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * 消息消费者
 *
 * 通过@RabbitListener注解定义该类对 datetime 队列的监听
 *
 * 该消费者实现了对 datetime 队列的消费，消费操作为输出消息的字符串内容
 *
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-15 15:41
 */
@Component
@RabbitListener(queues = "datetime")
public class Receiver {

    /**
     * 用@RabbitHandler注解来指定对消息的处理方法
     */
    @RabbitHandler
    public void process(String datetime) {
        System.out.println("##############################################################################");
        System.out.println("Receiver : " + datetime);
        System.out.println("##############################################################################");
    }

}
