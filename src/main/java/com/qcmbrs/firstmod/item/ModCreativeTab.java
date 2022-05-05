package com.qcmbrs.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab
{
    public static final CreativeModeTab FIRST_TAB = new CreativeModeTab("firsttab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.BLOCK_1.get());
        }
    };
}
