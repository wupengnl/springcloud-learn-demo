
package com.wu.springcloud.service.impl;

import com.wu.springcloud.base.impl.BaseService;
import com.wu.springcloud.dao.UserMapper;
import com.wu.springcloud.domain.User;
import com.wu.springcloud.service.IUserService;
import org.springframework.stereotype.Service;


@Service
public class UserService extends BaseService<UserMapper,User> implements IUserService {


    /**
     * 查询：获取当前登陆用户
     * @return
     */
    @Override

    public User getUser() {
        return dao.get(1);
    }
}
