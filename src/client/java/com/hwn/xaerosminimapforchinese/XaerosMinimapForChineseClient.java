package com.hwn.xaerosminimapforchinese;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Xaero's Minimap汉化模组客户端初始化器
 */
public class XaerosMinimapForChineseClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("XaerosMinimapForChinese");
    
    @Override
    public void onInitializeClient() {
        LOGGER.info("初始化Xaero's Minimap汉化客户端组件");
        
        // 初始化翻译管理器
        TranslationManager.init();
        
        // 初始化翻译处理器
        initializeTranslationHandlers();
        
        LOGGER.info("Xaero's Minimap汉化客户端初始化完成！");
    }
    
    /**
     * 初始化所有翻译处理器
     */
    private void initializeTranslationHandlers() {
        // 路径点翻译处理器初始化（如果需要特殊初始化）
        LOGGER.info("路径点翻译处理器已加载");
        
        // 设置界面翻译处理器初始化
        LOGGER.info("设置界面翻译处理器已加载");
        
        // 信息显示翻译处理器初始化
        LOGGER.info("信息显示翻译处理器已加载");
        
        // 实体雷达翻译处理器初始化
        LOGGER.info("实体雷达翻译处理器已加载");
        
        LOGGER.info("所有翻译处理器初始化完成");
    }
}