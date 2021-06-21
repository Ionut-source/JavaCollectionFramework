package ro.ctrln.java.collections.model;

import java.util.Objects;

public class CarBrand {

    private int carBrandId;
    private String carBrandName;

    public CarBrand(String[] brandLineComponent) {
        this.carBrandId = Integer.parseInt(brandLineComponent[0]);
        this.carBrandName = brandLineComponent[1];
    }

    public int getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(int carBrandId) {
        this.carBrandId = carBrandId;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarBrand carBrand = (CarBrand) o;
        return carBrandId == carBrand.carBrandId && carBrandName.equals(carBrand.carBrandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrandId, carBrandName);
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "carBrandId=" + carBrandId +
                ", carBrandName='" + carBrandName + '\'' +
                '}';
    }
}
