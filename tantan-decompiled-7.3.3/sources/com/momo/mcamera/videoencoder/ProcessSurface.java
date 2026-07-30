package com.momo.mcamera.videoencoder;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.momo.mcamera.mask.StickerGroupFilter;
import com.momo.mcamera.videoprocess.VideoProcessListener;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p153l.dah0;
import p153l.jt2;
import p153l.omw;
import p153l.qv40;
import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class ProcessSurface {
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final String TAG = "ProcessSurface";
    int[] attrib_list;
    public FrameRefreshSoonListener frameRefreshSoonListener;
    public AtomicBoolean isRenderDrawing;
    private Object mActiviteSyncObject;
    private volatile boolean mAddCodecSurface;
    int[] mAttribList;
    private volatile boolean mBitrateAdapt;
    private dah0 mCodecSurfaceManager;
    EGLConfig[] mConfigs;
    private volatile boolean mDropFrame;
    private EGLSurface mEGLDumpSurface;
    private EGLSurface mEGLSurface;
    private volatile int mEncoderFrameRate;
    private jt2 mFilterWrap;
    private volatile boolean mFrameAvailable;
    private Object mFrameSyncObject;
    private int mLastError;
    private Surface mMediaCodecSurface;
    private Handler mMonitorHandler;
    private HandlerThread mMonitorTread;
    private volatile boolean mNeedActiveSurface;
    private volatile boolean mNeedRending;
    private volatile boolean mNeedSetFilter;
    int[] mNumConfigs;
    private int mOutImgH;
    private int mOutImgW;
    int[] mPbAttribListbAttribList;
    private ProcessParam mProcessParam;
    private volatile boolean mRemoveCodecSurface;
    public int mRenderFRate;
    private volatile boolean mRenderShouldExit;
    private RenderThread mRenderThread;
    public int mRenderTime;
    private int[] mScreenHight;
    private Object mScreenSurface;
    private int[] mScreenWidth;
    private StickerGroupFilter mStickersFilter;
    private Surface mSurface;
    int[] mSurfaceAttribs;
    private SurfaceTexture mSurfaceTexture;
    private ProcessRender mTextureRender;
    private final Lock mThreadSyn;
    private Object mThreadSyncObject;
    private int[] mValue;
    private long playIngTime;
    private long playStartTime;
    private VideoProcessListener processListener;
    private ProcessParam processParam;
    long renderLoop;
    long renderToCT;
    long renderToDT;
    public AtomicBoolean shouldDrop;
    private EGL10 mEGL = null;
    private EGLDisplay mEGLDisplay = EGL10.EGL_NO_DISPLAY;
    private EGLContext mEGLContext = EGL10.EGL_NO_CONTEXT;

    public interface FrameRefreshSoonListener {
        void frameRefresh();
    }

    public class RenderThread extends Thread {
        final int TIMEOUT_MS;
        long count;

        /* JADX INFO: renamed from: i */
        int f14978i;
        volatile boolean isRecording;
        ProcessSurface mOwr;
        long now;
        long oldnow;

        /* JADX INFO: renamed from: t */
        int f14979t;

        public RenderThread(ProcessSurface processSurface, String str) {
            super(str);
            this.TIMEOUT_MS = 40;
            this.count = 0L;
            this.f14978i = 0;
            this.f14979t = 0;
            this.isRecording = false;
            this.mOwr = processSurface;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (ProcessSurface.this.mThreadSyncObject) {
                ProcessSurface.this.mThreadSyncObject.notifyAll();
            }
            do {
                synchronized (ProcessSurface.this.mActiviteSyncObject) {
                    try {
                        if (ProcessSurface.this.mNeedActiveSurface) {
                            ProcessSurface.this.activiteSurface_l();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            if (ProcessSurface.this.mEGLSurface != EGL10.EGL_NO_SURFACE) {
                                ProcessSurface.this.mEGL.eglSwapBuffers(ProcessSurface.this.mEGLDisplay, ProcessSurface.this.mEGLSurface);
                            }
                        }
                        if (ProcessSurface.this.mNeedSetFilter) {
                            ProcessSurface.this.selectFilter_l();
                        }
                        if (ProcessSurface.this.mAddCodecSurface) {
                            ProcessSurface processSurface = ProcessSurface.this;
                            processSurface.addMediaCodecSurface_l(processSurface.mMediaCodecSurface);
                            this.isRecording = true;
                        }
                        if (ProcessSurface.this.mRemoveCodecSurface) {
                            ProcessSurface.this.removeMediaCodecSurface_l();
                            this.isRecording = false;
                        }
                        ProcessSurface.this.mActiviteSyncObject.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (ProcessSurface.this.mFrameSyncObject) {
                    if (!ProcessSurface.this.mFrameAvailable) {
                        try {
                            ProcessSurface.this.mFrameSyncObject.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (ProcessSurface.this.mFrameAvailable) {
                        ProcessSurface.this.drawImage();
                        ProcessSurface.this.mFrameAvailable = false;
                        this.f14978i++;
                        long jNanoTime = System.nanoTime() / 1000;
                        this.now = jNanoTime;
                        int i = this.f14978i;
                        if (i > 3) {
                            this.f14979t = (int) (((long) this.f14979t) + (jNanoTime - this.oldnow));
                            this.count++;
                        }
                        if (i > 20) {
                            long j = ((long) this.f14979t) / this.count;
                            if (j > 0) {
                                ProcessSurface.this.mRenderFRate = (int) ((1000000 / j) + 1);
                            }
                            ProcessSurface processSurface2 = ProcessSurface.this;
                            int i2 = processSurface2.mRenderFRate;
                            if (i2 > 0) {
                                processSurface2.mRenderTime = 1000 / i2;
                            }
                            this.count = 0L;
                            this.oldnow = 0L;
                            this.now = 0L;
                            this.f14979t = 0;
                            this.f14978i = 0;
                        }
                        this.oldnow = this.now;
                    }
                }
            } while (!ProcessSurface.this.mRenderShouldExit);
            if (ProcessSurface.this.mFilterWrap != null) {
                ProcessSurface.this.mFilterWrap.destroy();
                ProcessSurface.this.mFilterWrap = null;
            }
            if (ProcessSurface.this.mStickersFilter != null) {
                ProcessSurface.this.mStickersFilter.destroy();
                ProcessSurface.this.mStickersFilter = null;
            }
            if (ProcessSurface.this.mTextureRender != null) {
                ProcessSurface.this.mTextureRender.release();
                ProcessSurface.this.mTextureRender = null;
            }
            if (ProcessSurface.this.mEGL != null) {
                ProcessSurface.this.mEGL.eglDestroySurface(ProcessSurface.this.mEGLDisplay, ProcessSurface.this.mEGLSurface);
                ProcessSurface.this.mEGL.eglDestroySurface(ProcessSurface.this.mEGLDisplay, ProcessSurface.this.mEGLDumpSurface);
                if (ProcessSurface.this.mEGL.eglGetCurrentContext().equals(ProcessSurface.this.mEGLContext)) {
                    EGL10 egl10 = ProcessSurface.this.mEGL;
                    EGLDisplay eGLDisplay = ProcessSurface.this.mEGLDisplay;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                ProcessSurface.this.mEGL.eglDestroyContext(ProcessSurface.this.mEGLDisplay, ProcessSurface.this.mEGLContext);
                ProcessSurface.this.mEGL.eglTerminate(ProcessSurface.this.mEGLDisplay);
                ProcessSurface.this.mEGL = null;
            }
            ProcessSurface.this.mScreenSurface = null;
            synchronized (ProcessSurface.this.mActiviteSyncObject) {
                ProcessSurface.this.mActiviteSyncObject.notifyAll();
            }
        }
    }

    public ProcessSurface(ProcessParam processParam) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.mEGLSurface = eGLSurface;
        this.mEGLDumpSurface = eGLSurface;
        this.mFilterWrap = null;
        this.mStickersFilter = null;
        this.mScreenSurface = null;
        this.mThreadSyn = new ReentrantLock();
        this.mFrameSyncObject = new Object();
        this.mActiviteSyncObject = new Object();
        this.mThreadSyncObject = new Object();
        this.mTextureRender = null;
        this.mScreenWidth = new int[1];
        this.mScreenHight = new int[1];
        this.mLastError = 0;
        this.mOutImgW = 352;
        this.mOutImgH = 640;
        this.playStartTime = 0L;
        this.playIngTime = 0L;
        this.isRenderDrawing = new AtomicBoolean(false);
        this.shouldDrop = new AtomicBoolean(false);
        this.mRenderFRate = 20;
        this.mRenderTime = 30;
        this.renderToDT = 0L;
        this.renderToCT = 0L;
        this.renderLoop = 0L;
        this.mMonitorTread = null;
        this.mMonitorHandler = null;
        this.mSurfaceAttribs = new int[]{12375, 192, 12374, 320, 12344};
        this.mPbAttribListbAttribList = new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};
        this.mAttribList = new int[]{12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};
        this.attrib_list = new int[]{12440, 2, 12344};
        this.mConfigs = null;
        this.mNumConfigs = null;
        this.mValue = new int[1];
        this.mNeedRending = false;
        this.mNeedActiveSurface = true;
        this.mNeedSetFilter = false;
        this.mAddCodecSurface = false;
        this.mRemoveCodecSurface = false;
        this.mEncoderFrameRate = 25;
        this.mDropFrame = false;
        this.mBitrateAdapt = false;
        this.mRenderThread = new RenderThread(this, "ijkStrRender");
        this.mRenderShouldExit = false;
        if (this.playStartTime == 0) {
            this.playStartTime = System.currentTimeMillis();
        }
        synchronized (this.mThreadSyncObject) {
            try {
                this.mProcessParam = processParam;
                try {
                    RenderThread renderThread = this.mRenderThread;
                    if (renderThread != null) {
                        renderThread.start();
                    }
                    this.mThreadSyncObject.wait();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mNeedRending = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MonitorTask() {
        this.mDropFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void activiteSurface_l() {
        try {
            eglSetup(this.mScreenSurface);
            if (this.mScreenSurface == null) {
                makeUnCurrent();
                this.mNeedRending = false;
            } else {
                makeCurrent();
                this.mNeedRending = true;
            }
            setup();
            this.mNeedActiveSurface = false;
        } catch (IllegalArgumentException unused) {
            this.mNeedRending = false;
            setLastErr(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMediaCodecSurface_l(Surface surface) {
        synchronized (this.mActiviteSyncObject) {
            if (surface != null) {
                try {
                    this.mCodecSurfaceManager = new dah0(surface, 2, this.mEGLContext, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.mAddCodecSurface = false;
        }
    }

    private void checkEglError(String str) {
        while (this.mEGL.eglGetError() != 12288) {
            setLastErr(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawImage() {
        if (this.mNeedRending) {
            makeCurrent();
        } else {
            makeUnCurrent();
        }
        if (this.mTextureRender == null) {
            return;
        }
        System.currentTimeMillis();
        this.renderLoop++;
        if (this.mNeedRending) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.mTextureRender.drawFrame(0);
            this.mEGL.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface);
            if (this.renderLoop < 20) {
                this.renderToDT = (this.renderToDT + System.currentTimeMillis()) - jCurrentTimeMillis;
            } else {
                this.renderToDT = System.currentTimeMillis() - jCurrentTimeMillis;
                this.renderLoop = 1L;
            }
        } else {
            this.mTextureRender.drawFrame(0);
        }
        if (this.mCodecSurfaceManager != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (!this.mDropFrame && !this.shouldDrop.get()) {
                this.mCodecSurfaceManager.m115120c();
                this.mTextureRender.drawScreenFrame();
                this.mCodecSurfaceManager.m115122e();
            }
            if (this.renderLoop == 1) {
                this.renderToCT = System.currentTimeMillis() - jCurrentTimeMillis2;
            } else {
                this.renderToCT = (this.renderToCT + System.currentTimeMillis()) - jCurrentTimeMillis2;
            }
            if (this.mBitrateAdapt) {
                this.mDropFrame = true;
                Handler handler = this.mMonitorHandler;
                if (handler != null) {
                    handler.postDelayed(new Runnable() { // from class: com.momo.mcamera.videoencoder.ProcessSurface.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ProcessSurface.this.MonitorTask();
                        }
                    }, 1000 / this.mEncoderFrameRate);
                }
            } else {
                this.mDropFrame = false;
            }
        }
        FrameRefreshSoonListener frameRefreshSoonListener = this.frameRefreshSoonListener;
        if (frameRefreshSoonListener != null) {
            frameRefreshSoonListener.frameRefresh();
        }
    }

    private void eglSetup(Object obj) {
        EGLConfig eGLConfigChooseConfig;
        if (this.mEGL == null) {
            this.mEGL = (EGL10) EGLContext.getEGL();
        }
        EGLSurface eGLSurface = this.mEGLSurface;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.mEGL.eglDestroySurface(this.mEGLDisplay, eGLSurface);
            this.mEGL.eglMakeCurrent(this.mEGLDisplay, eGLSurface2, eGLSurface2, eGLContext);
            this.mEGLSurface = eGLSurface2;
        }
        if (this.mEGLDisplay == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.mEGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mEGLDisplay = eGLDisplayEglGetDisplay;
            if (!this.mEGL.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.mLastError = -1;
                return;
            }
        }
        if (this.mConfigs == null) {
            this.mConfigs = new EGLConfig[1];
        }
        if (this.mNumConfigs == null) {
            this.mNumConfigs = new int[1];
        }
        EGL10 egl10 = this.mEGL;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.mEGLDisplay, this.mAttribList, null, 0, this.mNumConfigs)) {
                this.mLastError = -1;
                return;
            }
            int[] iArr = this.mNumConfigs;
            int i = iArr[0];
            if (i <= 0) {
                wg3.m206174a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                this.mEGL.eglChooseConfig(this.mEGLDisplay, this.mAttribList, eGLConfigArr, i, iArr);
                eGLConfigChooseConfig = chooseConfig(this.mEGL, this.mEGLDisplay, eGLConfigArr);
            }
        } else {
            if (!egl10.eglChooseConfig(this.mEGLDisplay, this.mPbAttribListbAttribList, null, 0, this.mNumConfigs)) {
                this.mLastError = -1;
                return;
            }
            int[] iArr2 = this.mNumConfigs;
            int i2 = iArr2[0];
            if (i2 <= 0) {
                wg3.m206174a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
                this.mEGL.eglChooseConfig(this.mEGLDisplay, this.mPbAttribListbAttribList, eGLConfigArr2, i2, iArr2);
                eGLConfigChooseConfig = chooseConfig(this.mEGL, this.mEGLDisplay, eGLConfigArr2);
            }
        }
        if (this.mEGLContext == eGLContext) {
            this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, eGLConfigChooseConfig, eGLContext, this.attrib_list);
            checkEglError("eglCreateContext");
            if (this.mEGLContext == null) {
                this.mLastError = -1;
                return;
            }
        }
        if (obj != null) {
            if (this.mEGLSurface == eGLSurface2) {
                this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, eGLConfigChooseConfig, obj, null);
                checkEglError("eglCreateWindowSurface");
                if (this.mEGLSurface == null) {
                    this.mLastError = -1;
                    return;
                }
            }
            this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12374, this.mScreenHight);
            this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12375, this.mScreenWidth);
            return;
        }
        EGLSurface eGLSurface3 = this.mEGLDumpSurface;
        if (eGLSurface3 != eGLSurface2) {
            this.mEGL.eglDestroySurface(this.mEGLDisplay, eGLSurface3);
            this.mEGLDumpSurface = eGLSurface2;
        }
        int[] iArr3 = this.mSurfaceAttribs;
        iArr3[1] = this.mOutImgW;
        iArr3[3] = this.mOutImgH;
        if (this.mEGLDumpSurface == eGLSurface2) {
            this.mEGLDumpSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, eGLConfigChooseConfig, iArr3);
            checkEglError("eglCreatePbufferSurface");
            if (this.mEGLDumpSurface == null) {
                this.mLastError = -1;
            }
        }
    }

    private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
    }

    private void makeCurrent() {
        if (this.mEGL == null) {
            this.mLastError = -1;
            return;
        }
        checkEglError("before makeCurrent");
        EGLSurface eGLSurface = this.mEGLSurface;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.mScreenHight[0] == 0 || this.mScreenWidth[0] == 0 || this.mEGL.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        this.mLastError = -1;
    }

    private void makeUnCurrent() {
        if (this.mEGL == null) {
            this.mLastError = -1;
            return;
        }
        checkEglError("before makeUnCurrent");
        EGLSurface eGLSurface = this.mEGLDumpSurface;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.mEGL.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        this.mLastError = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMediaCodecSurface_l() {
        synchronized (this.mActiviteSyncObject) {
            try {
                dah0 dah0Var = this.mCodecSurfaceManager;
                if (dah0Var != null) {
                    dah0Var.m115121d();
                    this.mCodecSurfaceManager = null;
                }
                this.mRemoveCodecSurface = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectFilter_l() {
        jt2 jt2Var;
        ProcessRender processRender = this.mTextureRender;
        if (processRender != null && (jt2Var = this.mFilterWrap) != null) {
            processRender.selectFilter(jt2Var);
        }
        this.mNeedSetFilter = false;
    }

    private void setup() {
        if (this.mTextureRender == null) {
            ProcessRender processRender = new ProcessRender(new qv40(), this, this.mProcessParam);
            this.mTextureRender = processRender;
            processRender.setFrameRate(this.mEncoderFrameRate);
            this.mTextureRender.surfaceCreated();
            try {
                this.mSurfaceTexture = this.mTextureRender.getSurfaceTexture();
                this.mSurface = this.mTextureRender.getSurface();
                this.mTextureRender.setProcessListener(new VideoProcessListener() { // from class: com.momo.mcamera.videoencoder.ProcessSurface.1
                    @Override // com.momo.mcamera.videoprocess.VideoProcessListener
                    public void onFail(Exception exc) {
                        if (ProcessSurface.this.processListener != null) {
                            ProcessSurface.this.processListener.onFail(exc);
                        }
                    }

                    @Override // com.momo.mcamera.videoprocess.VideoProcessListener
                    public void onProcessFinish(String str) {
                        if (ProcessSurface.this.processListener != null) {
                            ProcessSurface.this.processListener.onProcessFinish(null);
                        }
                    }

                    @Override // com.momo.mcamera.videoprocess.VideoProcessListener
                    public void onProcessProgress(float f) {
                        if (ProcessSurface.this.processListener != null) {
                            ProcessSurface.this.processListener.onProcessProgress(f);
                        }
                    }

                    @Override // com.momo.mcamera.videoprocess.VideoProcessListener
                    public void onStart() {
                        if (ProcessSurface.this.processListener != null) {
                            ProcessSurface.this.processListener.onStart();
                        }
                    }
                });
                this.mTextureRender.startRender();
            } catch (Surface.OutOfResourcesException unused) {
                this.mLastError = -1;
            }
        }
    }

    public synchronized void activiteSurface(Object obj) {
        this.mLastError = 0;
        try {
            synchronized (this.mActiviteSyncObject) {
                try {
                    if (this.mScreenSurface != obj || obj == null) {
                        this.mNeedActiveSurface = true;
                    }
                    this.mScreenSurface = obj;
                    this.mActiviteSyncObject.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public synchronized void addFilterToDestory(jt2 jt2Var) {
        synchronized (this.mActiviteSyncObject) {
            try {
                ProcessRender processRender = this.mTextureRender;
                if (processRender != null) {
                    processRender.addFilterToDestory(jt2Var);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void addGroupFilter(Context context, StickerGroupFilter stickerGroupFilter) {
        synchronized (this.mActiviteSyncObject) {
            try {
                try {
                    this.mStickersFilter = stickerGroupFilter;
                    this.mActiviteSyncObject.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void addMediaCodecSurface(Surface surface) {
        synchronized (this.mActiviteSyncObject) {
            try {
                this.mMediaCodecSurface = surface;
                this.mAddCodecSurface = true;
                try {
                    this.mActiviteSyncObject.wait();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HandlerThread handlerThread = new HandlerThread("VMonitor");
        this.mMonitorTread = handlerThread;
        handlerThread.start();
        this.mMonitorHandler = new Handler(this.mMonitorTread.getLooper());
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i = 0;
        while (i < length) {
            EGLConfig eGLConfig = eGLConfigArr[i];
            ProcessSurface processSurface = this;
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iFindConfigAttrib = processSurface.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iFindConfigAttrib2 = processSurface.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iFindConfigAttrib >= 0 && iFindConfigAttrib2 >= 0) {
                int iFindConfigAttrib3 = processSurface.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iFindConfigAttrib4 = processSurface.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iFindConfigAttrib5 = processSurface.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iFindConfigAttrib6 = processSurface.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iFindConfigAttrib3 == 8 && iFindConfigAttrib4 == 8 && iFindConfigAttrib5 == 8 && iFindConfigAttrib6 == 8) {
                    return eGLConfig;
                }
            }
            i++;
            this = processSurface;
            egl10 = egl11;
            eGLDisplay = eGLDisplay2;
        }
        return null;
    }

    public MediaCodec.BufferInfo getCurrentBuffer() {
        ProcessRender processRender = this.mTextureRender;
        if (processRender != null) {
            return processRender.getCurrentBuffer();
        }
        return null;
    }

    public int getLastErr() {
        return this.mLastError;
    }

    public synchronized Surface getSurface() {
        return this.mSurface;
    }

    public synchronized SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ProcessRender processRender;
        if (this.playIngTime == 0) {
            this.playIngTime = System.currentTimeMillis();
        }
        synchronized (this.mFrameSyncObject) {
            try {
                if (this.mFrameAvailable && (processRender = this.mTextureRender) != null) {
                    processRender.checkGlError("mFrameAvailable already set, frame could be dropped");
                }
                this.mFrameAvailable = true;
                this.mFrameSyncObject.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void release() {
        this.mNeedRending = false;
        try {
            if (this.mRenderThread != null) {
                this.mRenderShouldExit = true;
                try {
                    this.mRenderThread.join();
                } catch (InterruptedException unused) {
                    this.mRenderThread.interrupt();
                }
                this.mRenderThread = null;
            }
            Surface surface = this.mSurface;
            if (surface != null) {
                surface.release();
                this.mSurface = null;
            }
        } catch (Error | Exception unused2) {
        }
        this.mSurfaceTexture = null;
        this.mMediaCodecSurface = null;
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.mEGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.mEGLSurface = eGLSurface;
        this.mEGLDumpSurface = eGLSurface;
        this.mEGL = null;
    }

    public void removeMediaCodecSurface() {
        synchronized (this.mActiviteSyncObject) {
            try {
                this.mRemoveCodecSurface = true;
                try {
                    this.mActiviteSyncObject.wait();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void selectFilter(Context context, jt2 jt2Var) {
        switchFilterTo(context, jt2Var);
    }

    public void setEncodeFrameRate(int i) {
        this.mEncoderFrameRate = i;
        ProcessRender processRender = this.mTextureRender;
        if (processRender != null) {
            processRender.setFrameRate(i);
        }
    }

    public void setLastErr(int i) {
        this.mLastError = i;
    }

    public void setProcessListener(VideoProcessListener videoProcessListener) {
        this.processListener = videoProcessListener;
    }

    public void switchFilterTo(Context context, jt2 jt2Var) {
        synchronized (this.mActiviteSyncObject) {
            try {
                try {
                    this.mFilterWrap = jt2Var;
                    this.mNeedSetFilter = true;
                    this.mActiviteSyncObject.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void updatePoints(omw omwVar) {
        StickerGroupFilter stickerGroupFilter = this.mStickersFilter;
        if (stickerGroupFilter != null) {
            stickerGroupFilter.setMMCVInfo(omwVar);
        }
    }
}
