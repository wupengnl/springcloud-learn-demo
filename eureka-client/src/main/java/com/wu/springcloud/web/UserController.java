package com.wu.springcloud.web;

import com.wu.springcloud.domain.User;
import com.wu.springcloud.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


/***
 * @author wupeng
 * @date 2017-08-29 9:50
 * @version V1.0
 * @Description:
 */
@Api(value = "用户接口", description = "用户接口")
@RequestMapping(value = "/v1/users")
@RestController
@RefreshScope
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询：根据id查询用户详情
     * @param id
     * @return
     */
    @ApiOperation(value="根据用户id查询用户详情", notes="根据用户id查询用户详情")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType="string",paramType = "path")
    @RequestMapping(value="/{id}",method = RequestMethod.GET,produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public User get(@PathVariable("id") Integer id){
        User user = userService.get(id);
        return user;
    }

    /**
     * 查询：当前登陆用户信息
     * @return
     */
    @ApiOperation(value="查询当前用户", notes="查询当前用户")
    @RequestMapping(value="/getLoginUser",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public User getLoginUser(){
        User user = userService.getUser();
        return user;
    }


}
