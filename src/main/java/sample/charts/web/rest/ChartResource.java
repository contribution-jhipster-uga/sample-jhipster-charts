package sample.charts.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.charts.service.dto.*;

/**
 * REST controller for chart.
 */
@RestController
@RequestMapping("/api")
public class ChartResource {

	private final Logger log = LoggerFactory.getLogger(ChartResource.class);

	@Value("${jhipster.clientApp.name}")
	private String applicationName;

	public ChartResource() {
	}

	/**
	 * {@code GET  /chart/:id} : get the "id" chart.
	 *
	 * @return a chart
	 */
	@GetMapping("/chart/{id}")
	public ResponseEntity<ChartDTO> getChart(@PathVariable Long id) {
		log.debug("REST request to get Chart : {}", id);

		if (id == 1) {
			return getMulti();
		} else if (id == 2) {
			return getSingle();
		} else {
			// TODO Bubble
			return null;
		}
	}

	private ResponseEntity<ChartDTO> getMulti() {
		ChartDTO chartDTO = new ChartDTO();
		List<MultiSerieEntry> multi = new ArrayList<MultiSerieEntry>();

		MultiSerieEntry mse;
		List<SerieEntry> series;
		SerieEntry serieEntry;

		mse = new MultiSerieEntry();
		mse.setName("GERMANY");
		series = new ArrayList<SerieEntry>();

		serieEntry = new SerieEntry();
		serieEntry.setName("January");
		serieEntry.setValue(123.0);
		series.add(serieEntry);
		serieEntry = new SerieEntry();
		serieEntry.setName("February");
		serieEntry.setValue(76.0);
		series.add(serieEntry);
		serieEntry = new SerieEntry();
		serieEntry.setName("March");
		serieEntry.setValue(150.0);
		series.add(serieEntry);
		mse.setSeries(series);
		multi.add(mse);

		mse = new MultiSerieEntry();
		mse.setName("FRANCE");
		series = new ArrayList<SerieEntry>();

		serieEntry = new SerieEntry();
		serieEntry.setName("January");
		serieEntry.setValue(150.0);
		series.add(serieEntry);
		serieEntry = new SerieEntry();
		serieEntry.setName("February");
		serieEntry.setValue(100.0);
		series.add(serieEntry);
		serieEntry = new SerieEntry();
		serieEntry.setName("March");
		serieEntry.setValue(130.0);
		series.add(serieEntry);
		mse.setSeries(series);
		multi.add(mse);

		chartDTO.setMulti(multi);
		return ResponseEntity.ok().body(chartDTO);
	}

	private ResponseEntity<ChartDTO> getSingle() {
		ChartDTO chartDTO = new ChartDTO();

		List<SerieEntry> series;
		SerieEntry serieEntry;

		series = new ArrayList<SerieEntry>();

		serieEntry = new SerieEntry();
		serieEntry.setName("January");
		serieEntry.setValue(123.0);
		series.add(serieEntry);
		serieEntry = new SerieEntry();
		serieEntry.setName("February");
		serieEntry.setValue(76.0);
		series.add(serieEntry);
		serieEntry = new SerieEntry();
		serieEntry.setName("March");
		serieEntry.setValue(150.0);
		series.add(serieEntry);

		chartDTO.setSingle(series);
		return ResponseEntity.ok().body(chartDTO);
	}

}
