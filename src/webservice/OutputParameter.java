package webservice;

import java.io.IOException;

import javax.naming.ldap.StartTlsRequest;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class OutputParameter {
	public String str = new String("hasfadsa");
	
	public String outputName() {
		return "Lannister";
	}
	HttpClient client = new HttpClient() {
		
		@Override
		public HttpParams getParams() {
			// TODO Auto-generated method stub
			String aString = new String("gh");
			aString.charAt(1);
			return null;
		}
		
		@Override
		public ClientConnectionManager getConnectionManager() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T execute(HttpHost arg0, HttpRequest arg1, ResponseHandler<? extends T> arg2, HttpContext arg3)
				throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T execute(HttpHost arg0, HttpRequest arg1, ResponseHandler<? extends T> arg2)
				throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T execute(HttpUriRequest arg0, ResponseHandler<? extends T> arg1, HttpContext arg2)
				throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public HttpResponse execute(HttpHost arg0, HttpRequest arg1, HttpContext arg2)
				throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T execute(HttpUriRequest arg0, ResponseHandler<? extends T> arg1)
				throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public HttpResponse execute(HttpHost arg0, HttpRequest arg1) throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		
		public HttpResponse execute(HttpUriRequest arg0, HttpContext arg1) throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public HttpResponse execute(HttpUriRequest arg0) throws IOException, ClientProtocolException {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	
}
