package com.momocv;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class MMFrame implements Serializable {
    public int width_ = 0;
    public int height_ = 0;
    public int step_ = 0;
    public int format_ = 0;
    public int data_len_ = 0;
    public byte[] data_ptr_ = null;

    public class MMFormat {
        public static final int FMT_BGR = 24;
        public static final int FMT_BGRA = 5;
        public static final int FMT_NONE = 0;
        public static final int FMT_NV12 = 18;
        public static final int FMT_NV21 = 17;
        public static final int FMT_RGB = 25;
        public static final int FMT_RGB56 = 27;
        public static final int FMT_RGBA = 4;

        public MMFormat() {
        }
    }
}
