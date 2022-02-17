package com.nf.graphitetools.item;

import com.nf.graphitetools.GraphiteTools;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GraphiteTools.MOD_ID);

    public static final RegistryObject<Item> GRAPHITE_SWORD = ITEMS.register("graphite_sword",
            () -> new SwordItem(ModItemTier.GRAPHITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE_PICKAXE = ITEMS.register("graphite_pickaxe",
            () -> new PickaxeItem(ModItemTier.GRAPHITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE_SHOVEL = ITEMS.register("graphite_shovel",
            () -> new ShovelItem(ModItemTier.GRAPHITE, 1.5f, -3f, new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE_AXE = ITEMS.register("graphite_axe",
            () -> new AxeItem(ModItemTier.GRAPHITE, 5.8f, -3.05f, new Item.Properties()));

    public static final RegistryObject<Item> GRAPHITE_HOE = ITEMS.register("graphite_hoe",
            () -> new HoeItem(ModItemTier.GRAPHITE, -2, -1f, new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
