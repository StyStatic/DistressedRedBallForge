package tech.stystatic.fluffysqueakyballforge.Item;

import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.intellij.lang.annotations.Identifier;
import tech.stystatic.fluffysqueakyballforge.FluffySqueakyBall;

public class FSItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FluffySqueakyBall.MOD_ID);

    public static final RegistryObject<Item> DistressedRedBall = ITEMS.register("distressed_red_ball",
            ()-> new DistressedRedBall(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
