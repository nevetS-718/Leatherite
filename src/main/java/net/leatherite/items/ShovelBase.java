package net.leatherite.items;

import net.leatherite.Leatherite;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {
    public ShovelBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 1, -3f, new Settings().group(Leatherite.ALL));
    }
}
