package com.effectsar.labcv.effectsdk;

import android.graphics.PointF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefBachSkeletonInfo {
    private int skeletonNum;
    private Skeleton[] skeletons;

    public static class Skeleton {

        /* JADX INFO: renamed from: id */
        int f5851id;
        SkeletonPoint[] keypoints;
        int orientation;
        BefFaceInfo.FaceRect skeletonRect;

        public int getId() {
            return this.f5851id;
        }

        public SkeletonPoint[] getKeypoints() {
            SkeletonPoint[] skeletonPointArr = this.keypoints;
            return skeletonPointArr == null ? new SkeletonPoint[0] : skeletonPointArr;
        }

        public int getOrientation() {
            return this.orientation;
        }

        public BefFaceInfo.FaceRect getSkeletonRect() {
            return this.skeletonRect;
        }

        public String toString() {
            return "Skeleton{keypoints=" + Arrays.toString(this.keypoints) + ", skeletonRect=" + this.skeletonRect + '}';
        }
    }

    public static class SkeletonPoint {
        boolean is_detect;
        float score;

        /* JADX INFO: renamed from: x */
        float f5852x;

        /* JADX INFO: renamed from: y */
        float f5853y;

        public SkeletonPoint(float f, float f2, boolean z, float f3) {
            this.f5852x = f;
            this.f5853y = f2;
            this.is_detect = z;
            this.score = f3;
        }

        public PointF asPoint() {
            return new PointF(this.f5852x, this.f5853y);
        }

        public float getScore() {
            return this.score;
        }

        public float getX() {
            return this.f5852x;
        }

        public float getY() {
            return this.f5853y;
        }

        public boolean isDetect() {
            return this.is_detect;
        }

        public void setIs_detect(boolean z) {
            this.is_detect = z;
        }

        public void setX(float f) {
            this.f5852x = f;
        }

        public void setY(float f) {
            this.f5853y = f;
        }

        public String toString() {
            return "FacePoint{x=" + this.f5852x + ", y=" + this.f5853y + ", isdetect=" + String.valueOf(this.is_detect) + '}';
        }
    }

    public int getSkeletonNum() {
        return this.skeletonNum;
    }

    public Skeleton[] getSkeletons() {
        Skeleton[] skeletonArr = this.skeletons;
        return skeletonArr == null ? new Skeleton[0] : skeletonArr;
    }

    public void setSkeletonNum(int i) {
        this.skeletonNum = i;
    }

    public String toString() {
        return "BefSkeletonInfo{skeletons=" + Arrays.toString(this.skeletons) + ", skeletonNum=" + this.skeletonNum + '}';
    }
}
