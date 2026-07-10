package com.moliyy.exotic_star.ModItem;

import com.moliyy.exotic_star.Exotic_Star;
import com.moliyy.exotic_star.ModBlock.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Exotic_Star.MOD_ID);

    public static final Supplier<CreativeModeTab> EXOTIC_STAR_TAB =
            CREATIVE_MODE_TAB.register("exotic_star_tab",
            () -> CreativeModeTab.builder().icon(() ->new ItemStack(ModItems.BLUE_STEEL.get()))
            .title(Component.translatable("creaticetab.exotic_star.exotic_star_tab"))
            .displayItems((ItemDisplayParameters, output) -> {
                output.accept(ModItems.BLUE_STEEL);
                output.accept(ModBlocks.BLUE_STEEL_BLOCK);
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }



}
