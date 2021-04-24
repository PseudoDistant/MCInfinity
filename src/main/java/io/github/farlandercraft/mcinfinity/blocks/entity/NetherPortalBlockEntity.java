package io.github.farlandercraft.mcinfinity.blocks.entity;

import io.github.farlandercraft.mcinfinity.Main;
import io.github.farlandercraft.mcinfinity.blocks.entity.NetherPortalBlockEntity;
import io.github.farlandercraft.mcinfinity.blocks.FunkyPortal;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.EndPortalBlockEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import org.jetbrains.annotations.Nullable;


public class NetherPortalBlockEntity extends BlockEntity {
    private int dimension;

    public NetherPortalBlockEntity() {
        super(Main.NEITHER);
    }

    public NetherPortalBlockEntity(int i) {
        this();
        this.dimension = i;
    }

    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);
        tag.putInt("Dimension", this.dimension);
        return tag;
    }

    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        this.dimension = tag.getInt("Dimension");
    }

    @Nullable
    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return new BlockEntityUpdateS2CPacket(this.pos, 15, this.toInitialChunkDataTag());
    }

    public CompoundTag toInitialChunkDataTag() {
        return this.toTag(new CompoundTag());
    }

    public int getDimension() {
        return this.dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
