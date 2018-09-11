package com.training.spring.bigcorp;

import com.training.spring.bigcorp.service.SiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BigCorpApplication {

    public static void main(String[] args) {
        BigCorpApplication application = new BigCorpApplication();
        application.run();
    }

    public void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BigCorpApplicationConfig.class);
        System.out.println("Application startup");
        SiteService siteService = context.getBean(SiteService.class);
        System.out.println(siteService.findById("siteA"));
        SiteService siteService2 = context.getBean(SiteService.class);
        System.out.println(siteService2.findById("siteA"));
        System.out.println(" ---------------------- START TEXT ---------------------- ");
        siteService.readFile("file:C:/Users/formation/Desktop/example.txt");
        System.out.println(" ---------------------- END TEXT ---------------------- ");
    }
}
