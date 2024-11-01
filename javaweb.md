# SpringBoot+Vue全栈开发

## 1 SpringBoot快速上手

### maven项目结构

![image-20241031164541696](https://raw.githubusercontent.com/MoonHF1024/cloudepic/master/img/image-20241031164541696.png)

典型的maven项目结构如上图所示，

| 文件或文件夹               | 作用                                                         |
| -------------------------- | ------------------------------------------------------------ |
| pom.xml                    | 在parent标签中引用maven父级依赖，不必在项目中单独配置；在dependencies标签中可添加项目所需的其他依赖文件。主要作用是统一管理项目依赖 |
| src/main/java              | 放置Java源码                                                 |
| resources/static           | 放置关于网站的静态资源，例如图片、CSS和JS等，在前后端分离开发中无用 |
| resources/templates        | 放置HTML模板，在前后端分离开发中无用，前端资源不会放置于此   |
| application.properties     | SpringBoot的配置文件，可以在该文件中对SpringBoot进行配置；一般来说只需要在此文件中添加需要的配置即可，其默认配置可不做更改，SpringBoot遵从“约定优于配置”的原则 |
| HelloWorldApplication.java | SpringBoot的启动文件，Spring应用的启动需要从此文件开始       |

### 开发环境热部署

![image-20241031172334356](https://raw.githubusercontent.com/MoonHF1024/cloudepic/master/img/image-20241031172334356.png)

可在pom.xml文件中配置dependency，加入spring-boot-devtools的依赖

![image-20241101091717674](https://raw.githubusercontent.com/MoonHF1024/cloudepic/master/img/image-20241101091717674.png)

之后在application.properties文件中配置热部署生效

![image-20241101091734988](https://raw.githubusercontent.com/MoonHF1024/cloudepic/master/img/image-20241101091734988.png)

使用IDEA时还需进行如下配置才使得热部署生效

![image-20241031173703306](https://raw.githubusercontent.com/MoonHF1024/cloudepic/master/img/image-20241031173703306.png)

## 2 SpringBoot Controller

