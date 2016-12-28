package br.com.springcloud.client.cloudfoundry;

import java.util.Map;

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

public class MarkersWebServiceInfoCreator extends CloudFoundryServiceInfoCreator<WSInfo> {
	
	public static final String SERVICE_PREFIX = "markers";

	public MarkersWebServiceInfoCreator() {
		super(new Tags(), SERVICE_PREFIX);
	}

	@Override
	public WSInfo createServiceInfo(Map<String, Object> serviceData) {
		String id = (String) serviceData.get("name");
		Map<String,Object> credentials = getCredentials(serviceData);
		String uri = getUriFromCredentials(credentials);
		return new WSInfo(id, uri);
	}

}
