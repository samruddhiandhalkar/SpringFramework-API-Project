package com.example.PracticalAPI2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping
    public List<RegionEntity> getAllRegions() {
        return regionService.getAllRegions();
    }

    @GetMapping("/{id}")
    public RegionEntity getRegionById(@PathVariable int id) {
        return regionService.getRegionById(id);
    }

    @PostMapping
    public RegionEntity createRegion(@RequestBody RegionEntity region) {
        return regionService.createRegion(region);
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable int id) {
        regionService.deleteRegion(id);
    }
}
