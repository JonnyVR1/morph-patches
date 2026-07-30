package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.kqe;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class StickerItem {
    protected Context context;
    public StickerBlendFilter.StickerMaskFinishListener finishListener;
    public FloatBuffer fvertexBuffer;
    private boolean hasShowedThisTrigger;
    private int hiddenFrameCount;
    private boolean isHiddenFrame;
    private boolean isPlaying;
    protected float[] mProjectionMatrix;
    public final float[] mViewMatrix;
    public vjw mmcvImage;
    protected MmcvImageLoader mmcvImageLoader;
    public Sticker sticker;
    public float stickerScale;
    StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener;
    public float[] texData0;
    public FloatBuffer vertexBuffer;
    public FloatBuffer vertexBuffer2;
    private final int STICKER_MMTIME_PER_FRAME = 50;
    protected boolean needUpdateSticker = false;
    public float imageWidth = 0.0f;
    public float imageHeight = 0.0f;
    public long mStickerDuration = -1;
    public Object maskLock = new Object();
    long mRenderTime = -1;
    public Object maskListLock = new Object();
    public List<float[]> mvpLists = Collections.synchronizedList(new ArrayList());
    public boolean isDraw = false;
    private boolean lastShouldShow = true;
    private boolean hasShowed = false;
    public boolean isTriggered = false;
    long startTime = -1;
    public int texture_sticker = 0;
    private boolean needPlayLoop = true;
    private kqe mEffectTimeBean = null;
    private long lastRenderTime = 0;

    public StickerItem(Sticker sticker, Context context) {
        float[] fArr = new float[16];
        this.mViewMatrix = fArr;
        this.sticker = sticker;
        this.context = context;
        initCoordinate();
        Matrix.setIdentityM(fArr, 0);
        fArr[0] = -1.0f;
    }

    private boolean checkUpdateHidenFrameCnt() {
        long j = this.mRenderTime;
        if (j - this.lastRenderTime <= 50) {
            return false;
        }
        this.lastRenderTime = j;
        return true;
    }

    private void resumeDisplay() {
        startPlay();
    }

    public void clearPoints() {
        synchronized (this.maskLock) {
            try {
                List<float[]> list = this.mvpLists;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void destroy() {
        int i = this.texture_sticker;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_sticker = 0;
        }
    }

    public Bitmap getBitmap() {
        return this.mmcvImageLoader.getDelegateBitmap();
    }

    public kqe getEffectTimeBean() {
        return this.mEffectTimeBean;
    }

    public long getEscapedTime() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        long j = this.mStickerDuration;
        return jCurrentTimeMillis >= j ? j : System.currentTimeMillis() - this.startTime;
    }

    public Object getLockObject() {
        return this.maskLock;
    }

    public MmcvImageLoader getMMcvImageLoader() {
        boolean zIsUseImageCache = this.sticker.isUseImageCache();
        Sticker sticker = this.sticker;
        return zIsUseImageCache ? new MmcvImageCacheLoader(sticker, this.context) : new MmcvImageLoader(sticker);
    }

    public vjw getMmcvImage(Context context) {
        return this.mmcvImageLoader.getMmcvImage(context);
    }

    public float getStickerAspectRatio() {
        Sticker sticker = this.sticker;
        if (sticker != null) {
            return (sticker.getImageHeight() * 1.0f) / this.sticker.getImageWidth();
        }
        return 1.0f;
    }

    public void initCoordinate() {
        float imageHeight = this.sticker.getImageHeight() / this.sticker.getImageWidth();
        this.stickerScale = imageHeight;
        float[] fArr = {-0.5f, imageHeight * 0.5f, -0.5f, (-0.5f) * imageHeight, 0.5f, (-0.5f) * imageHeight, 0.5f, imageHeight * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.vertexBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.vertexBuffer2 = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr);
        this.vertexBuffer2.position(0);
        float f = this.stickerScale;
        this.texData0 = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.mViewMatrix, 0);
        this.mViewMatrix[0] = -1.0f;
        this.mmcvImageLoader = getMMcvImageLoader();
    }

    public void releaseFrameBuffer() {
        int i = this.texture_sticker;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_sticker = 0;
        }
    }

    public void setCurrentTime(long j) {
        MmcvImageLoader mmcvImageLoader = this.mmcvImageLoader;
        if (mmcvImageLoader != null) {
            mmcvImageLoader.setCurrentTime(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x014f  */
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        boolean z;
        Sticker sticker;
        Sticker sticker2;
        FilterTriggerManager filterTriggerManager = faceDetectParam.filterTrigerManager;
        boolean zTriggerTypeProcess = filterTriggerManager != null ? filterTriggerManager.triggerTypeProcess(this.sticker, this.stickerStateChangeListener) : true;
        if (zTriggerTypeProcess && (!TextUtils.isEmpty(this.sticker.getObjectTriggerType()) || !TextUtils.isEmpty(this.sticker.getHiddenObjectTriggerType()))) {
            zTriggerTypeProcess = faceDetectParam.filterTrigerManager.objectTriggerTypeProcess(this.sticker, faceDetectParam, this.isTriggered);
        }
        if (this.sticker.getMinHiddenFrameCount() <= 0 || (this.sticker.getHiddenTriggerType() <= 0 && TextUtils.isEmpty(this.sticker.getHiddenObjectTriggerType()))) {
            z = zTriggerTypeProcess;
        } else {
            if (!zTriggerTypeProcess && this.lastShouldShow) {
                this.isHiddenFrame = true;
            }
            if (this.sticker.isNotResetOnHide() && !zTriggerTypeProcess && this.hiddenFrameCount > 0) {
                this.hiddenFrameCount = 0;
            }
            if (this.isHiddenFrame) {
                if (this.sticker.getMinHiddenFrameCount() > 0 && this.hiddenFrameCount >= this.sticker.getMinHiddenFrameCount() + 2) {
                    this.hiddenFrameCount = 0;
                    this.isHiddenFrame = false;
                }
                if (this.isHiddenFrame) {
                    if (checkUpdateHidenFrameCnt()) {
                        this.hiddenFrameCount++;
                    }
                    z = false;
                } else {
                    z = zTriggerTypeProcess;
                }
            } else {
                z = zTriggerTypeProcess;
            }
        }
        if (this.hasShowedThisTrigger && (this.sticker.isNotHiddenAfterTrigger() || (this.sticker.getLoopStart() > 0 && this.sticker.isAlwaysShow()))) {
            z = true;
        }
        Sticker sticker3 = this.sticker;
        if (sticker3.curIndex == sticker3.getFrameNumber() - 1 && this.sticker.getLoopStart() == -1) {
            this.needPlayLoop = false;
        }
        if (z) {
            if (zTriggerTypeProcess && this.sticker.isNotHiddenAfterTrigger()) {
                Sticker sticker4 = this.sticker;
                if (sticker4.curIndex == sticker4.getFrameNumber() - 1) {
                    this.sticker.curIndex = 0;
                }
            }
            if (!this.needPlayLoop) {
                return;
            }
            startPlay();
            this.hasShowed = true;
            this.lastShouldShow = true;
            this.isHiddenFrame = false;
        } else {
            if (this.sticker.isNotHiddenAfterTrigger()) {
                this.lastShouldShow = z;
            }
            if (this.sticker.isNotHiddenAfterTrigger()) {
                Sticker sticker5 = this.sticker;
                if (sticker5.curIndex == sticker5.getFrameNumber() - 1) {
                    Sticker sticker6 = this.sticker;
                    if (sticker6.curIndex > 0) {
                        sticker6.curIndex = 0;
                        resumeDisplay();
                    } else {
                        if (this.sticker.isNoBreakLoop()) {
                            sticker2 = this.sticker;
                            if (sticker2.curIndex >= sticker2.getFrameNumber() - 1 && this.hasShowed && this.sticker.curIndex > 0 && this.needPlayLoop) {
                                resumeDisplay();
                            }
                        }
                        sticker = this.sticker;
                        if (sticker.curIndex == sticker.getFrameNumber() - 1 && (this.sticker.getLoopStart() <= 0 || !this.sticker.isAlwaysShow())) {
                            this.sticker.curIndex = 0;
                        }
                        stopPlay();
                    }
                    z = true;
                } else {
                    if (this.sticker.isNoBreakLoop()) {
                        sticker2 = this.sticker;
                        if (sticker2.curIndex >= sticker2.getFrameNumber() - 1) {
                        }
                    }
                    sticker = this.sticker;
                    if (sticker.curIndex == sticker.getFrameNumber() - 1) {
                        this.sticker.curIndex = 0;
                    }
                    stopPlay();
                }
            } else {
                if (this.sticker.isNoBreakLoop()) {
                    sticker2 = this.sticker;
                    if (sticker2.curIndex >= sticker2.getFrameNumber() - 1) {
                    }
                }
                sticker = this.sticker;
                if (sticker.curIndex == sticker.getFrameNumber() - 1) {
                    this.sticker.curIndex = 0;
                }
                stopPlay();
            }
        }
        if (z) {
            this.hasShowedThisTrigger = true;
        }
        if (this.stickerStateChangeListener != null && !TextUtils.isEmpty(this.sticker.getObjectTriggerType())) {
            this.stickerStateChangeListener.stickerGestureTypeChanged(this.sticker.getObjectTriggerType(), z);
        }
        if (this.mStickerDuration > -1 && this.startTime != -1 && System.currentTimeMillis() - this.startTime > this.mStickerDuration) {
            clearPoints();
            StickerBlendFilter.StickerMaskFinishListener stickerMaskFinishListener = this.finishListener;
            if (stickerMaskFinishListener != null) {
                stickerMaskFinishListener.stickerRenderFinished();
                return;
            }
            return;
        }
        synchronized (this.maskLock) {
            setParamForMatrix(faceDetectParam.scaleW, faceDetectParam.scaleH, faceDetectParam.centerPoint, faceDetectParam.angle);
            this.isDraw = z;
        }
        if (this.startTime == -1) {
            this.startTime = System.currentTimeMillis();
        }
    }

    public void setEffectTimeInfo(kqe kqeVar) {
        this.mEffectTimeBean = kqeVar;
    }

    public void setFinishListener(StickerBlendFilter.StickerMaskFinishListener stickerMaskFinishListener) {
        this.finishListener = stickerMaskFinishListener;
    }

    public void setNeedUpdate(boolean z) {
        this.needUpdateSticker = z;
    }

    public void setParamForMatrix(float f, float f2, PointF pointF, float f3) {
        if (pointF == null) {
            return;
        }
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, -f4, f5, 0.0f);
        Matrix.multiplyMM(fArr, 0, this.mViewMatrix, 0, this.mProjectionMatrix, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.texData0, 0);
        this.mvpLists.add(new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]});
    }

    public void setProjectionMatrix(float[] fArr) {
        this.mProjectionMatrix = fArr;
    }

    public void setRenderTime(long j) {
        this.mRenderTime = j;
        MmcvImageLoader mmcvImageLoader = this.mmcvImageLoader;
        if (mmcvImageLoader != null) {
            mmcvImageLoader.setRenderTime(j);
        }
    }

    public void setStickerStateChangeListener(StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener) {
        this.stickerStateChangeListener = stickerStateChangeListener;
    }

    public void startPlay() {
        if (this.sticker.isNotResetOnHide()) {
            Sticker sticker = this.sticker;
            if (sticker.curIndex == 0 && this.hasShowed) {
                sticker.curIndex = sticker.getLoopStart();
            }
        }
        if (!this.isPlaying) {
            if (this.stickerStateChangeListener != null && this.sticker.getSoundId() > 0) {
                this.stickerStateChangeListener.playStateChanged(this.sticker.getSoundId(), true);
            }
            this.isPlaying = true;
        }
        this.isPlaying = true;
    }

    public void stopPlay() {
        if (this.isPlaying) {
            if (this.stickerStateChangeListener != null && this.sticker.getSoundId() > 0) {
                this.stickerStateChangeListener.playStateChanged(this.sticker.getSoundId(), false);
            }
            this.isPlaying = false;
        }
    }
}
