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
        private float f5829x;

        /* JADX INFO: renamed from: y */
        private float f5830y;

        public BefKeyPoint(float f, float f2, boolean z) {
            this.f5829x = f;
            this.f5830y = f2;
            this.isDetect = z;
        }

        public float getX() {
            return this.f5829x;
        }

        public float getY() {
            return this.f5830y;
        }

        public boolean isDetect() {
            return this.isDetect;
        }

        public void setDetect(boolean z) {
            this.isDetect = z;
        }

        public void setX(float f) {
            this.f5829x = f;
        }

        public void setY(float f) {
            this.f5830y = f;
        }

        public String toString() {
            return "BefKeyPoint{x=" + this.f5829x + ", y=" + this.f5830y + ", isDetected=" + this.isDetect + '}';
        }
    }

    public static class BefPointF {

        /* JADX INFO: renamed from: x */
        private float f5831x;

        /* JADX INFO: renamed from: y */
        private float f5832y;

        public BefPointF(float f, float f2) {
            this.f5831x = f;
            this.f5832y = f2;
        }

        public float getX() {
            return this.f5831x;
        }

        public float getY() {
            return this.f5832y;
        }

        public void setX(float f) {
            this.f5831x = f;
        }

        public void setY(float f) {
            this.f5832y = f;
        }

        public String toString() {
            return "BefPointF{x=" + this.f5831x + ", y=" + this.f5832y;
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
