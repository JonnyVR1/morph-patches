package p149l;

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
public class ez50 implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public EGL10 f93856a;

    /* JADX INFO: renamed from: e */
    public SurfaceTexture f93860e;

    /* JADX INFO: renamed from: f */
    public Surface f93861f;

    /* JADX INFO: renamed from: h */
    public boolean f93863h;

    /* JADX INFO: renamed from: i */
    public vki0 f93864i;

    /* JADX INFO: renamed from: j */
    public int f93865j;

    /* JADX INFO: renamed from: k */
    public int f93866k;

    /* JADX INFO: renamed from: m */
    public int f93868m;

    /* JADX INFO: renamed from: n */
    public float f93869n;

    /* JADX INFO: renamed from: p */
    public Handler f93871p;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f93857b = null;

    /* JADX INFO: renamed from: c */
    public EGLContext f93858c = null;

    /* JADX INFO: renamed from: d */
    public EGLSurface f93859d = null;

    /* JADX INFO: renamed from: g */
    public final Object f93862g = new Object();

    /* JADX INFO: renamed from: l */
    public int f93867l = 0;

    /* JADX INFO: renamed from: o */
    public HandlerThread f93870o = new HandlerThread("OutputSurface-Thread");

    public ez50(int i, int i2, int i3, boolean z) {
        this.f93868m = 0;
        this.f93865j = i;
        this.f93866k = i2;
        this.f93868m = i3;
        if (!z) {
            this.f93869n = 0.0f;
        } else if (i > i2) {
            this.f93869n = ((i - i2) / 2.0f) / i;
        } else {
            this.f93869n = ((i2 - i) / 2.0f) / i2;
        }
        m118850e();
    }

    /* JADX INFO: renamed from: a */
    public void m118846a() {
        synchronized (this.f93862g) {
            while (!this.f93863h) {
                try {
                    this.f93862g.wait(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                    if (!this.f93863h) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.f93863h = false;
        }
        this.f93864i.m198741a("before updateTexImage");
        this.f93860e.updateTexImage();
    }

    /* JADX INFO: renamed from: b */
    public void m118847b(boolean z) {
        this.f93864i.m198743c(this.f93860e, z);
    }

    /* JADX INFO: renamed from: c */
    public Surface m118848c() {
        return this.f93861f;
    }

    /* JADX INFO: renamed from: d */
    public void m118849d() {
        EGL10 egl10 = this.f93856a;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f93858c)) {
                EGL10 egl11 = this.f93856a;
                EGLDisplay eGLDisplay = this.f93857b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f93856a.eglDestroySurface(this.f93857b, this.f93859d);
            this.f93856a.eglDestroyContext(this.f93857b, this.f93858c);
        }
        this.f93861f.release();
        this.f93870o.quitSafely();
        this.f93870o = null;
        this.f93857b = null;
        this.f93858c = null;
        this.f93859d = null;
        this.f93856a = null;
        this.f93864i = null;
        this.f93861f = null;
        this.f93860e = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m118850e() {
        this.f93870o.start();
        this.f93871p = new Handler(this.f93870o.getLooper());
        vki0 vki0Var = new vki0(this.f93867l);
        this.f93864i = vki0Var;
        vki0Var.m198745e(this.f93866k > this.f93865j, this.f93869n, this.f93868m);
        this.f93864i.m198747g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f93864i.m198744d());
        this.f93860e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this, this.f93871p);
        this.f93861f = new Surface(this.f93860e);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f93862g) {
            try {
                if (this.f93863h) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.f93863h = true;
                this.f93862g.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
