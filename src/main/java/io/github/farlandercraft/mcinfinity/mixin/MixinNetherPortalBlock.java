package io.github.farlandercraft.mcinfinity.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;


@Mixin(NetherPortalBlock.class)
public abstract class MixinNetherPortalBlock extends Block {

    public MixinNetherPortalBlock(Settings settings) {
        super(settings);
    }
    /**
     * @author Mojang
     */
    @Overwrite
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!entity.hasVehicle() && !entity.hasPassengers() && entity.canUsePortals()) {
            if (!(entity instanceof ItemEntity)) {
                entity.setInNetherPortal(pos);
            }
            else {
                ItemEntity itemEntity = (ItemEntity) entity;
                if (!(itemEntity.getStack().getItem() == Items.WRITTEN_BOOK)) {
                    entity.setInNetherPortal(pos);
                } else {
                    entity.remove();
                }
            }
        }
    }
}
