package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14240e extends C14255t {

    /* JADX INFO: renamed from: A */
    private int f59539A;

    /* JADX INFO: renamed from: B */
    private float[] f59540B;

    /* JADX INFO: renamed from: x */
    private int f59541x;

    /* JADX INFO: renamed from: y */
    private int f59542y;

    /* JADX INFO: renamed from: z */
    private int f59543z;

    /* JADX INFO: renamed from: b */
    public void m84308b(float[] fArr) {
        double d = (((double) fArr[0]) * 0.2989d) + (((double) fArr[1]) * 0.5866d);
        float f = fArr[2];
        float f2 = (float) (d + (((double) f) * 0.1145d));
        m83984b(this.f59542y, new float[]{f2, (float) (((double) (fArr[0] - f2)) * 0.7132d), (float) (((double) (f - f2)) * 0.5647d)});
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: c */
    public void mo83987c() {
        super.mo83987c();
        this.f59541x = GLES20.glGetUniformLocation(m84001p(), "screenMode");
        this.f59542y = GLES20.glGetUniformLocation(m84001p(), "screenReplaceColor");
        this.f59543z = GLES20.glGetUniformLocation(m84001p(), "screenMirrorX");
        this.f59539A = GLES20.glGetUniformLocation(m84001p(), "screenMirrorY");
        m84308b(this.f59540B);
    }
}
