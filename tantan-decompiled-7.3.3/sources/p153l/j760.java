package p153l;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes8.dex */
public class j760 implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public EGL10 f118631a;

    /* JADX INFO: renamed from: e */
    public SurfaceTexture f118635e;

    /* JADX INFO: renamed from: f */
    public Surface f118636f;

    /* JADX INFO: renamed from: h */
    public boolean f118638h;

    /* JADX INFO: renamed from: i */
    public vti0 f118639i;

    /* JADX INFO: renamed from: j */
    public int f118640j;

    /* JADX INFO: renamed from: k */
    public int f118641k;

    /* JADX INFO: renamed from: m */
    public int f118643m;

    /* JADX INFO: renamed from: n */
    public float f118644n;

    /* JADX INFO: renamed from: p */
    public Handler f118646p;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f118632b = null;

    /* JADX INFO: renamed from: c */
    public EGLContext f118633c = null;

    /* JADX INFO: renamed from: d */
    public EGLSurface f118634d = null;

    /* JADX INFO: renamed from: g */
    public final Object f118637g = new Object();

    /* JADX INFO: renamed from: l */
    public int f118642l = 0;

    /* JADX INFO: renamed from: o */
    public HandlerThread f118645o = new HandlerThread("OutputSurface-Thread");

    public j760(int i, int i2, int i3, boolean z) {
        this.f118643m = 0;
        this.f118640j = i;
        this.f118641k = i2;
        this.f118643m = i3;
        if (!z) {
            this.f118644n = 0.0f;
        } else if (i > i2) {
            this.f118644n = ((i - i2) / 2.0f) / i;
        } else {
            this.f118644n = ((i2 - i) / 2.0f) / i2;
        }
        m143748e();
    }

    /* JADX INFO: renamed from: a */
    public void m143744a() {
        synchronized (this.f118637g) {
            while (!this.f118638h) {
                try {
                    this.f118637g.wait(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    if (!this.f118638h) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f118638h = false;
        }
        this.f118639i.m202674a("before updateTexImage");
        this.f118635e.updateTexImage();
    }

    /* JADX INFO: renamed from: b */
    public void m143745b(boolean z) {
        this.f118639i.m202676c(this.f118635e, z);
    }

    /* JADX INFO: renamed from: c */
    public Surface m143746c() {
        return this.f118636f;
    }

    /* JADX INFO: renamed from: d */
    public void m143747d() {
        EGL10 egl10 = this.f118631a;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f118633c)) {
                EGL10 egl11 = this.f118631a;
                EGLDisplay eGLDisplay = this.f118632b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f118631a.eglDestroySurface(this.f118632b, this.f118634d);
            this.f118631a.eglDestroyContext(this.f118632b, this.f118633c);
        }
        this.f118636f.release();
        this.f118645o.quitSafely();
        this.f118645o = null;
        this.f118632b = null;
        this.f118633c = null;
        this.f118634d = null;
        this.f118631a = null;
        this.f118639i = null;
        this.f118636f = null;
        this.f118635e = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m143748e() {
        this.f118645o.start();
        this.f118646p = new Handler(this.f118645o.getLooper());
        vti0 vti0Var = new vti0(this.f118642l);
        this.f118639i = vti0Var;
        vti0Var.m202678e(this.f118641k > this.f118640j, this.f118644n, this.f118643m);
        this.f118639i.m202680g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f118639i.m202677d());
        this.f118635e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this, this.f118646p);
        this.f118636f = new Surface(this.f118635e);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f118637g) {
            try {
                if (this.f118638h) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.f118638h = true;
                this.f118637g.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
