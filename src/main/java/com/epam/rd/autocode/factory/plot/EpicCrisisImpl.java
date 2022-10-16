package com.epam.rd.autocode.factory.plot;

public class EpicCrisisImpl implements EpicCrisis {
    String name;

    public EpicCrisisImpl(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
