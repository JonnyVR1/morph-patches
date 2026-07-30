package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.Matrix;
import com.momo.mcamera.mask.bean.ObjectRegion;
import com.momocv.MMRect;
import com.momocv.objecttracker.ObjectTracker;
import com.momocv.objecttracker.ObjectTrackerInfo;
import com.momocv.objecttracker.ObjectTrackerParams;
import p149l.mcj;
import p149l.pjw;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class StickerGestureTrackingFilter extends StickerMaskFilter {
    private static final float DEFAULT_GESTURE_WIDTH = 180.0f;
    private static final int DETECT_MISS_COUNT = 3;
    private PointF currentCenter;
    private RectF currentRect;
    private int gestureMiss;
    private boolean hasGestureRect;
    private ObjectTracker mTracker;
    private vjw mmFrame;
    private pjw mmcvInfo;
    private MMRect mmcvRect;
    private volatile boolean startTracking;
    private ObjectTrackerInfo trackerInfo;
    private ObjectTrackerParams trackerParams;
    private volatile boolean trackingInit;

    public StickerGestureTrackingFilter(Context context, Sticker sticker) {
        super(context, sticker, null);
        this.hasGestureRect = false;
        this.currentRect = null;
        this.currentCenter = null;
        this.mTracker = new ObjectTracker();
        this.mmFrame = new vjw();
        this.trackerParams = new ObjectTrackerParams();
        this.trackerInfo = new ObjectTrackerInfo();
    }

    private void adjustRectF(RectF rectF) {
        ObjectRegion trackingRegion = this.sticker.getTrackingRegion();
        float fWidth = rectF.width() / trackingRegion.f14251w;
        float fHeight = rectF.height() / trackingRegion.f14250h;
        float f = rectF.left - (trackingRegion.f14252x * fWidth);
        rectF.left = f;
        float f2 = rectF.top - (trackingRegion.f14253y * fHeight);
        rectF.top = f2;
        rectF.right = f + fWidth;
        rectF.bottom = f2 + fHeight;
    }

    private void log(String str, MMRect mMRect) {
    }

    private void trackingUpdate() {
        if (!this.startTracking || this.mmcvRect == null || this.mmcvInfo == null) {
            this.trackingInit = false;
            return;
        }
        this.mmFrame.m198695h(17);
        this.mmFrame.m198699l(this.width);
        this.mmFrame.m198700m(this.width);
        this.mmFrame.m198697j(this.height);
        ObjectTrackerParams objectTrackerParams = this.trackerParams;
        MMRect mMRect = this.mmcvRect;
        objectTrackerParams.rect_ = mMRect;
        this.trackerInfo.rect_ = mMRect;
        boolean z = this.trackingInit;
        ObjectTracker objectTracker = this.mTracker;
        if (z) {
            objectTracker.Update(this.mmFrame.m198689b(), this.trackerParams, this.trackerInfo);
        } else {
            objectTracker.ReInit(this.mmFrame.m198689b(), this.trackerParams);
            this.trackingInit = true;
        }
        FaceDetectFilter.FaceDetectParam faceDetectParam = new FaceDetectFilter.FaceDetectParam();
        faceDetectParam.centerPoint = new PointF(0.0f, 0.0f);
        RectF rectF = new RectF();
        MMRect mMRect2 = this.trackerInfo.rect_;
        int i = mMRect2.f14764x_;
        rectF.left = i;
        int i2 = mMRect2.f14765y_;
        rectF.top = i2;
        rectF.right = i + mMRect2.width_;
        rectF.bottom = i2 + mMRect2.height_;
        if (this.sticker.getTrackingRegion() != null) {
            adjustRectF(rectF);
        }
        faceDetectParam.gestureRect = rectF;
        setDetectParam(faceDetectParam);
    }

    @Override // com.momo.mcamera.mask.StickerMaskFilter, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        ObjectTracker objectTracker = this.mTracker;
        if (objectTracker != null) {
            objectTracker.Release();
        }
    }

    public void gestureMiss() {
        synchronized (getLockObject()) {
            try {
                int i = this.gestureMiss + 1;
                this.gestureMiss = i;
                if (i >= 3) {
                    this.gestureMiss = 0;
                    this.startTracking = false;
                    this.trackingInit = false;
                    this.mmcvRect = null;
                    pauseBitmapCache();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float getAdjustWidthScale() {
        return ((float) getWidth()) == 480.0f ? 1.0f : 1.5f;
    }

    public PointF getCenterPoint(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = f + ((pointF2.x - f) / 2.0f);
        float f3 = pointF.y;
        return new PointF(f2, f3 + ((pointF2.y - f3) / 2.0f));
    }

    public boolean isTrackingInit() {
        return this.trackingInit;
    }

    @Override // com.momo.mcamera.mask.StickerMaskFilter, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        synchronized (getLockObject()) {
            trackingUpdate();
        }
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // com.momo.mcamera.mask.StickerMaskFilter, com.momo.mcamera.mask.FaceDetectFilter
    public void pauseBitmapCache() {
        super.pauseBitmapCache();
        Sticker sticker = this.sticker;
        if (sticker != null) {
            sticker.curIndex = 0;
            this.hasGestureRect = false;
            this.currentRect = null;
        }
    }

    @Override // com.momo.mcamera.mask.StickerMaskFilter, com.momo.mcamera.mask.FaceDetectFilter
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        PointF pointF;
        RectF rectF = faceDetectParam.gestureRect;
        if (rectF != null) {
            this.currentRect = rectF;
        }
        if (this.currentRect == null) {
            return;
        }
        synchronized (this.maskListLock) {
            try {
                RectF rectF2 = this.currentRect;
                float f = rectF2.right - rectF2.left;
                float f2 = rectF2.bottom - rectF2.top;
                float f3 = f / 180.0f;
                float adjustWidthScale = f3 / getAdjustWidthScale();
                faceDetectParam.points8 = new float[]{f, f, f, f, f, f, f, f};
                RectF rectF3 = this.currentRect;
                float f4 = rectF3.left;
                float f5 = rectF3.right;
                float f6 = rectF3.top;
                float f7 = rectF3.bottom;
                if (this.sticker.getPointIndexes() == null || this.sticker.getPointIndexes().length <= 1) {
                    adjustWidthScale = f3 / getAdjustWidthScale();
                    pointF = new PointF(((this.currentRect.left + (f / 2.0f)) + (this.sticker.getOffsetX() * adjustWidthScale)) / getWidth(), ((this.currentRect.top + (f2 / 2.0f)) + (this.sticker.getOffsetY() * adjustWidthScale)) / getHeight());
                } else {
                    int i = this.sticker.getPointIndexes()[0];
                    int i2 = this.sticker.getPointIndexes()[1];
                    float[] fArr = faceDetectParam.points8;
                    PointF centerPoint = getCenterPoint(new PointF(fArr[i], fArr[i + 4]), new PointF(fArr[i2], fArr[i2 + 4]));
                    centerPoint.x += (this.sticker.getOffsetX() * adjustWidthScale) / 2.0f;
                    centerPoint.y += (this.sticker.getOffsetY() * adjustWidthScale) / 2.0f;
                    pointF = new PointF(centerPoint.x / getWidth(), centerPoint.y / getHeight());
                }
                float f8 = adjustWidthScale;
                setParamForMatrix(f8, f8, pointF, 0.0f, faceDetectParam.filterTrigerManager);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.StickerMaskFilter, com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mmcvInfo = pjwVar;
    }

    public void setMMCVRect(MMRect mMRect) {
        synchronized (getLockObject()) {
            this.mmcvRect = mMRect;
        }
    }

    public void setParamForMatrix(float f, float f2, PointF pointF, float f3, FilterTriggerManager filterTriggerManager) {
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        pointF.x = f4;
        pointF.y = f5;
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

    public void startTracking() {
        synchronized (getLockObject()) {
            this.startTracking = true;
        }
    }
}
