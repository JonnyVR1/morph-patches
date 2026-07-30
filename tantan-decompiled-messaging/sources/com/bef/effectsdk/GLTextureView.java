package com.bef.effectsdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.amazing.annotation.EffectKeep;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.heytap.mcssdk.mode.CommandMessage;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import p149l.ig3;
import p149l.qkq0;
import p149l.upk0;

/* JADX INFO: loaded from: classes.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final boolean LOG_ATTACH_DETACH = true;
    private static final boolean LOG_EGL = true;
    private static final boolean LOG_PAUSE_RESUME = true;
    private static final boolean LOG_RENDERER = true;
    private static final boolean LOG_RENDERER_DRAW_FRAME = true;
    private static final boolean LOG_SURFACE = true;
    private static final boolean LOG_THREADS = true;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final String TAG = "GLTextureView";
    private static final GLThreadManager sGLThreadManager = new GLThreadManager();
    private int mDebugFlags;
    private boolean mDetached;
    private EGLConfigChooser mEGLConfigChooser;
    private int mEGLContextClientVersion;
    private EGLContextFactory mEGLContextFactory;
    private EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private GLThread mGLThread;
    private GLWrapper mGLWrapper;
    private boolean mPreserveEGLContextOnPause;
    SurfaceTexture mPrevSurfaceTexture;
    private GLSurfaceView.Renderer mRenderer;
    private final WeakReference<GLTextureView> mThisWeakRef;

    public abstract class BaseConfigChooser implements EGLConfigChooser {
        protected int[] mConfigSpec;

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        private int[] filterConfigSpec(int[] iArr) {
            if (GLTextureView.this.mEGLContextClientVersion == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[length + 2];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                return iArr2;
            }
            if (GLTextureView.this.mEGLContextClientVersion != 3) {
                return iArr;
            }
            int length2 = iArr.length;
            int[] iArr3 = new int[length2 + 2];
            int i2 = length2 - 1;
            System.arraycopy(iArr, 0, iArr3, 0, i2);
            iArr3[i2] = 12352;
            iArr3[length2] = 64;
            iArr3[length2 + 1] = 12344;
            return iArr3;
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                ig3.m135964a("eglChooseConfig failed");
                return null;
            }
            int i = iArr[0];
            if (i <= 0) {
                ig3.m135964a("No configs match configSpec");
                return null;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i, iArr)) {
                ig3.m135964a("eglChooseConfig#2 failed");
                return null;
            }
            EGLConfig eGLConfigChooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigChooseConfig != null) {
                return eGLConfigChooseConfig;
            }
            ig3.m135964a("No config chosen");
            return null;
        }

        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);
    }

    public class ComponentSizeChooser extends BaseConfigChooser {
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue;

        public ComponentSizeChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.mValue = new int[1];
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
        }

        @Override // com.bef.effectsdk.GLTextureView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                ComponentSizeChooser componentSizeChooser = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iFindConfigAttrib = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iFindConfigAttrib2 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iFindConfigAttrib >= componentSizeChooser.mDepthSize && iFindConfigAttrib2 >= componentSizeChooser.mStencilSize) {
                    int iFindConfigAttrib3 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iFindConfigAttrib4 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iFindConfigAttrib5 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iFindConfigAttrib6 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iFindConfigAttrib3 == componentSizeChooser.mRedSize && iFindConfigAttrib4 == componentSizeChooser.mGreenSize && iFindConfigAttrib5 == componentSizeChooser.mBlueSize && iFindConfigAttrib6 == componentSizeChooser.mAlphaSize) {
                        return eGLConfig;
                    }
                }
                i++;
                this = componentSizeChooser;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    public class DefaultContextFactory implements EGLContextFactory {
        private int EGL_CONTEXT_CLIENT_VERSION;

        private DefaultContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.EGL_CONTEXT_CLIENT_VERSION, 3, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
            GLTextureView.this.mEGLContextClientVersion = 3;
            if (eGLContextEglCreateContext != eGLContext) {
                return eGLContextEglCreateContext;
            }
            EGLContext eGLContextEglCreateContext2 = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
            GLTextureView.this.mEGLContextClientVersion = 2;
            if (eGLContextEglCreateContext2 == eGLContext) {
                GLTextureView.this.mEGLContextClientVersion = 0;
            }
            return eGLContextEglCreateContext2;
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            Thread.currentThread().getId();
            EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
        }
    }

    public static class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        private DefaultWindowSurfaceFactory() {
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e(GLTextureView.TAG, "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    public interface EGLConfigChooser {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface EGLContextFactory {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface EGLWindowSurfaceFactory {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public static class GLThread extends Thread {
        private EglHelper mEglHelper;
        private boolean mExited;
        private boolean mFinishedCreatingEglSurface;
        private WeakReference<GLTextureView> mGLTextureViewWeakRef;
        private boolean mHasSurface;
        private boolean mHaveEglContext;
        private boolean mHaveEglSurface;
        private boolean mPaused;
        private boolean mRenderComplete;
        private boolean mRequestPaused;
        private boolean mShouldExit;
        private boolean mShouldReleaseEglContext;
        private boolean mSurfaceIsBad;
        private boolean mWaitingForSurface;
        private ArrayList<Runnable> mEventQueue = new ArrayList<>();
        private boolean mSizeChanged = true;
        private int mWidth = 0;
        private int mHeight = 0;
        private boolean mRequestRender = true;
        private int mRenderMode = 1;

        public GLThread(WeakReference<GLTextureView> weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:166:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        private void guardedRun() throws InterruptedException {
            boolean z;
            boolean z2;
            this.mEglHelper = new EglHelper(this.mGLTextureViewWeakRef);
            this.mHaveEglContext = false;
            this.mHaveEglSurface = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            int i = 0;
            int i2 = 0;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (GLTextureView.sGLThreadManager) {
                            while (true) {
                                try {
                                    if (this.mHaveEglContext && !this.mEventQueue.isEmpty()) {
                                        runnableRemove = this.mEventQueue.remove(0);
                                        z = false;
                                        break;
                                    }
                                    if (this.mShouldExit) {
                                        this.mGLTextureViewWeakRef.get().onExitContext();
                                        synchronized (GLTextureView.sGLThreadManager) {
                                            stopEglSurfaceLocked();
                                            stopEglContextLocked();
                                        }
                                        return;
                                    }
                                    boolean z11 = this.mPaused;
                                    boolean z12 = this.mRequestPaused;
                                    if (z11 != z12) {
                                        this.mPaused = z12;
                                        GLTextureView.sGLThreadManager.notifyAll();
                                        getId();
                                    } else {
                                        z12 = false;
                                    }
                                    if (this.mShouldReleaseEglContext) {
                                        getId();
                                        this.mGLTextureViewWeakRef.get().onExitContext();
                                        stopEglSurfaceLocked();
                                        stopEglContextLocked();
                                        this.mShouldReleaseEglContext = false;
                                        z10 = true;
                                    }
                                    if (z6) {
                                        this.mGLTextureViewWeakRef.get().onExitContext();
                                        stopEglSurfaceLocked();
                                        stopEglContextLocked();
                                        z6 = false;
                                    }
                                    if (z12 && this.mHaveEglSurface) {
                                        getId();
                                        stopEglSurfaceLocked();
                                    }
                                    if (z12 && this.mHaveEglContext) {
                                        GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                                        if (!(gLTextureView == null ? false : gLTextureView.mPreserveEGLContextOnPause) || GLTextureView.sGLThreadManager.shouldReleaseEGLContextWhenPausing()) {
                                            stopEglContextLocked();
                                            getId();
                                        }
                                    }
                                    if (z12 && GLTextureView.sGLThreadManager.shouldTerminateEGLWhenPausing()) {
                                        this.mEglHelper.finish();
                                        getId();
                                    }
                                    if (!this.mHasSurface && !this.mWaitingForSurface) {
                                        getId();
                                        if (this.mHaveEglSurface) {
                                            stopEglSurfaceLocked();
                                        }
                                        this.mWaitingForSurface = true;
                                        this.mSurfaceIsBad = false;
                                        GLTextureView.sGLThreadManager.notifyAll();
                                    }
                                    if (this.mHasSurface && this.mWaitingForSurface) {
                                        getId();
                                        this.mWaitingForSurface = false;
                                        GLTextureView.sGLThreadManager.notifyAll();
                                    }
                                    if (z9) {
                                        getId();
                                        this.mRenderComplete = true;
                                        GLTextureView.sGLThreadManager.notifyAll();
                                        z8 = false;
                                        z9 = false;
                                    }
                                    if (readyToDraw()) {
                                        if (!this.mHaveEglContext) {
                                            if (z10) {
                                                z10 = false;
                                            } else if (GLTextureView.sGLThreadManager.tryAcquireEglContextLocked(this)) {
                                                try {
                                                    this.mEglHelper.start();
                                                    this.mHaveEglContext = true;
                                                    GLTextureView.sGLThreadManager.notifyAll();
                                                    z3 = true;
                                                } catch (RuntimeException e) {
                                                    GLTextureView.sGLThreadManager.releaseEglContextLocked(this);
                                                    throw e;
                                                }
                                            }
                                        }
                                        if (this.mHaveEglContext && !this.mHaveEglSurface) {
                                            this.mHaveEglSurface = true;
                                            z4 = true;
                                            z5 = true;
                                            z7 = true;
                                        }
                                        if (this.mHaveEglSurface) {
                                            if (this.mSizeChanged) {
                                                i = this.mWidth;
                                                i2 = this.mHeight;
                                                getId();
                                                this.mSizeChanged = false;
                                                z4 = true;
                                                z7 = true;
                                                z8 = true;
                                            }
                                            z = false;
                                            this.mRequestRender = false;
                                            GLTextureView.sGLThreadManager.notifyAll();
                                            break;
                                        }
                                    }
                                    getId();
                                    GLTextureView.sGLThreadManager.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (z4) {
                            if (this.mEglHelper.createSurface()) {
                                synchronized (GLTextureView.sGLThreadManager) {
                                    this.mFinishedCreatingEglSurface = true;
                                    GLTextureView.sGLThreadManager.notifyAll();
                                }
                                z4 = z;
                            } else {
                                synchronized (GLTextureView.sGLThreadManager) {
                                    this.mFinishedCreatingEglSurface = true;
                                    this.mSurfaceIsBad = true;
                                    GLTextureView.sGLThreadManager.notifyAll();
                                }
                            }
                            synchronized (GLTextureView.sGLThreadManager) {
                                stopEglSurfaceLocked();
                                stopEglContextLocked();
                                throw th;
                            }
                        }
                        if (z5) {
                            GL10 gl11 = (GL10) this.mEglHelper.createGL();
                            GLTextureView.sGLThreadManager.checkGLDriver(gl11);
                            gl10 = gl11;
                            z5 = z;
                        }
                        if (z3) {
                            GLTextureView gLTextureView2 = this.mGLTextureViewWeakRef.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.mRenderer.onSurfaceCreated(gl10, this.mEglHelper.mEglConfig);
                            }
                            z3 = z;
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            GLTextureView gLTextureView3 = this.mGLTextureViewWeakRef.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.mRenderer.onSurfaceChanged(gl10, i, i2);
                            }
                            z7 = z;
                        }
                        getId();
                        GLTextureView gLTextureView4 = this.mGLTextureViewWeakRef.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.mRenderer.onDrawFrame(gl10);
                        }
                        int iSwap = this.mEglHelper.swap();
                        if (iSwap == 12288) {
                            z2 = true;
                        } else if (iSwap != 12302) {
                            EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", iSwap);
                            synchronized (GLTextureView.sGLThreadManager) {
                                z2 = true;
                                this.mSurfaceIsBad = true;
                                GLTextureView.sGLThreadManager.notifyAll();
                            }
                        } else {
                            z2 = true;
                            getId();
                            z6 = true;
                        }
                        if (z8) {
                            z9 = z2;
                        }
                    } catch (Throwable th2) {
                        synchronized (GLTextureView.sGLThreadManager) {
                            stopEglSurfaceLocked();
                            stopEglContextLocked();
                            throw th2;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        private boolean readyToDraw() {
            if (this.mPaused || !this.mHasSurface || this.mSurfaceIsBad || this.mWidth <= 0 || this.mHeight <= 0) {
                return false;
            }
            return this.mRequestRender || this.mRenderMode == 1;
        }

        private void stopEglContextLocked() {
            if (this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                GLTextureView.sGLThreadManager.releaseEglContextLocked(this);
            }
        }

        private void stopEglSurfaceLocked() {
            if (this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        public boolean ableToDraw() {
            return this.mHaveEglContext && this.mHaveEglSurface && readyToDraw();
        }

        public int getRenderMode() {
            int i;
            synchronized (GLTextureView.sGLThreadManager) {
                i = this.mRenderMode;
            }
            return i;
        }

        public void onPause() {
            synchronized (GLTextureView.sGLThreadManager) {
                getId();
                this.mRequestPaused = true;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onResume() {
            synchronized (GLTextureView.sGLThreadManager) {
                getId();
                this.mRequestPaused = false;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onWindowResize(int i, int i2) {
            synchronized (GLTextureView.sGLThreadManager) {
                this.mWidth = i;
                this.mHeight = i2;
                this.mSizeChanged = true;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                    getId();
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void queueEvent(Runnable runnable) {
            if (runnable == null) {
                ig3.m135964a("r must not be null");
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                this.mEventQueue.add(runnable);
                GLTextureView.sGLThreadManager.notifyAll();
            }
        }

        public void requestExitAndWait() {
            synchronized (GLTextureView.sGLThreadManager) {
                this.mShouldExit = true;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestReleaseEglContextLocked() {
            this.mShouldReleaseEglContext = true;
            GLTextureView.sGLThreadManager.notifyAll();
        }

        public void requestRender() {
            synchronized (GLTextureView.sGLThreadManager) {
                this.mRequestRender = true;
                GLTextureView.sGLThreadManager.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            getId();
            try {
                guardedRun();
            } catch (InterruptedException | RuntimeException unused) {
            } finally {
                GLTextureView.sGLThreadManager.threadExiting(this);
            }
        }

        public void setRenderMode(int i) {
            if (i < 0 || i > 1) {
                ig3.m135964a("renderMode");
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                this.mRenderMode = i;
                GLTextureView.sGLThreadManager.notifyAll();
            }
        }

        public void surfaceCreated() {
            synchronized (GLTextureView.sGLThreadManager) {
                getId();
                this.mHasSurface = true;
                this.mFinishedCreatingEglSurface = false;
                GLTextureView.sGLThreadManager.notifyAll();
                while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void surfaceDestroyed() {
            synchronized (GLTextureView.sGLThreadManager) {
                getId();
                this.mHasSurface = false;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mWaitingForSurface && !this.mExited) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static class GLThreadManager {
        private static String TAG = "GLThreadManager";
        private static final int kGLES_20 = 131072;
        private static final String kMSM7K_RENDERER_PREFIX = "Q3Dimension MSM7500 ";
        private GLThread mEglOwner;
        private boolean mGLESDriverCheckComplete;
        private int mGLESVersion;
        private boolean mGLESVersionCheckComplete;
        private boolean mLimitedGLESContexts;
        private boolean mMultipleGLESContextsAllowed;

        private GLThreadManager() {
        }

        private void checkGLESVersion() {
            if (this.mGLESVersionCheckComplete) {
                return;
            }
            this.mMultipleGLESContextsAllowed = true;
            this.mGLESVersionCheckComplete = true;
        }

        public synchronized void checkGLDriver(GL10 gl10) {
            try {
                if (!this.mGLESDriverCheckComplete) {
                    checkGLESVersion();
                    String strGlGetString = gl10.glGetString(7937);
                    if (this.mGLESVersion < 131072) {
                        this.mMultipleGLESContextsAllowed = !strGlGetString.startsWith(kMSM7K_RENDERER_PREFIX);
                        notifyAll();
                    }
                    this.mLimitedGLESContexts = !this.mMultipleGLESContextsAllowed;
                    this.mGLESDriverCheckComplete = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            if (this.mEglOwner == gLThread) {
                this.mEglOwner = null;
            }
            notifyAll();
        }

        public synchronized boolean shouldReleaseEGLContextWhenPausing() {
            return this.mLimitedGLESContexts;
        }

        public synchronized boolean shouldTerminateEGLWhenPausing() {
            checkGLESVersion();
            return !this.mMultipleGLESContextsAllowed;
        }

        public synchronized void threadExiting(GLThread gLThread) {
            try {
                gLThread.getId();
                gLThread.mExited = true;
                if (this.mEglOwner == gLThread) {
                    this.mEglOwner = null;
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }

        public boolean tryAcquireEglContextLocked(GLThread gLThread) {
            GLThread gLThread2 = this.mEglOwner;
            if (gLThread2 == gLThread || gLThread2 == null) {
                this.mEglOwner = gLThread;
                notifyAll();
                return true;
            }
            checkGLESVersion();
            if (this.mMultipleGLESContextsAllowed) {
                return true;
            }
            GLThread gLThread3 = this.mEglOwner;
            if (gLThread3 == null) {
                return false;
            }
            gLThread3.requestReleaseEglContextLocked();
            return false;
        }
    }

    public interface GLWrapper {
        GL wrap(GL gl);
    }

    public static class LogWriter extends Writer {
        private StringBuilder mBuilder = new StringBuilder();

        private void flushBuilder() {
            if (this.mBuilder.length() > 0) {
                this.mBuilder.toString();
                StringBuilder sb = this.mBuilder;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }
    }

    public class SimpleEGLConfigChooser extends ComponentSizeChooser {
        public SimpleEGLConfigChooser(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.mPrevSurfaceTexture = null;
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    private void checkRenderThreadState() {
        if (this.mGLThread == null) {
            return;
        }
        qkq0.m175383a("setRenderer has already been called for this instance.");
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public void finalize() throws Throwable {
        try {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public int getEGLContextClientVersion() {
        return this.mEGLContextClientVersion;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public int getRenderMode() {
        return this.mGLThread.getRenderMode();
    }

    /* JADX INFO: renamed from: on */
    public void m5287on(SurfaceHolder surfaceHolder) {
        this.mGLThread.surfaceCreated();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null) {
            GLThread gLThread = this.mGLThread;
            int renderMode = gLThread != null ? gLThread.getRenderMode() : 1;
            GLThread gLThread2 = new GLThread(this.mThisWeakRef);
            this.mGLThread = gLThread2;
            if (renderMode != 1) {
                gLThread2.setRenderMode(renderMode);
            }
            this.mGLThread.onWindowResize(getWidth(), getHeight());
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    @EffectKeep
    public void onDestroy() {
        SurfaceTexture surfaceTexture = this.mPrevSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onExitContext() {
    }

    @EffectKeep
    public void onPause() {
        this.mGLThread.onPause();
    }

    @EffectKeep
    public void onResume() {
        if (this.mPrevSurfaceTexture != null) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.mPrevSurfaceTexture;
            if (surfaceTexture != surfaceTexture2) {
                setSurfaceTexture(surfaceTexture2);
                this.mGLThread.surfaceCreated();
            }
        }
        this.mGLThread.onResume();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.onWindowResize(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mPrevSurfaceTexture = surfaceTexture;
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.surfaceCreated();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        GLThread gLThread = this.mGLThread;
        if (gLThread == null) {
            return false;
        }
        gLThread.surfaceDestroyed();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mGLThread.onWindowResize(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (getRenderMode() != 0) {
            requestRender();
        }
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    public void requestRender() {
        this.mGLThread.requestRender();
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new ComponentSizeChooser(i, i2, i3, i4, i5, i6));
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.mEGLContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.mGLWrapper = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    public void setRenderMode(int i) {
        this.mGLThread.setRenderMode(i);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new DefaultContextFactory();
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        this.mRenderer = renderer;
        GLThread gLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread = gLThread;
        gLThread.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(z));
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPrevSurfaceTexture = null;
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public static class EglHelper {
        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        private WeakReference<GLTextureView> mGLTextureViewWeakRef;

        public EglHelper(WeakReference<GLTextureView> weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.mEglSurface;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
            if (gLTextureView != null) {
                gLTextureView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
            }
            this.mEglSurface = null;
        }

        public static String formatEglError(String str, int i) {
            return str + " failed";
        }

        public static void logEglErrorAsWarning(String str, String str2, int i) {
            formatEglError(str2, i);
        }

        public static void throwEglException(String str, int i) {
            String eglError = formatEglError(str, i);
            Log.e("EglHelper", "throwEglException tid=" + Thread.currentThread().getId() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + eglError);
            throw new RuntimeException(eglError);
        }

        public GL createGL() {
            GL gl = this.mEglContext.getGL();
            GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
            if (gLTextureView != null) {
                if (gLTextureView.mGLWrapper != null) {
                    gl = gLTextureView.mGLWrapper.wrap(gl);
                }
                if ((gLTextureView.mDebugFlags & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (gLTextureView.mDebugFlags & 1) == 0 ? 0 : 1, (gLTextureView.mDebugFlags & 2) != 0 ? new LogWriter() : null);
                }
            }
            return gl;
        }

        public boolean createSurface() {
            Thread.currentThread().getId();
            if (this.mEgl == null) {
                upk0.m194883a("egl not initialized");
                return false;
            }
            if (this.mEglDisplay == null) {
                upk0.m194883a("eglDisplay not initialized");
                return false;
            }
            if (this.mEglConfig == null) {
                upk0.m194883a("mEglConfig not initialized");
                return false;
            }
            destroySurfaceImp();
            GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
            if (gLTextureView != null) {
                this.mEglSurface = gLTextureView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, gLTextureView.getSurfaceTexture());
            } else {
                this.mEglSurface = null;
            }
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.mEgl.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.mEgl.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
                return true;
            }
            logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
            return false;
        }

        public void destroySurface() {
            Thread.currentThread().getId();
            destroySurfaceImp();
        }

        public void finish() {
            Thread.currentThread().getId();
            if (this.mEglContext != null) {
                GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        public void start() {
            Thread.currentThread().getId();
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.mEgl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mEglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                upk0.m194883a("eglGetDisplay failed");
                return;
            }
            if (!this.mEgl.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                upk0.m194883a("eglInitialize failed");
                return;
            }
            GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
            if (gLTextureView == null) {
                this.mEglConfig = null;
                this.mEglContext = null;
            } else {
                this.mEglConfig = gLTextureView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                this.mEglContext = gLTextureView.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, this.mEglConfig);
            }
            EGLContext eGLContext = this.mEglContext;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.mEglContext = null;
                throwEglException("createContext");
            }
            Objects.toString(this.mEglContext);
            Thread.currentThread().getId();
            this.mEglSurface = null;
        }

        public int swap() {
            return !this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface) ? this.mEgl.eglGetError() : CommandMessage.COMMAND_BASE;
        }

        private void throwEglException(String str) {
            throwEglException(str, this.mEgl.eglGetError());
        }
    }
}
