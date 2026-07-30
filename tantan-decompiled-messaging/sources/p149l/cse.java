package p149l;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes8.dex */
public class cse {

    /* JADX INFO: renamed from: a */
    public cre f82345a;

    /* JADX INFO: renamed from: b */
    public EGLSurface f82346b = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c */
    public int f82347c = -1;

    /* JADX INFO: renamed from: d */
    public int f82348d = -1;

    public cse(cre creVar) {
        this.f82345a = creVar;
    }

    /* JADX INFO: renamed from: a */
    public void m108494a(Object obj) {
        if (this.f82346b == EGL14.EGL_NO_SURFACE) {
            this.f82346b = this.f82345a.m108356b(obj);
        } else {
            qkq0.m175383a("surface already created");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m108495b() {
        this.f82345a.m108358d(this.f82346b);
    }

    /* JADX INFO: renamed from: c */
    public void m108496c(long j) {
        this.f82345a.m108360f(this.f82346b, j);
    }

    /* JADX INFO: renamed from: d */
    public boolean m108497d() {
        return this.f82345a.m108361g(this.f82346b);
    }
}
