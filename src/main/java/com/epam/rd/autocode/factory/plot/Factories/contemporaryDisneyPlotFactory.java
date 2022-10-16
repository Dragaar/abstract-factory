package com.epam.rd.autocode.factory.plot.Factories;

import com.epam.rd.autocode.factory.plot.Characters.Character;
import com.epam.rd.autocode.factory.plot.EpicCrises.EpicCrisis;
import com.epam.rd.autocode.factory.plot.Plots.Plot;
import com.epam.rd.autocode.factory.plot.Plots.contemporaryDisneyPlot;

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
