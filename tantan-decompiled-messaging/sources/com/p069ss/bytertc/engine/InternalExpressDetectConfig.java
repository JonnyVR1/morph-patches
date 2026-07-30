package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.video.VideoEffectExpressionConfig;

/* JADX INFO: loaded from: classes13.dex */
public class InternalExpressDetectConfig {
    public boolean enableAgeDetect;
    public boolean enableAttractivenessDetect;
    public boolean enableEmotionDetect;
    public boolean enableGenderDetect;
    public boolean enableHappinessDetect;

    public InternalExpressDetectConfig(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        this.enableAgeDetect = false;
        this.enableGenderDetect = false;
        this.enableEmotionDetect = false;
        this.enableAttractivenessDetect = false;
        this.enableHappinessDetect = false;
        this.enableAgeDetect = videoEffectExpressionConfig.enableAgeDetect;
        this.enableGenderDetect = videoEffectExpressionConfig.enableGenderDetect;
        this.enableEmotionDetect = videoEffectExpressionConfig.enableEmotionDetect;
        this.enableAttractivenessDetect = videoEffectExpressionConfig.enableAttractivenessDetect;
        this.enableHappinessDetect = videoEffectExpressionConfig.enableHappinessDetect;
    }

    @CalledByNative
    public boolean enableAgeDetect() {
        return this.enableAgeDetect;
    }

    @CalledByNative
    public boolean enableAttractivenessDetect() {
        return this.enableAttractivenessDetect;
    }

    @CalledByNative
    public boolean enableEmotionDetect() {
        return this.enableEmotionDetect;
    }

    @CalledByNative
    public boolean enableGenderDetect() {
        return this.enableGenderDetect;
    }

    @CalledByNative
    public boolean enableHappinessDetect() {
        return this.enableHappinessDetect;
    }
}
