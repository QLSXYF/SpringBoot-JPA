package com.example.jpa.model;

import com.example.jpa.entity.SysUser;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
public class Response extends BaseResponse<SysUser> {
	

	public static Response success(SysUser u) {
		Response response = new Response();
		response.setCode("200");
		response.setMessage("success");
		response.setResponseBody(u);
		return response;
	}
	
	public static Response fail(String code, String message) {
		Response response = new Response();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}
	
}

		