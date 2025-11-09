package com.hwn.xaerosminimapforchinese;

import net.minecraft.text.Text;
import java.util.HashMap;
import java.util.Map;

/**
 * 信息显示翻译处理器 - 专门处理小地图上显示的信息文本
 */
public class InfoDisplayTranslationHandler {
    
    // 信息显示相关的翻译映射
    private static final Map<String, String> INFO_DISPLAY_TRANSLATIONS = new HashMap<>();
    
    static {
        // 初始化信息显示翻译映射
        
        // 坐标显示
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.coordinates", "坐标");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.x", "X");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.y", "Y");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.z", "Z");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.xyz", "XYZ");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.position", "位置");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.location", "位置");
        
        // 高度/深度信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.height", "高度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.depth", "深度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.altitude", "海拔");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.level", "等级");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.world_height", "世界高度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.sea_level", "海平面");
        
        // 生物群系信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome", "生物群系");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_info", "生物群系信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.current_biome", "当前生物群系");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_name", "生物群系名称");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_temperature", "生物群系温度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_humidity", "生物群系湿度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_rainfall", "生物群系降雨");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_grass_color", "生物群系草色");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_foliage_color", "生物群系叶子色");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.biome_water_color", "生物群系水色");
        
        // 天气信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.weather", "天气");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.weather_info", "天气信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.current_weather", "当前天气");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.clear", "晴朗");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.rain", "下雨");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.thunderstorm", "雷暴");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.sunny", "晴天");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.cloudy", "多云");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.overcast", "阴天");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.storm", "暴风雨");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.snow", "下雪");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.lightning", "闪电");
        
        // 时间信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.time", "时间");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.time_info", "时间信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.current_time", "当前时间");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.world_time", "世界时间");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.day", "白天");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.night", "夜晚");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.dawn", "黎明");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.dusk", "黄昏");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.sunrise", "日出");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.sunset", "日落");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.midnight", "午夜");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.noon", "正午");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.morning", "早晨");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.afternoon", "下午");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.evening", "傍晚");
        
        // 游戏时间
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.game_day", "游戏天数");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.days_passed", "经过天数");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.time_of_day", "一天中的时间");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.day_time", "白天时间");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.world_age", "世界年龄");
        
        // 环境信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.environment", "环境");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.environment_info", "环境信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.dimension", "维度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.world", "世界");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.world_info", "世界信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.dimension_info", "维度信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.overworld", "主世界");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.nether", "下界");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.end", "末地");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.the_end", "末地");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.the_nether", "下界");
        
        // 区块信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.chunk", "区块");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.chunk_info", "区块信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.chunk_x", "区块X");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.chunk_z", "区块Z");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.current_chunk", "当前区块");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.spawn_chunk", "出生点区块");
        
        // 方向/朝向
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.direction", "方向");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.facing", "朝向");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.heading", "航向");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.bearing", "方位");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.north", "北");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.south", "南");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.east", "东");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.west", "西");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.northeast", "东北");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.northwest", "西北");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.southeast", "东南");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.southwest", "西南");
        
        // 距离信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.distance", "距离");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.range", "范围");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.radius", "半径");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.meters", "米");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.blocks", "方块");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.units", "单位");
        
        // 速度信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.speed", "速度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.velocity", "速度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.movement_speed", "移动速度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.walking_speed", "行走速度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.flying_speed", "飞行速度");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.blocks_per_second", "方块/秒");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.mps", "米/秒");
        
        // 其他信息
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.info", "信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.information", "信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.details", "详细信息");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.stats", "统计");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.data", "数据");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.statistics", "统计");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.metrics", "指标");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.readings", "读数");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.values", "数值");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.indicators", "指示器");
        INFO_DISPLAY_TRANSLATIONS.put("xaeros.minimap.indicators", "指示器");
    }
    
    /**
     * 翻译信息显示相关文本
     * @param key 翻译键
     * @return 翻译后的文本
     */
    public static String translateInfoDisplay(String key) {
        if (key == null || key.isEmpty()) {
            return key;
        }
        
        String translation = INFO_DISPLAY_TRANSLATIONS.get(key);
        if (translation != null) {
            return translation;
        }
        
        // 如果没有找到具体翻译，尝试通用翻译
        return TranslationManager.translate(key);
    }
    
    /**
     * 翻译信息显示文本对象
     * @param text 文本对象
     * @return 翻译后的文本对象
     */
    public static Text translateInfoDisplay(Text text) {
        if (text instanceof net.minecraft.text.TranslatableTextContent) {
            net.minecraft.text.TranslatableTextContent translatable = (net.minecraft.text.TranslatableTextContent) text;
            String key = translatable.getKey();
            String translated = translateInfoDisplay(key);
            
            if (!translated.equals(key)) {
                return Text.translatable(translated);
            }
        } else {
            String rawText = text.getString();
            String translated = translateInfoDisplay(rawText);
            
            if (!translated.equals(rawText)) {
                return Text.of(translated);
            }
        }
        
        return text;
    }
}