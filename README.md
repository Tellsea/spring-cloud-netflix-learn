# SpringCloud 分布式微服务项目

springcloud 模块非常多，一个个的学习之后，又涉及了各个模块之间的整合使用，所有这里我整理了一个 springcloud 分布式微服务基础架构，[源码传送门](https://github.com/Tellsea/spring-cloud-templete)，其中涉及的都是springcloud 中的核心模块。

搭建这样一个模块的目标是希望能实现将来实际应用上的分布式微服务脚手架项目，这样一来更能快速的在原有的基础之上，直接进行项目的开发，大量的减少重复的配置。

注意：我也是一个初学者，只是想达到自己设想的目的，然后进行各方面的设计与开发，如果说项目中有更多、更好的解决方法，还请尽快联系我，会立即进行改正，谢谢！

> 更多的相关模块还在不断的开发中...

## 核心依赖

SpringCloud 分布式微服务基础架构采用的是当前官网最新的版本。

| 依赖 | 版本 |
|:--|:--|
| Spring Boot | 2.1.5.RELEASE |
| Spring Cloud | Greenwich.RELEASE |
| tk.mybatis | 2.1.0 |
| Swagger2 | 1.9.0.RELEASE |

## 模块概述

| 模块名称 | 端口号 | 功能 |
|:--|:--|:--|
| spring-cloud-zuul | 8080 | 布式微服务网关 |
| spring-cloud-user | 8081 | 用户微服务，提供用户相关操作，也是服务提供方 |
| spring-cloud-consumer | 8082 | 消费者服务，实现服务间Feign远程调用 |
| spring-cloud-eureka | 9000 | 分布式微服务注册中心 |
| spring-cloud-boot-admin | 9001 | spring boot admin 服务监控中心 |
| spring-cloud-config | 9002 | 分布式微服务配置中心 |
| spring-cloud-zipkin | 9411 | 分布式微服务链路追踪 |

## 交流

- QQ群：957406675

- [Tellsea's blog](http://www.tellsea.cn/)

## 预览

![在这里插入图片描述](https://github.com/Tellsea/spring-cloud-templete/blob/master/doc/images/1.png)

![在这里插入图片描述](https://github.com/Tellsea/spring-cloud-templete/blob/master/doc/images/2.png)

![在这里插入图片描述](https://github.com/Tellsea/spring-cloud-templete/blob/master/doc/images/3.png)

![在这里插入图片描述](https://github.com/Tellsea/spring-cloud-templete/blob/master/doc/images/4.png)

![在这里插入图片描述](https://github.com/Tellsea/spring-cloud-templete/blob/master/doc/images/5.png)

![在这里插入图片描述](https://github.com/Tellsea/spring-cloud-templete/blob/master/doc/images/6.png)
