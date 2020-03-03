package sample.charts.service.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

public class MultiSerieEntry implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Name
	 */
	@ApiModelProperty(value = "name")
	private String name;

	@NotNull
	@Valid
	private List<SerieEntry> series;

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
	public List<SerieEntry> getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(List<SerieEntry> series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "MultiSerieEntry [name=" + name + ", series=" + series + "]";
	}
}
