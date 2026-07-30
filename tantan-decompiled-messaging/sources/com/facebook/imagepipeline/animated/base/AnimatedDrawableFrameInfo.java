package com.facebook.imagepipeline.animated.base;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedDrawableFrameInfo {

    /* JADX INFO: renamed from: a */
    public final int f6431a;

    /* JADX INFO: renamed from: b */
    public final int f6432b;

    /* JADX INFO: renamed from: c */
    public final int f6433c;

    /* JADX INFO: renamed from: d */
    public final int f6434d;

    /* JADX INFO: renamed from: e */
    public final int f6435e;

    /* JADX INFO: renamed from: f */
    public final BlendOperation f6436f;

    /* JADX INFO: renamed from: g */
    public final DisposalMethod f6437g;

    public enum BlendOperation {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    public enum DisposalMethod {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public AnimatedDrawableFrameInfo(int i, int i2, int i3, int i4, int i5, BlendOperation blendOperation, DisposalMethod disposalMethod) {
        this.f6431a = i;
        this.f6432b = i2;
        this.f6433c = i3;
        this.f6434d = i4;
        this.f6435e = i5;
        this.f6436f = blendOperation;
        this.f6437g = disposalMethod;
    }
}
