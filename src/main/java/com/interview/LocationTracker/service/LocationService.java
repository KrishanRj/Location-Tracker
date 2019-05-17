package com.interview.LocationTracker.service;

import com.interview.LocationTracker.entity.Location;
import com.interview.LocationTracker.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public Location addLocation(Location location) {
        return locationRepository.save(location);

    }

    public Location getLocation(Integer id) {
        return locationRepository.findOne(id);
    }

    public void deleteLocation(Integer id) {
        locationRepository.delete(id);
    }

    public Location editLocation(Location location, Integer id) {

        Location location1 = locationRepository.findOne(id);
        location1.setLatitude(location.getLatitude());
        location1.setLongitude(location.getLongitude());
        return locationRepository.save(location1);

    }
}
