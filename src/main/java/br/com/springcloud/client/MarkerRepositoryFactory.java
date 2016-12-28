package br.com.springcloud.client;

import java.net.URL;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;

public class MarkerRepositoryFactory {

	public MarkersRepository create(String url) {
		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return Feign.builder().requestInterceptor(new BasicAuthRequestInterceptor("user", "usr01"))
				.decoder(new JacksonDecoder(mapper)).target(MarkersRepository.class, url);

	}
	
	public MarkersRepository create(URL url) {
		return create(url.toString());
	}

}
