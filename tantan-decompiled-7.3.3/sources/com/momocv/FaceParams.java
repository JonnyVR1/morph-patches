package com.momocv;

import com.momocv.facefeatures.FaceFeaturesParams;

/* JADX INFO: loaded from: classes8.dex */
public class FaceParams extends BaseParams {
    public int img_crop_type_ = 0;
    public int frame_interval_ = 5;
    public int face_alignment_version_ = 0;
    public int max_faces_ = 3;
    public float keypoints_stable_coef_ = 2.0f;
    public int pose_estimation_type_ = 0;
    public float pose_stable_coef_ = 2.0f;
    public boolean detect_single_frame_ = false;
    public boolean image_quality_controller_ = false;
    public boolean use_npd_ = true;
    public boolean use_mix_ = false;
    public boolean npd_accelerate_ = false;
    public boolean asynchronous_face_detect_ = true;
    public boolean do_facedect_corp_center_ = false;
    public boolean supper_stable_mode_ = true;
    public double fov_ = 45.0d;
    public double zFar_ = 5000.0d;
    public double zNear_ = 0.05d;
    public float focal_length_multiply_ = 1.0f;
    public boolean save_features_ = false;
    public int extract_feature_id_ = 0;
    public int reset_feature_id_ = 0;
    public float[] constraint_euler_angles_ = {40.0f, 45.0f, 50.0f};
    public int save_features_version_ = FaceFeaturesParams.BigFeatureVersion.f15488V1;
    public boolean asynchronous_save_features_ = false;
    public boolean feature_strict_ = false;
    public boolean debug_on_ = false;
    public String debug_output_ = "/sdcard/momocv_debug.log";
    public boolean face_register_mode_ = false;
    public float motion_blur_result_threshold_ = 0.5f;
    public boolean mouth_sg = false;
    public boolean mouth_sg_smooth = false;

    public class PoseEstimationType {
        public static final int POSE_ESTIMATION_MORE_PRECISE = 1;
        public static final int POSE_ESTIMATION_NORMAL = 0;
        public static final int POSE_ESTIMATION_NORMAL_BY87POINTS = 2;
        public static final int POSE_ESTIMATION_WITH_EULERS = 3;

        public PoseEstimationType() {
        }
    }
}
