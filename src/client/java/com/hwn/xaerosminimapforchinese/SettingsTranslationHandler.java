package com.hwn.xaerosminimapforchinese;

import net.minecraft.text.Text;
import java.util.HashMap;
import java.util.Map;

/**
 * 设置界面翻译处理器 - 专门处理设置界面的翻译
 */
public class SettingsTranslationHandler {
    
    // 设置界面相关的翻译映射
    private static final Map<String, String> SETTINGS_TRANSLATIONS = new HashMap<>();
    
    static {
        // 初始化设置翻译映射
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.settings", "小地图设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.general_settings", "一般设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.display_settings", "显示设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.interface_settings", "界面设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.ui_settings", "UI设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.overlay_settings", "覆盖层设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.hud_settings", "HUD设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.screen_settings", "屏幕设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.window_settings", "窗口设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.layout_settings", "布局设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.theme_settings", "主题设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.skin_settings", "皮肤设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.appearance_settings", "外观设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.look_settings", "外观设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.style_settings", "样式设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.visual_settings", "视觉设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.graphic_settings", "图形设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.performance_settings", "性能设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.quality_settings", "质量设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.detail_settings", "细节设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.render_settings", "渲染设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.rendering_settings", "渲染设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.effects_settings", "效果设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.particles_settings", "粒子设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.lighting_settings", "光照设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.shadows_settings", "阴影设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.reflections_settings", "反射设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.animations_settings", "动画设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.motion_settings", "运动设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.movement_settings", "移动设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.control_settings", "控制设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.input_settings", "输入设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.keyboard_settings", "键盘设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.mouse_settings", "鼠标设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.gamepad_settings", "手柄设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.controller_settings", "控制器设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.joystick_settings", "摇杆设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.audio_settings", "音频设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.sound_settings", "声音设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.music_settings", "音乐设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.volume_settings", "音量设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.effects_volume_settings", "效果音量设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.music_volume_settings", "音乐音量设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.master_volume_settings", "主音量设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.accessibility_settings", "可访问性设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.font_settings", "字体设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.text_settings", "文本设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.language_settings", "语言设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.localization_settings", "本地化设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.translation_settings", "翻译设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.advanced_settings", "高级设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.expert_settings", "专家设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.developer_settings", "开发者设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.debug_settings", "调试设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.testing_settings", "测试设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.experimental_settings", "实验性设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.beta_settings", "测试版设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.alpha_settings", "Alpha设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.preview_settings", "预览设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.new_features_settings", "新功能设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.upcoming_features_settings", "即将推出的功能设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.future_features_settings", "未来功能设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.roadmap_settings", "路线图设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.planned_features_settings", "计划功能设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.development_settings", "开发设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.build_settings", "构建设置");
        SETTINGS_TRANSLATIONS.put("xaeros.minimap.compilation_settings", "编译设置");
    }
    
    /**
     * 翻译设置相关文本
     * @param key 翻译键
     * @return 翻译后的文本
     */
    public static String translateSettings(String key) {
        if (key == null || key.isEmpty()) {
            return key;
        }
        
        String translation = SETTINGS_TRANSLATIONS.get(key);
        if (translation != null) {
            return translation;
        }
        
        // 如果没有找到具体翻译，尝试通用翻译
        return TranslationManager.translate(key);
    }
    
    /**
     * 翻译设置文本对象
     * @param text 文本对象
     * @return 翻译后的文本对象
     */
    public static Text translateSettings(Text text) {
        if (text instanceof net.minecraft.text.TranslatableTextContent) {
            net.minecraft.text.TranslatableTextContent translatable = (net.minecraft.text.TranslatableTextContent) text;
            String key = translatable.getKey();
            String translated = translateSettings(key);
            
            if (!translated.equals(key)) {
                return Text.translatable(translated);
            }
        } else {
            String rawText = text.getString();
            String translated = translateSettings(rawText);
            
            if (!translated.equals(rawText)) {
                return Text.of(translated);
            }
        }
        
        return text;
    }
}