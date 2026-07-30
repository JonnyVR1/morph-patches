package com.bytedance.realx.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import com.immomo.momomediaext.sei.BaseSei;
import p149l.bre;
import p149l.o5d0;
import p149l.qkq0;
import p149l.upk0;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
public class EglBase14 implements EglBase {
    private static final int EGLExt_SDK_VERSION = 18;
    private static final String TAG = "EglBase14";

    @Nullable
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    private int glesVersion = -1;
    private static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    private static int egl14ContextCount = 0;

    public EglBase14(Context context, int[] iArr) {
        init(EglBase.EglVersion.getPreferredEglVersion(), context, iArr);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            Log.e(TAG, "This object has been released");
            upk0.m194883a("This object has been released");
        }
    }

    private static EGLContext createEglContext(@Nullable Context context, int i, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextEglCreateContext;
        if (context != null && context.egl14Context == EGL14.EGL_NO_CONTEXT) {
            Log.e(TAG, "Invalid sharedContext");
            upk0.m194883a("Invalid sharedContext");
            return null;
        }
        int[] iArr = {12440, i, 12344};
        EGLContext eGLContext = (context == null || context.egl14Context == null) ? EGL14.EGL_NO_CONTEXT : context.egl14Context;
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
            egl14ContextCount++;
            RXLogging.m5692w(TAG, "EGL14 context create. current count is:" + egl14ContextCount);
            return eGLContextEglCreateContext;
        }
        Log.e(TAG, "Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
        o5d0.m162778a("Failed to create EGL context: 0x", Integer.toHexString(EGL14.eglGetError()));
        return null;
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            Log.e(TAG, "Input must be either a Surface or SurfaceTexture");
            qkq0.m175383a("Input must be either a Surface or SurfaceTexture");
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "Already has an EGLSurface");
            upk0.m194883a("Already has an EGLSurface");
            return;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        Log.e(TAG, "Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
        o5d0.m162778a("Failed to create window surface: 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    private void eglDetachCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        Log.e(TAG, "eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        o5d0.m162778a("eglDetachCurrent failed: 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    private void eglMakeCurrent() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
            return;
        }
        Log.e(TAG, "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
        o5d0.m162778a("eglMakeCurrent failed: 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            o5d0.m162778a("eglChooseConfig failed: 0x", Integer.toHexString(EGL14.eglGetError()));
            return null;
        }
        if (iArr2[0] <= 0) {
            upk0.m194883a("Unable to find any matching EGL config");
            return null;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        upk0.m194883a("eglChooseConfig returned null");
        return null;
    }

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            o5d0.m162778a("Unable to get EGL14 display: 0x", Integer.toHexString(EGL14.eglGetError()));
            return null;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        o5d0.m162778a("Unable to initialize EGL14: 0x", Integer.toHexString(EGL14.eglGetError()));
        return null;
    }

    private void init(int i, Context context, int[] iArr) {
        this.glesVersion = i;
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        try {
            EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
            this.eglConfig = eglConfig;
            this.eglContext = createEglContext(context, i, this.eglDisplay, eglConfig);
        } catch (RuntimeException e) {
            if (i != 3) {
                RXLogging.m5692w(TAG, "EGL14 GLES context create failed.");
                throw e;
            }
            RXLogging.m5692w(TAG, "EGL14 GLES3 context create failed: " + e.toString() + ". trying falback to EGLS2");
            EGLConfig eglConfig2 = getEglConfig(this.eglDisplay, EglBase.createModifiedEGLConfigArray(iArr, 12352, 64, 4));
            this.eglConfig = eglConfig2;
            this.eglContext = createEglContext(context, 2, this.eglDisplay, eglConfig2);
        }
    }

    public static boolean isEGL14Supported() {
        return CURRENT_SDK_VERSION >= 18;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "Already has an EGLSurface");
            upk0.m194883a("Already has an EGLSurface");
            return;
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        Log.e(TAG, "Failed to create pixel buffer surface with size " + i + BaseSei.f13930X + i2 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
        bre.m103538a("Failed to create pixel buffer surface with size ", i, BaseSei.f13930X, i2, ": 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void detachCurrent() {
        if (!EglBase.EglLock.enableEglLock) {
            eglDetachCurrent();
            return;
        }
        synchronized (EglBase.lock) {
            eglDetachCurrent();
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext, this.glesVersion);
    }

    @Override // com.bytedance.realx.video.EglBase
    public int getGLESVersion() {
        return this.glesVersion;
    }

    @Override // com.bytedance.realx.video.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "No EGLSurface - can't make current");
            upk0.m194883a("No EGLSurface - can't make current");
        } else {
            if (!EglBase.EglLock.enableEglLock) {
                eglMakeCurrent();
                return;
            }
            synchronized (EglBase.lock) {
                eglMakeCurrent();
            }
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EglBase.eglContextDestoryStart();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EglBase.eglContextDestoryEnd();
        if (!GlReleaseThreadByPass.isEglReleaseThreadByPass()) {
            EGL14.eglReleaseThread();
        }
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
        egl14ContextCount--;
        RXLogging.m5692w(TAG, "EGL14 context destroy. current count is:" + egl14ContextCount);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers(long j) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            Log.e(TAG, "No EGLSurface - can't swap buffers");
            upk0.m194883a("No EGLSurface - can't swap buffers");
        } else if (!EglBase.EglLock.enableEglLock) {
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, eGLSurface, j);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        } else {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    public static class Context implements EglBase.Context {
        private final EGLContext egl14Context;
        private final int glesVersion;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
            this.glesVersion = 2;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        public EGLContext getEgl14Context() {
            return this.egl14Context;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        public int getGLESVersion() {
            return this.glesVersion;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        @TargetApi(21)
        public long getNativeEglContext() {
            int i = EglBase14.CURRENT_SDK_VERSION;
            EGLContext eGLContext = this.egl14Context;
            return i >= 21 ? eGLContext.getNativeHandle() : eGLContext.getHandle();
        }

        public Context(EGLContext eGLContext, int i) {
            this.egl14Context = eGLContext;
            this.glesVersion = i;
        }
    }

    public EglBase14(int i, Context context, int[] iArr) {
        init(i, context, iArr);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            if (EglBase.EglLock.enableEglLock) {
                synchronized (EglBase.lock) {
                    EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
                }
                return;
            }
            EGL14.eglSwapBuffers(this.eglDisplay, eGLSurface);
            return;
        }
        Log.e(TAG, "No EGLSurface - can't swap buffers");
        upk0.m194883a("No EGLSurface - can't swap buffers");
    }
}
