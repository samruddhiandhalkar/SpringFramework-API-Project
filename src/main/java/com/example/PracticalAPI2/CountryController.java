package com.example.PracticalAPI2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<CountryEntity> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{id}")
    public Optional<CountryEntity> getCountryById(@PathVariable int id) {
        return countryService.getCountryById(id);
    }

    @PostMapping
    public CountryEntity createCountry(@RequestBody CountryEntity country) {
        return countryService.createCountry(country);
    }

    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable int id) {
        countryService.deleteCountry(id);
    }
}
