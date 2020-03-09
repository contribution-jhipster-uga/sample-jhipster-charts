
package sample.charts.repository;

import sample.charts.service.dto.BubbleEntry;

import java.util.List;

public interface BubbleSerieEntryProjection {

	/**
	 * @return the name
	 */
    public String getName();


	/**
	 * @return the series
	 */
    public String getSerieName();

    /**
    * @return x value
    */
    public double getX();

    /**
     * @return y value
     */

    public double getY();


}
