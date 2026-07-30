package com.bytedance.realx.video;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import androidx.annotation.RequiresApi;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes.dex */
public class EglBaseUtils {
    @CalledByNative
    public static EglBase createEGLBase(EGLContext eGLContext) {
        return (eGLContext == EGL14.EGL_NO_CONTEXT || eGLContext == null) ? EglBase.createEgl14(EglBase.getEGLConfig(getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN)) : EglBase.createEgl14(eGLContext, EglBase.getEGLConfig(getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
    }

    @CalledByNative
    @RequiresApi(api = 17)
    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    @CalledByNative
    public static EglBase.Context getEGLBaseContext(EglBase eglBase) {
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    @CalledByNative
    public static long getNativeContextFromEGLBaseContext(EglBase.Context context) {
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0L;
    }

    @CalledByNative
    public static long getNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext == null) {
            return 0L;
        }
        return eGLContext.getNativeHandle();
    }

    @CalledByNative
    public static int getPreferredEglVersion() {
        return EglBase.EglVersion.getPreferredEglVersion();
    }

    @CalledByNative
    public static void releaseEGLBase(EglBase eglBase) {
        if (eglBase != null) {
            eglBase.release();
        }
    }

    @CalledByNative
    public static void setPreferredEglVersion(int i) {
        EglBase.EglVersion.setPreferredEglVersion(i);
    }
}
