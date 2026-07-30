package com.effectsar.labcv.effectsdk;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefFaceInfo {
    private FaceAttri[] attris;
    private ExtraInfo[] extras;
    private Face106[] face106s;
    private FaceMaskInfo[] faceMask;
    private FaceMaskInfo[] mouthMask;
    private FaceMaskInfo[] teethMask;

    public static class ExtraInfo {
        public static final int EYE_BROW_POINTS_NUM = 13;
        public static final int EYE_IRIS_POINTS_NUM = 20;
        public static final int EYE_POINTS_NUM = 22;
        public static final int LIP_POINTS_NUM = 64;
        int eye_count;
        FacePoint[] eye_left;
        FacePoint[] eye_right;
        int eyebrow_count;
        FacePoint[] eyebrow_left;
        FacePoint[] eyebrow_right;
        int iris_count;
        FacePoint[] left_iris;
        FacePoint[] lips;
        int lips_count;
        FacePoint[] right_iris;

        public FacePoint[] getEye_left() {
            FacePoint[] facePointArr = this.eye_left;
            return facePointArr == null ? new FacePoint[0] : facePointArr;
        }

        public FacePoint[] getEye_right() {
            FacePoint[] facePointArr = this.eye_right;
            return facePointArr == null ? new FacePoint[0] : facePointArr;
        }

        public FacePoint[] getEyebrow_left() {
            FacePoint[] facePointArr = this.eyebrow_left;
            return facePointArr == null ? new FacePoint[0] : facePointArr;
        }

        public FacePoint[] getEyebrow_right() {
            FacePoint[] facePointArr = this.eyebrow_right;
            return facePointArr == null ? new FacePoint[0] : facePointArr;
        }

        public FacePoint[] getLeft_iris() {
            FacePoint[] facePointArr = this.left_iris;
            return facePointArr == null ? new FacePoint[0] : facePointArr;
        }

        public FacePoint[] getLips() {
            FacePoint[] facePointArr = this.lips;
            return facePointArr == null ? new FacePoint[0] : facePointArr;
        }

        public FacePoint[] getRight_iris() {
            FacePoint[] facePointArr = this.right_iris;
            return facePointArr == null ? new FacePoint[0] : facePointArr;
        }

        public String toString() {
            return "ExtraInfo{eye_count=" + this.eye_count + ", eyebrow_count=" + this.eyebrow_count + ", lips_count=" + this.lips_count + ", iris_count=" + this.iris_count + ", eye_left=" + Arrays.toString(this.eye_left) + ", eye_right=" + Arrays.toString(this.eye_right) + ", eyebrow_left=" + Arrays.toString(this.eyebrow_left) + ", eyebrow_right=" + Arrays.toString(this.eyebrow_right) + ", lips=" + Arrays.toString(this.lips) + ", left_iris=" + Arrays.toString(this.left_iris) + ", right_iris=" + Arrays.toString(this.right_iris) + '}';
        }
    }

    public static class Face106 {

        /* JADX INFO: renamed from: ID */
        int f5821ID;
        int action;
        float eye_dist;
        float pitch;
        FacePoint[] points_array;
        FaceRect rect;
        float roll;
        float score;
        float[] visibility_array;
        float yaw;

        public int getAction() {
            return this.action;
        }

        public float getEye_dist() {
            return this.eye_dist;
        }

        public int getID() {
            return this.f5821ID;
        }

        public float getPitch() {
            return this.pitch;
        }

        public FacePoint[] getPoints_array() {
            return this.points_array;
        }

        public FaceRect getRect() {
            return this.rect;
        }

        public float getRoll() {
            return this.roll;
        }

        public float getScore() {
            return this.score;
        }

        public float[] getVisibility_array() {
            return this.visibility_array;
        }

        public float getYaw() {
            return this.yaw;
        }

        public String toString() {
            return "Face106{rect=" + this.rect + ", score=" + this.score + ", points_array=" + Arrays.toString(this.points_array) + ", visibility_array=" + Arrays.toString(this.visibility_array) + ", yaw=" + this.yaw + ", pitch=" + this.pitch + ", roll=" + this.roll + ", eye_dist=" + this.eye_dist + ", action=" + this.action + ", ID=" + this.f5821ID + '}';
        }
    }

    public static class FaceAttri {
        float confuse_prob;
        float[] exp_probs;
        float age = 0.0f;
        float boy_prob = 0.0f;
        float attractive = 0.0f;
        float happy_score = 0.0f;
        int expression_type = 0;

        public float getAge() {
            return this.age;
        }

        public float getAttractive() {
            return this.attractive;
        }

        public float getBoy_prob() {
            return this.boy_prob;
        }

        public float getConfuseProb() {
            return this.confuse_prob;
        }

        public float[] getExp_probs() {
            float[] fArr = this.exp_probs;
            return fArr == null ? new float[0] : fArr;
        }

        public int getExpression_type() {
            return this.expression_type;
        }

        public float getHappy_score() {
            return this.happy_score;
        }

        public void setAge(float f) {
            this.age = f;
        }

        public void setAttractive(float f) {
            this.attractive = f;
        }

        public void setBoy_prob(float f) {
            this.boy_prob = f;
        }

        public void setExp_probs(float[] fArr) {
            this.exp_probs = fArr;
        }

        public void setExpression_type(int i) {
            this.expression_type = i;
        }

        public void setHappy_score(float f) {
            this.happy_score = f;
        }
    }

    public static class FaceMaskInfo {

        /* JADX INFO: renamed from: ID */
        public int f5822ID;
        public byte[] mask;
        public int mask_size;
        public double[] warp_mat;
    }

    public static class FacePoint {

        /* JADX INFO: renamed from: x */
        float f5823x;

        /* JADX INFO: renamed from: y */
        float f5824y;

        public FacePoint(float f, float f2) {
            this.f5823x = f;
            this.f5824y = f2;
        }

        public PointF asPoint() {
            return new PointF(this.f5823x, this.f5824y);
        }

        public float getX() {
            return this.f5823x;
        }

        public float getY() {
            return this.f5824y;
        }

        public void setX(float f) {
            this.f5823x = f;
        }

        public void setY(float f) {
            this.f5824y = f;
        }

        public String toString() {
            return "FacePoint{x=" + this.f5823x + ", y=" + this.f5824y + '}';
        }
    }

    public static class FaceRect {
        int bottom;
        int left;
        int right;
        int top;

        public FaceRect(int i, int i2, int i3, int i4) {
            this.left = i;
            this.right = i3;
            this.top = i2;
            this.bottom = i4;
        }

        public int getBottom() {
            return this.bottom;
        }

        public int getLeft() {
            return this.left;
        }

        public int getRight() {
            return this.right;
        }

        public int getTop() {
            return this.top;
        }

        public void setBottom(int i) {
            this.bottom = i;
        }

        public void setLeft(int i) {
            this.left = i;
        }

        public void setRight(int i) {
            this.right = i;
        }

        public void setTop(int i) {
            this.top = i;
        }

        public Rect toRect() {
            return new Rect(this.left, this.top, this.right, this.bottom);
        }

        public String toString() {
            return "FaceRect{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
        }
    }

    public FaceAttri[] getAttris() {
        FaceAttri[] faceAttriArr = this.attris;
        return faceAttriArr == null ? new FaceAttri[0] : faceAttriArr;
    }

    public ExtraInfo[] getExtras() {
        ExtraInfo[] extraInfoArr = this.extras;
        return extraInfoArr == null ? new ExtraInfo[0] : extraInfoArr;
    }

    public Face106[] getFace106s() {
        Face106[] face106Arr = this.face106s;
        return face106Arr != null ? face106Arr : new Face106[0];
    }

    public FaceMaskInfo[] getFaceMaskInfo() {
        FaceMaskInfo[] faceMaskInfoArr = this.faceMask;
        return faceMaskInfoArr == null ? new FaceMaskInfo[0] : faceMaskInfoArr;
    }

    public FaceMaskInfo[] getMouthMaskInfo() {
        FaceMaskInfo[] faceMaskInfoArr = this.mouthMask;
        return faceMaskInfoArr == null ? new FaceMaskInfo[0] : faceMaskInfoArr;
    }

    public FaceMaskInfo[] getTeethMaskInfo() {
        FaceMaskInfo[] faceMaskInfoArr = this.teethMask;
        return faceMaskInfoArr == null ? new FaceMaskInfo[0] : faceMaskInfoArr;
    }

    public String toString() {
        return "BefFaceInfo{face106s=" + Arrays.toString(this.face106s) + ", extras=" + Arrays.toString(this.extras) + ", attris=" + Arrays.toString(this.attris) + ", mouthMask=" + Arrays.toString(this.mouthMask) + ", teethMask=" + Arrays.toString(this.teethMask) + ", faceMask=" + Arrays.toString(this.faceMask) + '}';
    }
}
