package com.ziki.server.mode;

import java.net.Socket;
import java.util.HashMap;

public class ClientBox 
{
	static HashMap<String, Socket> map = new HashMap<String, Socket>();
	
	//添加用户到集合
	public static void addClient(String Id,Socket socket) 
	{
		map.put(Id, socket);
	}
	
	//判断此集合中是否已经存在此用户
	
	//
}
