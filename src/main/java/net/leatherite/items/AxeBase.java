package net.leatherite.items;

import net.leatherite.Leatherite;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {
    public AxeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 5, -3.0f, new Settings().group(Leatherite.ALL));
    }
}
