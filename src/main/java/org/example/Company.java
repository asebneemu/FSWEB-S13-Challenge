package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // Constructor
    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    // Getter ve Setter'lar
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            throw new IllegalArgumentException("Giro sıfırdan küçük olamaz.");
        }
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    @Override
    public String toString() {
        return "Şirket{" +
                "ID=" + id +
                ", Ad='" + name + '\'' +
                ", Ciro=" + giro +
                ", Geliştiriciler=" + Arrays.toString(developerNames) +
                '}';
    }
}
