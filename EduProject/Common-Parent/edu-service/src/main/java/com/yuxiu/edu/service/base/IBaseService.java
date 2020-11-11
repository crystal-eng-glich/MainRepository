package com.yuxiu.edu.service.base;

public interface IBaseService<T> {

	public T findById(Integer id);
	
	public T finById(String id);
	
	public void deleteById(Integer id);
	
	public void deleteByUUId(String id);
	
	public void update(T t);
	
	public void insert(T t);
}
