package xyz.blapplappl.ir.module.player;

import net.minecraft.network.play.client.C03PacketPlayer;
import org.lwjgl.input.Keyboard;
import xyz.blapplappl.ir.event.EventTarget;
import xyz.blapplappl.ir.event.events.EventUpdate;
import xyz.blapplappl.ir.module.Category;
import xyz.blapplappl.ir.module.Module;

public class NoFall extends Module {
    public NoFall() {
        super("NoFall", Keyboard.KEY_B, Category.PLAYER);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if(mc.thePlayer.fallDistance > 2F)
            mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
    }
}
