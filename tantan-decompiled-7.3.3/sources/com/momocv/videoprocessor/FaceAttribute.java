package com.momocv.videoprocessor;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class FaceAttribute implements Serializable {
    public float[] dst_warp_points_;
    public int[] skin_threshold_;
    public float[] src_warp_points_;
    public float[] warped_landmarks104_;
    public float[] warped_landmarks106_;
    public float[] warped_landmarks240_;
    public float[] warped_landmarks68_;
    public float[] warped_landmarks96_;
    public float left_eye_close_prob_ = -1.0f;
    public float right_eye_close_prob_ = -1.0f;
    public int expression_ = -1;
}
