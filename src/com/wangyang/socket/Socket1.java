package com.wangyang.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket1 {
	public static void main(String[] args) {
		  ServerSocket serverSocket = null;     
		  int port = 8080;     
	  	  try {         
	  		  serverSocket = new ServerSocket(port, 1,InetAddress.getByName("127.0.0.1"));     
	  		  while(true) {
	  			  Socket socket =serverSocket.accept();
	  			  System.out.println("aaaa");
	  		  }
	  	  }catch (IOException e) {     
			  e.printStackTrace();     
			  System.exit(1);     
		  }  
	  
		  
	}
}
