package com.wu.springcloud.base.impl;


import com.github.pagehelper.PageHelper;
import com.wu.springcloud.base.BaseEntity;
import com.wu.springcloud.base.BaseMapper;
import com.wu.springcloud.base.IBaseService;
import com.wu.springcloud.persistence.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly=false)
public class BaseService<D extends BaseMapper<T>,T extends BaseEntity<T>> implements IBaseService<T> {

	
	@Autowired
	protected D dao;
	/**
	 * 查询所有数据
	 */
	@Transactional(readOnly=true)
	public List<T> getAll(T t) {
		return dao.getByPage(t);
	}

	/**
	 * 查询所有数据带分页
	 * @param t 条件参数
	 * @param page 分页参数
	 */
	@Transactional(readOnly=true)
	@Override
	public List<T> getAll(T t,Page<T> page) {
		PageHelper.startPage(page.getPageNo(), page.getPageSize());
		return dao.getByPage(t);
	}

	/**
	 * 获取详情信息
	 * @param id 主键
	 */
	@Transactional(readOnly=true)
	public T get(Integer id) {		
		return dao.get(id);
	}

	/**
	 * 保存
	 * @param t
	 * @return
	 */
	public int save(T t) {		
		return dao.save(t);
	}

	/**
	 * 更新
	 * @param t
	 * @return
	 */
	public int update(T t) {
		return dao.update(t);
	}

	/**
	 * 逻辑删除
	 * @param t
	 * @return
	 */
	@Override
	public int deleteByLogic(T t) {
		return 0;
	}


}
