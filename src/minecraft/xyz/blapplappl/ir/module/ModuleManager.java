package xyz.blapplappl.ir.module;

import xyz.blapplappl.ir.module.misc.*;
import xyz.blapplappl.ir.module.movement.*;
import xyz.blapplappl.ir.module.player.*;
import xyz.blapplappl.ir.module.render.*;
import xyz.blapplappl.ir.module.combat.*;

import java.util.ArrayList;

public class ModuleManager {
    private ArrayList<Module> modules = new ArrayList<Module>();

    public ModuleManager() {
        // COMBAT
            modules.add(new KillAura()); // R
            modules.add(new MobAura()); // P
            modules.add(new MobAuraFast()); // U

        // MOVEMENT
            modules.add(new Sprint()); // V
            modules.add(new Fly()); // M
            modules.add(new Step()); // K

        // RENDER
            modules.add(new Fullbright()); // Y

        // PLAYER
            modules.add(new NoFall());  // B

        // MISC
            modules.add(new AntiBotWatchDog()); // Z

        // NONE


    }

    public ArrayList<Module> getModules() {
        return modules;
    }
    public Module getModuleByName(String name) {
        return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

}
