package com.core.glcore.util;

import com.momocv.SingleFaceInfo;
import com.momocv.videoprocessor.FaceAttribute;
import com.momocv.videoprocessor.VideoInfo;

/* JADX INFO: loaded from: classes.dex */
public class MMCvInfoHelper {
    public static SingleFaceInfo clone(SingleFaceInfo singleFaceInfo) {
        if (singleFaceInfo == null) {
            return null;
        }
        SingleFaceInfo singleFaceInfo2 = new SingleFaceInfo();
        singleFaceInfo2.tracking_id_ = singleFaceInfo.tracking_id_;
        singleFaceInfo2.face_prob_ = singleFaceInfo.face_prob_;
        singleFaceInfo2.quality_ = singleFaceInfo.quality_;
        singleFaceInfo2.orig_face_rotate_degree_2d_ = singleFaceInfo.orig_face_rotate_degree_2d_;
        singleFaceInfo2.face_rotate_degree_2d_ = singleFaceInfo.face_rotate_degree_2d_;
        singleFaceInfo2.features_quality_ = singleFaceInfo.features_quality_;
        singleFaceInfo2.facepose_type_ = singleFaceInfo.facepose_type_;
        singleFaceInfo2.occflag_ = singleFaceInfo.occflag_;
        singleFaceInfo2.occtype_ = singleFaceInfo.occtype_;
        singleFaceInfo2.liveness_ = singleFaceInfo.liveness_;
        singleFaceInfo2.feature_quality_score_ = singleFaceInfo.feature_quality_score_;
        singleFaceInfo2.orig_face_rect_ = ArrayUtils.bunshin(singleFaceInfo.orig_face_rect_);
        singleFaceInfo2.orig_landmarks_68_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_68_);
        singleFaceInfo2.orig_landmarks_96_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_96_);
        singleFaceInfo2.orig_landmarks_104_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_104_);
        singleFaceInfo2.orig_landmarks_137_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_137_);
        singleFaceInfo2.orig_landmarks_87_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_87_);
        singleFaceInfo2.orig_landmarks_240_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_240_);
        singleFaceInfo2.orig_landmarks_222_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_222_);
        singleFaceInfo2.orig_landmarks_106_ = ArrayUtils.bunshin(singleFaceInfo.orig_landmarks_106_);
        singleFaceInfo2.face_rect_ = ArrayUtils.bunshin(singleFaceInfo.face_rect_);
        singleFaceInfo2.landmarks_68_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_68_);
        singleFaceInfo2.landmarks_96_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_96_);
        singleFaceInfo2.landmarks_104_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_104_);
        singleFaceInfo2.landmarks_137_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_137_);
        singleFaceInfo2.landmarks_87_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_87_);
        singleFaceInfo2.landmarks_240_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_240_);
        singleFaceInfo2.landmarks_222_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_222_);
        singleFaceInfo2.landmarks_106_ = ArrayUtils.bunshin(singleFaceInfo.landmarks_106_);
        singleFaceInfo2.landmarks137_occprobe_ = ArrayUtils.bunshin(singleFaceInfo.landmarks137_occprobe_);
        singleFaceInfo2.features_ = ArrayUtils.bunshin(singleFaceInfo.features_);
        singleFaceInfo2.euler_angles_ = ArrayUtils.bunshin(singleFaceInfo.euler_angles_);
        singleFaceInfo2.camera_matrix_ = ArrayUtils.bunshin(singleFaceInfo.camera_matrix_);
        singleFaceInfo2.rotation_matrix_ = ArrayUtils.bunshin(singleFaceInfo.rotation_matrix_);
        singleFaceInfo2.rotation_vector_ = ArrayUtils.bunshin(singleFaceInfo.rotation_vector_);
        singleFaceInfo2.translation_vector_ = ArrayUtils.bunshin(singleFaceInfo.translation_vector_);
        singleFaceInfo2.projection_matrix_ = ArrayUtils.bunshin(singleFaceInfo.projection_matrix_);
        singleFaceInfo2.modelview_matrix_ = ArrayUtils.bunshin(singleFaceInfo.modelview_matrix_);
        singleFaceInfo2.projection_matrix_opengl_ = ArrayUtils.bunshin(singleFaceInfo.projection_matrix_opengl_);
        return singleFaceInfo2;
    }

    public static VideoInfo clone(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return null;
        }
        VideoInfo videoInfo2 = new VideoInfo();
        videoInfo2.dst_warp_points_ = ArrayUtils.bunshin(videoInfo.dst_warp_points_);
        videoInfo2.src_warp_points_ = ArrayUtils.bunshin(videoInfo.src_warp_points_);
        videoInfo2.frame_rect_ = ArrayUtils.bunshin(videoInfo.frame_rect_);
        SingleFaceInfo[] singleFaceInfoArr = videoInfo.facesinfo_;
        if (singleFaceInfoArr != null) {
            videoInfo2.facesinfo_ = new SingleFaceInfo[singleFaceInfoArr.length];
            int i = 0;
            while (true) {
                SingleFaceInfo[] singleFaceInfoArr2 = videoInfo.facesinfo_;
                if (i >= singleFaceInfoArr2.length) {
                    break;
                }
                videoInfo2.facesinfo_[i] = clone(singleFaceInfoArr2[i]);
                i++;
            }
        }
        FaceAttribute[] faceAttributeArr = videoInfo.faces_attributes_;
        if (faceAttributeArr != null) {
            videoInfo2.faces_attributes_ = new FaceAttribute[faceAttributeArr.length];
            for (int i2 = 0; i2 < videoInfo.faces_attributes_.length; i2++) {
                videoInfo2.faces_attributes_[i2] = new FaceAttribute();
                FaceAttribute faceAttribute = videoInfo2.faces_attributes_[i2];
                FaceAttribute faceAttribute2 = videoInfo.faces_attributes_[i2];
                faceAttribute.expression_ = faceAttribute2.expression_;
                faceAttribute.left_eye_close_prob_ = faceAttribute2.left_eye_close_prob_;
                faceAttribute.right_eye_close_prob_ = faceAttribute2.right_eye_close_prob_;
                faceAttribute.skin_threshold_ = ArrayUtils.bunshin(faceAttribute2.skin_threshold_);
                videoInfo2.faces_attributes_[i2].warped_landmarks68_ = ArrayUtils.bunshin(videoInfo.faces_attributes_[i2].warped_landmarks68_);
                videoInfo2.faces_attributes_[i2].warped_landmarks96_ = ArrayUtils.bunshin(videoInfo.faces_attributes_[i2].warped_landmarks96_);
                videoInfo2.faces_attributes_[i2].warped_landmarks104_ = ArrayUtils.bunshin(videoInfo.faces_attributes_[i2].warped_landmarks104_);
                videoInfo2.faces_attributes_[i2].warped_landmarks240_ = ArrayUtils.bunshin(videoInfo.faces_attributes_[i2].warped_landmarks240_);
                videoInfo2.faces_attributes_[i2].warped_landmarks106_ = ArrayUtils.bunshin(videoInfo.faces_attributes_[i2].warped_landmarks106_);
            }
        }
        return videoInfo2;
    }
}
