package com.momo.mcamera.mask;

import android.graphics.PointF;
import android.graphics.RectF;
import com.core.glcore.p023cv.MMCVBoxes;
import p149l.etf;
import p149l.pjw;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FaceDetectFilter extends ts2 implements etf {
    public FaceDetectFilter parentFilter;

    public static class FaceDetectParam {
        public float angle;

        /* JADX INFO: renamed from: cX */
        public float f14243cX;

        /* JADX INFO: renamed from: cY */
        public float f14244cY;
        public PointF centerPoint;
        public float[] euler_angles;
        public FilterTriggerManager filterTrigerManager;
        public RectF gestureRect;
        public MMCVBoxes mmcvBoxes;
        public float[] points104;
        public float[] points68;
        public float[] points8;
        public float[] points96;
        public float scaleH;
        public float scaleW;
        public String triggerType;
        public float[] warpedPoints104;
    }

    public abstract void cancelDraw();

    public abstract void clearPoints();

    public void lockTexture() {
    }

    public void pauseBitmapCache() {
    }

    public abstract void resetSticker(Sticker sticker);

    public void resumeBitmapCache() {
    }

    public void setDetectParam(FaceDetectParam faceDetectParam) {
    }

    public abstract void setMMCVInfo(pjw pjwVar);

    public void unlockTexture() {
    }
}
