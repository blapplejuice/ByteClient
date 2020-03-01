package xyz.blapplappl.ir.module;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import xyz.blapplappl.ir.Infared;

public class Module {
    protected Minecraft mc = Minecraft.getMinecraft();

    private String name, displayName;
    private int key;
    private Category category;
    private boolean toggled;

    public Module(String name, int key, Category category) {
        this.name = name;
        this.key = key;
        this.category = category;
        toggled = false;
    }

    public void onEnable() {
        Infared.instance.eventManager.register(this);
        if(displayName == null) {
            mc.thePlayer.addChatMessage(new ChatComponentText(ChatFormatting.GREEN + "Enabled " + ChatFormatting.LIGHT_PURPLE + ChatFormatting.BOLD + name + "."));
        }else
            mc.thePlayer.addChatMessage(new ChatComponentText(ChatFormatting.GREEN + "Enabled " + ChatFormatting.LIGHT_PURPLE + ChatFormatting.BOLD + displayName + "."));

    }
    public void onDisable() {
        Infared.instance.eventManager.unregister(this);
        if(displayName == null) {
            mc.thePlayer.addChatMessage(new ChatComponentText(ChatFormatting.RED + "Disabled " + ChatFormatting.LIGHT_PURPLE + ChatFormatting.BOLD + name + "."));
        }else
            mc.thePlayer.addChatMessage(new ChatComponentText(ChatFormatting.RED + "Disabled " + ChatFormatting.LIGHT_PURPLE + ChatFormatting.BOLD + displayName + "."));
    }

    public void onToggle() {

    }
    public void toggle() {
        toggled = !toggled;
        onToggle();
        if(toggled)
            onEnable();
        else
            onDisable();

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public boolean isToggled() {
        return toggled;
    }
    public String getDisplayName() {
        return displayName == null ? name : displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
