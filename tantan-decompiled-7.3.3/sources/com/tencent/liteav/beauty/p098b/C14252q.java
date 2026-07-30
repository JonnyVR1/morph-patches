package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14171a;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.q */
/* JADX INFO: loaded from: classes2.dex */
public class C14252q extends C14178h {

    /* JADX INFO: renamed from: r */
    private C14171a f59619r;

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        if (this.f59619r == null) {
            C14171a c14171a = new C14171a();
            this.f59619r = c14171a;
            c14171a.f58927a = 0;
            c14171a.f58928b = 0;
            c14171a.f58929c = this.f59020e;
            c14171a.f58930d = this.f59021f;
        }
        C14171a c14171a2 = this.f59619r;
        GLES20.glViewport(c14171a2.f58927a, c14171a2.f58928b, c14171a2.f58929c, c14171a2.f58930d);
        return super.mo83981b(i);
    }
}
