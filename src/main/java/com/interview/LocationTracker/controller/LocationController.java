package com.interview.LocationTracker.controller;

import com.interview.LocationTracker.entity.Location;
import com.interview.LocationTracker.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(method= RequestMethod.POST, value="/location/add")
    public Location addLocation(@RequestBody Location location){
        return locationService.addLocation(location);
    }

    @RequestMapping(method= RequestMethod.GET, value="/location/get/{id}")
    public Location getLocation(@PathVariable("id") Integer id){
        return locationService.getLocation(id);

    }

    @RequestMapping(method= RequestMethod.DELETE, value="/location/delete/{id}")
    public void deleteLocation(@PathVariable("id") Integer id){
        locationService.deleteLocation(id);

    }

    @RequestMapping(method= RequestMethod.PUT, value="/location/edit/{id}")
    public Location editLocation(@RequestBody Location location, @PathVariable("id") Integer id){
        return locationService.editLocation(location, id);
    }


}
