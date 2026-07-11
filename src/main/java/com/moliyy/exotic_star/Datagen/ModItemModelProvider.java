package com.moliyy.exotic_star.Datagen;

import com.moliyy.exotic_star.Exotic_Star;
import com.moliyy.exotic_star.ModItem.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,ExistingFileHelper existingFileHelper) {
        super(output, Exotic_Star.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.INDIGO_SCRAP.get());
    }
}
