package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes8.dex */
public class StickerGestureMaskFilter extends StickerMaskFilter {
    private static final float DEFAULT_GESTURE_WIDTH = 180.0f;
    private PointF currentCenter;
    private RectF currentRect;
    private boolean hasGestureRect;

    public StickerGestureMaskFilter(Context context, Sticker sticker) {
        super(context, sticker, null);
        this.hasGestureRect = false;
        this.currentRect = null;
        this.currentCenter = null;
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
        if (!this.hasGestureRect) {
            RectF rectF = faceDetectParam.gestureRect;
            if (rectF != null) {
                this.currentRect = rectF;
                this.hasGestureRect = true;
            }
        } else if (faceDetectParam.gestureRect == null) {
            faceDetectParam.gestureRect = this.currentRect;
        }
        if (this.currentRect == null) {
            return;
        }
        synchronized (this.maskListLock) {
            try {
                RectF rectF2 = this.currentRect;
                float f = rectF2.right - rectF2.left;
                float f2 = rectF2.bottom - rectF2.top;
                float imageWidth = (f / 180.0f) * ((this.sticker.getImageWidth() * getAdjustWidthScale()) / (getWidth() / 2.0f));
                faceDetectParam.points8 = new float[]{f, f, f, f, f, f, f, f};
                RectF rectF3 = this.currentRect;
                float f3 = rectF3.left;
                float f4 = rectF3.right;
                float f5 = rectF3.top;
                float f6 = rectF3.bottom;
                if (this.sticker.getPointIndexes() == null || this.sticker.getPointIndexes().length <= 1) {
                    pointF = new PointF((this.currentRect.left + (f / 2.0f)) / getWidth(), (this.currentRect.top + (f2 / 2.0f)) / getHeight());
                } else {
                    int i = this.sticker.getPointIndexes()[0];
                    int i2 = this.sticker.getPointIndexes()[1];
                    float[] fArr = faceDetectParam.points8;
                    PointF centerPoint = getCenterPoint(new PointF(fArr[i], fArr[i + 4]), new PointF(fArr[i2], fArr[i2 + 4]));
                    pointF = new PointF(centerPoint.x / getWidth(), centerPoint.y / getHeight());
                }
                setParamForMatrix(imageWidth, imageWidth, pointF, 0.0f, faceDetectParam.filterTrigerManager);
            } catch (Throwable th) {
                throw th;
            }
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
}
