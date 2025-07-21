package com.example.PracticalAPI2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<CountryEntity> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<CountryEntity> getCountryById(int id) {
        return countryRepository.findById(id);
    }

    public CountryEntity createCountry(CountryEntity country) {
        return countryRepository.save(country);
    }

    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }
}
