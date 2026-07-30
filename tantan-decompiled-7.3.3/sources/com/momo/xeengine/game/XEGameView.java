package com.momo.xeengine.game;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.momo.xeengine.XEngineException;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.game.XEGameView;
import com.momo.xeengine.lua.XELuaEngine;
import com.momo.xeengine.somanager.IXEngineSOLoader;
import com.momo.xeengine.somanager.XEngineSOManager;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class XEGameView extends FrameLayout {
    public static int FRAME_NO_LIMIT = 0;
    public static int TYPE_SURFACE_VIEW = 0;
    public static int TYPE_TEXTURE_VIEW = 1;
    private XEGameViewCallback callback;
    protected boolean enableBackgroundTick;
    private boolean enableClearBackground;
    private SurfaceView glSurfaceView;
    private TextureView glTextureView;
    private XEngineRenderThread mGLThread;
    private final Handler mHandler;
    private final IXEngineSOLoader.LoaderCallback mLoaderCallback;
    private MyRender mRender;
    private final SurfaceHolder.Callback mSurfaceHolderCallback;
    private final TextureView.SurfaceTextureListener mSurfaceTextureListener;
    private boolean paused;
    private int preferredFramesPerSecond;
    private float renderScale;
    private int renderViewType;
    private boolean touchEnable;
    private SafeArea viewSafeArea;

    /* JADX INFO: renamed from: com.momo.xeengine.game.XEGameView$3 */
    public class C43323 implements IXEngineSOLoader.LoaderCallback {
        public C43323() {
        }

        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onFailed(String str) {
            XEGameView.this.callback.onStartFailed("动态库下载错误:" + str);
        }

        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onProcess(int i, double d) {
            XEGameView.this.callback.onEngineDynamicLinkLibraryDownloadProcess(i, d);
        }

        @Override // com.momo.xeengine.somanager.IXEngineSOLoader.LoaderCallback
        public void onSuccess() {
            boolean zIsAttachedToWindow = XEGameView.this.isAttachedToWindow();
            XEGameView xEGameView = XEGameView.this;
            if (zIsAttachedToWindow) {
                xEGameView.createRenderView();
                return;
            }
            Handler handler = xEGameView.mHandler;
            final XEGameView xEGameView2 = XEGameView.this;
            handler.post(new Runnable() { // from class: com.momo.xeengine.game.a
                @Override // java.lang.Runnable
                public final void run() {
                    xEGameView2.createRenderView();
                }
            });
        }
    }

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

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m21235a(MyRender myRender, String str) {
            XEGameView.this.stop();
            XEGameView.this.callback.onStartFailed(str);
        }

        private void updateSafeArea() {
            SafeArea safeArea;
            synchronized (XEGameView.this) {
                safeArea = XEGameView.this.viewSafeArea;
            }
            if (safeArea == null || 0.0f == safeArea.safeW || 0.0f == safeArea.safeH || this.renderSafeArea == safeArea) {
                return;
            }
            this.engine.getWindow().SetSafeArea(safeArea.safeX, safeArea.safeY, safeArea.safeW, safeArea.safeH);
            this.renderSafeArea = safeArea;
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onBackgroundFrame() {
            GameEngine gameEngine;
            if (!XEGameView.this.enableBackgroundTick || (gameEngine = this.engine) == null) {
                return;
            }
            gameEngine.postTickEvent();
        }

        @Override // com.momo.xeengine.game.IXRender
        public boolean onGLDrawFrame(EGL10 egl10) {
            GameEngine gameEngine = this.engine;
            if (gameEngine == null || XEGameView.this.paused) {
                return false;
            }
            updateSafeArea();
            boolean zRender = gameEngine.render();
            if (zRender && XEGameView.this.preferredFramesPerSecond != XEGameView.FRAME_NO_LIMIT && gameEngine.getRenderMode() == GameEngine.RenderMode.Auto) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.preDrawFrameTime;
                long j = 1000 / XEGameView.this.preferredFramesPerSecond;
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
                XEGameView.this.paused = false;
                this.engine = gameEngine;
                this.startCalled = false;
            } catch (Exception e) {
                String message = e.getMessage();
                boolean zIsEmpty = TextUtils.isEmpty(message);
                XEGameView xEGameView = XEGameView.this;
                if (zIsEmpty) {
                    xEGameView.callback.onStartFailed(XEngineException.UNKNOWN_ERROR);
                } else {
                    xEGameView.callback.onStartFailed(message);
                }
            }
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onGLEnvCreatedFailed(final String str) {
            XEGameView.this.mHandler.post(new Runnable() { // from class: com.momo.xeengine.game.c
                @Override // java.lang.Runnable
                public final void run() {
                    XEGameView.MyRender.m21235a(this.f15296a, str);
                }
            });
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onGLEnvRelease() {
            GameEngine gameEngine = this.engine;
            if (gameEngine != null) {
                gameEngine.release();
                this.engine = null;
            }
        }

        @Override // com.momo.xeengine.game.IXRender
        public void onGLRenderSizeChanged(int i, int i2) {
            final GameEngine gameEngine = this.engine;
            if (gameEngine == null) {
                return;
            }
            gameEngine.getWindow().SetSize(i, i2);
            XEGameView.this.callback.onRenderSizeChanged(i, i2);
            if (!this.startCalled) {
                XEGameView.this.callback.onStart(gameEngine);
                this.startCalled = true;
            }
            if (gameEngine.getRenderMode() == GameEngine.RenderMode.UserRequest) {
                gameEngine.requestRender();
                XEGameView.this.post(new Runnable() { // from class: com.momo.xeengine.game.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        GameEngine gameEngine2 = gameEngine;
                        gameEngine2.getRenderThreadExecutor().execute(new Runnable() { // from class: l.nlq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                gameEngine2.requestRender();
                            }
                        });
                    }
                });
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

    public XEGameView(Context context) {
        super(context);
        this.glSurfaceView = null;
        this.glTextureView = null;
        this.mGLThread = null;
        this.callback = null;
        this.enableClearBackground = false;
        this.preferredFramesPerSecond = 30;
        this.touchEnable = true;
        this.paused = false;
        this.renderScale = 1.0f;
        this.renderViewType = TYPE_TEXTURE_VIEW;
        this.mRender = null;
        this.enableBackgroundTick = false;
        this.mHandler = new Handler();
        this.mSurfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.momo.xeengine.game.XEGameView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                XEGameView.this.onNativeWindowCreate(surfaceTexture, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (XEGameView.this.mGLThread == null) {
                    return false;
                }
                XEGameView.this.mGLThread.destroyNativeWindow();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.mSurfaceHolderCallback = new SurfaceHolder.Callback() { // from class: com.momo.xeengine.game.XEGameView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i2, i3);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                XEGameView.this.onNativeWindowCreate(surfaceHolder.getSurface(), 0, 0);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.destroyNativeWindow();
                }
            }
        };
        this.mLoaderCallback = new C43323();
        this.viewSafeArea = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21232a(XEGameView xEGameView) {
        GameEngine gameEngine;
        MyRender myRender = xEGameView.mRender;
        if (myRender == null || (gameEngine = myRender.engine) == null) {
            return;
        }
        gameEngine.setOnBackground(false);
        XELuaEngine scriptEngine = gameEngine.getScriptEngine();
        if (scriptEngine != null) {
            scriptEngine.callOnResume();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21233b(XEGameView xEGameView) {
        GameEngine gameEngine;
        MyRender myRender = xEGameView.mRender;
        if (myRender == null || (gameEngine = myRender.engine) == null) {
            return;
        }
        gameEngine.setOnBackground(true);
        gameEngine.getScriptEngine().callOnPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createRenderView() {
        int i = this.renderViewType;
        if (i == TYPE_SURFACE_VIEW) {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.glSurfaceView = surfaceView;
            surfaceView.setLayerType(2, null);
            this.glSurfaceView.getHolder().setFormat(-3);
            this.glSurfaceView.setZOrderOnTop(true);
            addView(this.glSurfaceView);
            this.callback.onRenderViewCreate(this.glSurfaceView);
            this.glSurfaceView.getHolder().addCallback(this.mSurfaceHolderCallback);
            return;
        }
        if (i != TYPE_TEXTURE_VIEW) {
            this.callback.onStartFailed("错误的渲染视图类型设置");
            return;
        }
        TextureView textureView = new TextureView(getContext());
        this.glTextureView = textureView;
        textureView.setLayerType(2, null);
        this.glTextureView.setOpaque(false);
        addView(this.glTextureView);
        this.callback.onRenderViewCreate(this.glTextureView);
        this.glTextureView.setSurfaceTextureListener(this.mSurfaceTextureListener);
    }

    private void getNotchParams() {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List boundingRects;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.isEmpty()) {
            return;
        }
        Context context = getContext();
        if (context instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i2 == 0 || i == 0) {
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = getWidth() + i3;
        int height = getHeight() + i4;
        float safeInsetLeft = displayCutout.getSafeInsetLeft() <= i3 ? 0.0f : displayCutout.getSafeInsetLeft() - i3;
        float safeInsetTop = displayCutout.getSafeInsetTop() > i4 ? displayCutout.getSafeInsetTop() - i4 : 0.0f;
        SafeArea safeArea = new SafeArea(safeInsetLeft / getWidth(), safeInsetTop / getHeight(), ((width <= i - displayCutout.getSafeInsetRight() ? getWidth() : getWidth() - (width - (i - displayCutout.getSafeInsetRight()))) - safeInsetLeft) / getWidth(), ((height <= i2 - displayCutout.getSafeInsetBottom() ? getHeight() : getHeight() - (height - (i2 - displayCutout.getSafeInsetBottom()))) - safeInsetTop) / getHeight());
        synchronized (this) {
            this.viewSafeArea = safeArea;
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

    public IXEventDispatcher getEngineEventDispatcher() {
        GameEngine gameEngine;
        MyRender myRender = this.mRender;
        if (myRender == null || (gameEngine = myRender.engine) == null) {
            return null;
        }
        return gameEngine.getEventDispatcher();
    }

    public int getPreferredFramesPerSecond() {
        return this.preferredFramesPerSecond;
    }

    public float getRenderScale() {
        return this.renderScale;
    }

    @Deprecated
    public boolean isEnableClearBackground() {
        return this.enableClearBackground;
    }

    public boolean isPaused() {
        return this.paused;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TextureView textureView = this.glTextureView;
        if (textureView == null) {
            return;
        }
        float f = 1.0f / this.renderScale;
        if (textureView.getScaleX() == f && this.glTextureView.getScaleY() == f) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.glTextureView.getLayoutParams();
        layoutParams.height = (int) (getHeight() * this.renderScale);
        layoutParams.width = (int) (getWidth() * this.renderScale);
        layoutParams.gravity = 17;
        this.glTextureView.setLayoutParams(layoutParams);
        this.glTextureView.setScaleX(f);
        this.glTextureView.setScaleY(f);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            getNotchParams();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MyRender myRender;
        GameEngine gameEngine;
        if (!this.touchEnable || this.paused || (myRender = this.mRender) == null || (gameEngine = myRender.engine) == null) {
            return false;
        }
        IXEventDispatcher eventDispatcher = gameEngine.getEventDispatcher();
        if (eventDispatcher == null) {
            return super.onTouchEvent(motionEvent);
        }
        float f = this.renderScale;
        eventDispatcher.handleTouchEvent(motionEvent, f, f);
        return true;
    }

    public void pause() {
        this.paused = true;
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.queueEvent(new Runnable() { // from class: l.mlq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEGameView.m21233b(this.f137434a);
                }
            });
        }
    }

    public void resume() {
        this.paused = false;
        XEngineRenderThread xEngineRenderThread = this.mGLThread;
        if (xEngineRenderThread != null) {
            xEngineRenderThread.queueEvent(new Runnable() { // from class: l.llq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEGameView.m21232a(this.f132598a);
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
            wg3.m206174a("preferredFramesPerSecond must >= 0");
        }
    }

    public void setRenderScale(float f) {
        if (f <= 0.0f) {
            wg3.m206174a("renderScale must >= 0");
            return;
        }
        this.renderScale = f;
        if (this.glTextureView != null) {
            requestLayout();
        }
    }

    public void setRenderViewType(int i) {
        if (i != TYPE_SURFACE_VIEW && i != TYPE_TEXTURE_VIEW) {
            wg3.m206174a("RenderViewType only support TYPE_SURFACE_VIEW or TYPE_TEXTURE_VIEW");
        } else if (this.glSurfaceView == null && this.glTextureView == null) {
            this.renderViewType = i;
        } else {
            wg3.m206174a("RenderViewType can set before start only");
        }
    }

    public void setTouchEnable(boolean z) {
        this.touchEnable = z;
    }

    public void start() {
        XEGameViewCallback xEGameViewCallback = this.callback;
        if (xEGameViewCallback == null) {
            wtq0.m207906a("未设置回调，游戏启动失败");
            return;
        }
        if (this.glSurfaceView != null || this.glTextureView != null) {
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
        TextureView textureView = this.glTextureView;
        if (textureView != null) {
            removeView(textureView);
            this.glTextureView = null;
        }
        SurfaceView surfaceView = this.glSurfaceView;
        if (surfaceView != null) {
            removeView(surfaceView);
            this.glSurfaceView = null;
        }
    }

    @Deprecated
    public void setCallback(IXGameView.Callback callback) {
        if (this.callback != null || callback == null) {
            return;
        }
        this.callback = callback;
    }

    public XEGameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.glSurfaceView = null;
        this.glTextureView = null;
        this.mGLThread = null;
        this.callback = null;
        this.enableClearBackground = false;
        this.preferredFramesPerSecond = 30;
        this.touchEnable = true;
        this.paused = false;
        this.renderScale = 1.0f;
        this.renderViewType = TYPE_TEXTURE_VIEW;
        this.mRender = null;
        this.enableBackgroundTick = false;
        this.mHandler = new Handler();
        this.mSurfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.momo.xeengine.game.XEGameView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                XEGameView.this.onNativeWindowCreate(surfaceTexture, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (XEGameView.this.mGLThread == null) {
                    return false;
                }
                XEGameView.this.mGLThread.destroyNativeWindow();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.mSurfaceHolderCallback = new SurfaceHolder.Callback() { // from class: com.momo.xeengine.game.XEGameView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i2, i3);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                XEGameView.this.onNativeWindowCreate(surfaceHolder.getSurface(), 0, 0);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.destroyNativeWindow();
                }
            }
        };
        this.mLoaderCallback = new C43323();
        this.viewSafeArea = null;
    }

    public XEGameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.glSurfaceView = null;
        this.glTextureView = null;
        this.mGLThread = null;
        this.callback = null;
        this.enableClearBackground = false;
        this.preferredFramesPerSecond = 30;
        this.touchEnable = true;
        this.paused = false;
        this.renderScale = 1.0f;
        this.renderViewType = TYPE_TEXTURE_VIEW;
        this.mRender = null;
        this.enableBackgroundTick = false;
        this.mHandler = new Handler();
        this.mSurfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.momo.xeengine.game.XEGameView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                XEGameView.this.onNativeWindowCreate(surfaceTexture, i2, i3);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (XEGameView.this.mGLThread == null) {
                    return false;
                }
                XEGameView.this.mGLThread.destroyNativeWindow();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i2, i3);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.mSurfaceHolderCallback = new SurfaceHolder.Callback() { // from class: com.momo.xeengine.game.XEGameView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i3, i4);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                XEGameView.this.onNativeWindowCreate(surfaceHolder.getSurface(), 0, 0);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.destroyNativeWindow();
                }
            }
        };
        this.mLoaderCallback = new C43323();
        this.viewSafeArea = null;
    }

    public XEGameView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.glSurfaceView = null;
        this.glTextureView = null;
        this.mGLThread = null;
        this.callback = null;
        this.enableClearBackground = false;
        this.preferredFramesPerSecond = 30;
        this.touchEnable = true;
        this.paused = false;
        this.renderScale = 1.0f;
        this.renderViewType = TYPE_TEXTURE_VIEW;
        this.mRender = null;
        this.enableBackgroundTick = false;
        this.mHandler = new Handler();
        this.mSurfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.momo.xeengine.game.XEGameView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
                XEGameView.this.onNativeWindowCreate(surfaceTexture, i3, i4);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (XEGameView.this.mGLThread == null) {
                    return false;
                }
                XEGameView.this.mGLThread.destroyNativeWindow();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i3, i4);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.mSurfaceHolderCallback = new SurfaceHolder.Callback() { // from class: com.momo.xeengine.game.XEGameView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.onSizeChanged(i4, i5);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                XEGameView.this.onNativeWindowCreate(surfaceHolder.getSurface(), 0, 0);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (XEGameView.this.mGLThread != null) {
                    XEGameView.this.mGLThread.destroyNativeWindow();
                }
            }
        };
        this.mLoaderCallback = new C43323();
        this.viewSafeArea = null;
    }
}
