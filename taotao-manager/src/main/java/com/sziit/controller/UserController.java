package com.sziit.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sziit.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.sziit.controller
 *  @文件名:   UserController
 *  @创建者:   DELL
 *  @创建时间:  2018/9/11 15:40
 *  @描述：    TODO
 */
//@RestController=@Controller+@ResponseBody(表示方法的返回值是JSON数据)
@RestController
public class UserController {
    //这个注解的意思是：自动注入，在当前这个项目的Spring容器里寻找UserService这个接口的实现类对象。
    //找到之后，给这个userService赋值进来，UserService的实现类是UserServiceImpl.
    //@Autowired
    @Reference
    private UserService userService;

    @RequestMapping("save")
    public String save(){


        System.out.println("调用了UserController的save方法");
        userService.save();

        return "save success~";

    }
}
