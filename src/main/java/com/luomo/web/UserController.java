package com.luomo.web;

import com.luomo.bean.User;
import com.luomo.repository.UserRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "获取用户列表", notes = "获取所有用户")
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(method = RequestMethod.POST)
    public String postUser(@RequestBody User user) {
       userRepository.save(user);
        return "success";
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id获取用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "path", dataType = "Long")
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable long id) {
        return userRepository.findById(id);
    }

    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "path", dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable long id, @RequestBody User user) {
        User u = userRepository.findById(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        userRepository.save(u);
        return "success";
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "path", dataType = "Long")
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable long id) {
        userRepository.deleteById(id);
        return "success";
    }
}
