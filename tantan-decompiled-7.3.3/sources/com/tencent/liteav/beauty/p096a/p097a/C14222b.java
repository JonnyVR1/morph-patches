package com.tencent.liteav.beauty.p096a.p097a;

import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLSurface;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14222b {

    /* JADX INFO: renamed from: a */
    protected C14221a f59413a;

    /* JADX INFO: renamed from: b */
    private EGLSurface f59414b = EGL11.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c */
    private int f59415c = -1;

    /* JADX INFO: renamed from: d */
    private int f59416d = -1;

    public C14222b(C14221a c14221a) {
        this.f59413a = c14221a;
    }

    /* JADX INFO: renamed from: a */
    public void m84265a(int i, int i2) {
        if (this.f59414b != EGL11.EGL_NO_SURFACE) {
            wtq0.m207906a("surface already created");
            return;
        }
        this.f59414b = this.f59413a.m84260a(i, i2);
        this.f59415c = i;
        this.f59416d = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m84266b() {
        this.f59413a.m84263b(this.f59414b);
    }

    /* JADX INFO: renamed from: a */
    public void m84264a() {
        this.f59413a.m84262a(this.f59414b);
        this.f59414b = EGL11.EGL_NO_SURFACE;
        this.f59416d = -1;
        this.f59415c = -1;
    }
}
