package com.nishanth.jaxwsproject;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://com.nishanth.jaxwsproject.targeNamespace/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class JaxWSWebService {

	@WebMethod(operationName = "message")
	public String getHelloMessage(@WebParam(name = "helloMessage") String helloMessage)
	{
		if(helloMessage == null){
			return "This is JAX-WS WebService As helloMessage is null";
		}
		return "This is JAX-WS WebService";
	}
}
