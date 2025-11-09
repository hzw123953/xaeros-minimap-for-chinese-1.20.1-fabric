package com.hwn.xaerosminimapforchinese;

import net.minecraft.text.Text;
import java.util.HashMap;
import java.util.Map;

/**
 * 路径点翻译处理器 - 专门处理路径点相关的翻译
 */
public class WaypointTranslationHandler {
    
    // 路径点相关的翻译映射
    private static final Map<String, String> WAYPOINT_TRANSLATIONS = new HashMap<>();
    
    static {
        // 初始化路径点翻译映射
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.add_waypoint", "添加路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.edit_waypoint", "编辑路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.delete_waypoint", "删除路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.teleport_to_waypoint", "传送至路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.share_waypoint", "分享路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.import_waypoint", "导入路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.export_waypoint", "导出路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_name", "路径点名称");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_color", "路径点颜色");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_x", "X坐标");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_y", "Y坐标");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_z", "Z坐标");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_dimension", "维度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_set", "路径点集合");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_icon", "路径点图标");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_visible", "路径点可见性");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_enabled", "路径点启用");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_disabled", "路径点禁用");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_hidden", "路径点隐藏");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_shown", "路径点显示");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_current", "当前路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_target", "目标路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_destination", "路径点目的地");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_arrival", "路径点到达");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_distance", "距离路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_direction", "路径点方向");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_bearing", "路径点方位");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_compass", "路径点指南针");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_navigation", "路径点导航");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_tracker", "路径点追踪器");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_marker", "路径点标记");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_flag", "路径点旗帜");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_beacon", "路径点信标");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_pin", "路径点图钉");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_dot", "路径点点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_circle", "路径点圆圈");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_square", "路径点方块");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_triangle", "路径点三角");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_star", "路径点星形");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoint_cross", "路径点十字");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints", "路径点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_menu", "路径点菜单");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_list", "路径点列表");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_view", "路径点视图");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_display", "路径点显示");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_settings", "路径点设置");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_options", "路径点选项");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_preferences", "路径点偏好");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_configuration", "路径点配置");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_management", "路径点管理");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_organization", "路径点组织");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_sorting", "路径点排序");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_filtering", "路径点过滤");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_searching", "路径点搜索");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_finding", "路径点查找");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_locating", "路径点定位");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_positioning", "路径点定位");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_placing", "路径点放置");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_setting", "路径点设置");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_creating", "路径点创建");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_making", "路径点制作");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_adding", "路径点添加");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_inserting", "路径点插入");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_renaming", "路径点重命名");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_moving", "路径点移动");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_coping", "路径点复制");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_duplicating", "路径点复制");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_cloning", "路径点克隆");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_copying", "路径点复制");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_pasting", "路径点粘贴");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_importing", "路径点导入");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_exporting", "路径点导出");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_sharing", "路径点分享");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_loading", "路径点加载");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_saving", "路径点保存");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_storing", "路径点存储");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_recording", "路径点记录");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_logging", "路径点记录");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_archiving", "路径点归档");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_backing_up", "路径点备份");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_teleporting", "路径点传送");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_traveling", "路径点旅行");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_journeying", "路径点旅程");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_visiting", "路径点访问");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_exploring", "路径点探索");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_discovering", "路径点发现");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_finding", "路径点找到");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_locating", "路径点定位");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_spotting", "路径点发现");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_pinpointing", "路径点精确定位");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_targeting", "路径点定位");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_aiming", "路径点瞄准");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_pointing", "路径点指向");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_directing", "路径点指向");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_guiding", "路径点指导");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_leading", "路径点领导");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_heading", "路径点头部");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_north", "路径点北");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_south", "路径点南");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_east", "路径点东");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_west", "路径点西");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_up", "路径点上");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_down", "路径点下");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_center", "路径点中心");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_middle", "路径点中间");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_origin", "路径点原点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_spawn", "路径点出生");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_home", "路径点家");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_base", "路径点基地");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_house", "路径点房子");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_farm", "路径点农场");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_mineshaft", "路径点矿井");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_dungeon", "路径点地牢");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_temple", "路径点神庙");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_stronghold", "路径点要塞");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_village", "路径点村庄");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_city", "路径点城市");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_portal", "路径点传送门");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_nether_portal", "路径点下界传送门");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_end_portal", "路径点末地传送门");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_community", "路径点社区");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_server", "路径点服务器");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_world", "路径点世界");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_dimension", "路径点维度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_overworld", "路径点主世界");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_nether", "路径点下界");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_end", "路径点末地");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_coordinates", "路径点坐标");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_position", "路径点位置");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_location", "路径点位置");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_place", "路径点地点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_spot", "路径点地点");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_area", "路径点区域");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_region", "路径点区域");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_zone", "路径点区域");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_territory", "路径点领土");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_terrain", "路径点地形");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_landscape", "路径点景观");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_environment", "路径点环境");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_surroundings", "路径点周围");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_surroundings", "路径点周围");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_vicinity", "路径点附近");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_proximity", "路径点接近");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_closeness", "路径点接近");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_nearness", "路径点接近");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_proximity", "路径点接近");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_distance", "路径点距离");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_range", "路径点范围");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_radius", "路径点半径");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_extent", "路径点范围");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_scope", "路径点范围");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_scale", "路径点规模");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_size", "路径点大小");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_dimensions", "路径点尺寸");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_width", "路径点宽度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_height", "路径点高度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_length", "路径点长度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_depth", "路径点深度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_thickness", "路径点厚度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_thinness", "路径点薄度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_breadth", "路径点宽度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_longitude", "路径点经度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_latitude", "路径点纬度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_altitude", "路径点海拔");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_elevation", "路径点高度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_level", "路径点等级");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_tier", "路径点层级");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_degree", "路径点程度");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_stage", "路径点阶段");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_phase", "路径点阶段");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_step", "路径点步骤");
        WAYPOINT_TRANSLATIONS.put("xaeros.minimap.waypoints_level", "路径点等级");
    }
    
    /**
     * 翻译路径点相关文本
     * @param key 翻译键
     * @return 翻译后的文本
     */
    public static String translateWaypoint(String key) {
        if (key == null || key.isEmpty()) {
            return key;
        }
        
        String translation = WAYPOINT_TRANSLATIONS.get(key);
        if (translation != null) {
            return translation;
        }
        
        // 如果没有找到具体翻译，尝试通用翻译
        return TranslationManager.translate(key);
    }
    
    /**
     * 翻译路径点文本对象
     * @param text 文本对象
     * @return 翻译后的文本对象
     */
    public static Text translateWaypoint(Text text) {
        if (text instanceof net.minecraft.text.TranslatableTextContent) {
            net.minecraft.text.TranslatableTextContent translatable = (net.minecraft.text.TranslatableTextContent) text;
            String key = translatable.getKey();
            String translated = translateWaypoint(key);
            
            if (!translated.equals(key)) {
                return Text.translatable(translated);
            }
        } else {
            String rawText = text.getString();
            String translated = translateWaypoint(rawText);
            
            if (!translated.equals(rawText)) {
                return Text.of(translated);
            }
        }
        
        return text;
    }
}