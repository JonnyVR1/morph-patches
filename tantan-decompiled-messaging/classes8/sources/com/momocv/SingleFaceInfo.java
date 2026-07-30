package com.momocv;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SingleFaceInfo implements Serializable {
    public float[] camera_matrix_;
    public float[] euler_angles_;
    public float face_covered_rate;
    public byte[] face_mask;
    public int face_mask_height;
    public int face_mask_width;
    public float face_prob_;
    public float[] face_rect_;
    public float face_rotate_degree_2d_;
    public float[] face_warp_mat;
    public int facepose_type_;
    public float feature_quality_score_;
    public byte[] features_;
    public int features_quality_;
    public float[] landmarks137_occprobe_;
    public float[] landmarks_104_;
    public float[] landmarks_106_;
    public float[] landmarks_137_;
    public float[] landmarks_222_;
    public float[] landmarks_240_;
    public float[] landmarks_68_;
    public float[] landmarks_87_;
    public float[] landmarks_96_;
    public float[] modelview_matrix_;
    public float mouth_covered_rate;
    public byte[] mouth_mask;
    public int mouth_mask_height;
    public int mouth_mask_width;
    public float[] mouth_warp_mat;
    public float[] orig_face_rect_;
    public float orig_face_rotate_degree_2d_;
    public float[] orig_landmarks_104_;
    public float[] orig_landmarks_106_;
    public float[] orig_landmarks_137_;
    public float[] orig_landmarks_222_;
    public float[] orig_landmarks_240_;
    public float[] orig_landmarks_68_;
    public float[] orig_landmarks_87_;
    public float[] orig_landmarks_96_;
    public float[] projection_matrix_;
    public float[] projection_matrix_opengl_;
    public int quality_;
    public float[] rotation_matrix_;
    public float[] rotation_vector_;
    public int tracking_id_;
    public float[] translation_vector_;
    public int occflag_ = -1;
    public int occtype_ = -1;
    public int liveness_ = -1;
}
