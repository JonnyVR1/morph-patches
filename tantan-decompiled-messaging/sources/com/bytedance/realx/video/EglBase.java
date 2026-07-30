package com.bytedance.realx.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface EglBase {

    @Deprecated
    public static final int[] CONFIG_PIXEL_BUFFER;

    @Deprecated
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER;

    @Deprecated
    public static final int[] CONFIG_PLAIN;

    @Deprecated
    public static final int[] CONFIG_RECORDABLE;

    @Deprecated
    public static final int[] CONFIG_RGBA;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int[] ES2_CONFIG_PIXEL_BUFFER;
    public static final int[] ES2_CONFIG_PIXEL_RGBA_BUFFER;
    public static final int[] ES2_CONFIG_PLAIN;
    public static final int[] ES2_CONFIG_RECORDABLE;
    public static final int[] ES2_CONFIG_RGBA;
    public static final String TAG = "EglBase";
    public static final Object lock = new Object();
    public static final int[] ES3_CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 64, 12344};
    public static final int[] ES3_CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344};
    public static final int[] ES3_CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 64, 12339, 1, 12344};
    public static final int[] ES3_CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12339, 1, 12344};
    public static final int[] ES3_CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12610, 1, 12344};

    /* JADX INFO: renamed from: com.bytedance.realx.video.EglBase$1 */
    public static /* synthetic */ class C11301 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$EglBase$Config;

        static {
            int[] iArr = new int[Config.values().length];
            $SwitchMap$com$bytedance$realx$video$EglBase$Config = iArr;
            try {
                iArr[Config.CONFIG_RGBA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_PIXEL_BUFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_PIXEL_RGBA_BUFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_RECORDABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$EglBase$Config[Config.CONFIG_PLAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Config {
        CONFIG_PLAIN,
        CONFIG_RGBA,
        CONFIG_PIXEL_BUFFER,
        CONFIG_PIXEL_RGBA_BUFFER,
        CONFIG_RECORDABLE
    }

    public interface Context {
        public static final long NO_CONTEXT = 0;

        EGLContext getEgl14Context();

        int getGLESVersion();

        long getNativeEglContext();
    }

    public interface EglContextChecker {
        void EglContextDestoryEnd();

        void EglContextDestoryStart();
    }

    public static class EglLock {
        public static boolean enableEglLock = true;
    }

    public static class EglVersion {
        public static final int EGL_VERSION_2 = 2;
        public static final int EGL_VERSION_3 = 3;
        private static int PREFERRED_EGL_VERSION = 2;

        public static int getPreferredEglVersion() {
            return PREFERRED_EGL_VERSION;
        }

        public static void setPreferredEglVersion(int i) {
            PREFERRED_EGL_VERSION = i;
        }
    }

    static {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
        ES2_CONFIG_PLAIN = iArr;
        int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        ES2_CONFIG_RGBA = iArr2;
        int[] iArr3 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
        ES2_CONFIG_PIXEL_BUFFER = iArr3;
        int[] iArr4 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
        ES2_CONFIG_PIXEL_RGBA_BUFFER = iArr4;
        int[] iArr5 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344};
        ES2_CONFIG_RECORDABLE = iArr5;
        CONFIG_PLAIN = iArr;
        CONFIG_RGBA = iArr2;
        CONFIG_PIXEL_BUFFER = iArr3;
        CONFIG_PIXEL_RGBA_BUFFER = iArr4;
        CONFIG_RECORDABLE = iArr5;
    }

    static EglBase create(@Nullable Context context, int[] iArr) {
        return (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) ? new EglBase14(EglVersion.getPreferredEglVersion(), (EglBase14.Context) context, iArr) : new EglBase10((EglBase10.Context) context, iArr);
    }

    static EglBase createEgl10(javax.microedition.khronos.egl.EGLContext eGLContext, int[] iArr) {
        return new EglBase10(new EglBase10.Context(eGLContext), createModifiedEGLConfigArray(iArr, 12352, 64, 4));
    }

    static EglBase createEgl14(EGLContext eGLContext, int[] iArr) {
        return new EglBase14(EglVersion.getPreferredEglVersion(), new EglBase14.Context(eGLContext, EglVersion.getPreferredEglVersion()), iArr);
    }

    static int[] createModifiedEGLConfigArray(int[] iArr, int i, int i2, int i3) {
        int i4;
        int[] iArr2 = (int[]) iArr.clone();
        for (int i5 = 0; i5 < iArr2.length; i5++) {
            if (iArr2[i5] == i && (i4 = i5 + 1) < iArr2.length && iArr2[i4] == i2) {
                iArr2[i4] = i3;
                return iArr2;
            }
        }
        return iArr2;
    }

    static void eglContextDestoryEnd() {
        EglBaseCheckerHelper.EglContextDestoryEnd();
    }

    static void eglContextDestoryStart() {
        EglBaseCheckerHelper.EglContextDestoryStart();
    }

    static int[] getEGLConfig(int i, Config config) {
        int i2 = C11301.$SwitchMap$com$bytedance$realx$video$EglBase$Config[config.ordinal()];
        if (i2 == 1) {
            return i == 3 ? ES3_CONFIG_RGBA : ES2_CONFIG_RGBA;
        }
        if (i2 == 2) {
            return i == 3 ? ES3_CONFIG_PIXEL_BUFFER : ES2_CONFIG_PIXEL_BUFFER;
        }
        if (i2 == 3) {
            return i == 3 ? ES3_CONFIG_PIXEL_RGBA_BUFFER : ES2_CONFIG_PIXEL_RGBA_BUFFER;
        }
        if (i2 != 4) {
            return i == 3 ? ES3_CONFIG_PLAIN : ES2_CONFIG_PLAIN;
        }
        return i == 3 ? ES3_CONFIG_RECORDABLE : ES2_CONFIG_RECORDABLE;
    }

    static void setEglContextChecker(EglContextChecker eglContextChecker) {
        EglBaseCheckerHelper.setEglContextChecker(eglContextChecker);
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    int getGLESVersion();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    static EglBase createEgl14(int[] iArr) {
        return new EglBase14(EglVersion.getPreferredEglVersion(), null, iArr);
    }

    static EglBase createEgl10(int[] iArr) {
        return new EglBase10(null, iArr);
    }

    static EglBase create() {
        return create(null, getEGLConfig(EglVersion.getPreferredEglVersion(), Config.CONFIG_PLAIN));
    }

    static EglBase create(Context context) {
        return create(context, getEGLConfig(EglVersion.getPreferredEglVersion(), Config.CONFIG_PLAIN));
    }
}
