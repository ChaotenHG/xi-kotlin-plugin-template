package com.example.addon

import com.example.addon.commands.CommandExample
import com.example.addon.hud.HudExample
import com.example.addon.modules.ModuleExample
import com.mojang.logging.LogUtils
import meteordevelopment.meteorclient.MeteorClient
import meteordevelopment.meteorclient.systems.commands.Commands
import meteordevelopment.meteorclient.systems.hud.Hud
import meteordevelopment.meteorclient.systems.hud.HudGroup
import meteordevelopment.meteorclient.systems.modules.Category
import meteordevelopment.meteorclient.systems.modules.Modules
import org.slf4j.Logger
import xyz.chaoten.ximeteor.plugins.XiPlugin

class Addon : XiPlugin() {

    override fun onEnable() {

        // Modules
        Modules.get().add(ModuleExample)

        // Commands
        Commands.get().add(CommandExample)

        // HUD
        Hud.get().register(HudExample.info)

        MeteorClient.LOG.info("XiPlugin-Example enabled - ${this.authors.joinToString()}")

    }

    companion object {

        val LOG: Logger = LogUtils.getLogger()
    }
}

