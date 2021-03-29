package tech.itpark;

import tech.itpark.model.Request;
import tech.itpark.model.Response;
import tech.itpark.service.api.ContainerListener;
import tech.itpark.service.api.HttpServer;
import tech.itpark.service.impl.DefaultContainerListenerImpl;

public class Main {
    public static void main(String[] args) {
        ContainerListener containerListener = new DefaultContainerListenerImpl(new HttpServer() {
            @Override
            public void doGet(Response response, Request request) {
                System.out.println(response.getUrl());
                response.setStatus(200);

            }

            @Override
            public void doPost(Response response, Request request) {
                System.out.println(request.getBody());
                response.setStatus(200);
            }
        });
    }
}
