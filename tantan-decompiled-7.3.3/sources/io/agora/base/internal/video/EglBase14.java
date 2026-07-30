package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import java.util.concurrent.locks.ReadWriteLock;
import p153l.azk0;
import p153l.fse;
import p153l.rdd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(18)
public class EglBase14 implements EglBase {
    private static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    private static final int EGLExt_SDK_VERSION = 18;
    private static final String TAG = "EglBase14";

    @Nullable
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface;
    private boolean mIsDisplay;
    private int transferID;

    public static class Context implements EglBase.Context {
        private final EGLContext egl14Context;
        private int glesVersion = 2;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Context)) {
                return this == obj;
            }
            EGLContext eGLContext = this.egl14Context;
            EGLContext eGLContext2 = ((Context) obj).egl14Context;
            if (eGLContext != null) {
                return eGLContext.equals(eGLContext2);
            }
            return eGLContext2 == null;
        }

        public EGLContext getEglContext() {
            return this.egl14Context;
        }

        public int getGlesVersion() {
            return this.glesVersion;
        }

        @Override // io.agora.base.internal.video.EglBase.Context
        @TargetApi(21)
        public long getNativeEglContext() {
            int i = EglBase14.CURRENT_SDK_VERSION;
            EGLContext eGLContext = this.egl14Context;
            return i >= 21 ? eGLContext.getNativeHandle() : eGLContext.getHandle();
        }

        public int hashCode() {
            EGLContext eGLContext = this.egl14Context;
            return eGLContext != null ? eGLContext.hashCode() : super.hashCode();
        }

        @Override // io.agora.base.internal.video.EglBase.Context
        public void setGlesVersion(int i) {
            this.glesVersion = i;
        }
    }

    public EglBase14(Context context, int i, boolean z, EglBase.EglConfigType eglConfigType) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        VideoFrame.ColorSpace.Transfer.Unspecified.getTransfer();
        this.transferID = i;
        this.mIsDisplay = z;
        int[] eglConfigAttributes = eglConfigType.getEglConfigAttributes();
        if (HdrUtil.isDirectHdrVision(this.transferID) || (z && HdrUtil.isDisplayHdrVision(this.transferID))) {
            eglConfigAttributes = HdrUtil.isSupportedEGL3() ? EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102_EGL30 : EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
        }
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, eglConfigAttributes);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig, i);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            azk0.m101074a("This object has been released");
        }
    }

    private static EGLContext createEglContext(@Nullable Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eGLContextEglCreateContext;
        if (context != null && context.egl14Context == EGL14.EGL_NO_CONTEXT) {
            azk0.m101074a("Invalid sharedContext");
            return null;
        }
        int glesVersion = context != null ? context.getGlesVersion() : 2;
        if ((HdrUtil.is10BitLumaDepth(i) || HdrUtil.isNeedTransToHdrVision(i)) && HdrUtil.isSupportedEGL3()) {
            glesVersion = 3;
        }
        int[] iArr = {12440, glesVersion, 12344};
        EGLContext eGLContext = context == null ? EGL14.EGL_NO_CONTEXT : context.egl14Context;
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eGLContextEglCreateContext;
        }
        rdd0.m180845a("Failed to create EGL context: 0x", Integer.toHexString(EGL14.eglGetError()));
        return null;
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            wtq0.m207906a("Input must be either a Surface or SurfaceTexture");
            return;
        }
        checkIsNotReleased();
        if (hasSurface()) {
            azk0.m101074a("Already has an EGLSurface");
            return;
        }
        int[] iArr = {12344};
        if ((HdrUtil.isDirectHdrVision(this.transferID) || (this.mIsDisplay && HdrUtil.isDisplayHdrVision(this.transferID))) && (this.transferID == VideoFrame.ColorSpace.Transfer.SMPTEST2084.getTransfer() || this.transferID == VideoFrame.ColorSpace.Transfer.ARIB_STD_B67.getTransfer() || HdrUtil.isNeedTransToHdrVision(this.transferID))) {
            iArr = EglBase.EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, iArr, 0);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        rdd0.m180845a("Failed to create window surface: 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            rdd0.m180845a("eglChooseConfig failed: 0x", Integer.toHexString(EGL14.eglGetError()));
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

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            rdd0.m180845a("Unable to get EGL14 display: 0x", Integer.toHexString(EGL14.eglGetError()));
            return null;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        rdd0.m180845a("Unable to initialize EGL14: 0x", Integer.toHexString(EGL14.eglGetError()));
        return null;
    }

    public static boolean isEGL14Supported() {
        StringBuilder sb = new StringBuilder("SDK version: ");
        int i = CURRENT_SDK_VERSION;
        sb.append(i);
        sb.append(". isEGL14Supported: ");
        sb.append(i >= 18);
        Logging.m88100i(TAG, sb.toString());
        return isEGL14SupportedImpl();
    }

    public static boolean isEGL14SupportedImpl() {
        return CURRENT_SDK_VERSION >= 18;
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (hasSurface()) {
            azk0.m101074a("Already has an EGLSurface");
            return;
        }
        int[] iArr = {12375, i, 12374, i2, 12344};
        if ((HdrUtil.isDirectHdrVision(this.transferID) || (this.mIsDisplay && HdrUtil.isDisplayHdrVision(this.transferID))) && (this.transferID == VideoFrame.ColorSpace.Transfer.SMPTEST2084.getTransfer() || this.transferID == VideoFrame.ColorSpace.Transfer.ARIB_STD_B67.getTransfer() || HdrUtil.isNeedTransToHdrVision(this.transferID))) {
            iArr = new int[]{12375, i, 12374, i2, EglBase.EGL_GL_COLORSPACE_KHR, EglBase.EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, iArr, 0);
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        fse.m127168a("Failed to create pixel buffer surface with size ", i, BaseSei.f14624X, i2, ": 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // io.agora.base.internal.video.EglBase
    public boolean hasSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        return (eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) ? false : true;
    }

    @Override // io.agora.base.internal.video.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            azk0.m101074a("No EGLSurface - can't make current");
            return;
        }
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()) + ", eglDisplay: " + this.eglDisplay + ", eglSurface:" + this.eglSurface + ", eglContext:" + this.eglContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void release() {
        Logging.m88100i(TAG, "release()" + this);
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        ReadWriteLock readWriteLock = EglBase.rwlock;
        readWriteLock.writeLock().lock();
        try {
            synchronized (EglBase.lock) {
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            }
            readWriteLock.writeLock().unlock();
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglConfig = null;
        } catch (Throwable th) {
            EglBase.rwlock.writeLock().unlock();
            throw th;
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public void setPresentationTime(long j) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, eGLSurface, j);
        } else {
            azk0.m101074a("No EGLSurface can't swap buffers");
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // io.agora.base.internal.video.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // io.agora.base.internal.video.EglBase
    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            azk0.m101074a("No EGLSurface - can't swap buffers");
            return;
        }
        synchronized (EglBase.lock) {
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // io.agora.base.internal.video.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // io.agora.base.internal.video.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        azk0.m101074a("No EGLSurface - can't swap buffers");
    }

    public EglBase14(Context context, int[] iArr) {
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        this.transferID = VideoFrame.ColorSpace.Transfer.Unspecified.getTransfer();
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig, 0);
    }
}
