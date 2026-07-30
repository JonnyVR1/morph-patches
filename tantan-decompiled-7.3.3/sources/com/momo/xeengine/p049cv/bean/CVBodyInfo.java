package com.momo.xeengine.p049cv.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Deprecated
public class CVBodyInfo {
    public float[] dst_warp_points;
    public List<Joint> joints;
    public float[] src_warp_points;

    @Keep
    public static class Joint {
        public float score;

        /* JADX INFO: renamed from: x */
        public float f15287x;

        /* JADX INFO: renamed from: y */
        public float f15288y;
    }
}
