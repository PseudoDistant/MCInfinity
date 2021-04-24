package io.github.farlandercraft.mcinfinity.dimension;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
//import net.minecraft.world.biome.source.BiomeSourceType;
import net.minecraft.world.biome.source.FixedBiomeSource;
//import net.minecraft.world.biome.source.FixedBiomeSourceConfig;
import net.minecraft.world.biome.source.VanillaLayeredBiomeSource;
import net.minecraft.world.dimension.DimensionType;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public abstract class RandomDimension extends Dimension {
    //protected final World field_23566;

    /*public RandomDimension(World world, DimensionType dimensionType, float f) {
        super(world, dimensionType, f);
        this.field_23566 = world;
    }*/
/*
    @Nullable
    public BlockPos getSpawningBlockInChunk(ChunkPos chunkPos, boolean checkMobSpawnValidity) {
        return OverworldDimension.method_26526(this.field_23566, chunkPos, checkMobSpawnValidity);
    }

    @Nullable
    public BlockPos getTopSpawningBlockPosition(int x, int z, boolean checkMobSpawnValidity) {
        return OverworldDimension.method_26525(this.field_23566, x, z, checkMobSpawnValidity);
    }

    public boolean hasVisibleSky() {
        return false;
    }

    public boolean canPlayersSleep() {
        return false;
    }

    public static FixedBiomeSource method_26572(Biome biome) {
        FixedBiomeSourceConfig fixedBiomeSourceConfig = ((FixedBiomeSourceConfig)BiomeSourceType.FIXED.getConfig(0L)).setBiome(biome);
        return new FixedBiomeSource(fixedBiomeSourceConfig);
    }

    public static VanillaLayeredBiomeSource method_26573(long l) {
        return (VanillaLayeredBiomeSource)BiomeSourceType.VANILLA_LAYERED.applyConfig(BiomeSourceType.VANILLA_LAYERED.getConfig(l));
    }*/
}
