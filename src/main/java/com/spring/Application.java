package com.spring;

import com.spring.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("Beans.xml");
        Point p = (Point) applicationContext.getBean("point");
        System.out.println(p.getX());
        System.out.println(p.getY());
        Calculator c = (Calculator) applicationContext.getBean("calc");
        System.out.println(c.add());
        System.out.println(c.subtract());
        System.out.println(c.multiply());
        System.out.println(c.divide());
        System.out.println("-------------------------");

//        Animal a1 = (Animal) applicationContext.getBean("zebra1");
//        System.out.println("zebra 1 : " + a1.getColor().getColorName());

        System.out.println("-------------------------");

        Animal a3 = (Animal) applicationContext.getBean("zebra3");
        System.out.println("zebra 3 : " + a3.getColor().getColorName());
        Animal a4 = (Animal) applicationContext.getBean("zebra4");
        System.out.println("zebra 4 : " + a4.getColor().getColorName());

//        Color c1 = (Color) applicationContext.getBean("blackAndWhiteInner");
        //Above will give error: No bean named 'blackAndWhiteInner' available


        Animal2 tiger1 = (Animal2) applicationContext.getBean("tiger1");
        System.out.println("Tiger 1 : " + tiger1.getSize().getHeight());

        Animal2 tiger2 = (Animal2) applicationContext.getBean("tiger2");
        System.out.println("Tiger 2 : " + tiger2.getValidator());

        BeanValidator bean = (BeanValidator) applicationContext.getBean("validatorBean");
        System.out.println("Bean 1 : " + bean.toString());


        BeanValidator beanAlias = (BeanValidator) applicationContext.getBean("BeanValidator");
        System.out.println("Bean Alias : " + beanAlias.toString());

        Animal3 lion = (Animal3) applicationContext.getBean("lion");
        System.out.println("Lions List : " + lion.getNames());
        System.out.println("Lions Set : " + lion.getSetNames());
        System.out.println("Lions Map : " + lion.getMapNames());

//        Animal monkey1 = (Animal) applicationContext.getBean("monkey1");
//        System.out.println("Monkey : "+monkey1.getColor().getColorName());

//        Animal monkey2 = (Animal) applicationContext.getBean("monkey2");
//        System.out.println("Monkey : "+monkey2.getColor().getColorName());

//        Animal monkey3 = (Animal) applicationContext.getBean("monkey3");
//        System.out.println("Monkey : " + monkey3.getColor().getColorName());

//        Animal monkey4 = (Animal) applicationContext.getBean("monkey4");
//        System.out.println("Monkey : " + monkey4.getColor().getColorName());

//        Animal monkey5 = (Animal) applicationContext.getBean("monkey5");
//        System.out.println("Monkey5 : " + monkey5.getColor().getColorName());
    }
}
