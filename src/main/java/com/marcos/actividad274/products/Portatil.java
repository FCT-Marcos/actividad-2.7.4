package com.marcos.actividad274.products;

public class Portatil implements Producto {
	@Override
    public String getName() {
        return "Portatil";
    }

    @Override
    public double getPrice() {
        return 1000.0;
    }
}
