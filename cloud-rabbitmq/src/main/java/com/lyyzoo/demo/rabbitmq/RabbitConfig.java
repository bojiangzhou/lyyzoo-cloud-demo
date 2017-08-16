package com.lyyzoo.demo.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * 创建RabbitMQ的配置类RabbitConfig，用来配置队列、交换器、路由等高级信息。
 * 这里我们以入门为主，先以最小化的配置来定义，以完成一个基本的生产和消费过程。
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-15 15:44
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue datetimeQueue(){
        Queue datetime = new Queue("datetime");
        return datetime;
    }

}
