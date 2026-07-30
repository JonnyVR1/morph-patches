package com.momocv.beauty;

import com.momocv.BaseParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class BeautyWarpParams extends BaseParams {
    public float[][] euler_angle_;
    public float[][] landmarks104_;
    public float[][] landmarks106_;
    public float[][] landmarks222_;
    public float[][] landmarks240_;
    public float[] warp_level1_;
    public float[] warp_level2_;
    public XCameraWarpLevelParams[] warp_level_group_;
    public int image_width_ = 0;
    public int image_height_ = 0;
    public boolean is_stable_ = true;
    public int warp_type_ = 0;
    public boolean multifaces_switch_ = false;
    public boolean face_warp_gradual_switch_ = false;
    public int face_warp_gradual_thresh_ = 10;

    public class WarpType {
        public static final int AWL_FACE_BIG_EYE = 3;
        public static final int BIG_HEAD = 4;
        public static final int FAT_FACE_FAT_LIP = 14;
        public static final int FAT_FACE_SMALL_CHIN = 15;
        public static final int NEW_BIG_HEAD = 13;
        public static final int NONE = 0;
        public static final int PEAR_FACE_SMALL_EYE_BIG_MOUTH = 8;
        public static final int PTS240_END = 200;
        public static final int PTS240_START = 101;
        public static final int RECTANGLE_FACE_SMALL_FEATURE = 7;
        public static final int ROUND_FACE = 12;
        public static final int SHORT_FACE_BIG_EYE = 2;
        public static final int SLIGHT_BEAUTY = 16;
        public static final int SMALL_FACE_BIG_EYE = 6;
        public static final int THIN_FACE_BIG_EYE = 1;
        public static final int THIN_FACE_BIG_EYE1 = 9;
        public static final int THIN_FACE_BIG_EYE2 = 11;
        public static final int THIN_FACE_BIG_EYE_PTS240 = 101;
        public static final int TINY_FACE_BIG_EYE = 5;
        public static final int XCAMERA = 10;
        public static final int XCAMERA_END = 100;
        public static final int XCAMERA_PTS106_VER1 = 104;
        public static final int XCAMERA_PTS240 = 102;
        public static final int XCAMERA_PTS240_VER1 = 103;

        public WarpType() {
        }
    }
}
