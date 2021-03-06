package com.sharebo.entity;

import java.io.Serializable;
/**
 * 收费模式
 * @author Administrator
 *
 */
public class FeeType implements Serializable {
	private static final long serialVersionUID = 1L;
	private Double money;
	private Integer feeModel;//(1:按小时收费   2:按次收费)
	private Double maxMoney;//最高费用
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Integer getFeeModel() {
		return feeModel;
	}
	public void setFeeModel(Integer feeModel) {
		this.feeModel = feeModel;
	}
	public Double getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(Double maxMoney) {
		this.maxMoney = maxMoney;
	}
}
