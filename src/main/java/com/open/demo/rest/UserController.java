package com.open.demo.rest;

import com.open.demo.service.UserService;
import com.open.demo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Object addUser(@RequestBody UserVo userVo){
        return userService.addUser(userVo);
    }
    @GetMapping("/queryAllUser")
    public Object queryUserList(){
        return userService.queryUserList();
    }
}
