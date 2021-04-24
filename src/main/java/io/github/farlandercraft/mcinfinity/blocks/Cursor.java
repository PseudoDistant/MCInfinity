package io.github.farlandercraft.mcinfinity.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class Cursor extends Block {
    public Cursor() {
        super(FabricBlockSettings.copy(Blocks.STONE));
    }
}
