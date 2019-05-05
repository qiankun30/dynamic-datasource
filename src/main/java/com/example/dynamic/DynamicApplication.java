package com.example.dynamic;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@SpringBootApplication
public class DynamicApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DynamicApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("服务启动完成!");
    }

    @RequestMapping("/")
    String home() {
        return "redirect:buy";
    }
}
