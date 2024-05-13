package com.project;

import com.project.Controller.RemoteController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
//@ComponentScan(basePackageClasses= RemoteController.class)
public class SpringBootRemoteDesktopApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRemoteDesktopApplication.class, args);
    }
}
