package com.momo.xeengine.game;

import android.opengl.GLES20;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import androidx.annotation.Keep;
import com.momo.xeengine.XEngineException;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.game.XEVirtualGameView;
import com.momo.xeengine.lua.XELuaEngine;
import com.momo.xeengine.somanager.IXEngineSOLoader;
import com.momo.xeengine.somanager.XEngineSOManager;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import javax.microedition.khronos.egl.EGL10;
import l.ig3;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class XEVirtualGameView {
    public static int FRAME_NO_LIMIT;
    private int renderHeight;
    private int renderWidth;
    private Surface targetSurface;
    private XEngineRenderThread mGLThread = null;
    private XEGameViewCallback callback = null;
    private boolean enableClearBackground = false;
    private int preferredFramesPerSecond = 30;
    private boolean touchEnable = true;
    private boolean paused = false;
    private MyRender mRender = null;
    private final IXEngineSOLoader.LoaderCallback mLoaderCallback = new IXEngineSOLoader.LoaderCallback() { // from class: com.momo.xeengine.game.XEVirtualGameView.1
        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onFailed(String str) {
            XEVirtualGameView.this.callback.onStartFailed(str);
        }

        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onProcess(int i, double d) {
            XEVirtualGameView.this.callback.onEngineDynamicLinkLibraryDownloadProcess(i, d);
        }

        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onSuccess() {
            Surface surface = XEVirtualGameView.this.targetSurface;
            XEVirtualGameView xEVirtualGameView = XEVirtualGameView.this;
            if (surface != null) {
                xEVirtualGameView.onNativeWindowCreate(xEVirtualGameView.targetSurface, XEVirtualGameView.this.renderWidth, XEVirtualGameView.this.renderHeight);
            } else {
                xEVirtualGameView.callback.onStartFailed("Surface未设置");
            }
        }
    };
    private SafeArea viewSafeArea = null;

    public final class MyRender implements IXRender {
        private GameEngine engine;
        long preDrawFrameTime;
        private SafeArea renderSafeArea;
        private boolean startCalled;

        private MyRender() {
            this.preDrawFrameTime = 0L;
            this.engine = null;
            this.startCalled = false;
        }

        private void updateSafeArea() {
            SafeArea safeArea = XEVirtualGameView.this.viewSafeArea;
            if (safeArea == null || 0.0f == safeArea.safeW || 0.0f == safeArea.safeH || this.renderSafeArea == safeArea) {
                return;
            }
            this.engine.getWindow().SetSafeArea(safeArea.safeX, safeArea.safeY, safeArea.safeW, safeArea.safeH);
            this.renderSafeArea = safeArea;
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onBackgroundFrame() {
        }

        @Override // com.momo.xeengine.game.IXRender
        public boolean onGLDrawFrame(EGL10 egl10) {
            GameEngine gameEngine = this.engine;
            if (gameEngine == null || XEVirtualGameView.this.paused) {
                return false;
            }
            updateSafeArea();
            boolean zRender = gameEngine.render();
            if (zRender && XEVirtualGameView.this.preferredFramesPerSecond != XEVirtualGameView.FRAME_NO_LIMIT && gameEngine.getRenderMode() == GameEngine.RenderMode.Auto) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.preDrawFrameTime;
                long j = LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE / XEVirtualGameView.this.preferredFramesPerSecond;
                if (jCurrentTimeMillis < j) {
                    try {
                        Thread.sleep(j - jCurrentTimeMillis);
                    } catch (InterruptedException unused) {
                    }
                }
                this.preDrawFrameTime = System.currentTimeMillis();
            }
            return zRender;
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onGLEnvCreated() {
            try {
                GameEngine gameEngine = new GameEngine();
                XEVirtualGameView.this.paused = false;
                this.engine = gameEngine;
                this.startCalled = false;
            } catch (Exception e) {
                String message = e.getMessage();
                boolean zIsEmpty = TextUtils.isEmpty(message);
                XEVirtualGameView xEVirtualGameView = XEVirtualGameView.this;
                if (zIsEmpty) {
                    xEVirtualGameView.callback.onStartFailed(XEngineException.UNKNOWN_ERROR);
                } else {
                    xEVirtualGameView.callback.onStartFailed(message);
                }
            }
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onGLEnvCreatedFailed(String str) {
            XEVirtualGameView.this.callback.onStartFailed(str);
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onGLEnvRelease() {
            GameEngine gameEngine = this.engine;
            if (gameEngine != null) {
                gameEngine.release();
                this.engine = null;
            }
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onGLRenderSizeChanged(int i, int i2) {
            GameEngine gameEngine = this.engine;
            if (gameEngine == null) {
                return;
            }
            gameEngine.getWindow().SetSize(i, i2);
            XEVirtualGameView.this.callback.onRenderSizeChanged(i, i2);
            if (!this.startCalled) {
                XEVirtualGameView.this.callback.onStart(gameEngine);
                this.startCalled = true;
            }
            if (gameEngine.getRenderMode() == GameEngine.RenderMode.UserRequest) {
                gameEngine.requestRender();
            }
        }
    }

    public static final class SafeArea {
        final float safeH;
        final float safeW;
        final float safeX;
        final float safeY;

        public SafeArea(float f, float f2, float f3, float f4) {
            this.safeX = f;
            this.safeY = f2;
            this.safeW = f3;
            this.safeH = f4;
        }
    }

    public XEVirtualGameView(Surface surface, int i, int i2) {
        this.targetSurface = null;
        this.renderWidth = 0;
        this.renderHeight = 0;
        this.targetSurface = surface;
        this.renderWidth = i;
        this.renderHeight = i2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m509a(XEVirtualGameView xEVirtualGameView) {
        GameEngine gameEngine;
        MyRender myRender = xEVirtualGameView.mRender;
        if (myRender == null || (gameEngine = myRender.engine) == null) {
            return;
        }
        gameEngine.setOnBackground(true);
        gameEngine.getScriptEngine().callOnPause();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m510b(XEVirtualGameView xEVirtualGameView) {
        GameEngine gameEngine;
        MyRender myRender = xEVirtualGameView.mRender;
        if (myRender == null || (gameEngine = myRender.engine) == null) {
            return;
        }
        gameEngine.setOnBackground(false);
        XELuaEngine scriptEngine = gameEngine.getScriptEngine();
        if (scriptEngine != null) {
            scriptEngine.callOnResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeWindowCreate(Object obj, int i, int i2) {
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.resetNativeWindow(obj);
            return;
        }
        this.mRender = new MyRender();
        XEngineRenderThread xEngineRenderThread2 = new XEngineRenderThread(obj, this.mRender);
        this.mGLThread = xEngineRenderThread2;
        xEngineRenderThread2.onSizeChanged(i, i2);
        this.mGLThread.start();
    }

    public int getPreferredFramesPerSecond() {
        return this.preferredFramesPerSecond;
    }

    public boolean handleTouchEvent(MotionEvent motionEvent) {
        MyRender myRender;
        GameEngine gameEngine;
        IXEventDispatcher eventDispatcher;
        if (!this.touchEnable || this.paused || (myRender = this.mRender) == null || (gameEngine = myRender.engine) == null || (eventDispatcher = gameEngine.getEventDispatcher()) == null) {
            return false;
        }
        eventDispatcher.handleTouchEvent(motionEvent, 1.0f, 1.0f);
        return true;
    }

    @Deprecated
    public boolean isEnableClearBackground() {
        return this.enableClearBackground;
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void pause() {
        this.paused = true;
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.queueEvent(new Runnable() { // from class: l.scq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEVirtualGameView.m509a(this.f4132a);
                }
            });
        }
    }

    public void resume() {
        this.paused = false;
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.queueEvent(new Runnable() { // from class: l.tcq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEVirtualGameView.m510b(this.f4253a);
                }
            });
        }
    }

    public void setCallback(XEGameViewCallback xEGameViewCallback) {
        if (this.callback != null || xEGameViewCallback == null) {
            return;
        }
        this.callback = xEGameViewCallback;
    }

    @Deprecated
    public void setEnableClearBackground(boolean z) {
        this.enableClearBackground = z;
    }

    public void setPreferredFramesPerSecond(int i) {
        if (i >= 0) {
            this.preferredFramesPerSecond = i;
        } else {
            ig3.a("preferredFramesPerSecond must >= 0");
        }
    }

    public void setSafeArea(float f, float f2, float f3, float f4) {
        this.viewSafeArea = new SafeArea(f, f2, f3, f4);
    }

    public void setSurface(Surface surface, int i, int i2) {
        if (surface == null) {
            ig3.a("Surface不能为null");
            return;
        }
        this.targetSurface = surface;
        this.renderWidth = i;
        this.renderHeight = i2;
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.resetNativeWindow(surface);
        }
    }

    public void setTouchEnable(boolean z) {
        this.touchEnable = z;
    }

    public void start() {
        XEGameViewCallback xEGameViewCallback = this.callback;
        if (xEGameViewCallback == null) {
            qkq0.a("未设置回调，游戏启动失败");
            return;
        }
        if (this.targetSurface == null) {
            xEGameViewCallback.onStartFailed("Surface未设置");
        } else if (this.mGLThread != null) {
            xEGameViewCallback.onStartFailed("游戏正在运行 无法再次启动");
        } else if (XEngineSOManager.check(this.mLoaderCallback)) {
            this.mLoaderCallback.onSuccess();
        }
    }

    public void stop() {
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.requestStop();
            this.mGLThread = null;
        }
        this.mRender = null;
    }

    public void updateRenderSize(int i, int i2) {
        this.renderWidth = i;
        this.renderHeight = i2;
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.onSizeChanged(i, i2);
        }
    }

    @Deprecated
    public void setCallback(IXGameView.Callback callback) {
        if (this.callback != null || callback == null) {
            return;
        }
        this.callback = callback;
    }

    public void setSurface(Surface surface) {
        if (surface == null) {
            return;
        }
        this.targetSurface = surface;
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.resetNativeWindow(surface);
        }
    }
}
