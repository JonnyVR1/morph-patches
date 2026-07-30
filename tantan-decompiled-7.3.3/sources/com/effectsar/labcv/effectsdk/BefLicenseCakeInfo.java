package com.effectsar.labcv.effectsdk;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefLicenseCakeInfo {
    private LicenseCakeInfo[] licenseCakeInfos;
    private int licenseCakeNum;

    public static class BBoxRect {
        int bottom;
        int left;
        int right;
        int top;

        public BBoxRect(int i, int i2, int i3, int i4) {
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

    public static class LicenseCakeInfo {
        private float det_score = 0.0f;

        /* JADX INFO: renamed from: id */
        private int f5865id;
        private int label;
        private BBoxRect rect;

        public float getDet_score() {
            return this.det_score;
        }

        public int getId() {
            return this.f5865id;
        }

        public int getLabel() {
            return this.label;
        }

        public BBoxRect getRect() {
            return this.rect;
        }

        public void setDet_score(float f) {
            this.det_score = f;
        }

        public void setId(int i) {
            this.f5865id = i;
        }

        public void setLabel(int i) {
            this.label = i;
        }

        public void setRect(BBoxRect bBoxRect) {
            this.rect = bBoxRect;
        }

        public String toString() {
            return "LicenseCakeInfo{id=" + this.f5865id + ", label=" + this.label + ", det_score=" + this.det_score + ", rect=" + this.rect + '}';
        }
    }

    public LicenseCakeInfo[] getLicenseCakeInfos() {
        return this.licenseCakeInfos;
    }

    public int getLicenseCakeNum() {
        return this.licenseCakeNum;
    }

    public void setLicenseCakeInfos(LicenseCakeInfo[] licenseCakeInfoArr) {
        this.licenseCakeInfos = licenseCakeInfoArr;
    }

    public void setLicenseCakeNum(int i) {
        this.licenseCakeNum = i;
    }

    public String toString() {
        return "BefLicenseCakeInfo{licenseCakeInfos=" + Arrays.toString(this.licenseCakeInfos) + ", licenseCakeNum=" + this.licenseCakeNum + '}';
    }
}
