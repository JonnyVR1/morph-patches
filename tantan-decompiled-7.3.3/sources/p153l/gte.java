package p153l;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes8.dex */
public class gte {

    /* JADX INFO: renamed from: a */
    public gse f106403a;

    /* JADX INFO: renamed from: b */
    public EGLSurface f106404b = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c */
    public int f106405c = -1;

    /* JADX INFO: renamed from: d */
    public int f106406d = -1;

    public gte(gse gseVar) {
        this.f106403a = gseVar;
    }

    /* JADX INFO: renamed from: a */
    public void m132219a(Object obj) {
        if (this.f106404b == EGL14.EGL_NO_SURFACE) {
            this.f106404b = this.f106403a.m132029b(obj);
        } else {
            wtq0.m207906a("surface already created");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m132220b() {
        this.f106403a.m132031d(this.f106404b);
    }

    /* JADX INFO: renamed from: c */
    public void m132221c(long j) {
        this.f106403a.m132033f(this.f106404b, j);
    }

    /* JADX INFO: renamed from: d */
    public boolean m132222d() {
        return this.f106403a.m132034g(this.f106404b);
    }
}
