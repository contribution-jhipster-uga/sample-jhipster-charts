package sample.charts.service.dto;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class BubbleSerieEntry implements Serializable {

	/**
	 * Name
	 */
	@ApiModelProperty(value = "name")
	private String name;

	/**
	 * x
	 */
	@ApiModelProperty(value = "series")
	private List<BubbleEntry> series;

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
	 * @return the series
	 */
	public List<BubbleEntry> getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(List<BubbleEntry> series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "BubbleSerieEntry [name=" + name + ", series=" + series + "]";
	}

}
