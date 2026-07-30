package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14008a;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.q */
/* JADX INFO: loaded from: classes2.dex */
public class C14089q extends C14015h {

    /* JADX INFO: renamed from: r */
    private C14008a f58771r;

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        if (this.f58771r == null) {
            C14008a c14008a = new C14008a();
            this.f58771r = c14008a;
            c14008a.f58079a = 0;
            c14008a.f58080b = 0;
            c14008a.f58081c = this.f58172e;
            c14008a.f58082d = this.f58173f;
        }
        C14008a c14008a2 = this.f58771r;
        GLES20.glViewport(c14008a2.f58079a, c14008a2.f58080b, c14008a2.f58081c, c14008a2.f58082d);
        return super.mo82798b(i);
    }
}
