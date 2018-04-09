package me.max.queue.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 2018/4/8
 * Time: 下午7:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
public class RabbitMqConfig {
    @Bean
    public Queue queue(){
        return new Queue("china", false);
    }
}
