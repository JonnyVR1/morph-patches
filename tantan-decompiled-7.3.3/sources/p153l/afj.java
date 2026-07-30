package p153l;

import android.opengl.EGL14;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes7.dex */
public class afj {

    /* JADX INFO: renamed from: a */
    protected final int f70909a;

    /* JADX INFO: renamed from: b */
    protected Object f70910b;

    /* JADX INFO: renamed from: c */
    protected EGLSurface f70911c = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: d */
    protected C15698a f70912d = new C15698a();

    /* JADX INFO: renamed from: l.afj$a */
    public static class C15698a {

        /* JADX INFO: renamed from: a */
        public int f70913a;

        /* JADX INFO: renamed from: b */
        public int f70914b;

        /* JADX INFO: renamed from: c */
        public int f70915c;

        /* JADX INFO: renamed from: d */
        public int f70916d;
    }

    public afj(int i, int i2) {
        m97340a(0, 0, i, i2);
        this.f70910b = null;
        this.f70909a = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m97340a(int i, int i2, int i3, int i4) {
        C15698a c15698a = this.f70912d;
        c15698a.f70913a = i;
        c15698a.f70914b = i2;
        c15698a.f70915c = i3;
        c15698a.f70916d = i4;
    }
}
