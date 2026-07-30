package com.momo.mcamera.mask;

import android.graphics.PointF;
import android.graphics.RectF;
import com.core.glcore.p024cv.MMCVBoxes;
import p153l.jt2;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public abstract class FaceDetectFilter extends jt2 implements suf {
    public FaceDetectFilter parentFilter;

    public static class FaceDetectParam {
        public float angle;

        /* JADX INFO: renamed from: cX */
        public float f14962cX;

        /* JADX INFO: renamed from: cY */
        public float f14963cY;
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

    public abstract void setMMCVInfo(omw omwVar);

    public void unlockTexture() {
    }
}
