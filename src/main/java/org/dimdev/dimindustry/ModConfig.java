package org.dimdev.dimindustry;

import me.shedaniel.autoconfig.ConfigData;

public final class ModConfig implements ConfigData {

    public General general = new General();

    public static class General {
        public boolean useStatusBar = true;
    }

}