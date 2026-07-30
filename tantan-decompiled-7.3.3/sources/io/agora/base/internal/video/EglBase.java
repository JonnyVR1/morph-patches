package io.agora.base.internal.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();
    public static final ReadWriteLock rwlock = new ReentrantReadWriteLock();
    public static final int EGL_GL_COLORSPACE_KHR = 12445;
    public static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    public static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
    public static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    public static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344};
    public static final int[] CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final int[] CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12324, 10, 12323, 10, 12322, 10, 12321, 2, 12352, 4, 12339, 1, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102_EGL30 = {12324, 10, 12323, 10, 12322, 10, 12321, 2, 12352, 64, 12339, 1, 12344};

    /* JADX INFO: renamed from: io.agora.base.internal.video.EglBase$1 */
    public static /* synthetic */ class C150561 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType;

        static {
            int[] iArr = new int[EglConfigType.values().length];
            $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType = iArr;
            try {
                iArr[EglConfigType.CONFIG_PLAIN_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType[EglConfigType.CONFIG_RGBA_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType[EglConfigType.CONFIG_PIXEL_BUFFER_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType[EglConfigType.CONFIG_PIXEL_RGBA_BUFFER_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType[EglConfigType.CONFIG_RECORDABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType[EglConfigType.EGL_CONFIG_ATTRIBUTES_RGBA_1010102_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType[EglConfigType.EGL_CONFIG_ATTRIBUTES_RGBA_1010102_EGL30_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface Context {
        long getNativeEglContext();

        void setGlesVersion(int i);
    }

    public enum EglConfigType {
        CONFIG_PLAIN_TYPE(0),
        CONFIG_RGBA_TYPE(1),
        CONFIG_PIXEL_BUFFER_TYPE(2),
        CONFIG_PIXEL_RGBA_BUFFER_TYPE(3),
        CONFIG_RECORDABLE_TYPE(4),
        EGL_CONFIG_ATTRIBUTES_RGBA_1010102_TYPE(5),
        EGL_CONFIG_ATTRIBUTES_RGBA_1010102_EGL30_TYPE(6);

        public final int type;

        EglConfigType(int i) {
            this.type = i;
        }

        public int[] getEglConfigAttributes() {
            switch (C150561.$SwitchMap$io$agora$base$internal$video$EglBase$EglConfigType[ordinal()]) {
                case 1:
                    return EglBase.CONFIG_PLAIN;
                case 2:
                    return EglBase.CONFIG_RGBA;
                case 3:
                    return EglBase.CONFIG_PIXEL_BUFFER;
                case 4:
                    return EglBase.CONFIG_PIXEL_RGBA_BUFFER;
                case 5:
                    return EglBase.CONFIG_RECORDABLE;
                case 6:
                    return EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
                case 7:
                    return EglBase.EGL_CONFIG_ATTRIBUTES_RGBA_1010102_EGL30;
                default:
                    return EglBase.CONFIG_PLAIN;
            }
        }
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);
}
