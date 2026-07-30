package com.momo.mcamera.mask.facewarp;

import com.momocv.SingleFaceInfo;
import com.momocv.beauty.BeautyWarpParams;
import java.lang.reflect.Array;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class MultiFaceWarpFilter extends BaseFaceWarpFilter {
    private float[][] eulerAngles;
    private float[][] landmarks;
    private float warpLevel1;
    private float[] warpLevel1Array;
    private float warpLevel2;
    private float[] warpLevel2Array;

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
        if (this.warpLevel1Array == null) {
            this.warpLevel1Array = new float[1];
        }
        if (this.warpLevel2Array == null) {
            this.warpLevel2Array = new float[1];
        }
        float[][] fArr = this.landmarks;
        Class cls = Float.TYPE;
        if (fArr == null) {
            this.landmarks = (float[][]) Array.newInstance((Class<?>) cls, 1, singleFaceInfo.orig_landmarks_104_.length);
        }
        if (this.eulerAngles == null) {
            this.eulerAngles = (float[][]) Array.newInstance((Class<?>) cls, 1, singleFaceInfo.euler_angles_.length);
        }
        float[] fArr2 = this.warpLevel1Array;
        fArr2[0] = this.warpLevel1;
        float[] fArr3 = this.warpLevel2Array;
        fArr3[0] = this.warpLevel2;
        float[][] fArr4 = this.landmarks;
        fArr4[0] = singleFaceInfo.orig_landmarks_104_;
        float[][] fArr5 = this.eulerAngles;
        fArr5[0] = singleFaceInfo.euler_angles_;
        beautyWarpParams.warp_level1_ = fArr2;
        beautyWarpParams.warp_level2_ = fArr3;
        beautyWarpParams.landmarks104_ = fArr4;
        beautyWarpParams.euler_angle_ = fArr5;
        return beautyWarpParams;
    }

    @Override // com.momo.mcamera.mask.facewarp.IFaceWarp
    public void changeFaceBeautyValue(String str, float f) {
        if (FaceBeautyID.THIN_FACE.equals(str)) {
            this.warpLevel1 = f;
        } else if (FaceBeautyID.BIG_EYE.equals(str)) {
            this.warpLevel2 = f;
        }
    }

    @Override // com.momo.mcamera.mask.facewarp.BaseFaceWarpFilter
    public int getDefaultWarpType() {
        return 9;
    }

    @Override // com.momo.mcamera.mask.facewarp.BaseFaceWarpFilter
    public boolean notWarp() {
        pjw pjwVar;
        return this.warpType == 0 || (pjwVar = this.mmcvInfo) == null || pjwVar.m169950n() == 0;
    }
}
