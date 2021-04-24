package io.github.farlandercraft.mcinfinity.blocks;

import io.github.farlandercraft.mcinfinity.blocks.entity.NetherPortalBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.entity.Entity;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.math.Direction.AxisDirection;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.block.NetherPortalBlock;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class FunkyPortal extends NetherPortalBlock implements BlockEntityProvider {

    private static final Random RANDOM = new Random();

    public FunkyPortal() {
        super(FabricBlockSettings.copyOf(Blocks.NETHER_PORTAL).resistance(Blocks.BEDROCK.getBlastResistance()).luminance(15));
        setDefaultState(this.stateManager.getDefaultState().with(AXIS, Axis.X));
    }

    @Environment(EnvType.CLIENT)
    protected ParticleEffect createParticleEffect(BlockState state, World world, BlockPos pos) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof NetherPortalBlockEntity) {
            int i = ((NetherPortalBlockEntity)blockEntity).getDimension();
            Vec3d vec3d = Vec3d.unpackRgb(i);
            double d = 1.0D + (double)(i >> 16 & 255) / 255.0D;
            return new DustParticleEffect((float)vec3d.x, (float)vec3d.y, (float)vec3d.z, (float)d);
        } else {
            //return super.createParticleEffect(state, world, pos);
            return createParticleEffect(state, world, pos);
        }
    }

    @Nullable
    public BlockEntity createBlockEntity(BlockView world) {
        return new NetherPortalBlockEntity(Math.abs(RANDOM.nextInt()));
        //return new NetherPortalBlockEntity();
    }

}
