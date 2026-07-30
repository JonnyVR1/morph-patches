package p007l;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class cse {

    /* JADX INFO: renamed from: a */
    public cre f2477a;

    /* JADX INFO: renamed from: b */
    public EGLSurface f2478b = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c */
    public int f2479c = -1;

    /* JADX INFO: renamed from: d */
    public int f2480d = -1;

    public cse(cre creVar) {
        this.f2477a = creVar;
    }

    /* JADX INFO: renamed from: a */
    public void m8798a(Object obj) {
        if (this.f2478b == EGL14.EGL_NO_SURFACE) {
            this.f2478b = this.f2477a.m8792b(obj);
        } else {
            qkq0.a("surface already created");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8799b() {
        this.f2477a.m8794d(this.f2478b);
    }

    /* JADX INFO: renamed from: c */
    public void m8800c(long j) {
        this.f2477a.m8796f(this.f2478b, j);
    }

    /* JADX INFO: renamed from: d */
    public boolean m8801d() {
        return this.f2477a.m8797g(this.f2478b);
    }
}
