package org.dimdev.dimindustry.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.dimdev.dimindustry.DimensionalIndustry;

public final class ModItems {

    // Creative Tab
    public static final CreativeModeTab DIM_DOORS_CREATIVE_TAB = FabricItemGroupBuilder.build(DimensionalIndustry.id("tab"), () -> new ItemStack(Items.ENDER_PEARL));

    // Dimensional Industry items

    // Register Items
    public static void registerItems() {

    }

    // Register Item Models
    public static void registerModels() {
    	// item1.initModel();
    	// item2.initModel();
    }
}
