package com.momocv.videoprocessor;

import com.momocv.FaceParams;
import com.momocv.beauty.XCameraWarpLevelParams;

/* JADX INFO: loaded from: classes8.dex */
public class VideoParams extends FaceParams {
    public boolean expression_switch_ = false;
    public boolean eye_classify_switch_ = false;
    public boolean beauty_switch_ = false;
    public int warp_type_ = 0;
    public boolean multifaces_switch_ = false;
    public float warp_level1_ = 0.0f;
    public float warp_level2_ = 0.0f;
    public XCameraWarpLevelParams warp_level_group_ = new XCameraWarpLevelParams();
    public boolean skin_switch_ = false;
    public boolean face_warp_gradual_switch_ = false;
    public int face_warp_gradual_thresh_ = 10;
    public boolean track_switch_ = false;
    public int video_processor_frame_skip_ = 1;
}
