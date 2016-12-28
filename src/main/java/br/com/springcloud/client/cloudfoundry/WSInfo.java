package br.com.springcloud.client.cloudfoundry;

import org.springframework.cloud.service.ServiceInfo;

public class WSInfo implements ServiceInfo {

	private String id;
	private String uri;

	public WSInfo(String id, String uri) {
		this.id = id;
		this.uri = uri;
	}

	@Override
	public String getId() {
		return this.id;
	}

	public String getUri() {
		return this.uri;
	}
}
