package com.estore.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<KEY extends Serializable, TYPE> {

	public KEY create(TYPE instance);
	
    public void saveOrUpdate(TYPE instance);

    public void delete(TYPE instance);

    public TYPE findById(KEY id);

    public int count();

    public List<TYPE> getAll();

}
