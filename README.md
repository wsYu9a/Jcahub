# Jcahub: java代码审计靶场

<img src="https://socialify.git.ci/wsYu9a/Jcahub/image?font=Inter&language=1&name=1&owner=1&pattern=Floating%20Cogs&theme=Dark" alt="Jcahub" width="100%" height="320" /> 

## 靶场简介

**Jcahub**（Java Code Audit Hub）是一个专注于Java代码审计的靶场，致力于为初学者提供实践和学习Java代码审计的平台。

## 使用教程

以sql注入漏洞模块sqlInjection为例：

1、下载Jcahub

```
git clone https://github.com/wsYu9a/Jcahub.git
```

2、选择漏洞模块

```
cd Jcahub/sqlInjection
```

3、启动漏洞环境

```
docker-compose up -d
```

4、拷贝出容器内jar包

```
docker cp sqlinjection:/app.jar /xxxx
```

5、反编译

可以使用idea、jadx等工具

6、代码审计

## 目前支持

### 0x01 sqlInjection(sql注入)

jdbc、mybatis中常见的sql注入点，如：`like`、`order by`

### 0x02 privilegeescalation(权限绕过)

常见权限绕过，如：`../` 、`;` 、`url编码` 、`Spring MVC中追加/`

### 0x03 ssrf(服务端请求伪造)

常见发起http请求的类，如：`urlConnection`、`HttpURLConnection`、`ImageIO`、`restTemplate`

### 0x04 rce(命令执行)

包含一下三种场景：

- Java中常见执行命令的方法：`Runtime#exec()`、`ProcessBuilder#start()`、`ProcessImpl#start()`
- 若依计划任务简化（通过反射调用本地方法）
- cc1中`transform`方法引起的rce（本质还是反射）

### 0x05 敬请期待
