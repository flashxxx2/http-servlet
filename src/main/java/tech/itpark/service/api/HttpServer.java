package tech.itpark.service.api;

import tech.itpark.model.Request;
import tech.itpark.model.Response;

public interface HttpServer {

    void doGet(Response response, Request request);

    void doPost(Response response, Request request);
}
