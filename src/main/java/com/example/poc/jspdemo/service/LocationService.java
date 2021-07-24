package com.example.poc.jspdemo.service;

import com.example.poc.jspdemo.entity.Location;
import java.util.List;

public interface LocationService {

    List<Location> getAll();

    Location getById(Integer id);

    void save(Location location);

    void delete(Location location);

    void update(Location location);


}
