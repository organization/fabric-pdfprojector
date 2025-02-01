package me.mocha.pdfprojector.block

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys

object ModBlocks {

    val PROJECTOR_BLOCK = register(ProjectorBlock(), ProjectorBlock.REGISTRY_KEY, true)

    fun initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register {
            it.add(PROJECTOR_BLOCK.asItem())
        }
    }

    private fun register(block: Block, blockKey: RegistryKey<Block>, registerItem: Boolean = false): Block {
        if (registerItem) {
            val itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.value)
            val blockItem = BlockItem(block, Item.Settings().registryKey(itemKey))
            Registry.register(Registries.ITEM, itemKey, blockItem)
        }
        return Registry.register(Registries.BLOCK, blockKey, block)
    }

}