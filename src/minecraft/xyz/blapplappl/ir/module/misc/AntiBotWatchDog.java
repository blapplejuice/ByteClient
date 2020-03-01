package xyz.blapplappl.ir.module.misc;

import net.minecraft.entity.Entity;
import org.lwjgl.input.Keyboard;
import xyz.blapplappl.ir.event.EventTarget;
import xyz.blapplappl.ir.event.events.EventUpdate;
import xyz.blapplappl.ir.module.Category;
import xyz.blapplappl.ir.module.Module;

public class AntiBotWatchDog extends Module {
    public AntiBotWatchDog() {
        super("AntiBotWatchDog", Keyboard.KEY_Z, Category.MISC);
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        for(Object entity : mc.theWorld.loadedEntityList)
            if(((Entity)entity).isInvisible() && entity != mc.thePlayer)
                mc.theWorld.removeEntity((Entity)entity);
    }
}
