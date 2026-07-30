package io.agora.rtc2.internal.gdp;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import io.agora.utils2.internal.Logging;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public final class EglCore {
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    private static final String TAG = "EglCore";
    private static boolean mockNonEGLContext = false;
    private EGLConfig mEGLConfig;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;

    public EglCore(EGLContext eGLContext, int i) {
        EGLConfig config;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLDisplay = eGLDisplay;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            wtq0.m207906a("EGL already set up");
            throw null;
        }
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            wtq0.m207906a("unable to get EGL14 display");
            throw null;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.mEGLDisplay = null;
            wtq0.m207906a("unable to initialize EGL14");
            throw null;
        }
        if ((i & 2) != 0 && (config = getConfig(i, 3)) != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEGLDisplay, config, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.mEGLConfig = config;
                this.mEGLContext = eGLContextEglCreateContext;
            }
        }
        if (this.mEGLContext == EGL14.EGL_NO_CONTEXT || mockNonEGLContext) {
            EGLConfig config2 = getConfig(i, 2);
            if (config2 == null) {
                wtq0.m207906a("Unable to find a suitable EGLConfig");
                throw null;
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.mEGLDisplay, config2, eGLContext, new int[]{12440, 2, 12344}, 0);
            checkEglError("eglCreateContext");
            this.mEGLConfig = config2;
            this.mEGLContext = eGLContextEglCreateContext2;
        }
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.mEGLDisplay, this.mEGLContext, 12440, iArr2, 0);
        Logging.m88105d(TAG, "EGLContext created, client version " + iArr2[0]);
    }

    public static void setMockNonEGLContext(boolean z) {
        mockNonEGLContext = z;
    }

    public void checkEglError(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public EGLSurface createOffscreenSurface(int i, int i2) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        checkEglError("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        mnd0.m159157a("surface was null");
        return null;
    }

    public EGLConfig getConfig(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.mEGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        Logging.m88105d(TAG, "unable to find RGB8888 / " + i2 + " EGLConfig");
        return null;
    }

    public void makeCurrent(EGLSurface eGLSurface) {
        if (this.mEGLDisplay == EGL14.EGL_NO_DISPLAY) {
            Logging.m88105d(TAG, "NOTE: makeCurrent w/o display");
        }
        if (EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        wtq0.m207906a("eglMakeCurrent failed");
    }

    public void release() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    public void releaseSurface(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface);
    }

    public EglCore() {
        this(null, 0);
    }
}
