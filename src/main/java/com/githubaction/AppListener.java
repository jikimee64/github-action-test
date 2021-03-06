package com.githubaction;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@Data
public class AppListener implements ApplicationRunner {

    @Value("${kwc}")
    private String kwc;

    @Value("${username}")
    private String username;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("{}", kwc);
        System.out.println(kwc);
        log.info("{}", username);
        System.out.println(username);
    }

}
