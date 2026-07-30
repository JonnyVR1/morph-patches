package com.facebook.imagepipeline.animated.base;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedDrawableFrameInfo {

    /* JADX INFO: renamed from: a */
    public final int f6468a;

    /* JADX INFO: renamed from: b */
    public final int f6469b;

    /* JADX INFO: renamed from: c */
    public final int f6470c;

    /* JADX INFO: renamed from: d */
    public final int f6471d;

    /* JADX INFO: renamed from: e */
    public final int f6472e;

    /* JADX INFO: renamed from: f */
    public final BlendOperation f6473f;

    /* JADX INFO: renamed from: g */
    public final DisposalMethod f6474g;

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
        this.f6468a = i;
        this.f6469b = i2;
        this.f6470c = i3;
        this.f6471d = i4;
        this.f6472e = i5;
        this.f6473f = blendOperation;
        this.f6474g = disposalMethod;
    }
}
