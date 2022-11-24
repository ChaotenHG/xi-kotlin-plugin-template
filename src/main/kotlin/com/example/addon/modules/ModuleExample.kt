package com.example.addon.modules

import com.example.addon.Addon
import meteordevelopment.meteorclient.systems.modules.Module
import meteordevelopment.meteorclient.utils.player.ChatUtils
import net.minecraft.text.Text
import xyz.chaoten.ximeteor.XiAddon

object ModuleExample : Module(XiAddon.CATEGORY_Misc, "example", "An example module in a custom category.") {

    override fun onActivate() {

        ChatUtils.sendMsg(Text.of("Example module activated!"))
    }
}
