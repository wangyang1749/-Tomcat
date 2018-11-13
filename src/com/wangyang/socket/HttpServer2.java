package com.wangyang.socket;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer2 {
	  public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "webroot"; 
	  private static final String SHUTDOWN_COMMAND = "/SHUTDOWN"; 
	  private boolean shutdown = false; 
	  public static void main(String[] args) {
		  HttpServer2 server = new HttpServer2();      
		  server.await();     
	  }   
	  public void await() {     
		  ServerSocket serverSocket = null;     
		  int port = 8080;     
	  	  try {         
	  		  serverSocket = new ServerSocket(port, 1,InetAddress.getByName("127.0.0.1"));     
		  }catch (IOException e) {     
			  e.printStackTrace();     
			  System.exit(1);     
		  }     
	  	  // Loop waiting for a request   
		  while (!shutdown) {         
			  Socket socket = null;         
			  InputStream input = null;         
			  OutputStream output = null;         
			  	try {             
			  		  socket = serverSocket.accept(); 
			  		  Thread.sleep(100);
					  input = socket.getInputStream();             
					  output = socket.getOutputStream();                         
					  System.out.println("aa");
					  
					 // Request request = new Request(input);    // create Request object and parse         
					  //request.parse();                       
		  
//					  	StringBuffer request = new StringBuffer(2048);     
//						 int i;     
//						 byte[] buffer = new byte[2048];     
//						 try {         
//							 i = input.read(buffer);     
//						 }catch (IOException e) {         
//							 e.printStackTrace();         
//							 i = -1;     
//						 }     
//						 for (int j=0; j<i; j++) {         
//							 request.append((char) buffer[j]);     
//					     }     
//						 System.out.print(request.toString());
//						 
//						String uri = parseUri(request.toString());
//						 
						//socket.close(); 
						 
						
						//shutdown = uri.equals(SHUTDOWN_COMMAND);  
//					  Response response = new Response(output); // create Response object             
//					  response.setRequest(request);             
//					  response.sendStaticResource();                      
//					  
//					         // Close the socket       
//					  
//					  //check if the previous URI is a shutdown command          
//					        
				  }catch (Exception e) {            
					  e.printStackTrace ();             
					  continue;        
				  }     
			  }  
	  }
	  
	  private static String parseUri(String requestString) {     
			 int index1, index2;     
			 index1 = requestString.indexOf(' ');     
			 if (index1 != -1) {         
				 index2 = requestString.indexOf(' ', index1 + 1);         
				 if (index2 > index1)        
					 return requestString.substring(index1 + 1, index2);     
				 }    
			 	return null; 
	  } 
}
