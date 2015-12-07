package com.merge.alev.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.merge.alev.dao.model.Fee;
import com.merge.base.controller.GenericCRUDController;
import com.merge.base.controller.GenericRequest;
import com.merge.base.controller.GenericResponse;

@RestController
public class FeeController extends GenericCRUDController<Fee> {
	
	@Override
	@RequestMapping("/fee/create")
	@ResponseBody
	public GenericResponse<Fee> create(@RequestBody GenericRequest<Fee> request) {
		return super.create(request);
	}

	@Override
	@RequestMapping("/fee/read")
	@ResponseBody
	public GenericResponse<Fee> read(@RequestBody GenericRequest<Fee> request) {
		return super.read(request);
	}

	@Override
	@RequestMapping("/fee/update")
	@ResponseBody
	public GenericResponse<Fee> update(@RequestBody GenericRequest<Fee> request) {
		return super.update(request);
	}

	@Override
	@RequestMapping("/fee/delete")
	@ResponseBody
	public GenericResponse<Fee> delete(@RequestBody GenericRequest<Fee> request) {
		return super.delete(request);
	}	
	
	@Override
	@RequestMapping("/fee/list")
	@ResponseBody
	public GenericResponse<Fee> list(@RequestBody GenericRequest<Fee> request) {
		return super.list(request);
	}	
	
}