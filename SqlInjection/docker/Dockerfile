FROM zzl93/jdk8u65_tomcat7.0.77_maven3.3.9

ADD ./SqlInjection-0.0.1-SNAPSHOT.jar app.jar
COPY ./sqlinjection.sql db.sql
COPY ./supervisord.conf /etc/supervisord.conf


RUN export DEBIAN_FRONTEND=noninteractive \
    && apt-get update \
    && apt-get install -y tzdata \
    && ln -fs /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && dpkg-reconfigure --frontend noninteractive tzdata \
    && sed -i 's/http:\/\/archive.ubuntu.com\/ubuntu\//http:\/\/mirrors.tuna.tsinghua.edu.cn\/ubuntu\//g' /etc/apt/sources.list \
    && sed -i '/security/d' /etc/apt/sources.list \
    && apt-get update -y \
    && apt-get -yqq install supervisor mariadb-server \
    && rm -rf /var/lib/mysql \
    && mysql_install_db --user=mysql --datadir=/var/lib/mysql \
    && sh -c 'mysqld_safe &' \
    && sleep 10s \
    && mysqladmin -uroot password '123456' \
    && mysql -uroot -p123456 -e "CREATE USER 'sqlinjection'@'localhost' IDENTIFIED BY '123456';" \
    && mysql -uroot -p123456 -e "GRANT ALL PRIVILEGES ON *.* TO 'sqlinjection'@'localhost' WITH GRANT OPTION;" \
    && mysql -uroot -p123456 -e "FLUSH PRIVILEGES;" \
    && mysql -e "source /db.sql;" -uroot -p123456

RUN mkdir -p /var/log/supervisor

EXPOSE 8080

CMD ["supervisord", "-n"]
