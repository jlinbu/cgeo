package cgeo.geocaching.googlemaps;

import cgeo.geocaching.mapinterfaces.GeoPointImpl;

import com.google.android.maps.GeoPoint;

public class googleGeoPoint extends GeoPoint implements GeoPointImpl {

	public googleGeoPoint(int latitudeE6, int longitudeE6) {
		super(latitudeE6, longitudeE6);
	}

}
