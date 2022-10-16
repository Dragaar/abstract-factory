package com.epam.rd.autocode.factory.plot;

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
