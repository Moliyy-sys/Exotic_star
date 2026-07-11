package com.moliyy.exotic_star.Datagen;

import com.moliyy.exotic_star.Exotic_Star;
import com.moliyy.exotic_star.ModBlock.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output,ExistingFileHelper existingFileHelper) {
        super(output, Exotic_Star.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BLUE_STEEL_DEEPSLATE_ORE.get());
    }
}
