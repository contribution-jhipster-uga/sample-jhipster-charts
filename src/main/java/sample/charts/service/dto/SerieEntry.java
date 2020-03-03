package sample.charts.service.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class SerieEntry implements Serializable {
	
	/**
	 * Name
	 */
	@ApiModelProperty(value = "name")
	private String name;

	/**
	 * Value
	 */
	@ApiModelProperty(value = "value")
	private double value;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SerieEntry [name=" + name + ", value=" + value + "]";
	}

}
