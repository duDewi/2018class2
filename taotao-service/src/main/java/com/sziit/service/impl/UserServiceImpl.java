package com.sziit.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sziit.service.UserService;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.sziit.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   DELL
 *  @创建时间:  2018/9/11 15:51
 *  @描述：    TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的save方法");
    }
}
