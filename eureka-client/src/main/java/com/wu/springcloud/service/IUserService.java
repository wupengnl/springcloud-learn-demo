
package com.wu.springcloud.service;

import com.wu.springcloud.base.IBaseService;
import com.wu.springcloud.domain.User;

/**
 * @author wupeng
 * @date 2017年8月24日  
 * @version 1.0.0
 * @Description
 */
public interface IUserService extends IBaseService<User> {
    /** 获取当前登陆用户 **/
    public User getUser();
}
