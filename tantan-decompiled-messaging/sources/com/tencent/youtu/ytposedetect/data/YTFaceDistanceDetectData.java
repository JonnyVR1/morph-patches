package com.tencent.youtu.ytposedetect.data;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class YTFaceDistanceDetectData {
    public float detectScore;
    public FrameData[] frameList;
    public Rect[] processRect;

    public class FrameData {
        public float areaRatio;
        public float[] faceAlign;
        public ImageData img;
        public float iou;
        public int rectH;
        public int rectW;
        public int rectX;
        public int rectY;
        public long timestamp;

        /* JADX INFO: renamed from: x */
        public int f60842x;

        /* JADX INFO: renamed from: y */
        public int f60843y;

        public FrameData() {
        }
    }

    public class ImageData {
        public int height;
        public byte[] rgb;
        public int width;

        public ImageData() {
        }
    }
}
