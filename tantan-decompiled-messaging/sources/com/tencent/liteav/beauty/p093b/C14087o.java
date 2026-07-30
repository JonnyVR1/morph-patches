package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.o */
/* JADX INFO: loaded from: classes2.dex */
public class C14087o extends C14015h {

    /* JADX INFO: renamed from: r */
    private int f58756r = -1;

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(m82818p(), "purlColor");
        this.f58756r = iGlGetUniformLocation;
        m82805c(iGlGetUniformLocation, new float[]{0.0f, 0.0f, 0.0f, 1.0f});
        return zMo82803b;
    }

    /* JADX INFO: renamed from: b */
    public void m83151b(float[] fArr) {
        m82805c(this.f58756r, fArr);
    }
}
