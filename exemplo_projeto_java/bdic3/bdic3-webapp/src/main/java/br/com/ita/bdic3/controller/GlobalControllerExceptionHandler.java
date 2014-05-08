package br.com.ita.bdic3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.ita.bdic3.exception.APIException;

@ControllerAdvice
@EnableWebMvc
class GlobalControllerExceptionHandler {
    
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(APIException.class)
	public @ResponseBody APIException handleBadRequest(Exception ex) {
	    return new APIException(HttpStatus.BAD_REQUEST.toString(), ex.getMessage());
	} 
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(Exception.class)
	public @ResponseBody APIException handleAllException(Exception ex) {
		return new APIException(HttpStatus.BAD_REQUEST.toString(), ex.getMessage());
	}
 
}