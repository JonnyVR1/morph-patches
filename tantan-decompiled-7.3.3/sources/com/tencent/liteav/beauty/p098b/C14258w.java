package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.w */
/* JADX INFO: loaded from: classes2.dex */
public class C14258w extends C14257v {

    /* JADX INFO: renamed from: u */
    protected float f59642u;

    @Override // com.tencent.liteav.beauty.p098b.C14242g, com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
        m84342s();
    }

    @Override // com.tencent.liteav.beauty.p098b.C14242g, com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        return super.mo83986b() && GLES20.glGetError() == 0;
    }

    /* JADX INFO: renamed from: q */
    public float mo84311q() {
        return this.f59642u;
    }

    /* JADX INFO: renamed from: r */
    public float mo84312r() {
        return this.f59642u;
    }

    /* JADX INFO: renamed from: s */
    public void m84342s() {
        float fMo84312r = mo84312r();
        C14178h c14178h = ((C14242g) this).f59558r.get(0);
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(c14178h.m84001p(), "texelWidthOffset");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(c14178h.m84001p(), "texelHeightOffset");
        c14178h.m83968a(iGlGetUniformLocation, fMo84312r / this.f59020e);
        c14178h.m83968a(iGlGetUniformLocation2, 0.0f);
        float fMo84311q = mo84311q();
        C14178h c14178h2 = ((C14242g) this).f59558r.get(1);
        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(c14178h2.m84001p(), "texelWidthOffset");
        int iGlGetUniformLocation4 = GLES20.glGetUniformLocation(c14178h2.m84001p(), "texelHeightOffset");
        c14178h2.m83968a(iGlGetUniformLocation3, 0.0f);
        c14178h2.m83968a(iGlGetUniformLocation4, fMo84311q / this.f59021f);
    }
}
