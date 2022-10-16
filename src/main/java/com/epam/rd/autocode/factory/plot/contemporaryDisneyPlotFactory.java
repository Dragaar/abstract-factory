package com.epam.rd.autocode.factory.plot;

public class contemporaryDisneyPlotFactory implements PlotFactory{
    Plot plot;
    public contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        plot = new contemporaryDisneyPlot(hero, epicCrisis, funnyFriend);
    }

    @Override
    public Plot plot() {
        return plot;
    }
}
