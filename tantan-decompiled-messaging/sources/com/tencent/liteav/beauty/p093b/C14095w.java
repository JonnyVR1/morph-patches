package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.w */
/* JADX INFO: loaded from: classes2.dex */
public class C14095w extends C14094v {

    /* JADX INFO: renamed from: u */
    protected float f58794u;

    @Override // com.tencent.liteav.beauty.p093b.C14079g, com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
        m83159s();
    }

    @Override // com.tencent.liteav.beauty.p093b.C14079g, com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        return super.mo82803b() && GLES20.glGetError() == 0;
    }

    /* JADX INFO: renamed from: q */
    public float mo83128q() {
        return this.f58794u;
    }

    /* JADX INFO: renamed from: r */
    public float mo83129r() {
        return this.f58794u;
    }

    /* JADX INFO: renamed from: s */
    public void m83159s() {
        float fMo83129r = mo83129r();
        C14015h c14015h = ((C14079g) this).f58710r.get(0);
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(c14015h.m82818p(), "texelWidthOffset");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(c14015h.m82818p(), "texelHeightOffset");
        c14015h.m82785a(iGlGetUniformLocation, fMo83129r / this.f58172e);
        c14015h.m82785a(iGlGetUniformLocation2, 0.0f);
        float fMo83128q = mo83128q();
        C14015h c14015h2 = ((C14079g) this).f58710r.get(1);
        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(c14015h2.m82818p(), "texelWidthOffset");
        int iGlGetUniformLocation4 = GLES20.glGetUniformLocation(c14015h2.m82818p(), "texelHeightOffset");
        c14015h2.m82785a(iGlGetUniformLocation3, 0.0f);
        c14015h2.m82785a(iGlGetUniformLocation4, fMo83128q / this.f58173f);
    }
}
