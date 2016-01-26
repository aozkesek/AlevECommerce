package com.merge.alev.ui.service;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Component("productPageService")
public class ProductPageService implements IPageService {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response, Model model) {
		String contentType = request.getContentType();
		if (contentType == null || !contentType.startsWith("multipart/form-data"))
			return "administration/product";
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String,MultipartFile> files = multipartRequest.getFileMap();
		Map<String, String[]> paramMap = multipartRequest.getParameterMap();	
		
		for (MultipartFile picture : files.values()) {
			String name = picture.getName();
			if (name == "") {
				
			}
		}

		try {
			response.sendRedirect("/administration?activeIndex=3");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "administration/index";
	}

}