package com.estore.dao.catalog;

import org.springframework.stereotype.Repository;

import com.estore.dao.common.impl.GenericDaoHibernate;
import com.estore.datamodel.catalog.Category;

@Repository
public class CategoryDao extends GenericDaoHibernate<String, Category>  {

}
