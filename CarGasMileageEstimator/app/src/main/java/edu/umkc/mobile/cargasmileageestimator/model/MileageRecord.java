package edu.umkc.mobile.cargasmileageestimator.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Class representing a mileage record.
 * 
 * @author mike
 *
 */
public class MileageRecord {
	
	protected double distance;
	protected String unit;
	protected Date date;
	protected ArrayList<Double> originsLatitudes;
	protected ArrayList<Double> originsLongitudes;
	protected double gas = 15.0;
	protected double range = 450.0;
	protected double mileage = 30.0;
	protected double totalDistance = 3000;
	protected double totalGasUtilized = 100;
	
	public MileageRecord() {
		originsLatitudes = new ArrayList<Double>();
		originsLongitudes = new ArrayList<Double>();
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	public double getTotalGasUtilized() {
		return totalGasUtilized;
	}

	public void setTotalGasUtilized(double totalGasUtilized) {
		this.totalGasUtilized = totalGasUtilized;
	}

	/**
	 * Add a coordinate to the list
	 * 
	 * @param latitude
	 * @param longitude
	 */
	public void addCordinate(double latitude, double longitude) {
		originsLatitudes.add(latitude);
		originsLongitudes.add(longitude);
	}
	
	/**
	 * Get the starting latitude
	 * 
	 * @return
	 */
	public double getStartingLatitude() {
		return originsLatitudes.get(0);
	}
	
	/**
	 * Get the starting longitude coordinate
	 * 
	 * @return
	 */
	public double getStartingLongitude() {
		return originsLongitudes.get(0);
	}
	
	public double getPreviousLatitude() {
		return originsLatitudes.size() > 0 ? originsLatitudes.get(originsLatitudes.size()-1) : 0;
	}
	
	public double getPreviousLongitude() {
		return originsLongitudes.size() > 0 ? originsLongitudes.get(originsLongitudes.size()-1) : 0;
	}

}