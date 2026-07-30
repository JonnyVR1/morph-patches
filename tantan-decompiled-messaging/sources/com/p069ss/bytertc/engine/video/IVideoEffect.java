package com.p069ss.bytertc.engine.video;

import com.p069ss.bytertc.engine.data.VirtualBackgroundSource;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IVideoEffect {
    public abstract int appendEffectNodes(List<String> list);

    public abstract int applyStickerEffect(String str);

    public abstract int disableFaceDetection();

    public abstract int disableVideoEffect();

    public abstract int disableVirtualBackground();

    public abstract int enableFaceDetection(IFaceDetectionObserver iFaceDetectionObserver, int i, String str);

    public abstract int enableVideoEffect();

    public abstract int enableVirtualBackground(String str, VirtualBackgroundSource virtualBackgroundSource);

    public abstract long getVideoEffectHandle();

    public abstract int initCVResource(String str, String str2);

    public abstract int removeEffectNodes(List<String> list);

    public abstract int setAlgoModelResourceFinder(long j, long j2);

    public abstract int setColorFilter(String str);

    public abstract int setColorFilterIntensity(float f);

    public abstract int setEffectNodes(List<String> list);

    public abstract int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig);

    public abstract int updateEffectNode(String str, String str2, float f);
}
