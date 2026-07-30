package com.idv.identity.base.algorithm.doc;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes7.dex */
public class Attr {
    float bottomScore;
    RectF docRegion;
    float faceScore;
    float leftScore;
    public float[] points = new float[8];
    float rightScore;
    float topScore;

    public float getBottomScore() {
        return this.bottomScore;
    }

    public RectF getDocRegion() {
        return this.docRegion;
    }

    public float getFaceScore() {
        return this.faceScore;
    }

    public float getLeftScore() {
        return this.leftScore;
    }

    public float getRightScore() {
        return this.rightScore;
    }

    public float getTopScore() {
        return this.topScore;
    }

    public String toString() {
        return "Attr{topScore=" + this.topScore + ", rightScore=" + this.rightScore + ", bottomScore=" + this.bottomScore + ", leftScore=" + this.leftScore + ", faceScore=" + this.faceScore + ", docRegion=" + this.docRegion + ", points=" + this.points.toString() + '}';
    }
}
