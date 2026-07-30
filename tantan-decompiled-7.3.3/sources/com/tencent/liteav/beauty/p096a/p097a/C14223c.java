package com.tencent.liteav.beauty.p096a.p097a;

import android.view.Surface;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14223c extends C14222b {

    /* JADX INFO: renamed from: b */
    private Surface f59417b;

    /* JADX INFO: renamed from: c */
    private boolean f59418c;

    public C14223c(C14221a c14221a, int i, int i2, boolean z) {
        super(c14221a);
        m84265a(i, i2);
        this.f59418c = z;
    }

    /* JADX INFO: renamed from: c */
    public void m84267c() {
        m84264a();
        Surface surface = this.f59417b;
        if (surface != null) {
            if (this.f59418c) {
                surface.release();
            }
            this.f59417b = null;
        }
    }
}
