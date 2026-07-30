package com.tantanapp.media.ttmediaeffect.anim;

import androidx.annotation.NonNull;
import com.immomo.svgaplayer.adapter.SVGAResLoadAdapter;
import com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack;
import com.immomo.svgaplayer.setting.SVGASetting;
import com.tantanapp.media.ttmediaeffect.ILoadResStrategy;
import com.tantanapp.media.ttmediaeffect.IResLoadCallback;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class AnimEffectInitializer {

    /* JADX INFO: renamed from: com.tantanapp.media.ttmediaeffect.anim.AnimEffectInitializer$2 */
    public static /* synthetic */ class C138272 {

        /* JADX INFO: renamed from: $SwitchMap$com$tantanapp$media$ttmediaeffect$anim$AnimEffectInitializer$EffectType */
        static final /* synthetic */ int[] f57007x527ac9ad;

        static {
            int[] iArr = new int[EffectType.values().length];
            f57007x527ac9ad = iArr;
            try {
                iArr[EffectType.MMSVGA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum EffectType {
        MMSVGA
    }

    public void init(@NonNull final ILoadResStrategy iLoadResStrategy, @NonNull EffectType effectType) {
        if (C138272.f57007x527ac9ad[effectType.ordinal()] != 1) {
            return;
        }
        SVGASetting.INSTANCE.init().setSVGAResLoadAdapter(new SVGAResLoadAdapter() { // from class: com.tantanapp.media.ttmediaeffect.anim.AnimEffectInitializer.1
            @Override // com.immomo.svgaplayer.adapter.SVGAResLoadAdapter
            public void loadSVGARes(boolean z, @NonNull String str, @Nullable final SVGAResLoadCallBack sVGAResLoadCallBack) {
                iLoadResStrategy.loadResource(str, new IResLoadCallback() { // from class: com.tantanapp.media.ttmediaeffect.anim.AnimEffectInitializer.1.1
                    @Override // com.tantanapp.media.ttmediaeffect.IResLoadCallback
                    public void onFail() {
                        sVGAResLoadCallBack.onResLoadFail();
                    }

                    @Override // com.tantanapp.media.ttmediaeffect.IResLoadCallback
                    public void onSuccess(String str2) {
                        sVGAResLoadCallBack.onResLoadSuccess(str2);
                    }
                });
            }
        });
    }

    public void setMaxCacheSize(int i) {
        SVGASetting.INSTANCE.setCacheMaxSize(i);
    }
}
