package io.agora.base.internal.video;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import io.agora.base.VideoFrame;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p153l.azk0;
import p153l.fse;
import p153l.rdd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class EglBase10 implements EglBase {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private final EGL10 egl;

    @Nullable
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private boolean mIsDisplay;
    private int transferID;

    public static class Context implements EglBase.Context {
        private final EGLContext eglContext;

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Context)) {
                return this == obj;
            }
            EGLContext eGLContext = this.eglContext;
            EGLContext eGLContext2 = ((Context) obj).eglContext;
            if (eGLContext != null) {
                return eGLContext.equals(eGLContext2);
            }
            return eGLContext2 == null;
        }

        public EGLContext getEglContext() {
            return this.eglContext;
        }

        @Override // io.agora.base.internal.video.EglBase.Context
        public long getNativeEglContext() {
            return 0L;
        }

        public int hashCode() {
            EGLContext eGLContext = this.eglContext;
            return eGLContext != null ? eGLContext.hashCode() : super.hashCode();
        }

        @Override // io.agora.base.internal.video.EglBase.Context
        public void setGlesVersion(int i) {
        }
    }

    public EglBase10(Context context, int i, boolean z, EglBase.EglConfigType eglConfigType) {
        this.eglSurface = EGL10.EGL_NO_SURFACE;
        this.transferID = VideoFrame.ColorSpace.Transfer.Unspecified.getTransfer();
        this.egl = (EGL10) EGLContext.getEGL();
        this.transferID = i;
        this.mIsDisplay = z;
        int[] eglConfigAttributes = eglConfigType.getEglConfigAttributes();
        if (HdrUtil.isDirectHdrVision(this.transferID) || (this.mIsDisplay && HdrUtil.isDisplayHdrVision(this.transferID))) {
            eglConfigAttributes = HdrUtil.isSupportedEGL3() ? EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102_EGL30 : EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
        }
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, eglConfigAttributes);
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
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, HdrUtil.isSupportedEGL3() ? 3 : 2, 12344};
        EGLContext eGLContext = context == null ? EGL10.EGL_NO_CONTEXT : context.eglContext;
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = this.egl.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eGLContextEglCreateContext != EGL10.EGL_NO_CONTEXT) {
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
        int[] iArr = {12344};
        if ((HdrUtil.isDirectHdrVision(this.transferID) || (this.mIsDisplay && HdrUtil.isDisplayHdrVision(this.transferID))) && (this.transferID == VideoFrame.ColorSpace.Transfer.SMPTEST2084.getTransfer() || this.transferID == VideoFrame.ColorSpace.Transfer.ARIB_STD_B67.getTransfer() || HdrUtil.isNeedTransToHdrVision(this.transferID))) {
            iArr = EglBase.EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, iArr);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != eGLSurface2) {
            return;
        }
        rdd0.m180845a("Failed to create window surface: 0x", Integer.toHexString(this.egl.eglGetError()));
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

    @Override // io.agora.base.internal.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            azk0.m101074a("Already has an EGLSurface");
            return;
        }
        int[] iArr = {12375, i, 12374, i2, 12344};
        if (HdrUtil.isDirectHdrVision(this.transferID) || (this.mIsDisplay && HdrUtil.isDisplayHdrVision(this.transferID))) {
            if (this.transferID == VideoFrame.ColorSpace.Transfer.SMPTEST2084.getTransfer() || this.transferID == VideoFrame.ColorSpace.Transfer.ARIB_STD_B67.getTransfer()) {
                iArr = new int[]{12375, i, 12374, i2, EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
            } else if (HdrUtil.isNeedTransToHdrVision(this.transferID)) {
                iArr = EglBase.EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            }
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, iArr);
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != eGLSurface2) {
            return;
        }
        fse.m127168a("Failed to create pixel buffer surface with size ", i, BaseSei.f14624X, i2, ": 0x", Integer.toHexString(this.egl.eglGetError()));
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: io.agora.base.internal.video.EglBase10.1FakeSurfaceHolder
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

    @Override // io.agora.base.internal.video.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            try {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // io.agora.base.internal.video.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL10.EGL_NO_SURFACE;
    }

    @Override // io.agora.base.internal.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            azk0.m101074a("No EGLSurface - can't make current");
            return;
        }
        synchronized (EglBase.lock) {
            try {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(this.egl.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.egl.eglTerminate(this.eglDisplay);
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // io.agora.base.internal.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // io.agora.base.internal.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        this.egl.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    @Override // io.agora.base.internal.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL10.EGL_NO_SURFACE) {
            azk0.m101074a("No EGLSurface - can't swap buffers");
            return;
        }
        synchronized (EglBase.lock) {
            this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void swapBuffers(long j) {
        swapBuffers();
    }

    public EglBase10(Context context, int[] iArr) {
        this.eglSurface = EGL10.EGL_NO_SURFACE;
        this.transferID = VideoFrame.ColorSpace.Transfer.Unspecified.getTransfer();
        this.egl = (EGL10) EGLContext.getEGL();
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }
}
