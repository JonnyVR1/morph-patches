package com.core.glcore.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.x3k;

/* JADX INFO: loaded from: classes.dex */
public class GpuBenmarkUtils {
    public static final int GPU_BENMARK_HIGH = 1;
    public static final int GPU_BENMARK_LOWER = 3;
    public static final int GPU_BENMARK_MEDIUM = 2;
    private GpuBenmark gpuBenmark;

    /* JADX INFO: renamed from: i */
    private int f5772i;
    private Context mContext;
    private GpuBenmarkChangeListener mGpuBenmarkChangeListener;
    private double mGpubenmarkValue;
    private EGLConfig eglConfig = null;
    private EGLDisplay eglDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext eglContext = EGL14.EGL_NO_CONTEXT;
    private final ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(128));

    /* JADX INFO: renamed from: com.core.glcore.util.GpuBenmarkUtils$1 */
    public class RunnableC14151 implements Runnable {
        public RunnableC14151() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GpuBenmarkUtils.this.f5772i = 0;
            while (GpuBenmarkUtils.this.f5772i < 3) {
                GpuBenmarkUtils.this.poolExecutor.execute(new Runnable() { // from class: com.core.glcore.util.GpuBenmarkUtils.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GpuBenmarkUtils.this.gpuBenmark = new GpuBenmark();
                        GpuBenmarkUtils.this.gpuBenmark.setGpuBenmarkListener(new GpuBenmarkListener() { // from class: com.core.glcore.util.GpuBenmarkUtils.1.1.1
                            @Override // com.core.glcore.util.GpuBenmarkListener
                            public void getGpuBenmark(double d) {
                                GpuBenmarkUtils.access$218(GpuBenmarkUtils.this, d / 3.0d);
                                if (GpuBenmarkUtils.this.f5772i == 2) {
                                    int gpuBenmarkLevel = PreferenceUtil.getGpuBenmarkLevel(GpuBenmarkUtils.this.mContext);
                                    GpuBenmarkUtils gpuBenmarkUtils = GpuBenmarkUtils.this;
                                    int iJudgeGpuLevel = gpuBenmarkUtils.judgeGpuLevel(gpuBenmarkUtils.mGpubenmarkValue);
                                    GpuBenmarkUtils.this.mGpuBenmarkChangeListener.getGpuBenmarkLevel(iJudgeGpuLevel);
                                    if (gpuBenmarkLevel != iJudgeGpuLevel) {
                                        PreferenceUtil.setGpuBenmarkLevel(GpuBenmarkUtils.this.mContext, iJudgeGpuLevel);
                                    }
                                }
                                GpuBenmarkUtils.this.gpuBenmark.releaseGL();
                            }
                        });
                        GpuBenmarkUtils.this.gpuBenmark.startGpuBenmark();
                    }
                });
                SystemClock.sleep(1000L);
                GpuBenmarkUtils.access$008(GpuBenmarkUtils.this);
            }
        }
    }

    public GpuBenmarkUtils(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ int access$008(GpuBenmarkUtils gpuBenmarkUtils) {
        int i = gpuBenmarkUtils.f5772i;
        gpuBenmarkUtils.f5772i = i + 1;
        return i;
    }

    public static /* synthetic */ double access$218(GpuBenmarkUtils gpuBenmarkUtils, double d) {
        double d2 = gpuBenmarkUtils.mGpubenmarkValue + d;
        gpuBenmarkUtils.mGpubenmarkValue = d2;
        return d2;
    }

    private void createGL() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.eglDisplay = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.eglDisplay, new int[]{12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.eglConfig = eGLConfig;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.eglDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.eglContext = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            x3k.m209245a("EGL error ", EGL14.eglGetError());
            return;
        }
        GLSurface gLSurface = new GLSurface(512, 512);
        GLSurface.Viewport viewport = gLSurface.viewport;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, viewport.width, 12374, viewport.height, 12344}, 0);
        gLSurface.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        EGL14.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.eglContext);
    }

    private void destroyGL() {
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
    }

    private int getGLExtensions() {
        createGL();
        String strGlGetString = GLES20.glGetString(7939);
        int length = !TextUtils.isEmpty(strGlGetString) ? strGlGetString.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).length : 0;
        destroyGL();
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int judgeGpuLevel(double d) {
        int gLExtensions = getGLExtensions();
        if (gLExtensions < 77 || d > 320.0d) {
            return ((gLExtensions < 70 || d <= 320.0d || d > 500.0d) && gLExtensions < 77) ? 3 : 2;
        }
        return 1;
    }

    private int judgeGpuLevelFast() {
        int gLExtensions = getGLExtensions();
        if (gLExtensions >= 77) {
            return 1;
        }
        return (gLExtensions <= 70 || gLExtensions >= 77) ? 3 : 2;
    }

    private void updata() {
        new Thread(new RunnableC14151(), "live-media-GpuBenmarkUtils").start();
    }

    public int getGpuBenmark(boolean z) {
        int gpuBenmarkLevel = PreferenceUtil.getGpuBenmarkLevel(this.mContext);
        if (z && gpuBenmarkLevel != 0) {
            updata();
        }
        return gpuBenmarkLevel == 0 ? judgeGpuLevelFast() : gpuBenmarkLevel;
    }

    public void setGpuBenmarkChangeListener(GpuBenmarkChangeListener gpuBenmarkChangeListener) {
        this.mGpuBenmarkChangeListener = gpuBenmarkChangeListener;
    }
}
