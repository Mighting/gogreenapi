package models;

public class Zipcode {
    private int code;
    private String country;
    private String city;

    public Zipcode(int code, String country, String city) {
        this.code = code;
        this.country = country;
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
