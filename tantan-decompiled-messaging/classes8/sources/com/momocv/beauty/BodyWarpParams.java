package com.momocv.beauty;

import com.momocv.BaseParams;
import com.momocv.MMJoint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class BodyWarpParams extends BaseParams {
    public MMJoint[][] body_keypoints_;
    public BodyWarpGroup[] body_warp_params_group_;
    public int image_width_ = 0;
    public int image_height_ = 0;
    public boolean body_warp_gradual_switch_ = true;
    public float body_warp_gradual_thresh_ = 1.0f;
}
