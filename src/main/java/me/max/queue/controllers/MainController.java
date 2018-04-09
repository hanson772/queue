package me.max.queue.controllers;

import me.max.queue.sender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: max
 * Date: 2018/4/8
 * Time: 下午4:44
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class MainController {

    @Autowired
    private HelloSender sender;

    @RequestMapping("/home/{name:.+}")
    String home(@PathVariable String name) {
        name = name == null || name.trim().equals("")? "guest" : name;
        sender.send(name);
        return "Hello World!";
    }
}
