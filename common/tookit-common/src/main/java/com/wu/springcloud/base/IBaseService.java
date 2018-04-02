package com.wu.springcloud.base;


import com.wu.springcloud.persistence.Page;

import java.util.List;

public interface IBaseService<T> {
	
	List<T> getAll(T t);
	List<T> getAll(T t, Page<T> page);
	public T get(Integer id);

	public int save(T t);

	public int update(T t);

	public int deleteByLogic(T t);


}
