package com.forbetter.user.service;


import com.forbetter.base.SpringBaseTest;
import com.forbetter.user.i.IUserService;
import com.forbetter.user.pojo.SysUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceTest extends SpringBaseTest
{

    @Autowired
    private IUserService userService;

    @Test
    public void testSave()
    {
        SysUser user = new SysUser();
        user.setLogin("aaa");
        user.setPassword("bbb");
        System.out.println(userService.save(user));
    }
}