package com.sziit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.sziit
 *  @文件名:   ManagerApp
 *  @创建者:   DELL
 *  @创建时间:  2018/9/11 15:41
 *  @描述：    TODO
 */

//告诉SpringBoot 不要检测数据源
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)


@SpringBootApplication
public class ManagerApp {
    public static void main(String [] args){
        SpringApplication.run(ManagerApp.class, args);
    }
}
