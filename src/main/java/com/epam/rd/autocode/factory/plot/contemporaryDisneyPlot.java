package com.epam.rd.autocode.factory.plot;

public class contemporaryDisneyPlot implements Plot{
    StringBuilder stringBuilder = new StringBuilder();

    public contemporaryDisneyPlot(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        stringBuilder.append("In the beginning, "+hero.name()+" feels a bit awkward and uncomfortable. ");
        stringBuilder.append("But personal issue fades, when a big trouble comes - " +epicCrisis.name()+". ");
        stringBuilder.append(hero.name()+" stands up against it, but with no success at first. ");
        stringBuilder.append("But then, by putting self together and with the help of friends, including spectacular, funny " + funnyFriend.name() +", ");
        stringBuilder.append(hero.name() + " restores the spirit, overcomes the crisis and gains gratitude and respect.");
    }

    @Override
    public String asText() {
        return stringBuilder.toString();
    }
}
