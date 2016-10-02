/*
 * 文件名：UserController
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/9/29
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.controller;


import com.forbetter.user.i.IUserService;
import com.forbetter.user.pojo.SysUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 用户操作控制器
 * <p>
 * Created On 2016年-09月-29日 17:34
 *
 * @author lichen
 * @version 1.0
 */
public class UserController
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
            "classpath:spring/app-context.xml");
        ctx.start();
        IUserService userService = (IUserService)ctx.getBean("userService");
        SysUser user = new SysUser();
        user.setLogin("aaa");
        user.setPassword("bbb");
        System.out.println(userService.save(user));
    }
}
