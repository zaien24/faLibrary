package com.work.falibrary;

import org.springframework.boot.SpringApplication;

public class TestFaLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.from(FaLibraryApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
