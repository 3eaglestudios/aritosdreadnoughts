package net.threeeaglestudios.aritosdreadnoughts.creativetab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.threeeaglestudios.aritosdreadnoughts.Aritosdreadnoughts;
import net.threeeaglestudios.aritosdreadnoughts.block.ModBlocks;
import net.threeeaglestudios.aritosdreadnoughts.item.ModItems;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Aritosdreadnoughts.MODID);

    public  static final RegistryObject<CreativeModeTab> ARITOS_DREADNOUGHTS_TAB = CREATIVE_MODE_TABS.register("aritos_dreadnoughts_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.NETHERITE_CHESTPLATE))
                    .title(Component.translatable("creativetab.aritos_dreadnoughts_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //Put them in the right order, please...

                        //Items
                        pOutput.accept(ModItems.EXAMPLE_INGOT1.get());

                          //pOutput.accept(ModItems.RAW_KALPIUM.get());


                        //Blocks
                        pOutput.accept(ModBlocks.DEC_BLOCK1.get());

                          //pOutput.accept(ModBlocks.KALPIUM_ORE.get());

                        //Entities




                        //pOutput.accept(ModItems.EXAMPLE.get())



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}