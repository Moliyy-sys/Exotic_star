package com.moliyy.exotic_star.ModItem;

import com.moliyy.exotic_star.Exotic_Star;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Exotic_Star.MOD_ID);

    public static final DeferredItem<Item> BLUE_STEEL  = ITEMS.register("blue_steel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_STEEL_NUGGET = ITEMS.register("blue_steel_nugget",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem <Item> INDIGO_SCRAP = ITEMS.register("indigo_scrap",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BLUE_STEEL = ITEMS.register("raw_blue_steel",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> WAKAMO_INGOT = ITEMS.register("wakamo_ingot",
            ()->new Item(new Item.Properties()));


    /* public static final DeferredItem<Item>  GLORIOUS_CORE = ITEMS.register("glorious_core",
            ()->new GloriousCoreItem(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item>  END_SINGULARITY  = ITEMS.register("end_singularity",
            ()->new EndSingularityItem(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item>  COSMIC_NUCLEUS  = ITEMS.register("cosmic_nucleus",
            ()->new CosmicNucleusItem(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC)));
    */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }





}
