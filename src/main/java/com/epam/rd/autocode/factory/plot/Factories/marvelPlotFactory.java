package com.epam.rd.autocode.factory.plot.Factories;

import com.epam.rd.autocode.factory.plot.Characters.Character;
import com.epam.rd.autocode.factory.plot.EpicCrises.EpicCrisis;
import com.epam.rd.autocode.factory.plot.Plots.Plot;
import com.epam.rd.autocode.factory.plot.Plots.marvelPlot;

public class marvelPlotFactory implements PlotFactory{
    Plot plot;
    public marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        plot = new marvelPlot(heroes, epicCrisis, villain);
    }

    @Override
    public Plot plot() {
        return plot;
    }
}
