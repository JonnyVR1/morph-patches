package com.effectsar.labcv.licenselibrary;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public interface EffectsSDKLicenseInterface {

    public enum LICENSE_FUNCTION_NAME {
        EFFECT(0),
        FACE(1),
        C1(2),
        C2(3),
        CAR_DETECT(4),
        FACE_ATTR(5),
        FACE_CLUSTERING(6),
        FACE_VERIFY(7),
        GAZE_ESTIMATION(8),
        HAIR_PARSE(9),
        HAND_DETECT(10),
        HEAD_SEG(11),
        LIGHT_CLS(12),
        SKENETON(13),
        AVATAR_DRIVE(14),
        ACTION_RECOGNETION(15),
        SKY_SEG(16),
        VIDEO_CLS(17),
        STUDENT_ID_OCR(18),
        HUMAN_DISTANCE(19),
        PET_FACE(20),
        PORTRAIT_MATTING(21),
        ADAPTIVE_SHARPEN(22),
        VFI(23),
        ONEKEY_ENHANCE_STR(24),
        LENS_VIDA(25),
        TAINT_DETECT(26),
        SKELETON_3D(27),
        SALIENCY_MATTING(28),
        VIDEO_DEFLICKER(29),
        VIDEO_SR(30),
        NIGHT_SCENE(31),
        PHOTO_NIGHT_SCENE(32),
        DYNAMIC_GESTURE(33),
        LICENSE_CAKE(34),
        BACH_SKELETON(35),
        CHROMA_KEYING(36),
        SKIN_SEGMENTATION(37),
        SLAM(38),
        FACEFITTING(39),
        CINE_MOVE(40),
        AVABOOST(41),
        OBJECT_TRACKING_STR(42),
        VIDEO_HDR_LITE(43),
        VIDEO_STAB(44);

        private int value;

        LICENSE_FUNCTION_NAME(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    void clearParams();

    int getLicenseWithParams(HashMap<String, String> map, boolean z, LicenseCallback licenseCallback);

    String getParam(String str);

    void registerHttpProvider(HttpRequestProvider httpRequestProvider);

    void setParam(String str, String str2);

    int updateLicenseWithParams(HashMap<String, String> map, boolean z, LicenseCallback licenseCallback);
}
