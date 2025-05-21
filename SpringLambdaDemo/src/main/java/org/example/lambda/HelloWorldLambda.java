package org.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.service.DemoService;

public class HelloWorldLambda implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        DemoService service = new DemoService();
        service.greet();
        return "Hello World";
    }
}
