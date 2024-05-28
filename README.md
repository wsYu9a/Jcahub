# Jcahub

<img src="https://socialify.git.ci/wsYu9a/Jcahub/image?font=Inter&language=1&name=1&owner=1&pattern=Floating%20Cogs&theme=Dark" alt="Jcahub" width="100%" height="320" /> 

## 靶场简介

**Jcahub**（Java Code Audit Hub）是一个专注于Java代码审计的靶场，致力于为初学者提供实践和学习Java代码审计的平台。

## 使用教程

以sql注入漏洞模块sqlInjection为例：

1、通过`wsyu9a/模块名:版本`拉取漏洞镜像

```
docker pull wsyu9a/sqlinjection:v1.0
```

2、运行容器

```
docker run -itd -p 8080:8080 --name sqlinjection wsyu9a/sqlinjection:v1.0
```

3、拷贝出容器内jar包

```
docker cp sqlinjection:/app.jar /xxxx
```

4、反编译

可以使用idea、jadx等工具

5、代码审计

## 目前支持

### 0x01 sqlInjection(sql注入)

- jdbc中常见的sql注入点
- mybatis中常见sql注入点

## 0x02 持续更新

敬请期待

