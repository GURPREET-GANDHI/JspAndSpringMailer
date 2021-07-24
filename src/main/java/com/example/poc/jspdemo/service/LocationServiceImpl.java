package com.example.poc.jspdemo.service;

import com.example.poc.jspdemo.entity.Location;
import com.example.poc.jspdemo.repository.LocationRepo;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepo locationRepo;

    @Override
    public List<Location> getAll() {
        return locationRepo.findAll();
    }

    @Override
    public Location getById(Integer id) {

        Optional<Location> location = locationRepo.findById(id);

        if (!location.isPresent()) {
            throw new NoSuchElementException();
        }
        return location.get();
    }

    @Override
    public void save(Location location) {
        locationRepo.save(location);
    }

    @Override
    public void delete(Location location) {
        locationRepo.delete(location);
    }

    @Override
    public void update(Location location) {

        locationRepo.deleteById(location.getId());
        locationRepo.save(location);
    }
}
