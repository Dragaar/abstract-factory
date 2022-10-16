package com.epam.rd.autocode.factory.plot.Factories;

import com.epam.rd.autocode.factory.plot.Characters.Character;
import com.epam.rd.autocode.factory.plot.Plots.Plot;
import com.epam.rd.autocode.factory.plot.Plots.classicDisneyPlot;

public class classicDisneyPlotFactory implements PlotFactory{
    Plot plot;
    public classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        plot = new classicDisneyPlot(hero, beloved, villain);
    }

    @Override
    public Plot plot() {
        return plot;
    }
}
