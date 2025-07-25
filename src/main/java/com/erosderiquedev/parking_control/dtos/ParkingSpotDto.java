package com.erosderiquedev.parking_control.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class ParkingSpotDto {
    @NotBlank
    @Size(max = 10)
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 8)
    private  String licensePlateCar;
    @NotBlank
    @Size(max = 70)
    private String brandCar;
    @NotBlank
    @Size(max = 70)
    private String modelCar;
    @NotBlank
    @Size(max = 70)
    private String colorCar;
    //@NotBlank
    //private LocalDateTime registrationDate;
    @NotBlank
    @Size(max = 100)
    private String responsibleName;
    @NotBlank
    @Size(max = 30)
    private String apartment;
    @NotBlank
    @Size(max = 30)
    private String block;

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
