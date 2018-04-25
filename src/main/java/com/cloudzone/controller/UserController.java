package com.cloudzone.controller;

import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.common.entity.User;
import com.cloudzone.common.entity.UserExample;
import com.cloudzone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yintongjiang
 * @params
 * @since 2018/4/18
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 添加用户
     *
     * @param userVO
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<User> addUser(@RequestBody User userVO) {
        userService.insert(userVO);
        return new ResponseResult<>(userVO);
    }

    /**
     * 按条件查询用户列表(eg:userName)
     *
     * @param userName
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult<List<User>> selectUsers(@RequestParam(value = "userName", required = false) String userName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName);
        userService.selectByExample(userExample);
        return new ResponseResult<List<User>>(userService.selectByExample(userExample));
    }

    /**
     * 根据用户id删除用户
     *
     * @param userId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.DELETE,
            consumes = "application/json;charset=UTF-8",
            produces = "application/json;charset=UTF-8")
    public ResponseResult delUser(@RequestParam(value = "userId", required = false) Integer userId) {
        userService.deleteByPrimaryKey(userId);
        return new ResponseResult();
    }
}
