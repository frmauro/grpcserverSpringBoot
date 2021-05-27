package com.grpcserver.grpcserver;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@SpringBootApplication
public class GrpcserverApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		//SpringApplication.run(GrpcserverApplication.class, args);

		Server server = ServerBuilder.forPort(8030).addService(new GrpcserverServiceImpl()).build();
		server.start();
		server.awaitTermination();
	}

}
