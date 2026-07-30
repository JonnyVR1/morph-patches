package com.momocv;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class BaseParams implements Serializable {
    public int[] crop_rect;
    public int rotate_degree_ = 0;
    public int restore_degree_ = 0;
    public boolean fliped_show_ = false;
    public int business_type_ = 0;
    public float scale_factor_ = -1.0f;

    public class MMBusinessType {
        public static final int MBT_LIVEVIDEO = 2;
        public static final int MBT_NONE = 0;
        public static final int MBT_SHORTVIDEO = 1;

        public MMBusinessType() {
        }
    }
}
