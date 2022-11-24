package com.example.addon.commands

import com.mojang.brigadier.Command.SINGLE_SUCCESS
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import meteordevelopment.meteorclient.systems.commands.Command
import meteordevelopment.meteorclient.utils.player.ChatUtils
import net.minecraft.command.CommandSource

object CommandExample : Command("example", "Sends a message.") {

    override fun build(builder: LiteralArgumentBuilder<CommandSource>) {

        builder.then(LiteralArgumentBuilder.literal<CommandSource>("message")
            .executes {
                ChatUtils.info("Xi", "Hello World!")
                SINGLE_SUCCESS
            }
        )
    }
}
