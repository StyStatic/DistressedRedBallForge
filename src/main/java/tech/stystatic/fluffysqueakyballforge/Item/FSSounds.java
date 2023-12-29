package tech.stystatic.fluffysqueakyballforge.Item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tech.stystatic.fluffysqueakyballforge.FluffySqueakyBall;

public class FSSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FluffySqueakyBall.MOD_ID);

    static ResourceLocation location = new ResourceLocation("fluffysqueakyball:squeak");

    public static final RegistryObject<SoundEvent> SQUEAK_EVENT = SOUNDS.register("squeak",
            ()-> new SoundEvent(location));

    public static void register(IEventBus eventBus){
        SOUNDS.register(eventBus);
    }
}
