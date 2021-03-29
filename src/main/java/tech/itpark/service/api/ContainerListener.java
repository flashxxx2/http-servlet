package tech.itpark.service.api;

import java.net.Socket;

public interface ContainerListener {

    void registerGet(String path);

    void listen(final Socket socket);

    void registerPost(String path);

}
