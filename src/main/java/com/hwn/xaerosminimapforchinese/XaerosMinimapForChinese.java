package com.hwn.xaerosminimapforchinese;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XaerosMinimapForChinese implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("xaeros-minimap-for-chinese");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Xaero's Minimap汉化模组正在初始化...");

		// Note that this is *only* for common-side initialisation,
		// client-side initialisation will be handled in XaerosMinimapForChineseClient

		LOGGER.info("Xaero's Minimap汉化模组初始化完成！");
	}
}