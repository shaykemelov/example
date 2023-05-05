module kz.shaykemelov.example.runner {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.tx;
    requires jakarta.persistence;
    requires java.sql;
    requires spring.context;
    requires spring.core;
    requires spring.data.jpa;
    requires spring.web;
    requires kz.shaykemelov.example.api.v1public;
    requires kz.shaykemelov.example.api.v1private;

    opens kz.shaykemelov.example.runner;
}