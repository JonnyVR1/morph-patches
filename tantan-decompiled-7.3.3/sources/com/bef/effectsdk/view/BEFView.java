package com.bef.effectsdk.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.amazing.annotation.EffectKeep;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.GLTextureView;
import com.bef.effectsdk.ResourceFinder;
import com.bef.effectsdk.message.MessageCenter;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class BEFView extends GLTextureView implements GLSurfaceView.Renderer, ViewControllerInterface.NativeMessageListener, MessageCenter.Listener {
    protected static final long NANO_SECONDS_PER_MICRO_SECOND = 1000000;
    protected static final long NANO_SECONDS_PER_SECOND = 1000000000;
    private static final String TAG = "BEFView";
    protected String mAdBundlePath;
    private AssetResourceFinder mAssetResourceFinder;
    private long mAttachedEffect;
    protected Queue<Runnable> mCacheMessages;
    private boolean mDestroyed;
    protected long mHandle;
    private long mLastAttachedEffect;
    private long mLastTickInNanoSeconds;
    protected HashSet<MessageListener> mListeners;
    protected float[] mMatrix;
    private boolean mMultipleTouchEnabled;
    protected boolean mNativeInited;
    private Builder.Params mParams;
    protected int mSourceTexture;
    private int[] mTouch_ids;
    private float[] mTouch_xs;
    private float[] mTouch_ys;

    /* JADX INFO: renamed from: com.bef.effectsdk.view.BEFView$12 */
    public static /* synthetic */ class C104812 {
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode;

        static {
            int[] iArr = new int[FitMode.values().length];
            $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode = iArr;
            try {
                iArr[FitMode.FIT_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[FitMode.FIT_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[FitMode.FILL_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[FitMode.NO_CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @EffectKeep
    public enum BEFViewSceneKey {
        SHOOT,
        LIVE,
        LIVE_OGC,
        GAME,
        M10N
    }

    @EffectKeep
    public enum FitMode {
        FIT_WIDTH,
        FIT_HEIGHT,
        FILL_SCREEN,
        FIT_WIDTH_BOTTOM,
        NO_CLIP
    }

    public interface MessageListener {
        void onMessageReceived(long j, long j2, long j3, String str);
    }

    private BEFView(Context context) {
        super(context);
        this.mHandle = 0L;
        this.mAdBundlePath = "";
        this.mNativeInited = false;
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        this.mAttachedEffect = 0L;
        this.mLastAttachedEffect = 0L;
        this.mDestroyed = false;
        this.mAssetResourceFinder = null;
        init(context);
    }

    private void convertTouchesToNormalizedPos(float[] fArr, float[] fArr2, int i) {
        PointF pointFFitResolution;
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            PointF pointF = new PointF(f, f2);
            float f3 = width;
            float f4 = height;
            RectF rectF = new RectF(0.0f, 0.0f, f3, f4);
            new PointF();
            FitMode fitMode = this.mParams.mFitMode;
            FitMode fitMode2 = FitMode.FILL_SCREEN;
            if (fitMode == fitMode2) {
                pointFFitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight), FitMode.NO_CLIP);
            } else if (this.mParams.mFitMode == FitMode.NO_CLIP) {
                pointFFitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight), fitMode2);
            } else {
                if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
                    float f5 = ((f3 * 1.0f) / this.mParams.mRenderWidth) * this.mParams.mRenderHeight;
                    fArr[i2] = (f * 1.0f) / f3;
                    fArr2[i2] = ((f2 - (f4 - f5)) * 1.0f) / f5;
                } else {
                    pointFFitResolution = fitResolution(pointF, rectF, new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight), this.mParams.mFitMode);
                }
            }
            fArr[i2] = pointFFitResolution.x / this.mParams.mRenderWidth;
            fArr2[i2] = pointFFitResolution.y / this.mParams.mRenderHeight;
        }
    }

    private void dealWithTouches(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        final int i = pointerCount > 10 ? 10 : pointerCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mTouch_ids[i2] = motionEvent.getPointerId(i2);
            this.mTouch_xs[i2] = motionEvent.getX(i2);
            this.mTouch_ys[i2] = motionEvent.getY(i2);
        }
        convertTouchesToNormalizedPos(this.mTouch_xs, this.mTouch_ys, i);
        int actionIndex = motionEvent.getActionIndex();
        if (this.mMultipleTouchEnabled || actionIndex == 0) {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        final int[] iArr = new int[i];
                        final float[] fArr = new float[i];
                        final float[] fArr2 = new float[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr[i3] = this.mTouch_ids[i3];
                            fArr[i3] = this.mTouch_xs[i3];
                            fArr2[i3] = this.mTouch_ys[i3];
                        }
                        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.4
                            @Override // java.lang.Runnable
                            public void run() {
                                ViewControllerInterface.touchMoveEvent(BEFView.this.mHandle, iArr, fArr, fArr2, i);
                            }
                        });
                        return;
                    }
                    if (action != 5) {
                        if (action != 6) {
                            return;
                        }
                    }
                }
                final int[] iArr2 = {this.mTouch_ids[actionIndex]};
                final float[] fArr3 = {this.mTouch_xs[actionIndex]};
                final float[] fArr4 = {this.mTouch_ys[actionIndex]};
                queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewControllerInterface.touchEndEvent(BEFView.this.mHandle, iArr2, fArr3, fArr4, i);
                    }
                });
                return;
            }
            final int[] iArr3 = {this.mTouch_ids[actionIndex]};
            final float[] fArr5 = {this.mTouch_xs[actionIndex]};
            final float[] fArr6 = {this.mTouch_ys[actionIndex]};
            queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.3
                @Override // java.lang.Runnable
                public void run() {
                    ViewControllerInterface.touchBeginEvent(BEFView.this.mHandle, iArr3, fArr5, fArr6, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destoryRender() {
        if (getNativeInited()) {
            setNativeInited(false);
            if (this.mParams.mResourceFinder != null) {
                this.mParams.mResourceFinder.release(this.mHandle);
            }
            AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
            if (assetResourceFinder != null) {
                assetResourceFinder.release(0L);
            }
            ViewControllerInterface.removeMessageListener(this.mHandle, this);
            ViewControllerInterface.destroy(this.mHandle);
            this.mHandle = 0L;
            ViewControllerInterface.deleteTexture(this.mSourceTexture);
            this.mSourceTexture = 0;
            MessageCenter.removeListener(this);
            MessageCenter.destroy();
            this.mLastAttachedEffect = 0L;
        }
    }

    private PointF fitResolution(PointF pointF, RectF rectF, RectF rectF2, FitMode fitMode) {
        PointF pointF2 = new PointF();
        float f = rectF2.left;
        float f2 = rectF2.top;
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        float fWidth2 = (pointF.x - rectF.left) / rectF.width();
        float fHeight2 = (pointF.y - rectF.top) / rectF.height();
        int i = C104812.$SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[fitMode.ordinal()];
        if (i == 1) {
            float fWidth3 = fWidth / rectF.width();
            pointF2.x = (int) (f + (fWidth2 * fWidth));
            pointF2.y = (int) (f2 + ((fHeight - (rectF.height() * fWidth3)) / 2.0f) + (fHeight2 * fWidth3 * rectF.height()));
            return pointF2;
        }
        if (i == 2) {
            float fHeight3 = fHeight / rectF.height();
            pointF2.x = (int) (f + ((fWidth - (rectF.width() * fHeight3)) / 2.0f) + (fWidth2 * fHeight3 * rectF.width()));
            pointF2.y = (int) (f2 + (fHeight2 * fHeight));
            return pointF2;
        }
        if (i == 3) {
            return fWidth / rectF.width() < fHeight / rectF.height() ? fitResolution(pointF, rectF, rectF2, FitMode.FIT_HEIGHT) : fitResolution(pointF, rectF, rectF2, FitMode.FIT_WIDTH);
        }
        if (i != 4) {
            return pointF2;
        }
        return fWidth / rectF.width() > fHeight / rectF.height() ? fitResolution(pointF, rectF, rectF2, FitMode.FIT_HEIGHT) : fitResolution(pointF, rectF, rectF2, FitMode.FIT_WIDTH);
    }

    private void init(Context context) {
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        setRenderMode(1);
        this.mListeners = new HashSet<>();
        this.mCacheMessages = new LinkedList();
        AssetResourceFinder assetResourceFinder = new AssetResourceFinder(context.getAssets(), "");
        this.mAssetResourceFinder = assetResourceFinder;
        assetResourceFinder.createNativeResourceFinder(0L);
        this.mDestroyed = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initRender() {
        setNativeInited(false);
        long j = this.mHandle;
        if (j != 0) {
            try {
                ViewControllerInterface.destroy(j);
                this.mHandle = 0L;
            } catch (Exception unused) {
                Log.e(TAG, "Destroy old effect handle failed");
            }
        }
        int i = this.mSourceTexture;
        if (i > 0) {
            ViewControllerInterface.deleteTexture(i);
        }
        if (this.mHandle == 0) {
            long[] jArr = new long[2];
            ViewControllerInterface.createHandle(jArr, this.mParams.mSceneKey.ordinal());
            this.mHandle = jArr[0];
            ResourceFinder resourceFinder = this.mParams.mResourceFinder;
            long j2 = this.mHandle;
            if (resourceFinder != null) {
                ViewControllerInterface.setResourceFinder(j2, this.mParams.mResourceFinder.createNativeResourceFinder(this.mHandle), 0L);
            } else {
                ViewControllerInterface.setResourceFinder(j2, 0L, 0L);
            }
            ViewControllerInterface.init(this.mHandle, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        }
        ViewControllerInterface.addMessageListener(this.mHandle, this);
        MessageCenter.init();
        MessageCenter.addListener(this);
        this.mLastTickInNanoSeconds = System.nanoTime();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, this.mParams.mRenderWidth, this.mParams.mRenderHeight, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GLES20.glGetIntegerv(36006, iArr3, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glViewport(0, 0, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        this.mSourceTexture = iArr[0];
        String str = this.mAdBundlePath;
        if (str != "") {
            ViewControllerInterface.setStickerPath(this.mHandle, str);
        }
        this.mLastAttachedEffect = 0L;
        setNativeInited(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(Builder.Params params) {
        this.mParams = params;
    }

    @EffectKeep
    public synchronized int addMessageListener(MessageListener messageListener) {
        if (messageListener == null) {
            return -1;
        }
        this.mListeners.add(messageListener);
        return 0;
    }

    @EffectKeep
    public synchronized void attachEffect(long j) {
        this.mAttachedEffect = j;
    }

    @EffectKeep
    public boolean getNativeInited() {
        return this.mNativeInited;
    }

    @Override // com.bef.effectsdk.view.ViewControllerInterface.NativeMessageListener
    @EffectKeep
    public synchronized int nativeOnMsgReceived(long j, long j2, long j3, String str) {
        Iterator<MessageListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onMessageReceived(j, j2, j3, str);
        }
        return 0;
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onDestroy() {
        if (this.mDestroyed) {
            Log.e(TAG, "onDestroy Duplicate!");
            return;
        }
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.8
            @Override // java.lang.Runnable
            public void run() {
                BEFView.this.destoryRender();
            }
        });
        super.onDestroy();
        this.mDestroyed = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (getNativeInited()) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            long j = this.mAttachedEffect;
            if (j != this.mLastAttachedEffect) {
                ViewControllerInterface.attachEffect(this.mHandle, j);
                this.mLastAttachedEffect = this.mAttachedEffect;
            }
            long jNanoTime = System.nanoTime() - this.mLastTickInNanoSeconds;
            double d = (1.0d / this.mParams.mFPS) * 1.0E9d;
            double d2 = jNanoTime;
            if (d2 < d) {
                try {
                    Thread.sleep((long) (((d - d2) * 1.0d) / 1000000.0d));
                } catch (Exception unused) {
                }
            }
            this.mLastTickInNanoSeconds = System.nanoTime();
            while (!this.mCacheMessages.isEmpty()) {
                this.mCacheMessages.poll().run();
            }
            double dNanoTime = System.nanoTime() / 1.0E9d;
            int width = getWidth();
            int height = getHeight();
            Matrix.setIdentityM(this.mMatrix, 0);
            RectF rectF = new RectF(0.0f, 0.0f, this.mParams.mRenderWidth, this.mParams.mRenderHeight);
            float f = width;
            RectF rectF2 = new RectF(0.0f, 0.0f, f, height);
            PointF pointFFitResolution = fitResolution(new PointF(0.0f, 0.0f), rectF, rectF2, this.mParams.mFitMode);
            PointF pointFFitResolution2 = fitResolution(new PointF(this.mParams.mRenderWidth, this.mParams.mRenderHeight), rectF, rectF2, this.mParams.mFitMode);
            if (this.mParams.mFitMode == FitMode.FIT_WIDTH_BOTTOM) {
                pointFFitResolution = new PointF(0.0f, 0.0f);
                pointFFitResolution2 = new PointF(f, (this.mParams.mRenderHeight * width) / this.mParams.mRenderWidth);
            }
            float f2 = pointFFitResolution.x;
            float f3 = pointFFitResolution.y;
            ViewControllerInterface.processFrame(this.mHandle, this.mSourceTexture, this.mParams.mRenderWidth, this.mParams.mRenderHeight, this.mMatrix, new float[]{f2, f3, pointFFitResolution2.x - f2, pointFFitResolution2.y - f3}, dNanoTime);
        }
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onExitContext() {
        destoryRender();
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        postMessage(i, i2, i3, str);
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onPause() {
        if (this.mDestroyed) {
            Log.e(TAG, "onPause called after onDestroy!");
        } else {
            queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.6
                @Override // java.lang.Runnable
                public void run() {
                    if (BEFView.this.mParams.mSceneKey == BEFViewSceneKey.GAME || BEFView.this.mParams.mKeepStatusAtPause) {
                        ViewControllerInterface.onPause(BEFView.this.mHandle);
                    } else {
                        BEFView.this.destoryRender();
                    }
                }
            });
            super.onPause();
        }
    }

    @Override // com.bef.effectsdk.GLTextureView
    public void onResume() {
        if (this.mDestroyed) {
            Log.e(TAG, "onResume called after onDestroy!");
        } else {
            super.onResume();
            queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.7
                @Override // java.lang.Runnable
                public void run() {
                    boolean nativeInited = BEFView.this.getNativeInited();
                    BEFView bEFView = BEFView.this;
                    if (nativeInited) {
                        ViewControllerInterface.onResume(bEFView.mHandle);
                    } else {
                        bEFView.initRender();
                    }
                }
            });
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        initRender();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!getNativeInited() || this.mAdBundlePath == "" || this.mParams.mNeglectTouchEvent) {
            return false;
        }
        dealWithTouches(motionEvent);
        ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @EffectKeep
    public synchronized int postMessage(final long j, final long j2, final long j3, final String str) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.2
            @Override // java.lang.Runnable
            public void run() {
                BEFView.this.mCacheMessages.add(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC10492 runnableC10492 = RunnableC10492.this;
                        ViewControllerInterface.postMessage(BEFView.this.mHandle, j, j2, j3, str);
                    }
                });
            }
        });
        return 0;
    }

    @EffectKeep
    public synchronized int removeMessageListener(MessageListener messageListener) {
        if (messageListener == null) {
            return -1;
        }
        this.mListeners.remove(messageListener);
        return 0;
    }

    @EffectKeep
    public synchronized boolean setExternalTouchEvent(MotionEvent motionEvent) {
        if (getNativeInited() && this.mAdBundlePath != "") {
            dealWithTouches(motionEvent);
            return true;
        }
        return false;
    }

    public void setNativeInited(boolean z) {
        this.mNativeInited = z;
    }

    @EffectKeep
    public synchronized void setRenderCacheData(final String str, final String str2) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.9
            @Override // java.lang.Runnable
            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheData(BEFView.this.mHandle, str, str2);
                }
            }
        });
    }

    @EffectKeep
    public synchronized void setRenderCacheTexture(final String str, final String str2) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.10
            @Override // java.lang.Runnable
            public void run() {
                if (BEFView.this.getNativeInited()) {
                    ViewControllerInterface.setRenderCacheTexture(BEFView.this.mHandle, str, str2);
                }
            }
        });
    }

    @EffectKeep
    public synchronized void setRenderCacheTextureWithBuffer(final String str, final byte[] bArr, final int i, final int i2) throws Throwable {
        try {
            try {
                queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (BEFView.this.getNativeInited()) {
                            ViewControllerInterface.setRenderCacheTextureWithBuffer(BEFView.this.mHandle, str, bArr, i, i2);
                        }
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @EffectKeep
    public synchronized void setStickerPath(final String str) {
        queueEvent(new Runnable() { // from class: com.bef.effectsdk.view.BEFView.1
            @Override // java.lang.Runnable
            public void run() {
                if (BEFView.this.getNativeInited()) {
                    BEFView bEFView = BEFView.this;
                    String str2 = str;
                    bEFView.mAdBundlePath = str2;
                    ViewControllerInterface.setStickerPath(bEFView.mHandle, str2);
                }
            }
        });
    }

    @EffectKeep
    public static class Color {

        /* JADX INFO: renamed from: a */
        private float f4310a;

        /* JADX INFO: renamed from: b */
        private float f4311b;

        /* JADX INFO: renamed from: g */
        private float f4312g;

        /* JADX INFO: renamed from: r */
        private float f4313r;

        @EffectKeep
        public Color() {
            setColor(0.0f, 0.0f, 0.0f, 0.0f);
        }

        @EffectKeep
        public float alpha() {
            return this.f4310a;
        }

        @EffectKeep
        public float blue() {
            return this.f4311b;
        }

        @EffectKeep
        public float green() {
            return this.f4312g;
        }

        @EffectKeep
        public float red() {
            return this.f4313r;
        }

        @EffectKeep
        public void setColor(float f, float f2, float f3, float f4) {
            this.f4313r = f;
            this.f4312g = f2;
            this.f4311b = f3;
            this.f4310a = f4;
        }

        @EffectKeep
        public Color(float f, float f2, float f3, float f4) {
            setColor(f, f2, f3, f4);
        }
    }

    @EffectKeep
    public static final class Builder {
        private Params mParams = new Params();

        public class Params {
            private double mFPS;
            private FitMode mFitMode;
            private boolean mKeepStatusAtPause;
            private boolean mNeglectTouchEvent;
            private int mRenderHeight;
            private int mRenderWidth;
            private ResourceFinder mResourceFinder;
            private BEFViewSceneKey mSceneKey;

            private Params() {
            }
        }

        private Builder() {
        }

        @EffectKeep
        public static Builder obtain() {
            Builder builder = new Builder();
            builder.mParams.mRenderWidth = 720;
            builder.mParams.mRenderHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
            builder.mParams.mFPS = 30.0d;
            builder.mParams.mFitMode = FitMode.FILL_SCREEN;
            builder.mParams.mResourceFinder = null;
            builder.mParams.mSceneKey = BEFViewSceneKey.SHOOT;
            builder.mParams.mNeglectTouchEvent = false;
            builder.mParams.mKeepStatusAtPause = false;
            return builder;
        }

        @EffectKeep
        public BEFView build(Context context) {
            BEFView bEFView = new BEFView(context);
            bEFView.setParams(this.mParams);
            return bEFView;
        }

        @EffectKeep
        public Builder setFPS(double d) {
            this.mParams.mFPS = d;
            return this;
        }

        @EffectKeep
        public Builder setFitMode(FitMode fitMode) {
            this.mParams.mFitMode = fitMode;
            return this;
        }

        @EffectKeep
        public Builder setKeepStatusAtPause(boolean z) {
            this.mParams.mKeepStatusAtPause = z;
            return this;
        }

        @EffectKeep
        public Builder setNeglectTouchEvent(boolean z) {
            this.mParams.mNeglectTouchEvent = z;
            return this;
        }

        @EffectKeep
        public Builder setRenderSize(int i, int i2) {
            this.mParams.mRenderWidth = i;
            this.mParams.mRenderHeight = i2;
            return this;
        }

        @EffectKeep
        public Builder setResourceFinder(ResourceFinder resourceFinder) {
            this.mParams.mResourceFinder = resourceFinder;
            return this;
        }

        @EffectKeep
        public Builder setSceneKey(BEFViewSceneKey bEFViewSceneKey) {
            this.mParams.mSceneKey = bEFViewSceneKey;
            return this;
        }

        @EffectKeep
        public BEFView build(Context context, AttributeSet attributeSet) {
            BEFView bEFView = new BEFView(context, attributeSet);
            bEFView.setParams(this.mParams);
            return bEFView;
        }
    }

    private BEFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHandle = 0L;
        this.mAdBundlePath = "";
        this.mNativeInited = false;
        this.mMatrix = new float[16];
        this.mTouch_ids = new int[10];
        this.mTouch_xs = new float[10];
        this.mTouch_ys = new float[10];
        this.mMultipleTouchEnabled = true;
        this.mAttachedEffect = 0L;
        this.mLastAttachedEffect = 0L;
        this.mDestroyed = false;
        this.mAssetResourceFinder = null;
        init(context);
    }
}
