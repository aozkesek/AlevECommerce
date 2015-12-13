package com.merge.alev.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.merge.alev.dao.model.Product;
import com.merge.alev.dao.model.ProductCommand;
import com.merge.alev.dao.model.ProductPicture;
import com.merge.base.dao.impl.AbstractDiscreteCommandDAO;
import com.merge.base.dao.intf.IGenericDAO;

@Component
public class ProductCommandDAO extends AbstractDiscreteCommandDAO<ProductCommand> {

	@Autowired
	private IGenericDAO<Product> productDao;
	@Autowired
	private IGenericDAO<ProductPicture> productPictureDao;
	
	public IGenericDAO<Product> getProductDao() {
		return productDao;
	}

	public void setProductDao(IGenericDAO<Product> productDao) {
		this.productDao = productDao;
	}

	public IGenericDAO<ProductPicture> getProductPictureDao() {
		return productPictureDao;
	}

	public void setProductPictureDao(IGenericDAO<ProductPicture> productPictureDao) {
		this.productPictureDao = productPictureDao;
	}

	@Override
	public Criteria getListCriteria(Session session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria getListByCriteria(Session session, ProductCommand model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCommand createCommand(ProductCommand model) {
		try {
			
			Product product = getProductDao().create(newProduct(model));
			
			List<ProductPicture> ppl = new ArrayList<ProductPicture>();
			for (ProductPicture pp : model.getPictures()) {
				pp.setProductId(product.getId());
				ppl.add(getProductPictureDao().create(pp));
			}
		
			model.setId(product.getId());
			model.setCreateDate(product.getCreateDate());
			model.setUpdateDate(product.getUpdateDate());
			model.setPictures(ppl);
			return model;
		}
		catch (Exception ex) {
			
			throw ex;
		}
	}

	@Override
	public ProductCommand readCommand(ProductCommand model) {
		try {
			
			Product product = getProductDao().create(newProduct(model));
			
			List<ProductPicture> ppl = new ArrayList<ProductPicture>();
		
			model.setId(product.getId());
			model.setCreateDate(product.getCreateDate());
			model.setUpdateDate(product.getUpdateDate());
			model.setPictures(ppl);
			return model;
		}
		catch (Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public ProductCommand updateCommand(ProductCommand model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCommand deleteCommand(ProductCommand model) {
		// TODO Auto-generated method stub
		return null;
	}

	private Product newProduct(ProductCommand pc) {
		Product p = new Product();
		p.setActualPrice(pc.getActualPrice());
		p.setCategoryId(pc.getCategoryId());
		p.setColors(pc.getColors());
		p.setCreateDate(pc.getCreateDate());
		p.setDescription(pc.getDescription());
		p.setId(pc.getId());
		p.setName(pc.getName());
		p.setPrice(pc.getPrice());
		p.setSizes(pc.getSizes());
		p.setTitle(pc.getTitle());
		p.setUpdateDate(pc.getUpdateDate());
		p.setVersion(pc.getVersion());
		return p;
	}
	
	
}
