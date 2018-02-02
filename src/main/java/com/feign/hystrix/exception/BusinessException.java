package com.feign.hystrix.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends Exception {
	
	private String code;
	
	private String msg;

}
