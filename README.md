# springboot-with-mybatis

- ### spring-version: 3.2.4

- ### mybatis-version: 3.0.3

- ### java-version: 17

- ### redis-version: 7.2.4

- ### mysql-version: 8.0.30

```mysql
  CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `age` int NOT NULL COMMENT '年龄',
  `message` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
  
  INSERT INTO user (name, age, message)
  VALUES ('John', 30, 'A software engineer'),
  ('Alice', 25, 'A data scientist'),
  ('Bob', 27, '');
```

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/#build-image)
* [MVC 详细参数](https://docs.spring.io/spring-framework/docs/5.1.5.RELEASE/spring-framework-reference/web.html#mvc-ann-arguments)
* [MVC 详细返回](https://docs.spring.io/spring-framework/docs/5.1.5.RELEASE/spring-framework-reference/web.html#mvc-ann-return-types)
