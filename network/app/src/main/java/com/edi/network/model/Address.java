package com.edi.network.model;

public class Address {

    private String zipcode;
    private Geo geo;
    private String suite;
    private String city;
    private String street;

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getSuite() {
        return suite;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return
                "Address{" +
                        "zipcode = '" + zipcode + '\'' +
                        ",geo = '" + geo + '\'' +
                        ",suite = '" + suite + '\'' +
                        ",city = '" + city + '\'' +
                        ",street = '" + street + '\'' +
                        "}";
    }
}