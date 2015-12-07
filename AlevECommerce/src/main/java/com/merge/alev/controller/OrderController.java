package com.merge.alev.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.merge.alev.dao.model.Order;
import com.merge.base.controller.GenericCRUDController;
import com.merge.base.controller.GenericRequest;
import com.merge.base.controller.GenericResponse;

@RestController
public class OrderController extends GenericCRUDController<Order> {
	
	@Override
	@RequestMapping("/order/create")
	@ResponseBody
	public GenericResponse<Order> create(@RequestBody GenericRequest<Order> request) {
		return super.create(request);
	}

	@Override
	@RequestMapping("/order/read")
	@ResponseBody
	public GenericResponse<Order> read(@RequestBody GenericRequest<Order> request) {
		return super.read(request);
	}

	@Override
	@RequestMapping("/order/update")
	@ResponseBody
	public GenericResponse<Order> update(@RequestBody GenericRequest<Order> request) {
		return super.update(request);
	}

	@Override
	@RequestMapping("/order/delete")
	@ResponseBody
	public GenericResponse<Order> delete(@RequestBody GenericRequest<Order> request) {
		return super.delete(request);
	}	
	
	@Override
	@RequestMapping("/order/list")
	@ResponseBody
	public GenericResponse<Order> list(@RequestBody GenericRequest<Order> request) {
		return super.list(request);
	}	
	
}