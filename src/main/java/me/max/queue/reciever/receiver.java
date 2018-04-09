package me.max.queue.reciever;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 2018/4/8
 * Time: 下午7:53
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
@RabbitListener(queues = "china")
public class receiver {
    @RabbitHandler
    public void proccess(String context){
        System.out.println("Reciver   :"+ context);
    }
}
