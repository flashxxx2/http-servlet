package tech.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Request {

    private String url;
    private int status;
    private String body;

}
