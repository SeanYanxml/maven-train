
### 常见打包命令



* maven打包命令

```
### 原生打包命令
mvn package

### 打某个模块的包
mvn clean package -pl xx-manager -am -P dev -Dmaven.test.skip=true -Dpackage=xx-manager -Dpackage.version=v1 -Dpackage.environment=dev

### 打某个子模块的子目录的包(主模块->子模块->子子模块)
mvn clean package -pl collector/xx-collector-kafkaclient -am -P test -Dmaven.test.skip=true -Dpackage=xx-collector-kafkaclient -Dpackage.version=v1 -Dpackage.environment=test
```


* assembly插件

```
### 跳过test 和 javadoc
mvn assembly:assembly -Dmaven.test.skip=true -Dmaven.javadoc.skip=true

### 单独执行single插件
mvn assembly:single

```

* docker插件

```
### docker images 构建
mvn docker:build

### docker images 推送
mvn docker:push
```

* 调试

```
#在pom.xml文件里面定义的 maven的参数 详细请看 maven -D 命令的含义
#-X To debug the command.

### profile <profile>标签
-P ${env}
```


### 常见maven插件

* 编译 maven-compiler-plugin
* 源码 maven-source-plugin
* 依赖包(单独打) maven-dependency-plugin
* 依赖包(合并打/tar包/自定义打包方式) maven-assembly-plugin
* jar包 maven-jar-plugin
* war包 maven-war-plugin
* springboot spring-boot-maven-plugin
* 依赖资源编码 maven-resources-plugin

### 生命周期


* Clean Lifecycle 在进行真正的构建之前进行一些清理工作。
* Default Lifecycle 构建的核心部分，编译，测试，打包，部署等等。
* Site Lifecycle 生成项目报告，站点，发布站点。


｀mvn clean｀

    pre-clean  执行一些需要在clean之前完成的工作
    clean  移除所有上一次构建生成的文件
    post-clean  执行一些需要在clean之后立刻完成的工作

｀site｀

    pre-site     执行一些需要在生成站点文档之前完成的工作
    site    生成项目的站点文档
    post-site     执行一些需要在生成站点文档之后完成的工作，并且为部署做准备
    site-deploy     将生成的站点文档部署到特定的服务器上
    
    
｀default｀

    validate
    generate-sources
    process-sources
    generate-resources
    process-resources     复制并处理资源文件，至目标目录，准备打包。
    compile     编译项目的源代码。
    process-classes
    generate-test-sources 
    process-test-sources
    generate-test-resources
    process-test-resources     复制并处理资源文件，至目标测试目录。
    test-compile     编译测试源代码。
    process-test-classes
    test     使用合适的单元测试框架运行测试。这些测试代码不会被打包或部署。
    prepare-package
    package     接受编译好的代码，打包成可发布的格式，如 JAR 。
    pre-integration-test
    integration-test
    post-integration-test
    verify
    install     将包安装至本地仓库，以让其它项目依赖。
    deploy     将最终的包复制到远程的仓库，以让其它开发人员与项目共享。

### 其余打包方式

* 源码打包
* 源码加依赖包打包
* 源码打包＋依赖包打包+第三方启动插件包打包

Eclipse 自带 / Maven / Fat jar / One Jar

### Reference

[1]. [Maven的几个常用plugin](https://www.cnblogs.com/zhangxh20/p/6298062.html)
[1]. [maven常用插件: 打包源码 / 跳过测试 / 单独打包依赖项](http://www.cnblogs.com/yjmyzz/p/4034502.html)
[2]. [maven关于打包的那些插件](https://zhaoyanblog.com/archives/674.html)
[3]. [Java技术--maven的assembly插件打包（依赖包归档](http://www.cnblogs.com/taxuegongzi/p/4226569.html)
[4]. [使用maven插件对java工程进行打包](http://chenzhou123520.iteye.com/blog/1706242)
[5]. [Offical Maven Plugin Doc](http://maven.apache.org/plugins/index.html)