package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
	        packages(ApplicationConfig.class.getPackage().getName());
	        property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF/jsp");
	        register(JspMvcFeature.class);
	    }
}