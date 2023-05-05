module kz.shaykemelov.example.api.v1public
{
    requires lombok;
    requires com.fasterxml.jackson.annotation;
    requires org.mapstruct;
    requires kz.shaykemelov.example.domain;
    requires spring.beans;
    requires spring.web;

    exports kz.shaykemelov.example.api.v1.pub;
    exports kz.shaykemelov.example.api.v1.pub.dto.in;
    exports kz.shaykemelov.example.api.v1.pub.dto.out;

    opens kz.shaykemelov.example.api.v1.pub.dto.in;
    opens kz.shaykemelov.example.api.v1.pub.dto.out;
    opens kz.shaykemelov.example.api.v1.pub to spring.beans;
    opens kz.shaykemelov.example.api.v1.pub.mappers to spring.beans;
}