package com.momocv.facequality;

import com.momocv.BaseParams;

/* JADX INFO: loaded from: classes8.dex */
public class FaceQualityParams extends BaseParams {
    public float[][] multi_euler_angles_;
    public float[][] multi_origin_landmarks_222_;
    public float[][] multi_origin_landmarks_96_;
    public int[] multi_tracking_id_;
    public boolean evaluate_single_frame_ = false;
    public boolean strict_quality_switch_ = true;
    public boolean face_occlusion_switch_ = true;
    public boolean motion_blur_detect_switch_ = true;
    public float motion_blur_result_threshold_ = 0.5f;
    public boolean liveness_detect_switch_ = true;
}
