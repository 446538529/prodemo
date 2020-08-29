package com.open.demo.service;

import cn.hutool.core.util.RandomUtil;
import com.open.demo.entity.User;
import com.open.demo.mapper.UserMapper;
import com.open.demo.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public Object addUser(UserVo userVo) {
        User user =new User();
        BeanUtils.copyProperties(userVo,user);
        user.setId(RandomUtil.randomInt());
        return userMapper.addUser(user)==1;
    }

    public Object queryUserList() {
        return userMapper.selectAll();
    }
}
