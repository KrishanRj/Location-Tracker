package com.interview.LocationTracker.repository;

import com.interview.LocationTracker.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
