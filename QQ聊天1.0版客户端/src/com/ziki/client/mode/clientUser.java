package com.ziki.client.mode;

import com.ziki.common.User;

public class clientUser {
	
		// TODO Auto-generated constructor stub
		public String checkUser(User u) {
			return new clientSendServer().sendLoginInfoToServer(u);
		}
	
}
