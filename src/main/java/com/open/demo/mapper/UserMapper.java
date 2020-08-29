package com.open.demo.mapper;


import com.open.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int addUser(@Param("user")User user);

    List<User> selectAll();
}