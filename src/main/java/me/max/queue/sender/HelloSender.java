package me.max.queue.sender;

import java.util.Date;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 2018/4/8
 * Time: 下午7:47
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String name){
        String context = String.format("hi %s! %s",name,  new Date());
        System.out.println("sender:    "+ context);
        this.rabbitTemplate.convertAndSend("china", context);
    }

}
