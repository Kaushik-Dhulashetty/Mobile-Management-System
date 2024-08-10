package com.jsp.hibernate_servlet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileId;
	private String mobileModel;
	private String mobileBrand;
	private String rom;
	private String ram;
	private int mobilePrice;

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public int getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileModel=" + mobileModel + ", mobileBrand=" + mobileBrand
				+ ", rom=" + rom + ", ram=" + ram + ", mobilePrice=" + mobilePrice + "]";
	}

}
