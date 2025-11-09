package com.hwn.xaerosminimapforchinese;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 翻译管理器 - 负责拦截和翻译Xaero's Minimap的文本
 */
public class TranslationManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(TranslationManager.class);
    private static final String MOD_ID = "xaeros-minimap-for-chinese";
    
    // 存储翻译映射
    private static final Map<String, String> translationMap = new ConcurrentHashMap<>();
    private static final Set<String> processedKeys = ConcurrentHashMap.newKeySet();
    
    // 常见的中英文对照翻译
    private static final Map<String, String> COMMON_TRANSLATIONS = Map.ofEntries(
        // 基础文本
        Map.entry("Minimap", "小地图"),
        Map.entry("Settings", "设置"),
        Map.entry("Waypoints", "路径点"),
        Map.entry("Add Waypoint", "添加路径点"),
        Map.entry("Edit Waypoint", "编辑路径点"),
        Map.entry("Delete Waypoint", "删除路径点"),
        Map.entry("Teleport", "传送"),
        Map.entry("Share Waypoint", "分享路径点"),
        Map.entry("Import Waypoint", "导入路径点"),
        Map.entry("Export Waypoint", "导出路径点"),
        
        // 视图设置
        Map.entry("View Settings", "视图设置"),
        Map.entry("Size", "大小"),
        Map.entry("Shape", "形状"),
        Map.entry("Square", "方形"),
        Map.entry("Circle", "圆形"),
        Map.entry("Position", "位置"),
        Map.entry("Opacity", "透明度"),
        Map.entry("Lock North", "锁定北方"),
        Map.entry("Rotate Map", "旋转地图"),
        Map.entry("Show Grid", "显示网格"),
        Map.entry("Show Entity Names", "显示实体名称"),
        Map.entry("Show Coordinates", "显示坐标"),
        Map.entry("Show Biome", "显示生物群系"),
        Map.entry("Show Light Level", "显示光照等级"),
        Map.entry("Show Time", "显示时间"),
        Map.entry("Show Y Level", "显示Y轴高度"),
        Map.entry("Show Slime Chunks", "显示史莱姆区块"),
        Map.entry("Cave Mode", "洞穴模式"),
        Map.entry("Zoom", "缩放"),
        Map.entry("Zoom Level", "缩放级别"),
        Map.entry("Lighting", "光照"),
        Map.entry("On", "开"),
        Map.entry("Off", "关"),
        Map.entry("Arrow", "箭头"),
        Map.entry("Border", "边框"),
        Map.entry("Player Arrow", "玩家箭头"),
        Map.entry("Waypoints on Map", "地图上的路径点"),
        Map.entry("Entity Icons", "实体图标"),
        Map.entry("Background", "背景"),
        Map.entry("Color Mode", "配色模式"),
        Map.entry("Vanilla", "原版"),
        Map.entry("Accurate", "准确"),
        Map.entry("Biome Colors", "生物群系颜色"),
        
        // 实体雷达
        Map.entry("Entity Radar", "实体雷达"),
        Map.entry("Entity Radar Settings", "实体雷达设置"),
        Map.entry("Display Radar", "显示雷达"),
        Map.entry("Display Names", "显示名称"),
        Map.entry("Entity Name Scale", "实体名称缩放"),
        Map.entry("Entity Name when Icon Fails", "图标失败时显示名称"),
        Map.entry("Entity Dots", "实体点"),
        Map.entry("Entity Dot Size", "实体点大小"),
        Map.entry("Smooth Dots", "平滑点"),
        Map.entry("Display Icons", "显示图标"),
        Map.entry("Always", "总是"),
        Map.entry("Never", "从不"),
        Map.entry("On Hover", "悬停时"),
        Map.entry("Entity Icon Scale", "实体图标缩放"),
        Map.entry("Always Render Entity Name Tags", "总是渲染实体名称标签"),
        Map.entry("Entity Number", "实体数量"),
        Map.entry("Entity Height Limit", "实体高度限制"),
        Map.entry("Min Y Distance for Depth Fade", "深度渐隐最小Y距离"),
        Map.entry("Main Entity as", "主实体"),
        Map.entry("Arrow Scale", "箭头缩放"),
        Map.entry("Arrow Opacity", "箭头透明度"),
        Map.entry("Display Party/Ally Players", "显示队伍/盟友玩家"),
        Map.entry("Show Entity Depth", "显示实体深度"),
        Map.entry("Display Entity Y Level", "显示实体Y轴高度"),
        Map.entry("Main Entity Dot Size", "主实体点大小"),
        Map.entry("Arrow Color", "箭头颜色"),
        Map.entry("Render Radar over Frame", "在游戏框架上渲染雷达"),
        Map.entry("Entity Category", "实体类别"),
        Map.entry("All", "全部"),
        Map.entry("Animals", "动物"),
        Map.entry("Monsters", "怪物"),
        Map.entry("Players", "玩家"),
        Map.entry("Items", "物品"),
        
        // 路径点相关
        Map.entry("Waypoint", "路径点"),
        Map.entry("Waypoint Name", "路径点名称"),
        Map.entry("Waypoint Color", "路径点颜色"),
        Map.entry("X", "X坐标"),
        Map.entry("Y", "Y坐标"),
        Map.entry("Z", "Z坐标"),
        Map.entry("Dimension", "维度"),
        Map.entry("Overworld", "主世界"),
        Map.entry("Nether", "下界"),
        Map.entry("End", "末地"),
        Map.entry("Current Location", "当前位置"),
        Map.entry("Custom Location", "自定义位置"),
        Map.entry("Save", "保存"),
        Map.entry("Cancel", "取消"),
        Map.entry("Delete", "删除"),
        Map.entry("Edit", "编辑"),
        Map.entry("Confirm", "确认"),
        Map.entry("Rename", "重命名"),
        Map.entry("Copy", "复制"),
        Map.entry("Paste", "粘贴"),
        Map.entry("Clear", "清空"),
        Map.entry("Reset", "重置"),
        Map.entry("Apply", "应用"),
        Map.entry("OK", "确定"),
        Map.entry("Back", "返回"),
        Map.entry("Next", "下一页"),
        Map.entry("Previous", "上一页"),
        Map.entry("Loading...", "加载中..."),
        Map.entry("Search", "搜索"),
        Map.entry("Filter", "过滤"),
        Map.entry("Sort", "排序"),
        Map.entry("Show All", "显示全部"),
        Map.entry("Hide All", "隐藏全部"),
        Map.entry("Enable All", "启用全部"),
        Map.entry("Disable All", "禁用全部"),
        
        // 集合管理
        Map.entry("Current Set", "当前集合"),
        Map.entry("New Set", "新建集合"),
        Map.entry("Set Name", "集合名称"),
        Map.entry("Set Color", "集合颜色"),
        Map.entry("Add to Set", "添加到集合"),
        Map.entry("Remove from Set", "从集合移除"),
        Map.entry("Set as Current", "设为当前集合"),
        Map.entry("Delete Set", "删除集合"),
        Map.entry("Rename Set", "重命名集合"),
        Map.entry("Duplicate Set", "复制集合"),
        Map.entry("Merge Sets", "合并集合"),
        Map.entry("Move Waypoint", "移动路径点"),
        Map.entry("Move Up", "上移"),
        Map.entry("Move Down", "下移"),
        Map.entry("Move to Top", "移至顶部"),
        Map.entry("Move to Bottom", "移至底部"),
        
        // 世界地图
        Map.entry("World Map", "世界地图"),
        Map.entry("World Map Settings", "世界地图设置"),
        Map.entry("Map Size", "地图大小"),
        Map.entry("Map Zoom", "地图缩放"),
        Map.entry("Map Center", "地图中心"),
        Map.entry("Show All Dimensions", "显示所有维度"),
        Map.entry("Show Overworld", "显示主世界"),
        Map.entry("Show Nether", "显示下界"),
        Map.entry("Show End", "显示末地"),
        Map.entry("Map Export", "地图导出"),
        Map.entry("Export as", "导出为"),
        Map.entry("Export Map", "导出地图"),
        Map.entry("Export Image", "导出图片"),
        Map.entry("Export Scale", "导出缩放"),
        Map.entry("Export Format", "导出格式"),
        Map.entry("Export PNG", "PNG图片"),
        Map.entry("Export JPG", "JPG图片"),
        Map.entry("Export Full", "导出完整地图"),
        Map.entry("Export Current View", "导出当前视图"),
        Map.entry("Export Progress", "导出进度"),
        Map.entry("Export Complete", "导出完成"),
        Map.entry("Export Failed", "导出失败"),
        Map.entry("Export Cancelled", "导出已取消")
    );
    
    /**
     * 初始化翻译管理器
     */
    public static void init() {
        LOGGER.info("初始化Xaero's Minimap汉化翻译管理器");
        
        // 加载翻译映射
        loadTranslations();
        
        // 注册客户端事件
        registerClientEvents();
    }
    
    /**
     * 加载翻译映射
     */
    private static void loadTranslations() {
        // 添加常见翻译
        translationMap.putAll(COMMON_TRANSLATIONS);
        
        // 从语言文件中加载翻译（如果需要）
        // 这里可以添加从JSON文件加载翻译的逻辑
        
        LOGGER.info("已加载 {} 个翻译映射", translationMap.size());
    }
    
    /**
     * 注册客户端事件
     */
    private static void registerClientEvents() {
        // 客户端生命周期事件
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
            LOGGER.info("客户端启动，汉化系统已激活");
        });
        
        // HUD渲染回调
        HudRenderCallback.EVENT.register((matrixStack, tickDelta) -> {
            // 这里可以添加HUD渲染时的翻译处理
        });
    }
    
    /**
     * 翻译文本
     * @param text 原文本
     * @return 翻译后的文本
     */
    public static String translate(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        
        // 首先检查是否已经有翻译
        String translated = translationMap.get(text);
        if (translated != null) {
            return translated;
        }
        
        // 尝试使用专门的翻译处理器
        translated = trySpecializedHandlers(text);
        if (translated != null) {
            return translated;
        }
        
        // 如果没有找到翻译，添加到待处理列表以便后续补充
        if (!processedKeys.contains(text)) {
            processedKeys.add(text);
            LOGGER.debug("发现未翻译的文本: {}", text);
        }
        
        return text;
    }
    
    /**
     * 尝试使用专门的翻译处理器
     * @param text 要翻译的文本
     * @return 翻译结果，如果没有找到则返回null
     */
    private static String trySpecializedHandlers(String text) {
        // 路径点相关翻译
        String waypointTranslation = WaypointTranslationHandler.translateWaypoint(text);
        if (waypointTranslation != null && !waypointTranslation.equals(text)) {
            return waypointTranslation;
        }
        
        // 设置界面相关翻译
        String settingsTranslation = SettingsTranslationHandler.translateSettings(text);
        if (settingsTranslation != null && !settingsTranslation.equals(text)) {
            return settingsTranslation;
        }
        
        // 信息显示相关翻译
        String infoDisplayTranslation = InfoDisplayTranslationHandler.translateInfoDisplay(text);
        if (infoDisplayTranslation != null && !infoDisplayTranslation.equals(text)) {
            return infoDisplayTranslation;
        }
        
        // 实体雷达相关翻译
        String entityRadarTranslation = EntityRadarTranslationHandler.translateEntityRadar(text);
        if (entityRadarTranslation != null && !entityRadarTranslation.equals(text)) {
            return entityRadarTranslation;
        }
        
        return null;
    }
    
    /**
     * 翻译文本对象
     * @param text 文本对象
     * @return 翻译后的文本对象
     */
    public static Text translate(Text text) {
        if (text instanceof TranslatableTextContent) {
            TranslatableTextContent translatable = (TranslatableTextContent) text;
            String key = translatable.getKey();
            String translated = translate(key);
            
            if (!translated.equals(key)) {
                return Text.translatable(translated);
            }
        } else {
            String rawText = text.getString();
            String translated = translate(rawText);
            
            if (!translated.equals(rawText)) {
                return Text.of(translated);
            }
        }
        
        return text;
    }
    
    /**
     * 翻译文本对象（使用专门处理器）
     * @param text 文本对象
     * @return 翻译后的文本对象
     */
    public static Text translateWithHandlers(Text text) {
        if (text instanceof TranslatableTextContent) {
            TranslatableTextContent translatable = (TranslatableTextContent) text;
            String key = translatable.getKey();
            String translated = translate(key);
            
            if (!translated.equals(key)) {
                return Text.translatable(translated);
            }
        } else {
            // 尝试使用专门的处理器
            Text waypointText = WaypointTranslationHandler.translateWaypoint(text);
            if (waypointText != text) {
                return waypointText;
            }
            
            Text settingsText = SettingsTranslationHandler.translateSettings(text);
            if (settingsText != text) {
                return settingsText;
            }
            
            Text infoDisplayText = InfoDisplayTranslationHandler.translateInfoDisplay(text);
            if (infoDisplayText != text) {
                return infoDisplayText;
            }
            
            Text entityRadarText = EntityRadarTranslationHandler.translateEntityRadar(text);
            if (entityRadarText != text) {
                return entityRadarText;
            }
            
            // 如果专门处理器都没有处理，则使用通用翻译
            String rawText = text.getString();
            String translated = translate(rawText);
            
            if (!translated.equals(rawText)) {
                return Text.of(translated);
            }
        }
        
        return text;
    }
    
    /**
     * 检查是否启用汉化
     * @return 是否启用汉化
     */
    public static boolean isEnabled() {
        // 默认启用汉化，可通过配置文件控制
        return true;
    }
    
    /**
     * 获取未翻译的文本列表（用于调试和补充翻译）
     * @return 未翻译的文本集合
     */
    public static Set<String> getUntranslatedKeys() {
        return new HashSet<>(processedKeys);
    }
    
    /**
     * 添加翻译
     * @param key 翻译键
     * @param value 翻译值
     */
    public static void addTranslation(String key, String value) {
        if (key != null && value != null) {
            translationMap.put(key, value);
            processedKeys.remove(key);
        }
    }
    
    /**
     * 清除翻译缓存
     */
    public static void clearCache() {
        translationMap.clear();
        processedKeys.clear();
        loadTranslations();
    }
}