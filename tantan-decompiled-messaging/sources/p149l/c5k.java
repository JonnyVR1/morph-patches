package p149l;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class c5k {

    /* JADX INFO: renamed from: d */
    private Context f79392d;

    /* JADX INFO: renamed from: e */
    private y4k f79393e;

    /* JADX INFO: renamed from: f */
    private double f79394f;

    /* JADX INFO: renamed from: g */
    private int f79395g;

    /* JADX INFO: renamed from: a */
    private EGLConfig f79389a = null;

    /* JADX INFO: renamed from: b */
    private EGLDisplay f79390b = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: c */
    private EGLContext f79391c = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: h */
    private final ThreadPoolExecutor f79396h = new ThreadPoolExecutor(3, 5, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(128));

    /* JADX INFO: renamed from: l.c5k$a */
    public class RunnableC16077a implements Runnable {

        /* JADX INFO: renamed from: l.c5k$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: l.c5k$a$a$a, reason: collision with other inner class name */
            public class C22722a implements a5k {
                public C22722a() {
                }

                @Override // p149l.a5k
                public void getGpuBenmark(double d) {
                    c5k.m105332g(c5k.this, d / 3.0d);
                    int i = c5k.this.f79395g;
                    a aVar = a.this;
                    if (i != 2) {
                        c5k.this.f79393e.m212920c();
                        return;
                    }
                    xh80.m208778c(c5k.this.f79392d);
                    c5k c5kVar = c5k.this;
                    c5kVar.m105340p(c5kVar.f79394f);
                    c5k.m105335j(c5k.this);
                    throw null;
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c5k.this.f79393e = new y4k();
                c5k.this.f79393e.m212921d(new C22722a());
                c5k.this.f79393e.m212922e();
            }
        }

        public RunnableC16077a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c5k.this.f79395g = 0;
            while (c5k.this.f79395g < 3) {
                c5k.this.f79396h.execute(new a());
                SystemClock.sleep(1000L);
                c5k.m105328c(c5k.this);
            }
        }
    }

    public c5k(Context context) {
        this.f79392d = context;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m105328c(c5k c5kVar) {
        int i = c5kVar.f79395g;
        c5kVar.f79395g = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ double m105332g(c5k c5kVar, double d) {
        double d2 = c5kVar.f79394f + d;
        c5kVar.f79394f = d2;
        return d2;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ z4k m105335j(c5k c5kVar) {
        c5kVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: l */
    private void m105337l() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f79390b = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f79390b, new int[]{12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            h1k.m129030a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f79389a = eGLConfig;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f79390b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f79391c = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            return;
        }
        gcj gcjVar = new gcj(512, 512);
        gcj.C17058a c17058a = gcjVar.f102021d;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f79390b, this.f79389a, new int[]{12375, c17058a.f102024c, 12374, c17058a.f102025d, 12344}, 0);
        gcjVar.f102020c = eGLSurfaceEglCreatePbufferSurface;
        EGL14.eglMakeCurrent(this.f79390b, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.f79391c);
    }

    /* JADX INFO: renamed from: m */
    private void m105338m() {
        EGL14.eglDestroyContext(this.f79390b, this.f79391c);
        this.f79391c = EGL14.EGL_NO_CONTEXT;
        this.f79390b = EGL14.EGL_NO_DISPLAY;
    }

    /* JADX INFO: renamed from: n */
    private int m105339n() {
        m105337l();
        String strGlGetString = GLES20.glGetString(7939);
        int length = !TextUtils.isEmpty(strGlGetString) ? strGlGetString.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).length : 0;
        m105338m();
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public int m105340p(double d) {
        int iM105339n = m105339n();
        if (iM105339n < 77 || d > 320.0d) {
            return ((iM105339n < 70 || d <= 320.0d || d > 500.0d) && iM105339n < 77) ? 3 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: q */
    private int m105341q() {
        int iM105339n = m105339n();
        if (iM105339n >= 77) {
            return 1;
        }
        return (iM105339n <= 70 || iM105339n >= 77) ? 3 : 2;
    }

    /* JADX INFO: renamed from: r */
    private void m105342r() {
        new Thread(new RunnableC16077a(), "live-media-GpuBenmarkUtils").start();
    }

    /* JADX INFO: renamed from: o */
    public int m105343o(boolean z) {
        int iM208778c = xh80.m208778c(this.f79392d);
        if (z && iM208778c != 0) {
            m105342r();
        }
        return iM208778c == 0 ? m105341q() : iM208778c;
    }
}
