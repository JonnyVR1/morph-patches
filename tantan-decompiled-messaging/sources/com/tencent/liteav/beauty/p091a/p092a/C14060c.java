package com.tencent.liteav.beauty.p091a.p092a;

import android.view.Surface;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14060c extends C14059b {

    /* JADX INFO: renamed from: b */
    private Surface f58569b;

    /* JADX INFO: renamed from: c */
    private boolean f58570c;

    public C14060c(C14058a c14058a, int i, int i2, boolean z) {
        super(c14058a);
        m83082a(i, i2);
        this.f58570c = z;
    }

    /* JADX INFO: renamed from: c */
    public void m83084c() {
        m83081a();
        Surface surface = this.f58569b;
        if (surface != null) {
            if (this.f58570c) {
                surface.release();
            }
            this.f58569b = null;
        }
    }
}
