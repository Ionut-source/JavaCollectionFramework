package ro.ctrln.java.collections.practice;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Randomizer {

    public static void main(String[] args) {

        randomize();
    }

    public static void randomize() {

        try {
            List<String> brands = Files.readAllLines(Paths.get("brands.txt"));
            Collections.shuffle(brands);

            int index = 1;
            StringBuilder randomBrandsContent = new StringBuilder();
            for (String brand : brands) {
                randomBrandsContent.append(index).append(",").append(brand).append("\n");
                index++;
            }
            Files.write(Paths.get("random-brands.txt"), randomBrandsContent.toString().getBytes());
        }catch (Exception ex) {
            System.out.println("A aparut o exceptie: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
