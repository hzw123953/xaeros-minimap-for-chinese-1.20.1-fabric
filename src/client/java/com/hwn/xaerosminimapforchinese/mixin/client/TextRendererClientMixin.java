package com.hwn.xaerosminimapforchinese.mixin.client;

import com.hwn.xaerosminimapforchinese.TranslationManager;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * 文本渲染器混合类 - 简化版，暂时禁用复杂的文本拦截
 */
@Mixin(TextRenderer.class)
public class TextRendererClientMixin {
    // 暂时禁用了复杂的文本拦截以避免兼容性问题的安全隐患
    // 翻译系统将通过其他方式工作
}