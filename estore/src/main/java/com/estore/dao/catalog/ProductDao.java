package com.estore.dao.catalog;

import org.springframework.stereotype.Repository;

import com.estore.dao.common.impl.GenericDaoHibernate;
import com.estore.datamodel.catalog.Product;

@Repository
public class ProductDao extends GenericDaoHibernate<String, Product> {

}
