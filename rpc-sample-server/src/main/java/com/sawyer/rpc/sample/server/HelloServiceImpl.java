package com.sawyer.rpc.sample.server;

import com.sawyer.rpc.api.HelloService;
import com.sawyer.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello! " + name;
	}
}
