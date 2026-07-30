package com.momo.mcamera.mask.facewarp;

import android.text.TextUtils;
import com.momo.mcamera.util.ImageProcessUtil;
import com.momocv.SingleFaceInfo;
import com.momocv.beauty.BeautyWarpParams;
import com.momocv.beauty.XCameraWarpLevelParams;
import java.lang.reflect.Array;
import org.eclipse.jetty.http.HttpTokens;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class BeautyFaceWarpFilter extends BaseFaceWarpFilter {
    private float[][] eulerAngles;
    private float[][] landmarks;
    private float warpLevel1;
    private float warpLevel2;
    private final XCameraWarpLevelParams[] originWarpParams = {new XCameraWarpLevelParams()};
    private XCameraWarpLevelParams warpLevelParams = new XCameraWarpLevelParams();
    private boolean enableWarp = false;
    private XCameraWarpLevelParams[] xCameraWarpParams = new XCameraWarpLevelParams[1];
    private float[] warpLevel1Array = new float[1];
    private float[] warpLevel2Array = new float[1];

    private void changeBeautyValue(String str, float f) {
        if (FaceBeautyID.THIN_FACE.equals(str)) {
            this.warpLevel1 = f;
        } else if (FaceBeautyID.BIG_EYE.equals(str)) {
            this.warpLevel2 = f;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void changeCameraXValue(String str, float f) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1778074569:
                if (str.equals(FaceBeautyID.SHORTEN_FACE)) {
                    b = 0;
                }
                break;
            case -1535860719:
                if (str.equals(FaceBeautyID.NOSE_TIP_SIZE)) {
                    b = 1;
                }
                break;
            case -1533535109:
                if (str.equals(FaceBeautyID.CHIN_LENGTH)) {
                    b = 2;
                }
                break;
            case -1368180725:
                if (str.equals(FaceBeautyID.EYE_TILT)) {
                    b = 3;
                }
                break;
            case -703956925:
                if (str.equals(FaceBeautyID.THIN_FACE)) {
                    b = 4;
                }
                break;
            case -524346813:
                if (str.equals(FaceBeautyID.EYE_DISTANCE)) {
                    b = 5;
                }
                break;
            case -114837902:
                if (str.equals(FaceBeautyID.BIG_EYE)) {
                    b = 6;
                }
                break;
            case 5190850:
                if (str.equals(FaceBeautyID.JAW_SHAPE)) {
                    b = 7;
                }
                break;
            case 202065094:
                if (str.equals(FaceBeautyID.NOSE_RIDGE_WIDTH)) {
                    b = 8;
                }
                break;
            case 466885788:
                if (str.equals(FaceBeautyID.FOREHEAD)) {
                    b = 9;
                }
                break;
            case 893232119:
                if (str.equals(FaceBeautyID.NOSE_LIFT)) {
                    b = 10;
                }
                break;
            case 893441261:
                if (str.equals(FaceBeautyID.NOSE_SIZE)) {
                    b = 11;
                }
                break;
            case 922053988:
                if (str.equals(FaceBeautyID.FACE_WIDTH)) {
                    b = 12;
                }
                break;
            case 1449441480:
                if (str.equals(FaceBeautyID.LIP_THICKNESS)) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1930548826:
                if (str.equals(FaceBeautyID.NOSE_WIDTH)) {
                    b = 14;
                }
                break;
            case 1981169785:
                if (str.equals(FaceBeautyID.MOUTH_SIZE)) {
                    b = 15;
                }
                break;
        }
        switch (b) {
            case 0:
                this.warpLevelParams.short_face_ = f;
                break;
            case 1:
                this.warpLevelParams.nose_tip_size_ = f;
                break;
            case 2:
                this.warpLevelParams.chin_length_ = f;
                break;
            case 3:
                this.warpLevelParams.eye_tilt_ratio_ = f;
                break;
            case 4:
                this.warpLevelParams.mm_thin_face_ = f;
                break;
            case 5:
                this.warpLevelParams.eye_distance_ = f;
                break;
            case 6:
                this.warpLevelParams.eye_size_ = f;
                break;
            case 7:
                this.warpLevelParams.chin_width_ = f;
                break;
            case 8:
                this.warpLevelParams.nose_ridge_width_ = f;
                break;
            case 9:
                this.warpLevelParams.forehead_ud_ = f;
                break;
            case 10:
                this.warpLevelParams.nose_lift_ = f;
                break;
            case 11:
                this.warpLevelParams.nose_size_ = f;
                break;
            case 12:
                this.warpLevelParams.face_width_ = f;
                break;
            case 13:
                this.warpLevelParams.lip_thickness_ = f;
                break;
            case 14:
                this.warpLevelParams.nose_width_ = f;
                break;
            case 15:
                this.warpLevelParams.lip_size_ = f;
                break;
        }
    }

    private void chooseWarpParams(BeautyWarpParams beautyWarpParams, SingleFaceInfo singleFaceInfo) {
        if (this.warpType == 10) {
            this.xCameraWarpParams[0] = this.warpLevelParams;
            ImageProcessUtil.transformLandMark104Points(this.landmarks[0], singleFaceInfo.orig_landmarks_104_);
            beautyWarpParams.warp_level_group_ = this.xCameraWarpParams;
            return;
        }
        this.landmarks[0] = singleFaceInfo.orig_landmarks_104_;
        float[] fArr = this.warpLevel1Array;
        fArr[0] = this.warpLevel1;
        float[] fArr2 = this.warpLevel2Array;
        fArr2[0] = this.warpLevel2;
        beautyWarpParams.warp_level1_ = fArr;
        beautyWarpParams.warp_level2_ = fArr2;
        beautyWarpParams.warp_level_group_ = this.originWarpParams;
    }

    @Override // com.momo.mcamera.mask.facewarp.BaseFaceWarpFilter
    public BeautyWarpParams buildParams(pjw pjwVar, SingleFaceInfo singleFaceInfo) {
        BeautyWarpParams beautyWarpParams = this.warpParams;
        int i = pjwVar.f149898e;
        beautyWarpParams.image_width_ = i;
        int i2 = pjwVar.f149899f;
        beautyWarpParams.image_height_ = i2;
        float f = beautyWarpParams.scale_factor_;
        if (f > 0.0f) {
            beautyWarpParams.image_width_ = (int) (i * f);
            beautyWarpParams.image_height_ = (int) (i2 * f);
        }
        beautyWarpParams.is_stable_ = true;
        beautyWarpParams.multifaces_switch_ = true;
        beautyWarpParams.fliped_show_ = pjwVar.f149894a;
        beautyWarpParams.restore_degree_ = pjwVar.f149896c;
        beautyWarpParams.rotate_degree_ = pjwVar.f149895b;
        beautyWarpParams.face_warp_gradual_switch_ = true;
        beautyWarpParams.warp_type_ = this.warpType;
        float[][] fArr = this.landmarks;
        Class cls = Float.TYPE;
        if (fArr == null) {
            this.landmarks = (float[][]) Array.newInstance((Class<?>) cls, 1, singleFaceInfo.orig_landmarks_104_.length);
        }
        if (this.eulerAngles == null) {
            this.eulerAngles = (float[][]) Array.newInstance((Class<?>) cls, 1, singleFaceInfo.euler_angles_.length);
        }
        chooseWarpParams(beautyWarpParams, singleFaceInfo);
        float[][] fArr2 = this.eulerAngles;
        fArr2[0] = singleFaceInfo.euler_angles_;
        beautyWarpParams.landmarks104_ = this.landmarks;
        beautyWarpParams.euler_angle_ = fArr2;
        return beautyWarpParams;
    }

    @Override // com.momo.mcamera.mask.facewarp.IFaceWarp
    public void changeFaceBeautyValue(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.warpType == 10) {
            changeCameraXValue(str, f);
        } else {
            changeBeautyValue(str, f);
        }
    }

    @Override // com.momo.mcamera.mask.facewarp.BaseFaceWarpFilter
    public int getDefaultWarpType() {
        return 9;
    }

    public boolean isWarpFailed() {
        return this.enableWarp && this.isWarpFailed;
    }

    @Override // com.momo.mcamera.mask.facewarp.BaseFaceWarpFilter
    public boolean notWarp() {
        pjw pjwVar;
        return !this.enableWarp || (pjwVar = this.mmcvInfo) == null || pjwVar.m169950n() == 0;
    }

    public void setEnableWarp(boolean z) {
        this.enableWarp = z;
        this.isWarpFailed = false;
    }
}
