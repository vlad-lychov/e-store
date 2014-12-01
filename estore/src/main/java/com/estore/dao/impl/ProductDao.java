package com.estore.dao.impl;

import org.springframework.stereotype.Service;

import com.estore.catalog.datamodel.Product;

@Service
public class ProductDao extends GenericDaoHibernate<String, Product> {

}
