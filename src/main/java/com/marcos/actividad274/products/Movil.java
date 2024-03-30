package com.marcos.actividad274.products;

public class Movil implements Producto {
	@Override
    public String getName() {
        return "Movil";
    }

    @Override
    public double getPrice() {
        return 500.0;
    }
}
