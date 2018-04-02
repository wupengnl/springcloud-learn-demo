package com.wu.springcloud.base;

import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * 基础mapper接口类
 * @Description: TODO
 * @author Yunwei
 * @date 2016年8月3日 上午10:28:01
 * @version V1.0
 */
public interface BaseMapper<T> {
	/**
	 * 根据条件获取所有的数据
	 * @param t
	 * @return
	 */
	List<T> getByPage(T t);
	/**
	 * 根据主键查询单条数据
	 * @param id 主键
	 * @return
	 */
	@Cacheable(cacheNames="user" )
	public T get(Integer id);
	/**
	 * 保存数据
	 * @param t 需要保存的对象信息
	 * @return
	 */
	public int save(T t);
	/**
	 *  更新操作
	 * @param t 需要更新的数据
	 * @return
	 */
	public int update(T t);

	/**
	 * 逻辑删除
	 * @param t
	 * @return
	 */
	public int deleteByLogic(T t);
}