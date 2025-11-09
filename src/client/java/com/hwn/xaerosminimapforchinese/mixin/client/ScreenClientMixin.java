package com.hwn.xaerosminimapforchinese.mixin.client;

import com.hwn.xaerosminimapforchinese.TranslationManager;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * 屏幕混合类 - 拦截屏幕相关方法进行翻译
 */
@Mixin(Screen.class)
public class ScreenClientMixin {
    
    /**
     * 拦截获取屏幕标题的方法
     */
    @Inject(method = "getTitle", at = @At("HEAD"), cancellable = true)
    private void onGetTitle(CallbackInfoReturnable<Text> cir) {
        // 只有在启用汉化时才进行翻译
        if (TranslationManager.isEnabled()) {
            Text currentTitle = cir.getReturnValue();
            if (currentTitle != null) {
                Text translatedTitle = TranslationManager.translate(currentTitle);
                if (translatedTitle != currentTitle) {
                    cir.setReturnValue(translatedTitle);
                }
            }
        }
    }
    
    
}