package com.mavenamarExample3.OnetoManyDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Watch_Table")
public class Watch {
	@Id
	private String WatchBrand;
	private String WatchColor;
	public String getWatchBrand() {
		return WatchBrand;
	}
	public void setWatchBrand(String watchBrand) {
		WatchBrand = watchBrand;
	}
	public String getWatchColor() {
		return WatchColor;
	}
	public void setWatchColor(String watchColor) {
		WatchColor = watchColor;
	}
	public int getWatchPrice() {
		return WatchPrice;
	}
	public void setWatchPrice(int watchPrice) {
		WatchPrice = watchPrice;
	}
	private int WatchPrice;

}
