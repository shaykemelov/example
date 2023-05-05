module kz.shaykemelov.example.api.v1private
{
    requires lombok;

    requires kz.shaykemelov.example.domain;
    requires com.fasterxml.jackson.annotation;

    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    exports kz.shaykemelov.example.api.v1.pri;
    exports kz.shaykemelov.example.api.v1.pri.dto.in;

    opens kz.shaykemelov.example.api.v1.pri to spring.web;
}