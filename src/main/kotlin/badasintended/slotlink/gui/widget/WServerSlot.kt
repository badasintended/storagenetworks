package badasintended.slotlink.gui.widget

import net.minecraft.item.ItemStack
import spinnery.widget.WSlot

open class WServerSlot(
    protected val onSetStack: (Int, Int, ItemStack) -> Unit
) : WSlot() {

    override fun <W : WSlot> setStack(stack: ItemStack): W {
        super.setStack<W>(stack)
        onSetStack.invoke(inventoryNumber, slotNumber, stack)
        return this as W
    }

}