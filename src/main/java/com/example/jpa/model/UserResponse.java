package com.example.jpa.model;

import com.example.jpa.entity.Person;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
public class UserResponse extends BaseResponse<Person> {
	

	public static UserResponse success(Person u) {
		UserResponse userResponse = new UserResponse();
		userResponse.setCode("200");
		userResponse.setMessage("success");
		userResponse.setResponseBody(u);
		return userResponse;
	}
	
	public static UserResponse fail(String code,String message) {
		UserResponse userResponse = new UserResponse();
		userResponse.setCode(code);
		userResponse.setMessage(message);
		return userResponse;
	}
	
}

		