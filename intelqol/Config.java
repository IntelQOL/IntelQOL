package intelqol;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.awt.*;
import java.io.File;
import java.util.Arrays;

import java.io.File;

public class Config extends Vigilant {
    public static Config INSTANCE = new Config();

    @Property(type = PropertyType.SWITCH, name = "Auto Start Dungeon + Ready", description = "Automatically starts the dungeon and gets ready.",
            category = "IntelQOL", subcategory = "General")
    public boolean AutoReady = true;

    @Property(type = PropertyType.SWITCH, name = "Party Untransfer", description = "When you really dont wanna be party leader.",
            category = "IntelQOL", subcategory = "General")
    public boolean AutoUntransfer = true;

    @Property(type = PropertyType.SWITCH, name = "Enderman ESP", description = "**NOT** Needed for enderman macro.",
            category = "IntelQOL", subcategory = "General")
    public boolean EndermanESP = false;

    @Property(type = PropertyType.SWITCH, name = "Use Utility Items when Swapping", description = "Automatically use Tuba / Orb / Wand when AOTS or Whip swap are enabled",
            category = "IntelQOL", subcategory = "General")
    public boolean UseUtility = false;

    @Property(type = PropertyType.SLIDER, name = "Sword Swap Delay", description = "How often to swap swords (in miliseconds)",
            category = "IntelQOL", subcategory = "General", max = 2000)
    public int swapFrequency = 500;

    @Property(type = PropertyType.SLIDER, name = "ItemFrame Terminal Aura Delay", description = "How often to click an item frame (in miliseconds)",
            category = "IntelQOL", subcategory = "General", max = 500)
    public int auraDelay = 10;

    @Property(type = PropertyType.SLIDER, name = "Smooth Look Velocity", description = "How fast should head rotation changes be (in miliseconds)",
            category = "IntelQOL", subcategory = "General", min = 1, max = 200)
    public int smoothLookVelocity = 50;

    @Property(type = PropertyType.SLIDER, name = "Macro Range", description = "Look for entities only in radius of the player, 0 = unlimited",
            category = "IntelQOL", subcategory = "General", min = 0, max = 100)
    public int macroRadius = 0;

    public Config() {
        super(new File("./config/intelqol/config.toml"), "IntelQOL");
        initialize();
    }
}
