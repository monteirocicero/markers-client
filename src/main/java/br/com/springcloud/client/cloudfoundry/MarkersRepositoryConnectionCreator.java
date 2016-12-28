package br.com.springcloud.client.cloudfoundry;

import org.springframework.cloud.service.*;
import org.springframework.cloud.service.ServiceConnectorConfig;

import br.com.springcloud.client.MarkerRepositoryFactory;
import br.com.springcloud.client.MarkersRepository;

public class MarkersRepositoryConnectionCreator extends AbstractServiceConnectorCreator<MarkersRepository, WSInfo> {

	@Override
	public MarkersRepository create(WSInfo i, ServiceConnectorConfig c) {
		return new MarkerRepositoryFactory().create(i.getUri());
	}

}
