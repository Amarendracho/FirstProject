package com.mavenamarExample3.OnetoManyDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Mobile_Table")
public class Mobile {
	@Id
	private String MobileBrand;
	private String MobileColor;
	private int MobilePrice;
	public String getMobileBrand() {
		return MobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		MobileBrand = mobileBrand;
	}
	public String getMobileColor() {
		return MobileColor;
	}
	public void setMobileColor(String mobileColor) {
		MobileColor = mobileColor;
	}
	public int getMobilePrice() {
		return MobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		MobilePrice = mobilePrice;
	}

}
