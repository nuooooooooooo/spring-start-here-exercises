package codes.manon.main;

import codes.manon.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Parrot p = context.getBean("parrot", Parrot.class);
        System.out.println(p.getName());

        Parrot kiki = context.getBean("Kiki", Parrot.class);
        System.out.println(kiki);

        String hello = context.getBean("hello", String.class);
        System.out.println(hello);

        String goodbye = context.getBean("goodbye", String.class);
        System.out.println(goodbye);

        String coffee = context.getBean("coffee", String.class);
        System.out.println(coffee);

        Integer i = context.getBean("ten", Integer.class);
        System.out.println(i);

        Integer j = context.getBean("eleven", Integer.class);
        System.out.println(j);
    }
}