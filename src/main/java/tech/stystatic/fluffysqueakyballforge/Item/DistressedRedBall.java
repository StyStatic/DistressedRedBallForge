package tech.stystatic.fluffysqueakyballforge.Item;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import tech.stystatic.fluffysqueakyballforge.FluffySqueakyBall;

public class DistressedRedBall extends Item {

    private int SqueakCount;

    public DistressedRedBall(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {
            SqueakCount++;
            System.out.println(SqueakCount);

            world.playSound(
                    null,
                    player.blockPosition(),
                    FSSounds.SQUEAK_EVENT.get(),
                    SoundSource.PLAYERS,
                    1f,
                    1f
            );

            if ((SqueakCount % 10) == 0) {
                float f = 4.0F;
                player.getLevel().explode(null, player.getX(), player.getY(), player.getZ(), 4.0F, Level.ExplosionInteraction.BLOCK);
            }
        }

        return super.use(world, player, hand);
    }
}
