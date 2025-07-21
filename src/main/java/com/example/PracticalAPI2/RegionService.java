package com.example.PracticalAPI2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<RegionEntity> getAllRegions() {
        return regionRepository.findAll();
    }

    public RegionEntity getRegionById(int id) {
        Optional<RegionEntity> region = regionRepository.findById(id);
        return region.orElse(null);
    }

    public RegionEntity createRegion(RegionEntity region) {
        return regionRepository.save(region);
    }

    public RegionEntity updateRegion(int id, RegionEntity regionDetails) {
        Optional<RegionEntity> optionalRegion = regionRepository.findById(id);
        if (optionalRegion.isPresent()) {
            RegionEntity existingRegion = optionalRegion.get();
            existingRegion.setRegionname(regionDetails.getRegionname());
            return regionRepository.save(existingRegion);
        }
        return null;
    }

    public boolean deleteRegion(int id) {
        if (regionRepository.existsById(id)) {
            regionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

