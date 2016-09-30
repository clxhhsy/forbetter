package com.forbetter.user.i;


import com.forbetter.user.pojo.SysUser;


public interface IUserService
{

    /**
     * 添加用户
     * 
     * @param user
     * @return
     */
    int save(SysUser user);
}
