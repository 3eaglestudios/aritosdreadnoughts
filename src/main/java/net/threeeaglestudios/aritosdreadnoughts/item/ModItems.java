package net.threeeaglestudios.aritosdreadnoughts.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.threeeaglestudios.aritosdreadnoughts.Aritosdreadnoughts;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Aritosdreadnoughts.MODID);


    public static final RegistryObject<Item> EXAMPLE_INGOT1 = ITEMS.register("example_ingot1",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}