package ro.ctrln.java.collections.practice;

import ro.ctrln.java.collections.model.CarBrand;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HashMaps {

    public static void main(String[] args) {

        Randomizer.randomize();

        HashMap<Integer, CarBrand> brands = new HashMap<>();

        try {
            List<String> brandLines = Files.readAllLines(Paths.get("random-brands.txt"));
            for (String brandLine : brandLines) {
                String[] brandLineComponent = brandLine.split(",");
                brands.put(Integer.valueOf(brandLineComponent[0]), new CarBrand(brandLineComponent));
            }
            System.out.println("Hasmap-ul de marci este:");
            System.out.println(brands);

            ArrayList<CarBrand> carBrandsList = new ArrayList<>(brands.values());
            System.out.println("Lista de marci nearanjate: ");
            System.out.println(carBrandsList);
            System.out.println("Lista de marci aranjate: ");
            Collections.sort(carBrandsList, new Comparator<CarBrand>() {
                @Override
                public int compare(CarBrand carBrandOne, CarBrand carBrandTwo) {
                    return carBrandOne.getCarBrandName().compareTo(carBrandTwo.getCarBrandName());
                }
            });
            System.out.println(carBrandsList);
        } catch (Exception ex) {
            System.out.println("A aparut o exceptie: " + ex.getMessage());
            ex.printStackTrace();

        }
    }
}
