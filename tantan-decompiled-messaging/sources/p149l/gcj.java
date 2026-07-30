package p149l;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes7.dex */
public class gcj {

    /* JADX INFO: renamed from: a */
    protected final int f102018a;

    /* JADX INFO: renamed from: b */
    protected Object f102019b;

    /* JADX INFO: renamed from: c */
    protected EGLSurface f102020c = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: d */
    protected C17058a f102021d = new C17058a();

    /* JADX INFO: renamed from: l.gcj$a */
    public static class C17058a {

        /* JADX INFO: renamed from: a */
        public int f102022a;

        /* JADX INFO: renamed from: b */
        public int f102023b;

        /* JADX INFO: renamed from: c */
        public int f102024c;

        /* JADX INFO: renamed from: d */
        public int f102025d;
    }

    public gcj(int i, int i2) {
        m125500a(0, 0, i, i2);
        this.f102019b = null;
        this.f102018a = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m125500a(int i, int i2, int i3, int i4) {
        C17058a c17058a = this.f102021d;
        c17058a.f102022a = i;
        c17058a.f102023b = i2;
        c17058a.f102024c = i3;
        c17058a.f102025d = i4;
    }
}
