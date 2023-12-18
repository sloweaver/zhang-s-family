package com.sloweaver.springbootinit;

import com.alibaba.excel.util.StringUtils;
import freemarker.core.Environment;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * @author sloweaver
 * @date 2023/03/25
 * todo 如需开启 Redis，须移除 exclude 中的内容
 */
@SpringBootApplication(exclude = {})
@MapperScan("com.sloweaver.springbootinit.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@Slf4j
public class MainApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application =  SpringApplication.run(MainApplication.class, args);
        System.out.println(
                "  ____  __  __    ___    ___     __    ____    ____  \n" +
                        " /',__\\/\\ \\/\\ \\  /'___\\ /'___\\ /'__`\\ /',__\\  /',__\\ \n" +
                        "/\\__, `\\ \\ \\_\\ \\/\\ \\__//\\ \\__//\\  __//\\__, `\\/\\__, `\\\n" +
                        "\\/\\____/\\ \\____/\\ \\____\\ \\____\\ \\____\\/\\____/\\/\\____/\n" +
                        " \\/___/  \\/___/  \\/____/\\/____/\\/____/\\/___/  \\/___/ \n");
        ConfigurableEnvironment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        if (StringUtils.isEmpty(path)) {
            path = "";
        }
        log.info("\n----------------------------------------------------------\n\t" +
                "Application  is running! Access URLs:\n\t" +
                "Local访问网址: \t\thttp://localhost:" + port + path + "\n\t" +
                "External访问网址: \thttp://" + ip + ":" + port + path + "\n\t" +
                "----------------------------------------------------------");
        String jvmName = ManagementFactory.getRuntimeMXBean().getName();
        log.info("当前项目进程号：" + jvmName.split("@")[0]);

    }

}
