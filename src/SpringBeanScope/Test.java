/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringBeanScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author ngo
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA= (HelloWorld)context.getBean("helloWorld");
        objA.setMessage("T'm object A");
        objA.getMessage();
        HelloWorld objB= (HelloWorld)context.getBean("helloWorld");
        objB.getMessage();
    }
    
}
