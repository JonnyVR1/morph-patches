package com.idv.identity.base.algorithm;

import android.graphics.RectF;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityFaceAttr {

    /* JADX INFO: renamed from: df */
    DecimalFormat f12795df = new DecimalFormat("#.######");
    public boolean eyeBlink;
    public int faceNum;
    public RectF faceRegion;
    public int leftEyeOpen;
    public float occlusion;
    public float ratio;
    public int rightEyeOpen;
    public float score;

    public IdentityFaceAttr(RectF rectF, float f, float f2, float f3, int i, int i2, int i3) {
        this.faceRegion = rectF;
        this.ratio = f;
        this.score = f2;
        this.occlusion = f3;
        this.rightEyeOpen = i;
        this.leftEyeOpen = i2;
        this.faceNum = i3;
    }

    public int getFaceNum() {
        return this.faceNum;
    }

    public RectF getFaceRegion() {
        return this.faceRegion;
    }

    public float getOcclusion() {
        return this.occlusion;
    }

    public float getRatio() {
        return this.ratio;
    }

    public float getScore() {
        return this.score;
    }

    public boolean isEyeBlink() {
        return this.eyeBlink;
    }

    public int isLeftEyeOpen() {
        return this.leftEyeOpen;
    }

    public int isRightEyeOpen() {
        return this.rightEyeOpen;
    }

    public void setEyeBlink(boolean z) {
        this.eyeBlink = z;
    }

    public void setFaceNum(int i) {
        this.faceNum = i;
    }

    public void setFaceRegion(RectF rectF) {
        this.faceRegion = rectF;
    }

    public void setLeftEyeOpen(int i) {
        this.leftEyeOpen = i;
    }

    public void setOcclusion(float f) {
        this.occlusion = f;
    }

    public void setRatio(float f) {
        this.ratio = f;
    }

    public void setRightEyeOpen(int i) {
        this.rightEyeOpen = i;
    }

    public void setScore(float f) {
        this.score = f;
    }

    public String toString() {
        return "IdentityFaceAttr{face_ratio=" + this.ratio + ", occlusion=" + this.f12795df.format(this.occlusion) + ", faceRegion=" + this.faceRegion.toString() + ", score=" + this.score + ", rightEyeOpen=" + this.rightEyeOpen + ", leftEyeOpen=" + this.leftEyeOpen + ", faceNum=" + this.faceNum + '}';
    }

    public IdentityFaceAttr() {
    }

    public IdentityFaceAttr(float f, float f2, float f3, int i, int i2, int i3) {
        this.ratio = f;
        this.score = f2;
        this.occlusion = f3;
        this.rightEyeOpen = i;
        this.leftEyeOpen = i2;
        this.faceNum = i3;
    }
}
