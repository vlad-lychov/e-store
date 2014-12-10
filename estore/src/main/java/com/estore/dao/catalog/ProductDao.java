package com.estore.dao.catalog;

import org.springframework.stereotype.Service;

import com.estore.dao.common.impl.GenericDaoHibernate;
import com.estore.datamodel.catalog.Product;

@Service
public class ProductDao extends GenericDaoHibernate<String, Product> {

}
