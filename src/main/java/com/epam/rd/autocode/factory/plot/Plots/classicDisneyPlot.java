package com.epam.rd.autocode.factory.plot.Plots;

import com.epam.rd.autocode.factory.plot.Characters.Character;

public class classicDisneyPlot implements Plot{
    StringBuilder stringBuilder = new StringBuilder();

    public classicDisneyPlot(Character hero, Character beloved, Character villain) {
        stringBuilder.append(hero.name() + " is young and adorable. ");
        stringBuilder.append(hero.name() +" and " + beloved.name() + " love each other. ");
        stringBuilder.append(villain.name() + " interferes with their happiness, but loses in the end.");
    }

    @Override
    public String asText() {
        return stringBuilder.toString();
    }
}
