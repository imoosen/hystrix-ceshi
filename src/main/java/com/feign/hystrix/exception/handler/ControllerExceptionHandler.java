package com.feign.hystrix.exception.handler;



import com.allinpay.mcp.commons.base.ResponseMsg;
import com.feign.hystrix.constant.ErrorCode;
import com.feign.hystrix.exception.BusinessException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * TODO: RequestMapping 统一异常处理
 *
 * @author zhangd
 * @date 2017-10-31
 */
@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {
 
	/**
	 * 参数验证错误
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value={MethodArgumentNotValidException.class,BindException.class})
	@ResponseBody
	public ResponseMsg<String> paramException(BindException e, HttpServletRequest request)
	{
		List<ObjectError> errors = e.getBindingResult().getAllErrors();
	    String tips = "参数不合法";
	    if (errors.size() > 0) {
	        tips = errors.get(0).getDefaultMessage();
	    }
		log.error("请求参数错误："+ ErrorCode.ERROR_CODE_PARAMETER_ERROR,e);
		ResponseMsg body = new ResponseMsg();
		body.setCode(ErrorCode.ERROR_CODE_PARAMETER_ERROR);
		body.setMsg(tips);
		return body;
	}
	
	/**
	 * 全局统一异常处理
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value=BusinessException.class)
	@ResponseBody
	public ResponseMsg<String> handlerBusinessException(BusinessException e, HttpServletRequest request)
	{
		log.error("接口请求异常：",e);
		ResponseMsg body = new ResponseMsg();
		body.setCode(e.getCode());
		body.setMsg(e.getMessage());
		return body;
	}
	/**
	 * 全局统一异常处理
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public ResponseMsg<String> handlerException(Exception e, HttpServletRequest request)
	{
		log.error("接口请求异常："+ErrorCode.ERROR_CODE_SYS_EXCEPTION,e);
		ResponseMsg body = new ResponseMsg();
		body.setCode(ErrorCode.ERROR_CODE_SYS_EXCEPTION);
		body.setMsg("接口调用失败，请求出错");
		return body;
	}
}
