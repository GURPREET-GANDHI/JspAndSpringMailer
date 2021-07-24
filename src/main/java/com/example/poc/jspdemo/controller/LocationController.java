package com.example.poc.jspdemo.controller;

import com.example.poc.jspdemo.entity.Location;
import com.example.poc.jspdemo.service.LocationService;
import com.example.poc.jspdemo.util.Mailler;
import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;

    @Autowired
    Mailler mailler;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";

    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {

        String msg = "Location Created by Id" + location.getId();
        locationService.save(location);
        modelMap.put("msg", msg);
        System.out.println("Location : " + location.getName());
        List<Location> locations = locationService.getAll();
        modelMap.put("locations", locations);
        try {
            mailler.sendMail(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return "displayLocations";
    }


    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap) {
        List<Location> locations = locationService.getAll();
        modelMap.put("locations", locations);
        return "displayLocations";

    }


    @RequestMapping("/deleteLocations")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {

        Location location = locationService.getById(id);
        locationService.delete(location);
        List<Location> locations = locationService.getAll();
        modelMap.put("locations", locations);
        return "displayLocations";
    }


    @RequestMapping("/showUpdate")
    public String showUpdateLocation(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = locationService.getById(id);
        modelMap.put("location", location);
        return "updateLocation";
    }


    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        Integer id = location.getId();
        locationService.update(location);
        List<Location> locations = locationService.getAll();
        modelMap.put("locations", locations);
        return "displayLocations";
    }
}
