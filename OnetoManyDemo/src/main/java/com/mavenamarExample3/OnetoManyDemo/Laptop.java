package com.mavenamarExample3.OnetoManyDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop_Table")
public class Laptop {
	@Id
	private String LaptopBrand;
	private String LaptopColor;
	private int LaptopPrice;
	public String getLaptopBrand() {
		return LaptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		LaptopBrand = laptopBrand;
	}
	public String getLaptopColor() {
		return LaptopColor;
	}
	public void setLaptopColor(String laptopColor) {
		LaptopColor = laptopColor;
	}
	public int getLaptopPrice() {
		return LaptopPrice;
	}
	public void setLaptopPrice(int laptopPrice) {
		LaptopPrice = laptopPrice;
	}

}
