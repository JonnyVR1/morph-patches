package com.facebook.imagepipeline.nativecode;

import p153l.him;
import p153l.ppd;
import p153l.w6e;
import p153l.wkm;
import p153l.xkm;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class NativeJpegTranscoderFactory implements xkm {

    /* JADX INFO: renamed from: a */
    public final int f6498a;

    /* JADX INFO: renamed from: b */
    public final boolean f6499b;

    /* JADX INFO: renamed from: c */
    public final boolean f6500c;

    @w6e
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f6498a = i;
        this.f6499b = z;
        this.f6500c = z2;
    }

    @Override // p153l.xkm
    @w6e
    public wkm createImageTranscoder(him himVar, boolean z) {
        if (himVar != ppd.JPEG) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f6498a, this.f6499b, this.f6500c);
    }
}
