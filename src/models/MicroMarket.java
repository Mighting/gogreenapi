package models;

import java.sql.Date;
import java.util.ArrayList;

public class MicroMarket {

    private ArrayList<Product> products = new ArrayList<Product>();
    private int microMarketID;
    private int zipCodeID;
    private Date orderHoursStart;
    private Date orderHoursEnd;
    private Date openingHoursStart;
    private Date openingHoursEnd;
    private String streetName;
    private String houseNumber;
    private int floorNumber;
    private String phoneNumber;
    private String email;
    private String firstName;
    private String lastName;
    private int active;
    private String password;

    public MicroMarket() {
    }

    public Date getOpeningHoursStart() {
        return openingHoursStart;
    }

    public void setOpeningHoursStart(Date openingHoursStart) {
        this.openingHoursStart = openingHoursStart;
    }

    public Date getOpeningHoursEnd() {
        return openingHoursEnd;
    }

    public void setOpeningHoursEnd(Date openingHoursEnd) {
        this.openingHoursEnd = openingHoursEnd;
    }

    public Date getOrderHoursEnd() {
        return orderHoursEnd;
    }

    public void setOrderHoursEnd(Date orderHoursEnd) {
        this.orderHoursEnd = orderHoursEnd;
    }

    public Date getOrderHoursStart() {
        return orderHoursStart;
    }

    public void setOrderHoursStart(Date orderHoursStart) {
        this.orderHoursStart = orderHoursStart;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addItem(Product product){

    }

    public void removeItem(Product product){

    }

    public void updateItem(Product product){

    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getMicroMarketId() {
        return microMarketID;
    }

    public void setMicroMarketId(int microMarketId) {
        this.microMarketID = microMarketId;
    }

    public int getZipCodeID() {
        return zipCodeID;
    }

    public void setZipCodeID(int zipCodeID) {
        this.zipCodeID = zipCodeID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
