package com.estore.dao.catalog;

import org.springframework.stereotype.Service;

import com.estore.dao.common.impl.GenericDaoHibernate;
import com.estore.datamodel.catalog.Category;

@Service
public class CategoryDao extends GenericDaoHibernate<String, Category>  {

}
