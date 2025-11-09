package com.hwn.xaerosminimapforchinese;

import net.minecraft.text.Text;
import java.util.HashMap;
import java.util.Map;

/**
 * 实体雷达翻译处理器 - 专门处理实体雷达系统的翻译
 */
public class EntityRadarTranslationHandler {
    
    // 实体雷达相关的翻译映射
    private static final Map<String, String> ENTITY_RADAR_TRANSLATIONS = new HashMap<>();
    
    static {
        // 初始化实体雷达翻译映射
        
        // 实体雷达基本功能
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_radar", "实体雷达");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar", "雷达");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_tracking", "实体追踪");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_detection", "实体检测");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_finder", "实体查找器");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_scanner", "实体扫描器");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_search", "实体搜索");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_monitor", "实体监控");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_spy", "实体间谍");
        
        // 实体类型
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entities", "实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.mobs", "生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.players", "玩家");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hostile_mobs", "敌对生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.passive_mobs", "被动生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.neutral_mobs", "中立生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.animals", "动物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.monsters", "怪物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.creatures", "生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.peaceful_mobs", "和平生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.friendly_mobs", "友好生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.wild_mobs", "野生生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.tamed_mobs", "驯服生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.summoned_mobs", "召唤生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.bosses", "Boss");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.minibosses", "小Boss");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.boss_mobs", "Boss生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.structure_mobs", "结构生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.dungeon_mobs", "地牢生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.end_mobs", "末地生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.nether_mobs", "下界生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.water_mobs", "水生生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.flying_mobs", "飞行生物");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.ground_mobs", "地面生物");
        
        // 具体生物类型
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.zombies", "僵尸");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.skeletons", "骷髅");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.spiders", "蜘蛛");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.creepers", "苦力怕");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.endermen", "末影人");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.blazes", "烈焰人");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.magmacubes", "岩浆怪");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.silverfish", "蠹虫");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.enderdragons", "末影龙");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.withers", "凋零");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.ghasts", "恶魂");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.witches", "女巫");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.silverfish", "蠹虫");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.silverfish", "蠹虫");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.silverfish", "蠹虫");
        
        // 被动生物
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.cows", "牛");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.pigs", "猪");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.sheep", "羊");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.chickens", "鸡");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.horses", "马");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.donkeys", "驴");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.mules", "骡子");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.cats", "猫");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.parrots", "鹦鹉");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.bats", "蝙蝠");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.ocelots", "豹猫");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.wolves", "狼");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.dogs", "狗");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.mooshrooms", "哞菇");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.squids", "鱿鱼");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.dolphins", "海豚");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.turtles", "海龟");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.axolotls", "美西螈");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.bees", "蜜蜂");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.foxes", "狐狸");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.goats", "山羊");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.glow_squids", "发光鱿鱼");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.wardens", "监守者");
        
        // 实体属性信息
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_name", "实体名称");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_type", "实体类型");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_id", "实体ID");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_count", "实体数量");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entity_total", "实体总数");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.total_entities", "总实体数");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.visible_entities", "可见实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.nearby_entities", "附近实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.surrounding_entities", "周围实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.detected_entities", "检测到实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.found_entities", "发现实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.located_entities", "定位实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.tracked_entities", "追踪实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.monitored_entities", "监控实体");
        
        // 实体状态信息
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.health", "生命值");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hp", "HP");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hearts", "心");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.lives", "生命");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.attack_damage", "攻击力");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.defense", "防御力");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.speed", "速度");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.status", "状态");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.state", "状态");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.condition", "状态");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alive", "存活");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.dead", "死亡");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alive", "存活");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hurt", "受伤");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.angry", "愤怒");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.friendly", "友好");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.neutral", "中立");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hostile", "敌对");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.passive", "被动");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.tamed", "驯服");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.wild", "野生");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.spawned", "已生成");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.active", "活跃");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.inactive", "不活跃");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.sleeping", "睡觉");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.sitting", "坐着");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.following", "跟随");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.guardian_mode", "守护模式");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.peaceful", "和平");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.dangerous", "危险");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.threat_level", "威胁等级");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.aggression_level", "攻击性等级");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.danger_rating", "危险评级");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.threat_assessment", "威胁评估");
        
        // 距离和位置信息
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.distance", "距离");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.range", "范围");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radius", "半径");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.nearby", "附近");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.close", "近距离");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.far", "远距离");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.very_close", "很近");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.very_far", "很远");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.within_range", "范围内");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.out_of_range", "范围外");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.inside_range", "在范围内");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.outside_range", "在范围外");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.in_range", "在范围");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.not_in_range", "不在范围");
        
        // 雷达设置相关
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_enabled", "雷达启用");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_disabled", "雷达禁用");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_active", "雷达激活");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_inactive", "雷达非激活");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_on", "雷达开启");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_off", "雷达关闭");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_settings", "雷达设置");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_options", "雷达选项");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_preferences", "雷达偏好");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_configuration", "雷达配置");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_config", "雷达配置");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_controls", "雷达控制");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.radar_management", "雷达管理");
        
        // 雷达显示选项
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_entities", "显示实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_entities", "隐藏实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_names", "显示名称");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_names", "隐藏名称");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_icons", "显示图标");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_icons", "隐藏图标");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_health", "显示生命值");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_health", "隐藏生命值");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_distance", "显示距离");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_distance", "隐藏距离");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_directions", "显示方向");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_directions", "隐藏方向");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_indicators", "显示指示器");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_indicators", "隐藏指示器");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_status", "显示状态");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_status", "隐藏状态");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_info", "显示信息");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_info", "隐藏信息");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_labels", "显示标签");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_labels", "隐藏标签");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_titles", "显示标题");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_titles", "隐藏标题");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_warnings", "显示警告");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_warnings", "隐藏警告");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.show_alerts", "显示警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hide_alerts", "隐藏警报");
        
        // 实体过滤
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.filter_entities", "过滤实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.filter_types", "过滤类型");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.filter_settings", "过滤设置");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.filter_options", "过滤选项");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.include_entities", "包含实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.exclude_entities", "排除实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.include_types", "包含类型");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.exclude_types", "排除类型");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.white_list", "白名单");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.black_list", "黑名单");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.allowed_entities", "允许实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.blocked_entities", "阻止实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.enabled_entities", "启用实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.disabled_entities", "禁用实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.visible_entities", "可见实体");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.invisible_entities", "不可见实体");
        
        // 警报和警告
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alerts", "警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.warnings", "警告");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.notifications", "通知");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alerts_enabled", "警报启用");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alerts_disabled", "警报禁用");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alerts_on", "警报开启");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alerts_off", "警报关闭");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alert_settings", "警报设置");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alert_options", "警报选项");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.alert_configuration", "警报配置");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.danger_alert", "危险警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.warning_alert", "警告警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.threat_alert", "威胁警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.hostile_alert", "敌对警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.boss_alert", "Boss警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.player_alert", "玩家警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.nearby_alert", "附近警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.proximity_alert", "接近警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.approach_alert", "靠近警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.entry_alert", "进入警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.exiting_alert", "离开警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.arrival_alert", "到达警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.detection_alert", "检测警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.found_alert", "发现警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.lost_alert", "丢失警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.tracking_alert", "追踪警报");
        ENTITY_RADAR_TRANSLATIONS.put("xaeros.minimap.monitoring_alert", "监控警报");
    }
    
    /**
     * 翻译实体雷达相关文本
     * @param key 翻译键
     * @return 翻译后的文本
     */
    public static String translateEntityRadar(String key) {
        if (key == null || key.isEmpty()) {
            return key;
        }
        
        String translation = ENTITY_RADAR_TRANSLATIONS.get(key);
        if (translation != null) {
            return translation;
        }
        
        // 如果没有找到具体翻译，尝试通用翻译
        return TranslationManager.translate(key);
    }
    
    /**
     * 翻译实体雷达文本对象
     * @param text 文本对象
     * @return 翻译后的文本对象
     */
    public static Text translateEntityRadar(Text text) {
        if (text instanceof net.minecraft.text.TranslatableTextContent) {
            net.minecraft.text.TranslatableTextContent translatable = (net.minecraft.text.TranslatableTextContent) text;
            String key = translatable.getKey();
            String translated = translateEntityRadar(key);
            
            if (!translated.equals(key)) {
                return Text.translatable(translated);
            }
        } else {
            String rawText = text.getString();
            String translated = translateEntityRadar(rawText);
            
            if (!translated.equals(rawText)) {
                return Text.of(translated);
            }
        }
        
        return text;
    }
}