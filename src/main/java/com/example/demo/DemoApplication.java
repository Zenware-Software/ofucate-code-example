package com.example.demo;


import com.example.demo.endpoint.HelloDTO;

public class DemoApplication {

    public static void main(String[] args) {

        System.err.println("Running...");

        HelloDTO hello = new HelloDTO();
        hello.setTitulo("Hello");
        hello.setDescripcion("World");
        System.err.println(hello);

    }

}
