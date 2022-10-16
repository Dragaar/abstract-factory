package com.epam.rd.autocode.factory.plot.EpicCrises;

import com.epam.rd.autocode.factory.plot.EpicCrises.EpicCrisis;

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
