package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class BefDistanceInfo {
    private float[] dists;
    private int faceCount;
    private BefFaceInfo.FaceRect[] faceRects;

    public static class BefDistance {
        private float dis;
        private BefFaceInfo.FaceRect faceRect;

        public BefDistance(BefFaceInfo.FaceRect faceRect, float f) {
            this.faceRect = faceRect;
            this.dis = f;
        }

        public float getDis() {
            return this.dis;
        }

        public BefFaceInfo.FaceRect getFaceRect() {
            return this.faceRect;
        }
    }

    public BefDistance[] getBefDistance() {
        BefDistance[] befDistanceArr = new BefDistance[this.faceCount];
        for (int i = 0; i < this.faceCount; i++) {
            befDistanceArr[i] = new BefDistance(this.faceRects[i], this.dists[i]);
        }
        return befDistanceArr;
    }

    public float[] getDists() {
        return this.dists;
    }

    public int getFaceCount() {
        return this.faceCount;
    }

    public BefFaceInfo.FaceRect[] getFaceRects() {
        return this.faceRects;
    }

    public String toString() {
        return "";
    }
}
