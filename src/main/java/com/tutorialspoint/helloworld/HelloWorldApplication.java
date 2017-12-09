package com.tutorialspoint.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;


import javax.servlet.ServletContext;


@SpringBootApplication
public class HelloWorldApplication {

	//private final TemplateEngine templateEngine;

    //public HelloWorldApplication(final ServletContext servletContext) {
//
	//	super();
//
	//	ServletContextTemplateResolver templateResolver =
	//			new ServletContextTemplateResolver(servletContext);
//
	//	// HTML is the default mode, but we set it anyway for better understanding of code
	//	templateResolver.setTemplateMode(TemplateMode.HTML);
	//	// This will convert "home" to "/WEB-INF/templates/home.html"
	//	templateResolver.setPrefix("/WEB-INF/templates/");
	//	templateResolver.setSuffix(".html");
	//	// Template cache TTL=1h. If not set, entries would be cached until expelled by LRU
	//	templateResolver.setCacheTTLMs(Long.valueOf(3600000L));
//
	//	// Cache is set to true by default. Set to false if you want templates to
	//	// be automatically updated when modified.
	//	templateResolver.setCacheable(true);
//
	//	this.templateEngine = new TemplateEngine();
	//	this.templateEngine.setTemplateResolver(templateResolver);
	//}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
