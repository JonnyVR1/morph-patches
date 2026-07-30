package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14077e extends C14092t {

    /* JADX INFO: renamed from: A */
    private int f58691A;

    /* JADX INFO: renamed from: B */
    private float[] f58692B;

    /* JADX INFO: renamed from: x */
    private int f58693x;

    /* JADX INFO: renamed from: y */
    private int f58694y;

    /* JADX INFO: renamed from: z */
    private int f58695z;

    /* JADX INFO: renamed from: b */
    public void m83125b(float[] fArr) {
        double d = (((double) fArr[0]) * 0.2989d) + (((double) fArr[1]) * 0.5866d);
        float f = fArr[2];
        float f2 = (float) (d + (((double) f) * 0.1145d));
        m82801b(this.f58694y, new float[]{f2, (float) (((double) (fArr[0] - f2)) * 0.7132d), (float) (((double) (f - f2)) * 0.5647d)});
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: c */
    public void mo82804c() {
        super.mo82804c();
        this.f58693x = GLES20.glGetUniformLocation(m82818p(), "screenMode");
        this.f58694y = GLES20.glGetUniformLocation(m82818p(), "screenReplaceColor");
        this.f58695z = GLES20.glGetUniformLocation(m82818p(), "screenMirrorX");
        this.f58691A = GLES20.glGetUniformLocation(m82818p(), "screenMirrorY");
        m83125b(this.f58692B);
    }
}
