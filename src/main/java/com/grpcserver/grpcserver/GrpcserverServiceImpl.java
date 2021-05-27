package com.grpcserver.grpcserver;

import io.grpc.stub.StreamObserver;
//import com.grpcserver.grpcserver.*; 
import com.grpcserver.grpcserver.HelloRequest;
import com.grpcserver.grpcserver.HelloReply; 

//@GrpcService
public class GrpcserverServiceImpl extends GrpcserverServiceGrpc.GrpcserverServiceImplBase {

  
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
 
       String msgResponse = new StringBuilder()
         .append("Hello, ")
         .append(request.getName())
          .toString();
 
          HelloReply response = HelloReply.newBuilder()
          .setMessage(msgResponse)
          .build();
 
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}