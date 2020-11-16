package net.leatherite.items;

import net.leatherite.Leatherite;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 3, -2.4f, new Settings().group(Leatherite.ALL));
    }
}
