package com.example.PracticalAPI2;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Country")
public class CountryEntity {

    @Id
    private int country_id;

    @Column(name = "country_name")
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private RegionEntity region; 

    public CountryEntity() {}

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public RegionEntity getRegion() {  
        return region;
    }

    public void setRegion(RegionEntity region) {  
        this.region = region;
    }

    @Override
    public String toString() {
        return "Countr [country_id=" + country_id + ", countryName=" + countryName +
                ", region=" + (region != null ? region.getRegionname() : "null") + "]";
    }
}
