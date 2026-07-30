package com.effectsar.labcv.effectsdk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefSkeleton3DInfo {
    static final int SKELETON_3D_EXTENDED_JOINT_NUM = 64;
    static final int SKELETON_3D_HEATMAP_KEYPOINT_NUM = 27;
    static final int SKELETON_3D_MAX_TARGET_NUM = 5;
    float focal_length;
    TargetInfo[] targetInfos = new TargetInfo[5];
    int target_num;
    int tracking;

    public static class TargetInfo {
        public int joint_num;
        public int new_target;
        public int tracking_id;
        public float[] quaternion = new float[256];
        public float[] betas = new float[10];
        public float[] root = new float[3];
        public float[] joints = new float[192];
        public float[] scores = new float[64];
        public float[] joint_valid = new float[64];
        public float[] heatmap_kpts_2d = new float[54];
        public float[] box = new float[4];

        public String toString() {
            return "TargetInfo{quaternion=" + Arrays.toString(this.quaternion) + ", betas=" + Arrays.toString(this.betas) + ", root=" + Arrays.toString(this.root) + ", joints=" + Arrays.toString(this.joints) + ", scores=" + Arrays.toString(this.scores) + ", joint_valid=" + Arrays.toString(this.joint_valid) + ", heatmap_kpts_2d=" + Arrays.toString(this.heatmap_kpts_2d) + ", box=" + Arrays.toString(this.box) + ", joint_num=" + this.joint_num + ", tracking_id=" + this.tracking_id + ", new_target=" + this.new_target + '}';
        }
    }

    public BefSkeleton3DInfo() {
        int i = 0;
        while (true) {
            TargetInfo[] targetInfoArr = this.targetInfos;
            if (i >= targetInfoArr.length) {
                return;
            }
            targetInfoArr[i] = new TargetInfo();
            i++;
        }
    }

    public float getFocal_length() {
        return this.focal_length;
    }

    public TargetInfo[] getTargetInfos() {
        return this.targetInfos;
    }

    public int getTarget_num() {
        return this.target_num;
    }

    public int getTracking() {
        return this.tracking;
    }

    public void setFocal_length(float f) {
        this.focal_length = f;
    }

    public void setTargetInfos(TargetInfo[] targetInfoArr) {
        this.targetInfos = targetInfoArr;
    }

    public void setTarget_num(int i) {
        this.target_num = i;
    }

    public void setTracking(int i) {
        this.tracking = i;
    }

    public String toString() {
        return "BefSkeleton3DInfo{targetInfos=" + Arrays.toString(this.targetInfos) + ", target_num=" + this.target_num + ", focal_length=" + this.focal_length + ", tracking=" + this.tracking + '}';
    }
}
