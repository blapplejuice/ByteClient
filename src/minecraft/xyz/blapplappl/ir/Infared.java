package xyz.blapplappl.ir;

import xyz.blapplappl.ir.event.EventManager;
import org.lwjgl.opengl.Display;
import xyz.blapplappl.ir.event.EventTarget;
import xyz.blapplappl.ir.event.events.EventKey;
import xyz.blapplappl.ir.module.ModuleManager;

public class Infared {
    public String name = "Infared", version = "1", creator = "inciniride";

    public static Infared instance = new Infared();

    public EventManager eventManager;
    public ModuleManager moduleManager;

    public void startClient() {
        eventManager = new EventManager();
        moduleManager = new ModuleManager();

        System.out.println("[" + name + "] Starting Infared b" + version + ". Created by: " + creator);
        Display.setTitle(name + " b" + version + " by " + creator);

        eventManager.register(this);
    }

    public void stopClient() {
        eventManager.unregister(this);
    }

    @EventTarget
    public void onKey(EventKey event) {
        moduleManager.getModules().stream().filter(module -> module.getKey() == event.getKey()).forEach(module -> module.toggle());
    }
}
