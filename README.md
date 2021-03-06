# maven-train

For maven test.

### 前言
Maven是一个用于包管理、发布部署的一个工具. 相同的类型的工具还有`Ant`,`Gradle`.

本教程内所涉及的资源都可以在此项目内找到:https://github.com/SeanYanxml/maven-train

PS: 记得我解除的第一个任务就是打包,曾经对于发现`Jar In Jar`的方式研究了一整个晚上. 正是基于Maven的理解,之后,项目内部署包以及后面的脚本都是交与我来完成.

为了和我遇到一样困惑和问题的同伴们, 近期将其整理出来, 以飨读者.

---
### 正文
本教程内主要包括如下几个部分:

[1] [Maven 安装和配置](https://yanxml.blog.csdn.net/article/details/88425557)
[2] [Eclipse Maven插件&Tomcat插件](https://yanxml.blog.csdn.net/article/details/88421382)
[3] [Maven 基本使用与远端仓库配置](https://yanxml.blog.csdn.net/article/details/88426367)
[4] [Maven的聚合和依赖](https://yanxml.blog.csdn.net/article/details/88428101)
[5] [Maven 基础命令与生命周期](https://yanxml.blog.csdn.net/article/details/88428868)
[6] [Maven 常见插件](https://yanxml.blog.csdn.net/article/details/88530783)
[7] [Maven 打包实战](https://yanxml.blog.csdn.net/article/details/88539238)
[8] [Maven 解决依赖Jar包冲突](https://yanxml.blog.csdn.net/article/details/79562288)

### 知识点

* maven 安装与本地仓库配置
* maven eclipse 插件的配置
* maven eclipse simple项目的创建和使用
* maven eclipse web项目的创建和使用
* maven springboot 项目的创建和使用
* maven 相互的聚合和依赖
* maven 生命周期
* maven 基本原理(博客)
* maven 常见的maven命令
* maven 打包插件
* maven 设置代理镜像仓库 (官方 https://mvnrepository.com/)
* maven profile 插件的管理
* maven 私有仓库的安装

---
### offical

* offical

https://mvnrepository.com/

http://maven.apache.org/

http://search.maven.org/

* plugins

http://maven.apache.org/plugins/index.html

---

### Demos

* maven-train-quickstart 快速使用maven依赖(classpath)
* maven-train-parent(聚合和依赖)
* maven-train-web
* maven-train-springboot
* maven-train-package(maven 打包与打包插件)
* maven-train-jenkins(maven与jenkins聚合使用 CI)

---

### Reference

* maven-docker

[1]. [maven构建docker镜像三部曲之一：准备环境](https://blog.csdn.net/boling_cavalry/article/details/78869466)

* train

[1]. [Maven学习总结(一)——Maven入门](http://www.cnblogs.com/xdp-gacl/p/3498271.html)

[2]. [ Maven学习 (一) 搭建Maven环境 ](http://www.cnblogs.com/quanyongan/archive/2013/04/17/3025971.html)

[3]. [Maven实战（六）--- dependencies与dependencyManagement的区别](https://blog.csdn.net/liutengteng130/article/details/46991829)

[4]. [ Maven简介（三）——profile介绍 ](http://elim.iteye.com/blog/1900568)

* plugins

[1]. [Maven的几个常用plugin](https://www.cnblogs.com/zhangxh20/p/6298062.html)

[2]. [maven常用插件: 打包源码 / 跳过测试 / 单独打包依赖项](http://www.cnblogs.com/yjmyzz/p/4034502.html)

[3]. [maven关于打包的那些插件](https://zhaoyanblog.com/archives/674.html)

[4]. [Java技术--maven的assembly插件打包（依赖包归档](http://www.cnblogs.com/taxuegongzi/p/4226569.html)

[5]. [使用maven插件对java工程进行打包](http://chenzhou123520.iteye.com/blog/1706242)

[6]. [Offical Maven Plugin Doc](http://maven.apache.org/plugins/index.html)

* 生命周期

[1]. [ Maven生命周期详解 ](http://juvenshun.iteye.com/blog/213959)