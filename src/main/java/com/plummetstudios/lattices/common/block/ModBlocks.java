package com.plummetstudios.lattices.common.block;

import com.plummetstudios.lattices.Lattices;
import com.plummetstudios.lattices.common.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Lattices.MOD_ID);

public static final RegistryObject<Block> OAK_LATTICE = registerBlock("oak_lattice",
        () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.2F).noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SPRUCE_LATTICE = registerBlock("spruce_lattice",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.2F).noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BIRCH_LATTICE = registerBlock("birch_lattice",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.2F).noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ACACIA_LATTICE = registerBlock("acacia_lattice",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.2F).noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DARK_OAK_LATTICE = registerBlock("dark_oak_lattice",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.2F).noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> JUNGLE_LATTICE = registerBlock("jungle_lattice",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.2F).noOcclusion().sound(SoundType.WOOD)), CreativeModeTab.TAB_DECORATIONS);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus)
    {
    BLOCKS.register(eventBus);
    }
}
