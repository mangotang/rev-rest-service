package org.snb.rev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by steven on 7/30/16.
 */
@SpringBootApplication(scanBasePackages = "org.snb.rev")
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }


}
