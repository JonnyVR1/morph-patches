package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class BefPublicDefine {

    public static class BefCapturedImageInfo {
        public int format;
        public int height;
        public int rotate;
        public int stride;
        public int width;

        public String toString() {
            return "BefCapturedImageInfo{width=" + this.width + ", height=" + this.height + ", stride=" + this.stride + ", format=" + this.format + ", rotate=" + this.rotate;
        }
    }

    public static class BefKeyPoint {
        private boolean isDetect;

        /* JADX INFO: renamed from: x */
        private float f5866x;

        /* JADX INFO: renamed from: y */
        private float f5867y;

        public BefKeyPoint(float f, float f2, boolean z) {
            this.f5866x = f;
            this.f5867y = f2;
            this.isDetect = z;
        }

        public float getX() {
            return this.f5866x;
        }

        public float getY() {
            return this.f5867y;
        }

        public boolean isDetect() {
            return this.isDetect;
        }

        public void setDetect(boolean z) {
            this.isDetect = z;
        }

        public void setX(float f) {
            this.f5866x = f;
        }

        public void setY(float f) {
            this.f5867y = f;
        }

        public String toString() {
            return "BefKeyPoint{x=" + this.f5866x + ", y=" + this.f5867y + ", isDetected=" + this.isDetect + '}';
        }
    }

    public static class BefPointF {

        /* JADX INFO: renamed from: x */
        private float f5868x;

        /* JADX INFO: renamed from: y */
        private float f5869y;

        public BefPointF(float f, float f2) {
            this.f5868x = f;
            this.f5869y = f2;
        }

        public float getX() {
            return this.f5868x;
        }

        public float getY() {
            return this.f5869y;
        }

        public void setX(float f) {
            this.f5868x = f;
        }

        public void setY(float f) {
            this.f5869y = f;
        }

        public String toString() {
            return "BefPointF{x=" + this.f5868x + ", y=" + this.f5869y;
        }
    }

    public static class BefRect {
        private int bottom;
        private int left;
        private int right;
        private int top;

        public BefRect(int i, int i2, int i3, int i4) {
            this.left = i;
            this.top = i2;
            this.right = i3;
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

        public String toString() {
            return "BefRect{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
        }
    }
}
