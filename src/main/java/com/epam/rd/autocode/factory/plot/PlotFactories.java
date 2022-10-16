package com.epam.rd.autocode.factory.plot;

import com.epam.rd.autocode.factory.plot.Characters.Character;
import com.epam.rd.autocode.factory.plot.EpicCrises.EpicCrisis;
import com.epam.rd.autocode.factory.plot.Factories.PlotFactory;
import com.epam.rd.autocode.factory.plot.Factories.classicDisneyPlotFactory;
import com.epam.rd.autocode.factory.plot.Factories.contemporaryDisneyPlotFactory;
import com.epam.rd.autocode.factory.plot.Factories.marvelPlotFactory;

class PlotFactories {

    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        return new classicDisneyPlotFactory(hero, beloved, villain);
    }

    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
       return new contemporaryDisneyPlotFactory(hero, epicCrisis, funnyFriend);
    }

    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        return new marvelPlotFactory(heroes, epicCrisis, villain);
    }
}
