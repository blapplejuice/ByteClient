package xyz.blapplappl.ir.module.movement;

import org.lwjgl.input.Keyboard;
import xyz.blapplappl.ir.event.EventTarget;
import xyz.blapplappl.ir.event.events.EventUpdate;
import xyz.blapplappl.ir.module.Category;
import xyz.blapplappl.ir.module.Module;

public class Fly extends Module {
    public Fly() {
        super("Fly", Keyboard.KEY_M, Category.MOVEMENT);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        this.setDisplayName("§b§lVanilla§a§lFly");

        mc.thePlayer.capabilities.isFlying = true;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        mc.thePlayer.capabilities.isFlying = false;
    }
}
