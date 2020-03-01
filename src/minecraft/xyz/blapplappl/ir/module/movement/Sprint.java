package xyz.blapplappl.ir.module.movement;

import org.lwjgl.input.Keyboard;
import xyz.blapplappl.ir.event.EventTarget;
import xyz.blapplappl.ir.event.events.EventUpdate;
import xyz.blapplappl.ir.module.Category;
import xyz.blapplappl.ir.module.Module;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", Keyboard.KEY_V, Category.MOVEMENT);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if(!mc.thePlayer.isCollidedHorizontally && mc.thePlayer.moveForward > 0) {
            mc.thePlayer.setSprinting(true);
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();

        mc.thePlayer.setSprinting(false);
    }
}
