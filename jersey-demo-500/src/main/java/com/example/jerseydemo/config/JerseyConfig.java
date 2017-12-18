package com.example.jerseydemo.config;

import org.glassfish.jersey.message.filtering.EntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.example.jerseydemo");
        register(EntityFilteringFeature.class);
    }
}