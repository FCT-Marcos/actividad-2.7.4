package com.marcos.actividad274;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marcos.actividad274.products.Producto;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Logger logger = Logger.getLogger(Main.class.getName());
		
        Producto portatil = contexto.getBean("portatil", Producto.class);
        Producto movil = contexto.getBean("movil", Producto.class);

        logger.info("Nombre Producto: " + portatil.getName() + ", Precio: " + portatil.getPrice());
        logger.info("Nombre Producto: " + movil.getName() + ", Precio: " + movil.getPrice());

        contexto.close();
	}

}
