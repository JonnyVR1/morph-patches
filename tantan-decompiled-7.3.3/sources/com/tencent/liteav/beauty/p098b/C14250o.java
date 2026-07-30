package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.o */
/* JADX INFO: loaded from: classes2.dex */
public class C14250o extends C14178h {

    /* JADX INFO: renamed from: r */
    private int f59604r = -1;

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(m84001p(), "purlColor");
        this.f59604r = iGlGetUniformLocation;
        m83988c(iGlGetUniformLocation, new float[]{0.0f, 0.0f, 0.0f, 1.0f});
        return zMo83986b;
    }

    /* JADX INFO: renamed from: b */
    public void m84334b(float[] fArr) {
        m83988c(this.f59604r, fArr);
    }
}
