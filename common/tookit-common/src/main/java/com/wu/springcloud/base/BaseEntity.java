package com.wu.springcloud.base;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class BaseEntity<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiParam("主键")
	private Integer id;
	@ApiParam("创建人")
	private Integer creater;
	@ApiParam("创建日期")
	@JSONField(format ="yyyy-MM-dd HH:mm:ss")
	private Date createDate;
	@ApiParam("更新人")
	private Integer updater;
	@ApiParam("更新日期")
	@JSONField(format ="yyyy-MM-dd HH:mm:ss")
	private Date updateDate;
	@ApiParam("status 0-不可用，1-可用 ")
	private int status;
	@ApiParam("备注")
	private String remark;

}