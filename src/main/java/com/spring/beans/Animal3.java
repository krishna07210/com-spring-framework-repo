package com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Animal3 {
    private String speciesName;
    private Color color;
    private List<String> names;
    private Set<String> setNames;
    private Map<Integer, String> mapNames;

    public String getSpeciesName() {
        return speciesName;
    }

    public Map<Integer, String> getMapNames() {
        return mapNames;
    }

    public void setMapNames(Map<Integer, String> mapNames) {
        this.mapNames = mapNames;
    }

    public Set<String> getSetNames() {
        return setNames;
    }

    public void setSetNames(Set<String> setNames) {
        this.setNames = setNames;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
