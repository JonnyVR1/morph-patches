package p153l;

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
public class u7k {

    /* JADX INFO: renamed from: d */
    private Context f177914d;

    /* JADX INFO: renamed from: e */
    private q7k f177915e;

    /* JADX INFO: renamed from: f */
    private double f177916f;

    /* JADX INFO: renamed from: g */
    private int f177917g;

    /* JADX INFO: renamed from: a */
    private EGLConfig f177911a = null;

    /* JADX INFO: renamed from: b */
    private EGLDisplay f177912b = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: c */
    private EGLContext f177913c = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: h */
    private final ThreadPoolExecutor f177918h = new ThreadPoolExecutor(3, 5, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(128));

    /* JADX INFO: renamed from: l.u7k$a */
    public class RunnableC20517a implements Runnable {

        /* JADX INFO: renamed from: l.u7k$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: l.u7k$a$a$a, reason: collision with other inner class name */
            public class C22844a implements s7k {
                public C22844a() {
                }

                @Override // p153l.s7k
                public void getGpuBenmark(double d) {
                    u7k.m194862g(u7k.this, d / 3.0d);
                    int i = u7k.this.f177917g;
                    a aVar = a.this;
                    if (i != 2) {
                        u7k.this.f177915e.m175660c();
                        return;
                    }
                    cq80.m111885c(u7k.this.f177914d);
                    u7k u7kVar = u7k.this;
                    u7kVar.m194870p(u7kVar.f177916f);
                    u7k.m194865j(u7k.this);
                    throw null;
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                u7k.this.f177915e = new q7k();
                u7k.this.f177915e.m175661d(new C22844a());
                u7k.this.f177915e.m175662e();
            }
        }

        public RunnableC20517a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u7k.this.f177917g = 0;
            while (u7k.this.f177917g < 3) {
                u7k.this.f177918h.execute(new a());
                SystemClock.sleep(1000L);
                u7k.m194858c(u7k.this);
            }
        }
    }

    public u7k(Context context) {
        this.f177914d = context;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m194858c(u7k u7kVar) {
        int i = u7kVar.f177917g;
        u7kVar.f177917g = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ double m194862g(u7k u7kVar, double d) {
        double d2 = u7kVar.f177916f + d;
        u7kVar.f177916f = d2;
        return d2;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ r7k m194865j(u7k u7kVar) {
        u7kVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: l */
    private void m194867l() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f177912b = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f177912b, new int[]{12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f177911a = eGLConfig;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f177912b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f177913c = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            return;
        }
        afj afjVar = new afj(512, 512);
        afj.C15698a c15698a = afjVar.f70912d;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f177912b, this.f177911a, new int[]{12375, c15698a.f70915c, 12374, c15698a.f70916d, 12344}, 0);
        afjVar.f70911c = eGLSurfaceEglCreatePbufferSurface;
        EGL14.eglMakeCurrent(this.f177912b, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.f177913c);
    }

    /* JADX INFO: renamed from: m */
    private void m194868m() {
        EGL14.eglDestroyContext(this.f177912b, this.f177913c);
        this.f177913c = EGL14.EGL_NO_CONTEXT;
        this.f177912b = EGL14.EGL_NO_DISPLAY;
    }

    /* JADX INFO: renamed from: n */
    private int m194869n() {
        m194867l();
        String strGlGetString = GLES20.glGetString(7939);
        int length = !TextUtils.isEmpty(strGlGetString) ? strGlGetString.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).length : 0;
        m194868m();
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public int m194870p(double d) {
        int iM194869n = m194869n();
        if (iM194869n < 77 || d > 320.0d) {
            return ((iM194869n < 70 || d <= 320.0d || d > 500.0d) && iM194869n < 77) ? 3 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: q */
    private int m194871q() {
        int iM194869n = m194869n();
        if (iM194869n >= 77) {
            return 1;
        }
        return (iM194869n <= 70 || iM194869n >= 77) ? 3 : 2;
    }

    /* JADX INFO: renamed from: r */
    private void m194872r() {
        new Thread(new RunnableC20517a(), "live-media-GpuBenmarkUtils").start();
    }

    /* JADX INFO: renamed from: o */
    public int m194873o(boolean z) {
        int iM111885c = cq80.m111885c(this.f177914d);
        if (z && iM111885c != 0) {
            m194872r();
        }
        return iM111885c == 0 ? m194871q() : iM111885c;
    }
}
