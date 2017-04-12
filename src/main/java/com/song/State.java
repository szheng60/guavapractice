package com.song;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by xinyu on 4/11/2017.
 */
public class State {
    private String name;
    private String region;
    private String code;
    private int population;

    public State(String code, String name, String region, int population) {
        this.name = name;
        this.region = region;
        this.code = code;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", getName())
                .add("code", getCode())
                .toString();
    }
}
