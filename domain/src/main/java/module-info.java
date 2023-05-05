module kz.shaykemelov.example.domain
{
    requires jakarta.persistence;
    requires lombok;
    requires org.hibernate.orm.core;
    requires spring.data.commons;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.boot.autoconfigure;

    exports kz.shaykemelov.example.domain.entities;
    exports kz.shaykemelov.example.domain.services;

    opens kz.shaykemelov.example.domain.repositories;
    opens kz.shaykemelov.example.domain.services.impl to spring.beans;
    opens kz.shaykemelov.example.domain.entities to spring.core, org.hibernate.orm.core;
    opens kz.shaykemelov.example.domain.entities.internal to spring.core, org.hibernate.orm.core;
    opens kz.shaykemelov.example.domain.configurations;
    opens db.migration;
}