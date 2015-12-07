package com.merge.alev.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.merge.alev.dao.model.ProductPicture;
import com.merge.base.controller.GenericCRUDController;
import com.merge.base.controller.GenericRequest;
import com.merge.base.controller.GenericResponse;

@RestController
public class ProductPictureController extends GenericCRUDController<ProductPicture> {
	
	@Override
	@RequestMapping("/productpicture/create")
	@ResponseBody
	public GenericResponse<ProductPicture> create(@RequestBody GenericRequest<ProductPicture> request) {
		return super.create(request);
	}

	@Override
	@RequestMapping("/productpicture/read")
	@ResponseBody
	public GenericResponse<ProductPicture> read(@RequestBody GenericRequest<ProductPicture> request) {
		return super.read(request);
	}

	@Override
	@RequestMapping("/productpicture/update")
	@ResponseBody
	public GenericResponse<ProductPicture> update(@RequestBody GenericRequest<ProductPicture> request) {
		return super.update(request);
	}

	@Override
	@RequestMapping("/productpicture/delete")
	@ResponseBody
	public GenericResponse<ProductPicture> delete(@RequestBody GenericRequest<ProductPicture> request) {
		return super.delete(request);
	}	
	
	@Override
	@RequestMapping("/productpicture/list")
	@ResponseBody
	public GenericResponse<ProductPicture> list(@RequestBody GenericRequest<ProductPicture> request) {
		return super.list(request);
	}	
	
}