package org.example;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableVaadin
public class VaadinGalleryApplication implements AppShellConfigurator {
    public static void main(String[] args) {
        SpringApplication.run(VaadinGalleryApplication.class, args);
    }
}
