package com.jaya.SpringBasic_Application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //BeanFactory factory=new XmlBeanFactory("spring.xml");
        Triangle triangle=(Triangle)context.getBean("t");
        triangle.drow();
        
        //Circle circle=(Circle) factory.getBean("c");
        //circle.draw();
    }
}
