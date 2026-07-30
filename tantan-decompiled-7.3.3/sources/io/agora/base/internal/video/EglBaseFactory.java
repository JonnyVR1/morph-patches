package io.agora.base.internal.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes2.dex */
public class EglBaseFactory {
    public static EglBase create(@Nullable EglBase.Context context, int i, boolean z, EglBase.EglConfigType eglConfigType) {
        return (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) ? new EglBase14((EglBase14.Context) context, i, z, eglConfigType) : new EglBase10((EglBase10.Context) context, i, z, eglConfigType);
    }

    public static EglBase createEgl10(EGLContext eGLContext, int[] iArr) {
        return new EglBase10(new EglBase10.Context(eGLContext), iArr);
    }

    public static EglBase.Context createEgl10Context(@NonNull EGLContext eGLContext) {
        return new EglBase10.Context(eGLContext);
    }

    public static EglBase createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14(new EglBase14.Context(eGLContext), iArr);
    }

    public static EglBase.Context createEgl14Context(@NonNull android.opengl.EGLContext eGLContext) {
        return new EglBase14.Context(eGLContext);
    }

    public static boolean isEglBase14(@NonNull EglBase.Context context) {
        return context instanceof EglBase14.Context;
    }

    public static EglBase createEgl10(int i, boolean z, EglBase.EglConfigType eglConfigType) {
        return new EglBase10(null, i, z, eglConfigType);
    }

    public static EglBase createEgl14(int[] iArr) {
        return new EglBase14(null, iArr);
    }

    public static EglBase createEgl10(int[] iArr) {
        return new EglBase10(null, iArr);
    }

    public static EglBase create(@Nullable EglBase.Context context, int[] iArr) {
        if (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) {
            return new EglBase14((EglBase14.Context) context, iArr);
        }
        return new EglBase10((EglBase10.Context) context, iArr);
    }

    public static EglBase create() {
        return create(null, EglBase.CONFIG_PLAIN);
    }

    public static EglBase create(EglBase.Context context) {
        return create(context, EglBase.CONFIG_PLAIN);
    }
}
