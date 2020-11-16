package net.leatherite.items;

import net.leatherite.Leatherite;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {
    public HoeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -3, 0f, new Settings().group(Leatherite.ALL));
    }
}
