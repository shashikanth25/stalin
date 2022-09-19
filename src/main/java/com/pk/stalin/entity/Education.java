package com.pk.stalin.entity;

import java.util.List;

public class Education {


    String school;
    String inter;
    String btech;
    List<String> citiesWhereStudied;

    public Education(String school, String inter, String btech, List<String> citiesWhereStudied) {
        this.school = school;
        this.inter = inter;
        this.btech = btech;
        this.citiesWhereStudied = citiesWhereStudied;

    }

    public String getSchool() {
        return this.school;
    }

    public String getInter() {
        return this.inter;
    }

    public String getBtech() {
        return this.btech;
    }

    public List<String> getCitiesWhereStudied() {
        return this.citiesWhereStudied;
    }

    public static Builder builder() {
        return new Education.Builder();
    }

    public static class Builder {
        String school;
        String inter;
        String btech;
        List<String> citiesWhereStudied;

        public Education.Builder school(String school){
            this.school=school;
            return this;
        }

        public Education.Builder inter(String inter){
            this.inter= inter;
            return this;
        }

        public Education.Builder btech(String btech){
            this.btech= btech;
            return this;
        }

        public Education.Builder cities(List<String> cities){
            this.citiesWhereStudied= cities;
            return this;
        }


        public Education build() {
            return new Education(this.school, this.inter, this.btech, this.citiesWhereStudied);
        }


    }

}
