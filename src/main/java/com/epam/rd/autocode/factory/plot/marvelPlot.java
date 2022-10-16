package com.epam.rd.autocode.factory.plot;

public class marvelPlot implements Plot{

    StringBuilder stringBuilder = new StringBuilder();

    public marvelPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        stringBuilder.append(epicCrisis.name() + " threatens the world. ");
        stringBuilder.append("But ");
        for(int i = 0; i < heroes.length; i++){
            if(heroes.length == 1){
                stringBuilder.append("the brave " + heroes[i].name()+" is on guard. ");
            }
            if(heroes.length>2 && i != heroes.length-2){
                stringBuilder.append("the brave " + heroes[i].name()+", ");
            }
            if(i == heroes.length-2) {
                stringBuilder.append("the brave " + heroes[i].name()+" ");
                stringBuilder.append("and the brave " + heroes[i + 1].name() + " are on guard. ");
                break;
            }
        }
        stringBuilder.append("So, no way that intrigues of "+villain.name() + " will bend the willpower of ");
        if(heroes.length > 1){
            stringBuilder.append("inflexible heroes.");
        } else stringBuilder.append("the inflexible hero.");

    }

    @Override
    public String asText() {
        return stringBuilder.toString();
    }
}
