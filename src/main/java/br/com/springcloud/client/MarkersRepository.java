package br.com.springcloud.client;

import org.springframework.stereotype.Repository;

import br.com.springcloud.client.model.Marker.MarkerList;
import feign.RequestLine;

@Repository
public interface MarkersRepository {
	
	@RequestLine("GET/markers")
	MarkerList findAll();

}
