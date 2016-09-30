/*
 * 文件名：UserService
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/9/29
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.user.service;


import com.forbetter.user.i.IUserService;
import com.forbetter.user.mapper.SysUserMapper;
import com.forbetter.user.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户业务逻辑层
 * <p>
 * Created On 2016年-09月-29日 17:36
 *
 * @author lichen
 * @version 1.0
 */
@Service("userService")
public class UserService implements IUserService
{
    @Autowired
    private SysUserMapper userMapper;

    public int save(SysUser user)
    {
        return userMapper.insert(user);
    }
}
