package me.mocha.pdfprojector

import me.mocha.pdfprojector.block.ModBlocks
import me.mocha.pdfprojector.blockentity.ModBlockEntities
import net.fabricmc.api.ModInitializer

class PdfProjectorMod : ModInitializer {

    companion object {
        const val MOD_ID = "pdfprojector"
    }

    override fun onInitialize() {
        ModBlocks.initialize()
        ModBlockEntities.initialize()
    }
}
