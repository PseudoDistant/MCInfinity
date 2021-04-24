package io.github.farlandercraft.mcinfinity;

import io.github.farlandercraft.mcinfinity.blocks.Cursor;
import io.github.farlandercraft.mcinfinity.blocks.FunkyPortal;
import io.github.farlandercraft.mcinfinity.blocks.entity.NetherPortalBlockEntity;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.EndPortalBlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Main implements ModInitializer {

	public static final Block BookBlock = new BookBox();
	public static final Block FunkyPortal = new FunkyPortal();
	public static final Block Cursor = new Cursor();
	public static BlockEntityType<NetherPortalBlockEntity> NEITHER;
	@Override
	public void onInitialize() {
		//public static BlockEntityType<NetherPortalBlockEntity> NEITHER;
		//END_PORTAL = create("end_portal", BlockEntityType.Builder.create(EndPortalBlockEntity::new, Blocks.END_PORTAL));
		NEITHER = Registry.register(Registry.BLOCK_ENTITY_TYPE, "mcinfinity:neither", BlockEntityType.Builder.create(NetherPortalBlockEntity::new, FunkyPortal).build(null));
		//Registry.register(Registry.BLOCK_ENTITY_TYPE, "modid:demo", BlockEntityType.Builder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));

		Registry.register(Registry.BLOCK, new Identifier("mcinfinity", "book_box"), BookBlock);
		Registry.register(Registry.BLOCK, new Identifier("mcinfinity", "neither_portal"), FunkyPortal);
		Registry.register(Registry.BLOCK, new Identifier("mcinfinity", "cursor"), Cursor);
		Registry.register(Registry.ITEM, new Identifier("mcinfinity", "book_box"), new BlockItem(BookBlock, new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("mcinfinity", "cursor"), new BlockItem(Cursor, new Item.Settings().group(ItemGroup.MISC)));

		System.out.println("Test Le Startup. If you are not reading this your PC go boom, or you're using Mac because Mac is garbage. :sataniaEvil:");
	}
}
