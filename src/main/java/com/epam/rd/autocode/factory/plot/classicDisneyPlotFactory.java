package com.epam.rd.autocode.factory.plot;

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
