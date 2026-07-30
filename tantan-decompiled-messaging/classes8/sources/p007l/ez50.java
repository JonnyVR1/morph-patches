package p007l;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ez50 implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public EGL10 f2648a;

    /* JADX INFO: renamed from: e */
    public SurfaceTexture f2652e;

    /* JADX INFO: renamed from: f */
    public Surface f2653f;

    /* JADX INFO: renamed from: h */
    public boolean f2655h;

    /* JADX INFO: renamed from: i */
    public vki0 f2656i;

    /* JADX INFO: renamed from: j */
    public int f2657j;

    /* JADX INFO: renamed from: k */
    public int f2658k;

    /* JADX INFO: renamed from: m */
    public int f2660m;

    /* JADX INFO: renamed from: n */
    public float f2661n;

    /* JADX INFO: renamed from: p */
    public Handler f2663p;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f2649b = null;

    /* JADX INFO: renamed from: c */
    public EGLContext f2650c = null;

    /* JADX INFO: renamed from: d */
    public EGLSurface f2651d = null;

    /* JADX INFO: renamed from: g */
    public final Object f2654g = new Object();

    /* JADX INFO: renamed from: l */
    public int f2659l = 0;

    /* JADX INFO: renamed from: o */
    public HandlerThread f2662o = new HandlerThread("OutputSurface-Thread");

    public ez50(int i, int i2, int i3, boolean z) {
        this.f2660m = 0;
        this.f2657j = i;
        this.f2658k = i2;
        this.f2660m = i3;
        if (!z) {
            this.f2661n = 0.0f;
        } else if (i > i2) {
            this.f2661n = ((i - i2) / 2.0f) / i;
        } else {
            this.f2661n = ((i2 - i) / 2.0f) / i2;
        }
        m9079e();
    }

    /* JADX INFO: renamed from: a */
    public void m9075a() {
        synchronized (this.f2654g) {
            while (!this.f2655h) {
                try {
                    this.f2654g.wait(5000L);
                    if (!this.f2655h) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f2655h = false;
        }
        this.f2656i.m11270a("before updateTexImage");
        this.f2652e.updateTexImage();
    }

    /* JADX INFO: renamed from: b */
    public void m9076b(boolean z) {
        this.f2656i.m11272c(this.f2652e, z);
    }

    /* JADX INFO: renamed from: c */
    public Surface m9077c() {
        return this.f2653f;
    }

    /* JADX INFO: renamed from: d */
    public void m9078d() {
        EGL10 egl10 = this.f2648a;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f2650c)) {
                EGL10 egl11 = this.f2648a;
                EGLDisplay eGLDisplay = this.f2649b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f2648a.eglDestroySurface(this.f2649b, this.f2651d);
            this.f2648a.eglDestroyContext(this.f2649b, this.f2650c);
        }
        this.f2653f.release();
        this.f2662o.quitSafely();
        this.f2662o = null;
        this.f2649b = null;
        this.f2650c = null;
        this.f2651d = null;
        this.f2648a = null;
        this.f2656i = null;
        this.f2653f = null;
        this.f2652e = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m9079e() {
        this.f2662o.start();
        this.f2663p = new Handler(this.f2662o.getLooper());
        vki0 vki0Var = new vki0(this.f2659l);
        this.f2656i = vki0Var;
        vki0Var.m11274e(this.f2658k > this.f2657j, this.f2661n, this.f2660m);
        this.f2656i.m11276g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f2656i.m11273d());
        this.f2652e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this, this.f2663p);
        this.f2653f = new Surface(this.f2652e);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f2654g) {
            try {
                if (this.f2655h) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.f2655h = true;
                this.f2654g.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
