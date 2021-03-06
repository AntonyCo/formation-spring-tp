package com.training.spring.bigcorp;

import com.training.spring.bigcorp.config.BigCorpApplicationConfig;
import com.training.spring.bigcorp.model.ApplicationInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BigCorpApplication {

    public static void main(String[] args) {
        BigCorpApplication application = new BigCorpApplication();
        application.run();
    }

    public void run() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BigCorpApplicationConfig.class);
        ApplicationInfo applicationInfo = context.getBean(ApplicationInfo.class);
        System.out.println("==========================================================");
        System.out.println("Application [" + applicationInfo.getName() + "] - version : "
                + applicationInfo.getVersion());
        System.out.println("plus d'informations sur " + applicationInfo.getWebSiteUrl());
        System.out.println("==========================================================");
    }
}
