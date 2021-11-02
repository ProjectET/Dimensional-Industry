package org.dimdev.dimindustry;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DimensionalIndustry implements ModInitializer {

    public static Logger LOG = LogManager.getLogger();

    public static final String MOD_ID = "dimindustry";

    public static void sendTranslatedMessage(Entity entity, String text, Object... translationArgs) {
        if (entity instanceof Player player) {
            player.displayClientMessage(new TranslatableComponent(text, translationArgs), getConfig().general.useStatusBar);
        }
    }

    public static void chat(Entity entity, String text, Object... translationArgs) {
        entity.sendMessage(new TranslatableComponent(text, translationArgs), entity.getUUID());
    }

    @Override
    public void onInitialize() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static ModConfig getConfig() {
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
}
