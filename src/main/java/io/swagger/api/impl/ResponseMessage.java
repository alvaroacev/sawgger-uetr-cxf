package io.swagger.api.impl;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ResponseMessage implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String outputFormat = null;
		Response response = null;

		response = Response.ok(exchange.getIn().getBody()).type(outputFormat).build();

		exchange.getOut().setBody(response);

	}
}
