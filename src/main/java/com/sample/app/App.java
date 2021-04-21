package com.sample.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.graalvm.polyglot.*;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World!");

        var context = Context
            .newBuilder("js")
            .allowAllAccess(true)
            .allowHostAccess(HostAccess.ALL)
            .allowIO(true)
                .build();

        var result = context.eval("js", "1+2");

        System.out.println(result);
    }
}
