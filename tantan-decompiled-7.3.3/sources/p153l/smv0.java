package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.ads.zzet;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
public final class smv0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g */
    public static final int[] f169617g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a */
    public final Handler f169618a;

    /* JADX INFO: renamed from: b */
    public final int[] f169619b = new int[1];

    /* JADX INFO: renamed from: c */
    @Nullable
    public EGLDisplay f169620c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public EGLContext f169621d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public EGLSurface f169622e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public SurfaceTexture f169623f;

    public smv0(Handler handler, @Nullable mlv0 mlv0Var) {
        this.f169618a = handler;
    }

    /* JADX INFO: renamed from: a */
    public final SurfaceTexture m186843a() {
        SurfaceTexture surfaceTexture = this.f169623f;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /* JADX INFO: renamed from: b */
    public final void m186844b(int i) throws zzet {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        iqv0.m141727b(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        iqv0.m141727b(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f169620c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f169617g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        iqv0.m141727b(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f169620c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        iqv0.m141727b(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.f169621d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f169620c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            iqv0.m141727b(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        iqv0.m141727b(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.f169622e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f169619b, 0);
        iqv0.m141726a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f169619b[0]);
        this.f169623f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m186845c() {
        this.f169618a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f169623f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f169619b, 0);
            }
            EGLDisplay eGLDisplay = this.f169620c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f169620c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f169622e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f169620c, this.f169622e);
            }
            EGLContext eGLContext = this.f169621d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f169620c, eGLContext);
            }
            int i = mpw0.f137957a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f169620c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
            }
        } finally {
            EGLDisplay eGLDisplay4 = this.f169620c;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f169620c;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f169622e;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f169620c, this.f169622e);
            }
            EGLContext eGLContext2 = this.f169621d;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f169620c, eGLContext2);
            }
            int i2 = mpw0.f137957a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f169620c;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f169620c);
            }
            this.f169620c = null;
            this.f169621d = null;
            this.f169622e = null;
            this.f169623f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f169618a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f169623f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
