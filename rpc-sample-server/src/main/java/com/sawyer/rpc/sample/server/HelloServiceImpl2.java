package com.sawyer.rpc.sample.server;

import com.sawyer.rpc.api.HelloService;
import com.sawyer.rpc.server.RpcService;

@RpcService(value = HelloService.class, version = "sample.hello2")
public class HelloServiceImpl2 implements HelloService {

	@Override
	public String hello(String name) {
		return "你好! " + name;
	}

}
