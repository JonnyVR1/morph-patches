package com.momocv.handlandmark;

import com.momocv.BaseParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class HandLandmarkParams extends BaseParams {
    public int version_ = 0;
    public boolean use_tracking_ = false;
    public boolean debug_on_ = false;
    public boolean detect_single_frame_ = false;
    public boolean detect3d_switch_ = false;
    public String debug_output_ = "/sdcard/momocv_debug.log";
    public boolean use_cpu_only_ = false;
    public float[] proj_matrix_ = {4.294081f, 0.0f, 0.0f, 0.0f, 0.0f, 2.414213f, 0.0f, 0.0f, 0.0f, 0.0f, 1.05f, -0.01f, 0.0f, 0.0f, 1.0f, 0.0f};
}
