package com.bytedance.realx.video;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p153l.azk0;
import p153l.fse;
import p153l.rdd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
class EglBase10 implements EglBase {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final String TAG = "EglBase10";
    private static int egl10ContextCount;

    @Nullable
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;
    private final EGL10 egl = (EGL10) EGLContext.getEGL();

    public static class Context implements EglBase.Context {
        private final EGLContext eglContext;

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        public android.opengl.EGLContext getEgl14Context() {
            return null;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        public int getGLESVersion() {
            return 2;
        }

        @Override // com.bytedance.realx.video.EglBase.Context
        public long getNativeEglContext() {
            return 0L;
        }
    }

    public EglBase10(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL10.EGL_NO_DISPLAY || this.eglContext == EGL10.EGL_NO_CONTEXT || this.eglConfig == null) {
            azk0.m101074a("This object has been released");
        }
    }

    private EGLContext createEglContext(@Nullable Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextEglCreateContext;
        if (context != null && context.eglContext == EGL10.EGL_NO_CONTEXT) {
            azk0.m101074a("Invalid sharedContext");
            return null;
        }
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
        EGLContext eGLContext = context == null ? EGL10.EGL_NO_CONTEXT : context.eglContext;
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eGLContextEglCreateContext != EGL10.EGL_NO_CONTEXT) {
            egl10ContextCount++;
            return eGLContextEglCreateContext;
        }
        rdd0.m180845a("Failed to create EGL context: 0x", Integer.toHexString(this.egl.eglGetError()));
        return null;
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            wtq0.m207906a("Input must be either a SurfaceHolder or SurfaceTexture");
            return;
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            azk0.m101074a("Already has an EGLSurface");
            return;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344});
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != eGLSurface2) {
            return;
        }
        rdd0.m180845a("Failed to create window surface: 0x", Integer.toHexString(this.egl.eglGetError()));
    }

    private void eglDetachCurrent() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            return;
        }
        rdd0.m180845a("eglDetachCurrent failed: 0x", Integer.toHexString(this.egl.eglGetError()));
    }

    private void eglMakeCurrent() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = this.eglSurface;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
            return;
        }
        rdd0.m180845a("eglMakeCurrent failed: 0x", Integer.toHexString(this.egl.eglGetError()));
    }

    private EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!this.egl.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            rdd0.m180845a("eglChooseConfig failed: 0x", Integer.toHexString(this.egl.eglGetError()));
            return null;
        }
        if (iArr2[0] <= 0) {
            azk0.m101074a("Unable to find any matching EGL config");
            return null;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        azk0.m101074a("eglChooseConfig returned null");
        return null;
    }

    private EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        EGL10 egl10 = this.egl;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            rdd0.m180845a("Unable to get EGL10 display: 0x", Integer.toHexString(egl10.eglGetError()));
            return null;
        }
        if (egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            return eGLDisplayEglGetDisplay;
        }
        rdd0.m180845a("Unable to initialize EGL10: 0x", Integer.toHexString(this.egl.eglGetError()));
        return null;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            azk0.m101074a("Already has an EGLSurface");
            return;
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != eGLSurface2) {
            return;
        }
        fse.m127168a("Failed to create pixel buffer surface with size ", i, BaseSei.f14624X, i2, ": 0x", Integer.toHexString(this.egl.eglGetError()));
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: com.bytedance.realx.video.EglBase10.1FakeSurfaceHolder
            private final Surface surface;

            {
                this.surface = surface;
            }

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.surface;
            }

            @Override // android.view.SurfaceHolder
            @Nullable
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            @Nullable
            public Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i, int i2) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            @Deprecated
            public void setType(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }

            @Override // android.view.SurfaceHolder
            @Nullable
            public Canvas lockCanvas(Rect rect) {
                return null;
            }
        });
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
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // com.bytedance.realx.video.EglBase
    public int getGLESVersion() {
        return 2;
    }

    @Override // com.bytedance.realx.video.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            azk0.m101074a("No EGLSurface - can't make current");
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
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        EglBase.eglContextDestoryEnd();
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
        egl10ContextCount--;
    }

    @Override // com.bytedance.realx.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // com.bytedance.realx.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            azk0.m101074a("No EGLSurface - can't swap buffers");
        } else {
            if (!EglBase.EglLock.enableEglLock) {
                this.egl.eglSwapBuffers(this.eglDisplay, eGLSurface);
                return;
            }
            synchronized (EglBase.lock) {
                this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
        }
    }

    @Override // com.bytedance.realx.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // com.bytedance.realx.video.EglBase
    public void swapBuffers(long j) {
        swapBuffers();
    }
}
