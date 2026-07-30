package p153l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006%"}, m88121d2 = {"Ll/xje;", "", "<init>", "()V", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "", "e", "(Landroid/graphics/SurfaceTexture;)V", "f", Constants.INAPP_DATA_TAG, "Ljavax/microedition/khronos/egl/EGLConfig;", "a", "()Ljavax/microedition/khronos/egl/EGLConfig;", "", "c", "()[I", "Ljavax/microedition/khronos/egl/EGL10;", "egl", "Ljavax/microedition/khronos/egl/EGLDisplay;", "eglDisplay", "eglConfig", "Ljavax/microedition/khronos/egl/EGLContext;", "b", "(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLContext;", "Ljavax/microedition/khronos/egl/EGL10;", "Ljavax/microedition/khronos/egl/EGLDisplay;", "Ljavax/microedition/khronos/egl/EGLSurface;", "Ljavax/microedition/khronos/egl/EGLSurface;", "eglSurface", "Ljavax/microedition/khronos/egl/EGLContext;", "eglContext", "Ljavax/microedition/khronos/egl/EGLConfig;", "Landroid/view/Surface;", "Landroid/view/Surface;", "surface", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xje {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public EGL10 egl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public EGLDisplay eglDisplay = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public EGLContext eglContext = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public EGLConfig eglConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Surface surface;

    /* JADX INFO: renamed from: a */
    public final EGLConfig m211204a() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArrM211206c = m211206c();
        EGL10 egl10 = this.egl;
        if (egl10 == null || !egl10.eglChooseConfig(this.eglDisplay, iArrM211206c, eGLConfigArr, 1, iArr)) {
            return null;
        }
        return eGLConfigArr[0];
    }

    /* JADX INFO: renamed from: b */
    public final EGLContext m211205b(EGL10 egl, EGLDisplay eglDisplay, EGLConfig eglConfig) {
        int[] iArr = {12440, 2, 12344};
        if (egl != null) {
            return egl.eglCreateContext(eglDisplay, eglConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int[] m211206c() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    }

    /* JADX INFO: renamed from: d */
    public final void m211207d() {
        EGL10 egl10 = this.egl;
        if (egl10 != null) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
            egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
            egl10.eglTerminate(this.eglDisplay);
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.surface = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m211208e(@NotNull SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        try {
            EGL egl = EGLContext.getEGL();
            egl.getClass();
            EGL10 egl10 = (EGL10) egl;
            this.egl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10 != null ? egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY) : null;
            this.eglDisplay = eGLDisplayEglGetDisplay;
            int[] iArr = new int[2];
            EGL10 egl11 = this.egl;
            if (egl11 != null) {
                egl11.eglInitialize(eGLDisplayEglGetDisplay, iArr);
            }
            this.eglConfig = m211204a();
            Surface surface = new Surface(surfaceTexture);
            this.surface = surface;
            EGL10 egl12 = this.egl;
            this.eglSurface = egl12 != null ? egl12.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surface, null) : null;
            this.eglContext = m211205b(this.egl, this.eglDisplay, this.eglConfig);
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface != null && !Intrinsics.m88377d(eGLSurface, EGL10.EGL_NO_SURFACE)) {
                EGL10 egl13 = this.egl;
                if (egl13 != null) {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (egl13.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.eglContext)) {
                        return;
                    }
                    C21726z0 c21726z0 = C21726z0.INSTANCE;
                    EGL10 egl14 = this.egl;
                    c21726z0.m218093b("AnimPlayer.EGLUtil", "make current error:" + Integer.toHexString(egl14 != null ? egl14.eglGetError() : 0));
                    return;
                }
                return;
            }
            C21726z0 c21726z1 = C21726z0.INSTANCE;
            EGL10 egl15 = this.egl;
            c21726z1.m218093b("AnimPlayer.EGLUtil", "error:" + Integer.toHexString(egl15 != null ? egl15.eglGetError() : 0));
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.EGLUtil", "error:" + th, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m211209f() {
        EGLSurface eGLSurface;
        EGL10 egl10;
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay == null || (eGLSurface = this.eglSurface) == null || (egl10 = this.egl) == null) {
            return;
        }
        egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
    }
}
