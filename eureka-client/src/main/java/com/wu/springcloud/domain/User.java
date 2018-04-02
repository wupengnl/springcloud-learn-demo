package com.wu.springcloud.domain;

import com.wu.springcloud.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 
 * @author wupeng
 * @date 2017年08月25日
 * @version v1.0
 * @description
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class User extends BaseEntity<User> {
        /** 用户名  **/
        private String username;
        /** 密码  **/
        private String password;
        /** 姓名  **/
        private String name;
        /** 出生日期  **/
        private Date birthday;
        /** 电话  **/
        private String phone;
        /** 邮箱  **/
        private String email;
        /** 自我描述  **/
        private String description;

}