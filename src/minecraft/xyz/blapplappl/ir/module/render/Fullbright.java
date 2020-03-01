package xyz.blapplappl.ir.module.render;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.util.ChatComponentText;
import org.lwjgl.input.Keyboard;
import xyz.blapplappl.ir.event.EventTarget;
import xyz.blapplappl.ir.event.events.EventUpdate;
import xyz.blapplappl.ir.module.Category;
import xyz.blapplappl.ir.module.Module;

public class Fullbright extends Module {
    private float oldBrightness;

    public Fullbright() {
        super("Fullbright", Keyboard.KEY_Y, Category.RENDER);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        oldBrightness = mc.gameSettings.gammaSetting;

    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        mc.gameSettings.gammaSetting = 10F;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        mc.gameSettings.gammaSetting = oldBrightness;
    }
}
