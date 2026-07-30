package tv.danmaku.ijk.media.player;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p149l.n8c;

/* JADX INFO: loaded from: classes3.dex */
class fakeSurface implements SurfaceTexture.OnFrameAvailableListener {
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final String TAG = "fakeSurface";
    int[] attrib_list;
    private final Object mActiviteSyncObject;
    int[] mAttribList;
    EGLConfig[] mConfigs;
    private boolean mDeblueEnabled;
    private float mDeblurWeight;
    private EGL10 mEGL;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;
    private EGLSurface mEGLDumpSurface;
    private EGLSurface mEGLRendingSurface;
    private EGLSurface mEGLSurface;
    private long mFirstRenderT;
    private boolean mFrameAvailable;
    private int mFrameH;
    private final Condition mFrameSync;
    private final Object mFrameSyncObject;
    private int mFrameW;
    private int mLastError;
    private boolean mNeedActiveSurface;
    private boolean mNeedRending;
    int[] mNumConfigs;
    int[] mPbAttribListbAttribList;
    private RenderMode mRenderMode;
    private boolean mRenderShouldExit;
    private RenderThread mRenderThread;
    private float mSaturation;
    private int[] mScreenHight;
    private Object mScreenSurface;
    private int[] mScreenWidth;
    private Surface mSurface;
    int[] mSurfaceAttribs;
    private SurfaceTexture mSurfaceTexture;
    private TextureRenderExt mTextureRender;
    private TextureRender mTextureRenderSimple;
    private final Lock mThreadSyn;
    private final Object mThreadSyncObject;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.fakeSurface$1 */
    public static /* synthetic */ class C224581 {
        static final /* synthetic */ int[] $SwitchMap$tv$danmaku$ijk$media$player$fakeSurface$RenderMode;

        static {
            int[] iArr = new int[RenderMode.values().length];
            $SwitchMap$tv$danmaku$ijk$media$player$fakeSurface$RenderMode = iArr;
            try {
                iArr[RenderMode.RENDER_MODE_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$tv$danmaku$ijk$media$player$fakeSurface$RenderMode[RenderMode.RENDER_MODE_SIMPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum RenderMode {
        RENDER_MODE_SIMPLE,
        RENDER_MODE_NORMAL
    }

    public class RenderThread extends Thread {
        final int TIMEOUT_MS;
        fakeSurface mOwr;

        public RenderThread(fakeSurface fakesurface, String str) {
            super(str);
            this.TIMEOUT_MS = 40;
            this.mOwr = fakesurface;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (fakeSurface.this.mThreadSyncObject) {
                fakeSurface.this.mThreadSyncObject.notifyAll();
            }
            while (!fakeSurface.this.mRenderShouldExit) {
                synchronized (fakeSurface.this.mActiviteSyncObject) {
                    try {
                        if (fakeSurface.this.mNeedActiveSurface) {
                            fakeSurface.this.activiteSurface_l();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            if (fakeSurface.this.mEGLSurface != EGL10.EGL_NO_SURFACE) {
                                fakeSurface.this.mEGL.eglSwapBuffers(fakeSurface.this.mEGLDisplay, fakeSurface.this.mEGLSurface);
                            }
                            fakeSurface.this.mNeedActiveSurface = false;
                        }
                        fakeSurface.this.mActiviteSyncObject.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (fakeSurface.this.mFrameSyncObject) {
                    if (!fakeSurface.this.mFrameAvailable) {
                        try {
                            fakeSurface.this.mFrameSyncObject.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    boolean unused2 = fakeSurface.this.mFrameAvailable;
                    fakeSurface.this.mFrameAvailable = false;
                }
                fakeSurface.this.drawImage();
                if (Thread.interrupted() || fakeSurface.this.mRenderShouldExit) {
                    break;
                }
            }
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            EGLSurface eGLSurface = fakeSurface.this.mEGLSurface;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface != eGLSurface2) {
                fakeSurface.this.mEGL.eglSwapBuffers(fakeSurface.this.mEGLDisplay, fakeSurface.this.mEGLSurface);
            }
            if (fakeSurface.this.mTextureRenderSimple != null) {
                fakeSurface.this.mTextureRenderSimple.destroy();
                fakeSurface.this.mTextureRenderSimple = null;
            }
            if (fakeSurface.this.mEGL != null) {
                if (fakeSurface.this.mEGLDumpSurface != eGLSurface2) {
                    fakeSurface.this.mEGL.eglDestroySurface(fakeSurface.this.mEGLDisplay, fakeSurface.this.mEGLDumpSurface);
                    fakeSurface.this.mEGLDumpSurface = eGLSurface2;
                }
                if (fakeSurface.this.mEGLSurface != eGLSurface2) {
                    fakeSurface.this.mEGL.eglDestroySurface(fakeSurface.this.mEGLDisplay, fakeSurface.this.mEGLSurface);
                    fakeSurface.this.mEGLSurface = eGLSurface2;
                }
                if (fakeSurface.this.mEGL.eglGetCurrentContext().equals(fakeSurface.this.mEGLContext)) {
                    fakeSurface.this.mEGL.eglMakeCurrent(fakeSurface.this.mEGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                }
                fakeSurface.this.mEGL.eglDestroyContext(fakeSurface.this.mEGLDisplay, fakeSurface.this.mEGLContext);
                fakeSurface.this.mEGL.eglTerminate(fakeSurface.this.mEGLDisplay);
                fakeSurface.this.mEGL = null;
            }
            fakeSurface.this.mScreenSurface = null;
        }
    }

    public fakeSurface() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.mThreadSyn = reentrantLock;
        this.mFrameSync = reentrantLock.newCondition();
        this.mSurfaceAttribs = new int[]{12375, 352, 12374, 640, 12344};
        this.mPbAttribListbAttribList = new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};
        this.mAttribList = new int[]{12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};
        this.attrib_list = new int[]{12440, 2, 12344};
        this.mConfigs = null;
        this.mNumConfigs = null;
        this.mEGL = null;
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.mEGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.mEGLSurface = eGLSurface;
        this.mEGLDumpSurface = eGLSurface;
        this.mEGLRendingSurface = eGLSurface;
        this.mScreenSurface = null;
        this.mFrameSyncObject = new Object();
        this.mActiviteSyncObject = new Object();
        Object obj = new Object();
        this.mThreadSyncObject = obj;
        this.mTextureRender = null;
        this.mTextureRenderSimple = null;
        this.mScreenWidth = new int[1];
        this.mScreenHight = new int[1];
        this.mLastError = 0;
        this.mFrameW = 352;
        this.mFrameH = 640;
        this.mFirstRenderT = 0L;
        this.mNeedRending = false;
        this.mNeedActiveSurface = true;
        this.mRenderThread = new RenderThread(this, "ijkPlayRender");
        this.mRenderShouldExit = false;
        this.mDeblurWeight = 0.45f;
        this.mSaturation = 1.0f;
        this.mDeblueEnabled = false;
        this.mRenderMode = RenderMode.RENDER_MODE_SIMPLE;
        synchronized (obj) {
            try {
                try {
                    RenderThread renderThread = this.mRenderThread;
                    if (renderThread != null) {
                        renderThread.start();
                    }
                    obj.wait();
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
    public void activiteSurface_l() {
        TextureRender textureRender;
        try {
            eglSetup(this.mScreenSurface);
            if (this.mScreenSurface == null) {
                makeUnCurrent();
                this.mNeedRending = false;
            } else {
                makeCurrent();
                if (this.mScreenWidth[0] != 0 && this.mScreenHight[0] != 0) {
                    int i = C224581.$SwitchMap$tv$danmaku$ijk$media$player$fakeSurface$RenderMode[this.mRenderMode.ordinal()];
                    if (i == 1) {
                        TextureRenderExt textureRenderExt = this.mTextureRender;
                        if (textureRenderExt != null) {
                            textureRenderExt.updateRec(this.mFrameW, this.mFrameH, this.mScreenWidth[0], this.mScreenHight[0]);
                        }
                    } else if (i == 2 && (textureRender = this.mTextureRenderSimple) != null) {
                        textureRender.updateRec(this.mFrameW, this.mFrameH, this.mScreenWidth[0], this.mScreenHight[0]);
                    }
                }
                this.mNeedRending = true;
            }
            setup();
            Log.e(TAG, "activiteSurface_l: mRenderMode: " + this.mRenderMode + "， width: " + this.mFrameW + Constants.SEPARATOR_COMMA + this.mFrameH + ", " + this.mScreenWidth[0] + ", " + this.mScreenHight[0]);
        } catch (IllegalArgumentException unused) {
            n8c.m158483a(TAG, "activiteSurface_l eglSetup exception");
            this.mNeedRending = false;
            setLastErr(-1);
        }
    }

    private void checkEglError(String str) {
        while (true) {
            int iEglGetError = this.mEGL.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            n8c.m158485c(TAG, str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            setLastErr(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawImage() {
        int i = C224581.$SwitchMap$tv$danmaku$ijk$media$player$fakeSurface$RenderMode[this.mRenderMode.ordinal()];
        if (i == 1) {
            drawImageNormal();
        } else {
            if (i != 2) {
                return;
            }
            drawImageSimple();
        }
    }

    private void drawImageNormal() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay;
        try {
            if (this.mTextureRender == null) {
                return;
            }
            EGLSurface eGLSurface2 = this.mEGLSurface;
            EGLSurface eGLSurface3 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface2 != eGLSurface3) {
                this.mEGL.eglQuerySurface(this.mEGLDisplay, eGLSurface2, 12374, this.mScreenHight);
                this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12375, this.mScreenWidth);
            }
            if (this.mScreenWidth[0] != 0 && this.mScreenHight[0] != 0) {
                n8c.m158483a(TAG, "updateRec mEGLSurface width = " + this.mScreenWidth[0] + ";mEGLSurface hight =" + this.mScreenHight[0]);
                this.mTextureRender.updateRec(this.mFrameW, this.mFrameH, this.mScreenWidth[0], this.mScreenHight[0]);
            }
            this.mTextureRender.checkGlError("before updateTexImage");
            this.mSurfaceTexture.updateTexImage();
            if (this.mNeedRending) {
                if (this.mFirstRenderT == 0) {
                    this.mFirstRenderT = System.currentTimeMillis();
                }
                this.mTextureRender.drawFrame(this.mSurfaceTexture);
                EGL10 egl10 = this.mEGL;
                if (egl10 == null || (eGLSurface = this.mEGLSurface) == eGLSurface3 || (eGLDisplay = this.mEGLDisplay) == EGL10.EGL_NO_DISPLAY) {
                    return;
                }
                egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
            }
        } catch (Exception unused) {
            n8c.m158483a(TAG, " mSurfaceTexture.updateTexImage exception ");
        }
    }

    private void drawImageSimple() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay;
        try {
            if (this.mTextureRenderSimple == null) {
                return;
            }
            EGLSurface eGLSurface2 = this.mEGLSurface;
            EGLSurface eGLSurface3 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface2 != eGLSurface3) {
                this.mEGL.eglQuerySurface(this.mEGLDisplay, eGLSurface2, 12374, this.mScreenHight);
                this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12375, this.mScreenWidth);
            }
            if (this.mScreenWidth[0] != 0 && this.mScreenHight[0] != 0) {
                n8c.m158483a(TAG, "updateRec mEGLSurface width = " + this.mScreenWidth[0] + ";mEGLSurface hight =" + this.mScreenHight[0]);
                this.mTextureRenderSimple.updateRec(this.mFrameW, this.mFrameH, this.mScreenWidth[0], this.mScreenHight[0]);
            }
            this.mTextureRenderSimple.checkGlError("before updateTexImage");
            this.mSurfaceTexture.updateTexImage();
            if (this.mNeedRending) {
                if (this.mFirstRenderT == 0) {
                    this.mFirstRenderT = System.currentTimeMillis();
                }
                this.mTextureRenderSimple.drawFrame(this.mSurfaceTexture);
                EGL10 egl10 = this.mEGL;
                if (egl10 == null || (eGLSurface = this.mEGLSurface) == eGLSurface3 || (eGLDisplay = this.mEGLDisplay) == EGL10.EGL_NO_DISPLAY) {
                    return;
                }
                egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
            }
        } catch (Exception unused) {
            n8c.m158483a(TAG, " mSurfaceTexture.updateTexImage exception ");
        }
    }

    private void eglSetup(Object obj) {
        EGLSurface eGLSurface;
        if (this.mEGL == null) {
            this.mEGL = (EGL10) EGLContext.getEGL();
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
            if (!egl10.eglChooseConfig(this.mEGLDisplay, this.mAttribList, this.mConfigs, 1, this.mNumConfigs)) {
                this.mLastError = -1;
                return;
            }
        } else if (!egl10.eglChooseConfig(this.mEGLDisplay, this.mPbAttribListbAttribList, this.mConfigs, 1, this.mNumConfigs)) {
            this.mLastError = -1;
            return;
        }
        EGLContext eGLContext = this.mEGLContext;
        EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        if (eGLContext == eGLContext2) {
            this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, this.mConfigs[0], eGLContext2, this.attrib_list);
            checkEglError("eglCreateContext");
            if (this.mEGLContext == null) {
                this.mLastError = -1;
                return;
            }
        }
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (obj != null) {
            EGLSurface eGLSurface3 = this.mEGLSurface;
            if (eGLSurface3 != eGLSurface2) {
                this.mEGL.eglDestroySurface(this.mEGLDisplay, eGLSurface3);
                this.mEGLSurface = eGLSurface2;
            }
            if (this.mEGLSurface == eGLSurface2) {
                try {
                    this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mConfigs[0], obj, null);
                    checkEglError("eglCreateWindowSurface");
                    if (this.mEGLSurface == null) {
                        this.mLastError = -1;
                        return;
                    }
                } catch (Exception unused) {
                    this.mLastError = -1;
                    Log.e(TAG, "eglCreateWindowSurface fail");
                    return;
                }
            }
            this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12374, this.mScreenHight);
            this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12375, this.mScreenWidth);
            n8c.m158483a(TAG, "mEGLSurface width = " + this.mScreenWidth[0] + ";mEGLSurface hight =" + this.mScreenHight[0]);
        } else {
            int[] iArr = this.mSurfaceAttribs;
            if ((iArr[1] != this.mFrameW || iArr[3] != this.mFrameH) && (eGLSurface = this.mEGLDumpSurface) != eGLSurface2) {
                this.mEGL.eglDestroySurface(this.mEGLDisplay, eGLSurface);
                this.mEGLDumpSurface = eGLSurface2;
            }
            if (this.mEGLDumpSurface == eGLSurface2) {
                int[] iArr2 = this.mSurfaceAttribs;
                iArr2[1] = this.mFrameW;
                iArr2[3] = this.mFrameH;
                try {
                    this.mEGLDumpSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mConfigs[0], iArr2);
                    checkEglError("eglCreatePbufferSurface");
                    if (this.mEGLDumpSurface == null) {
                        this.mLastError = -1;
                        return;
                    }
                } catch (Exception unused2) {
                    this.mLastError = -1;
                    Log.e(TAG, "eglCreatePbufferSurface fail");
                    return;
                }
            }
        }
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
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

    private void setup() {
        RenderMode renderMode = this.mRenderMode;
        if (renderMode != RenderMode.RENDER_MODE_NORMAL) {
            if (renderMode == RenderMode.RENDER_MODE_SIMPLE && this.mTextureRenderSimple == null) {
                TextureRender textureRender = new TextureRender(this);
                this.mTextureRenderSimple = textureRender;
                textureRender.surfaceCreated();
                try {
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureRenderSimple.getTextureId());
                    this.mSurfaceTexture = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.mSurface = new Surface(this.mSurfaceTexture);
                    return;
                } catch (Surface.OutOfResourcesException unused) {
                    this.mLastError = -1;
                    return;
                }
            }
            return;
        }
        if (this.mTextureRender == null) {
            TextureRenderExt textureRenderExt = new TextureRenderExt(this);
            this.mTextureRender = textureRenderExt;
            textureRenderExt.setSaturation(this.mSaturation);
            this.mTextureRender.setDeblurWeight(this.mDeblurWeight);
            this.mTextureRender.setDeblurEnabled(this.mDeblueEnabled);
            this.mTextureRender.surfaceCreated();
            n8c.m158483a(TAG, "textureID=" + this.mTextureRender.getTextureId());
            try {
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.mTextureRender.getTextureId());
                this.mSurfaceTexture = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(this);
                this.mSurface = new Surface(this.mSurfaceTexture);
            } catch (Surface.OutOfResourcesException unused2) {
                this.mLastError = -1;
            }
        }
    }

    public synchronized void activiteSurface(Object obj) {
        this.mLastError = 0;
        n8c.m158483a(TAG, "activiteSurface" + obj);
        synchronized (this.mActiviteSyncObject) {
            try {
                if (obj != null) {
                    try {
                        Object obj2 = this.mScreenSurface;
                        if (obj2 == null || !obj2.equals(obj)) {
                        }
                        this.mScreenSurface = obj;
                        this.mActiviteSyncObject.wait();
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.mNeedActiveSurface = true;
                this.mScreenSurface = obj;
                this.mActiviteSyncObject.wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long getFirstRender() {
        return this.mFirstRenderT;
    }

    public int getLastErr() {
        return this.mLastError;
    }

    public synchronized Surface getSurface() {
        return this.mSurface;
    }

    public int getVideoWidth() {
        return this.mFrameW;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        n8c.m158483a(TAG, "new frame available");
        synchronized (this.mFrameSyncObject) {
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: all -> 0x000f, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000b, B:12:0x0016, B:11:0x0011, B:13:0x0018, B:15:0x002e, B:16:0x0033), top: B:23:0x0001, inners: #0 }] */
    public synchronized void release() {
        Surface surface;
        RenderThread renderThread = this.mRenderThread;
        if (renderThread != null) {
            this.mRenderShouldExit = true;
            try {
                renderThread.join(3000L);
            } catch (Exception unused) {
                this.mRenderThread.interrupt();
            }
            this.mRenderThread = null;
            this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
            this.mEGLContext = EGL10.EGL_NO_CONTEXT;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            this.mEGLSurface = eGLSurface;
            this.mEGLDumpSurface = eGLSurface;
            this.mEGL = null;
            this.mTextureRender = null;
            surface = this.mSurface;
            if (surface != null) {
                surface.release();
                this.mSurface = null;
            }
            this.mSurfaceTexture = null;
            this.mTextureRenderSimple = null;
        } else {
            this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
            this.mEGLContext = EGL10.EGL_NO_CONTEXT;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            this.mEGLSurface = eGLSurface2;
            this.mEGLDumpSurface = eGLSurface2;
            this.mEGL = null;
            this.mTextureRender = null;
            surface = this.mSurface;
            if (surface != null) {
                surface.release();
                this.mSurface = null;
            }
            this.mSurfaceTexture = null;
            this.mTextureRenderSimple = null;
        }
        throw th;
    }

    public void setDeblurEnabled(boolean z) {
        this.mDeblueEnabled = z;
        TextureRenderExt textureRenderExt = this.mTextureRender;
        if (textureRenderExt != null) {
            textureRenderExt.setDeblurEnabled(z);
        }
    }

    public void setDeblurWeight(float f) {
        this.mDeblurWeight = f;
        TextureRenderExt textureRenderExt = this.mTextureRender;
        if (textureRenderExt != null) {
            textureRenderExt.setDeblurWeight(f);
        }
    }

    public void setLastErr(int i) {
        this.mLastError = i;
    }

    public void setRenderMode(RenderMode renderMode) {
        this.mRenderMode = renderMode;
    }

    public void setSaturation(float f) {
        this.mSaturation = f;
        TextureRenderExt textureRenderExt = this.mTextureRender;
        if (textureRenderExt != null) {
            textureRenderExt.setSaturation(f);
        }
    }

    public void updateRec(int i, int i2, int i3, int i4) {
        this.mFrameW = i;
        this.mFrameH = i2;
    }

    public void updateRect(float f, float f2, float f3, float f4) {
        TextureRender textureRender = this.mTextureRenderSimple;
        if (textureRender != null) {
            textureRender.updateRec(f, f2, f3, f4);
        }
    }

    public fakeSurface(SurfaceHolder surfaceHolder) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.mThreadSyn = reentrantLock;
        this.mFrameSync = reentrantLock.newCondition();
        this.mSurfaceAttribs = new int[]{12375, 352, 12374, 640, 12344};
        this.mPbAttribListbAttribList = new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};
        this.mAttribList = new int[]{12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};
        this.attrib_list = new int[]{12440, 2, 12344};
        this.mConfigs = null;
        this.mNumConfigs = null;
        this.mEGL = null;
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.mEGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.mEGLSurface = eGLSurface;
        this.mEGLDumpSurface = eGLSurface;
        this.mEGLRendingSurface = eGLSurface;
        this.mScreenSurface = null;
        this.mFrameSyncObject = new Object();
        this.mActiviteSyncObject = new Object();
        this.mThreadSyncObject = new Object();
        this.mTextureRender = null;
        this.mTextureRenderSimple = null;
        this.mScreenWidth = new int[1];
        this.mScreenHight = new int[1];
        this.mLastError = 0;
        this.mFrameW = 352;
        this.mFrameH = 640;
        this.mFirstRenderT = 0L;
        this.mNeedRending = false;
        this.mNeedActiveSurface = true;
        this.mRenderThread = new RenderThread(this, "ijkPlayRender");
        this.mRenderShouldExit = false;
        this.mDeblurWeight = 0.45f;
        this.mSaturation = 1.0f;
        this.mDeblueEnabled = false;
        this.mRenderMode = RenderMode.RENDER_MODE_SIMPLE;
        try {
            eglSetup(surfaceHolder);
            makeCurrent();
            setup();
        } catch (IllegalArgumentException unused) {
            n8c.m158483a(TAG, "eglSetup exception");
            setLastErr(-1);
        }
    }
}
