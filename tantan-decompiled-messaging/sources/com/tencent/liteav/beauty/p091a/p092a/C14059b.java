package com.tencent.liteav.beauty.p091a.p092a;

import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLSurface;
import p149l.qkq0;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14059b {

    /* JADX INFO: renamed from: a */
    protected C14058a f58565a;

    /* JADX INFO: renamed from: b */
    private EGLSurface f58566b = EGL11.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c */
    private int f58567c = -1;

    /* JADX INFO: renamed from: d */
    private int f58568d = -1;

    public C14059b(C14058a c14058a) {
        this.f58565a = c14058a;
    }

    /* JADX INFO: renamed from: a */
    public void m83082a(int i, int i2) {
        if (this.f58566b != EGL11.EGL_NO_SURFACE) {
            qkq0.m175383a("surface already created");
            return;
        }
        this.f58566b = this.f58565a.m83077a(i, i2);
        this.f58567c = i;
        this.f58568d = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m83083b() {
        this.f58565a.m83080b(this.f58566b);
    }

    /* JADX INFO: renamed from: a */
    public void m83081a() {
        this.f58565a.m83079a(this.f58566b);
        this.f58566b = EGL11.EGL_NO_SURFACE;
        this.f58568d = -1;
        this.f58567c = -1;
    }
}
