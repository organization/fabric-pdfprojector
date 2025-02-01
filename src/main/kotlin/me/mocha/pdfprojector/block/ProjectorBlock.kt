package me.mocha.pdfprojector.block

import com.mojang.serialization.MapCodec
import me.mocha.pdfprojector.PdfProjectorMod
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos

class ProjectorBlock(
    settings: Settings = Settings.create()
        .sounds(BlockSoundGroup.GLASS)
        .strength(-1.0f, 3600000.0F)
        .requiresTool()
        .dropsNothing()
        .nonOpaque()
        .registryKey(REGISTRY_KEY),
) : BlockWithEntity(settings) {

    companion object {
        val REGISTRY_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PdfProjectorMod.MOD_ID, "projector"))
    }

    override fun getCodec(): MapCodec<out BlockWithEntity> {
        return createCodec(::ProjectorBlock)
    }

    override fun createBlockEntity(pos: BlockPos?, state: BlockState?): BlockEntity? {
        TODO("Not yet implemented")
    }

}