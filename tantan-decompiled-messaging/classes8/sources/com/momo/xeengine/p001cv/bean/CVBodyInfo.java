package com.momo.xeengine.p001cv.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
        public float f267x;

        /* JADX INFO: renamed from: y */
        public float f268y;
    }
}
