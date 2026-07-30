package com.momo.mcamera.mask.facewarp;

import android.graphics.PointF;
import android.text.TextUtils;
import com.momocv.SingleFaceInfo;
import com.momocv.beauty.BeautyWarpInfo;
import com.momocv.beauty.BeautyWarpParams;
import com.momocv.beauty.XCameraWarpLevelParams;
import com.momocv.videoprocessor.FaceAttribute;
import java.lang.reflect.Array;
import java.util.HashMap;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.omw;
import p153l.tuf;

/* JADX INFO: loaded from: classes8.dex */
public class FaceWarpProcessor {
    private float[][] eulerAngles;
    private float[][] landmarks;
    private float[][] landmarks106;
    private float[][] landmarks222;
    private float[][] landmarks240;
    private float warpLevel1;
    private float warpLevel2;
    protected BeautyWarpParams warpParams = new BeautyWarpParams();
    private XCameraWarpLevelParams warpLevelParams = new XCameraWarpLevelParams();
    private final XCameraWarpLevelParams[] originWarpParams = {new XCameraWarpLevelParams()};
    private int warpType = 9;
    private final HashMap<Integer, XCameraWarpLevelParams> warpParamMap = new HashMap<>();
    protected BeautyWarpInfo warpInfo = new BeautyWarpInfo();
    private XCameraWarpLevelParams[] xCameraWarpParams = new XCameraWarpLevelParams[1];
    private float[] warpLevel1Array = new float[1];
    private float[] warpLevel2Array = new float[1];

    private BeautyWarpParams buildParams(omw omwVar, SingleFaceInfo[] singleFaceInfoArr) {
        BeautyWarpParams beautyWarpParams = this.warpParams;
        int i = omwVar.f148018e;
        beautyWarpParams.image_width_ = i;
        int i2 = omwVar.f148019f;
        beautyWarpParams.image_height_ = i2;
        float f = beautyWarpParams.scale_factor_;
        if (f > 0.0f) {
            beautyWarpParams.image_width_ = (int) (i * f);
            beautyWarpParams.image_height_ = (int) (i2 * f);
        }
        beautyWarpParams.is_stable_ = true;
        beautyWarpParams.multifaces_switch_ = true;
        beautyWarpParams.fliped_show_ = omwVar.f148014a;
        beautyWarpParams.restore_degree_ = omwVar.f148016c;
        beautyWarpParams.rotate_degree_ = omwVar.f148015b;
        beautyWarpParams.face_warp_gradual_switch_ = true;
        beautyWarpParams.warp_type_ = this.warpType;
        float[][] fArr = this.landmarks;
        Class cls = Float.TYPE;
        if (fArr == null || fArr.length != singleFaceInfoArr.length) {
            this.landmarks = (float[][]) Array.newInstance((Class<?>) cls, singleFaceInfoArr.length, singleFaceInfoArr[0].orig_landmarks_104_.length);
        }
        int i3 = this.warpType;
        if (i3 == 103) {
            float[][] fArr2 = this.landmarks240;
            if (fArr2 == null || fArr2.length != singleFaceInfoArr.length) {
                this.landmarks240 = (float[][]) Array.newInstance((Class<?>) cls, singleFaceInfoArr.length, singleFaceInfoArr[0].orig_landmarks_240_.length);
            }
        } else if (i3 == 104) {
            float[][] fArr3 = this.landmarks106;
            if (fArr3 == null || fArr3.length != singleFaceInfoArr.length) {
                this.landmarks106 = (float[][]) Array.newInstance((Class<?>) cls, singleFaceInfoArr.length, singleFaceInfoArr[0].orig_landmarks_106_.length);
            }
            float[][] fArr4 = this.landmarks222;
            if (fArr4 == null || fArr4.length != singleFaceInfoArr.length) {
                this.landmarks222 = (float[][]) Array.newInstance((Class<?>) cls, singleFaceInfoArr.length, singleFaceInfoArr[0].landmarks_222_.length);
            }
        }
        float[][] fArr5 = this.eulerAngles;
        if (fArr5 == null || fArr5.length != singleFaceInfoArr.length) {
            this.eulerAngles = (float[][]) Array.newInstance((Class<?>) cls, singleFaceInfoArr.length, singleFaceInfoArr[0].euler_angles_.length);
        }
        chooseWarpParams(beautyWarpParams, singleFaceInfoArr);
        beautyWarpParams.landmarks104_ = this.landmarks;
        int i4 = this.warpType;
        if (i4 == 103) {
            beautyWarpParams.landmarks240_ = this.landmarks240;
        } else if (i4 == 104) {
            beautyWarpParams.landmarks106_ = this.landmarks106;
            beautyWarpParams.landmarks222_ = this.landmarks222;
        }
        beautyWarpParams.euler_angle_ = this.eulerAngles;
        omwVar.m168285B(beautyWarpParams);
        int[] iArr = beautyWarpParams.crop_rect;
        if (iArr != null) {
            beautyWarpParams.image_width_ = iArr[2];
            beautyWarpParams.image_height_ = iArr[3];
        }
        return beautyWarpParams;
    }

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
            case -909026571:
                if (str.equals(FaceBeautyID.EYE_HEIGHT)) {
                    b = 4;
                }
                break;
            case -703956925:
                if (str.equals(FaceBeautyID.THIN_FACE)) {
                    b = 5;
                }
                break;
            case -661836207:
                if (str.equals(FaceBeautyID.CHEEKBONE_WIDTH)) {
                    b = 6;
                }
                break;
            case -524346813:
                if (str.equals(FaceBeautyID.EYE_DISTANCE)) {
                    b = 7;
                }
                break;
            case -114837902:
                if (str.equals(FaceBeautyID.BIG_EYE)) {
                    b = 8;
                }
                break;
            case 5190850:
                if (str.equals(FaceBeautyID.JAW_SHAPE)) {
                    b = 9;
                }
                break;
            case 8917735:
                if (str.equals(FaceBeautyID.JAW_WIDTH)) {
                    b = 10;
                }
                break;
            case 202065094:
                if (str.equals(FaceBeautyID.NOSE_RIDGE_WIDTH)) {
                    b = 11;
                }
                break;
            case 466885788:
                if (str.equals(FaceBeautyID.FOREHEAD)) {
                    b = 12;
                }
                break;
            case 893232119:
                if (str.equals(FaceBeautyID.NOSE_LIFT)) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 893441261:
                if (str.equals(FaceBeautyID.NOSE_SIZE)) {
                    b = 14;
                }
                break;
            case 922053988:
                if (str.equals(FaceBeautyID.FACE_WIDTH)) {
                    b = 15;
                }
                break;
            case 1449441480:
                if (str.equals(FaceBeautyID.LIP_THICKNESS)) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 1930548826:
                if (str.equals(FaceBeautyID.NOSE_WIDTH)) {
                    b = 17;
                }
                break;
            case 1981169785:
                if (str.equals(FaceBeautyID.MOUTH_SIZE)) {
                    b = 18;
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
                this.warpLevelParams.eye_height_ = f;
                break;
            case 5:
                this.warpLevelParams.mm_thin_face_ = f;
                break;
            case 6:
                this.warpLevelParams.cheekbone_width_ = f;
                break;
            case 7:
                this.warpLevelParams.eye_distance_ = f;
                break;
            case 8:
                this.warpLevelParams.eye_size_ = f;
                break;
            case 9:
                this.warpLevelParams.chin_width_ = f;
                break;
            case 10:
                this.warpLevelParams.jaw_width_ = f;
                break;
            case 11:
                this.warpLevelParams.nose_ridge_width_ = f;
                break;
            case 12:
                this.warpLevelParams.forehead_ud_ = f;
                break;
            case 13:
                this.warpLevelParams.nose_lift_ = f;
                break;
            case 14:
                this.warpLevelParams.nose_size_ = f;
                break;
            case 15:
                this.warpLevelParams.face_width_ = f;
                break;
            case 16:
                this.warpLevelParams.lip_thickness_ = f;
                break;
            case 17:
                this.warpLevelParams.nose_width_ = f;
                break;
            case 18:
                this.warpLevelParams.lip_size_ = f;
                break;
        }
    }

    private void chooseWarpParams(BeautyWarpParams beautyWarpParams, SingleFaceInfo[] singleFaceInfoArr) {
        for (int i = 0; i < singleFaceInfoArr.length; i++) {
            try {
                int i2 = this.warpType;
                if (i2 == 10) {
                    this.xCameraWarpParams[i] = this.warpLevelParams;
                    this.landmarks[i] = transformLandMark104Points(singleFaceInfoArr[i].orig_landmarks_104_);
                    beautyWarpParams.warp_level_group_ = this.xCameraWarpParams;
                } else if (i2 == 103) {
                    XCameraWarpLevelParams[] xCameraWarpLevelParamsArr = this.xCameraWarpParams;
                    xCameraWarpLevelParamsArr[i] = this.warpLevelParams;
                    this.landmarks[i] = singleFaceInfoArr[i].orig_landmarks_104_;
                    this.landmarks240[i] = singleFaceInfoArr[i].landmarks_240_;
                    float[] fArr = this.warpLevel1Array;
                    fArr[i] = this.warpLevel1;
                    float[] fArr2 = this.warpLevel2Array;
                    fArr2[i] = this.warpLevel2;
                    beautyWarpParams.warp_level1_ = fArr;
                    beautyWarpParams.warp_level2_ = fArr2;
                    beautyWarpParams.warp_level_group_ = xCameraWarpLevelParamsArr;
                } else if (i2 == 104) {
                    XCameraWarpLevelParams[] xCameraWarpLevelParamsArr2 = this.xCameraWarpParams;
                    xCameraWarpLevelParamsArr2[i] = this.warpLevelParams;
                    this.landmarks[i] = singleFaceInfoArr[i].orig_landmarks_104_;
                    this.landmarks106[i] = singleFaceInfoArr[i].landmarks_106_;
                    this.landmarks222[i] = singleFaceInfoArr[i].landmarks_222_;
                    float[] fArr3 = this.warpLevel1Array;
                    fArr3[i] = this.warpLevel1;
                    float[] fArr4 = this.warpLevel2Array;
                    fArr4[i] = this.warpLevel2;
                    beautyWarpParams.warp_level1_ = fArr3;
                    beautyWarpParams.warp_level2_ = fArr4;
                    beautyWarpParams.warp_level_group_ = xCameraWarpLevelParamsArr2;
                } else {
                    this.landmarks[i] = singleFaceInfoArr[i].orig_landmarks_104_;
                    float[] fArr5 = this.warpLevel1Array;
                    fArr5[i] = this.warpLevel1;
                    float[] fArr6 = this.warpLevel2Array;
                    fArr6[i] = this.warpLevel2;
                    beautyWarpParams.warp_level1_ = fArr5;
                    beautyWarpParams.warp_level2_ = fArr6;
                    beautyWarpParams.warp_level_group_ = this.originWarpParams;
                }
                this.eulerAngles[i] = singleFaceInfoArr[i].euler_angles_;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private XCameraWarpLevelParams getParamsInCache(int i) {
        if (!this.warpParamMap.containsKey(Integer.valueOf(i))) {
            this.warpParamMap.put(Integer.valueOf(i), new XCameraWarpLevelParams());
        }
        return this.warpParamMap.get(Integer.valueOf(i));
    }

    private synchronized void processSingleWarpPoint(omw omwVar, SingleFaceInfo[] singleFaceInfoArr, FaceAttribute[] faceAttributeArr) {
        float[] fArr;
        float[] fArr2;
        try {
            BeautyWarpParams beautyWarpParamsBuildParams = buildParams(omwVar, singleFaceInfoArr);
            int i = this.warpType;
            if (i == 103 || i == 104) {
                beautyWarpParamsBuildParams.face_warp_gradual_switch_ = false;
                XCameraWarpLevelParams[] xCameraWarpLevelParamsArr = beautyWarpParamsBuildParams.warp_level_group_;
                if (xCameraWarpLevelParamsArr != null) {
                    for (XCameraWarpLevelParams xCameraWarpLevelParams : xCameraWarpLevelParamsArr) {
                        xCameraWarpLevelParams.thinface_euler_switch_ = true;
                    }
                }
            }
            BeautyWarpInfo beautyWarpInfo = this.warpInfo;
            beautyWarpInfo.src_warp_points_ = null;
            beautyWarpInfo.dst_warp_points_ = null;
            if (tuf.m192743a().m192744b(beautyWarpParamsBuildParams, this.warpInfo)) {
                BeautyWarpInfo beautyWarpInfo2 = this.warpInfo;
                float[][] fArr3 = beautyWarpInfo2.all_src_warp_points_;
                if (fArr3 != null || beautyWarpInfo2.all_dst_warp_points_ != null || (fArr = beautyWarpInfo2.src_warp_points_) == null || (fArr2 = beautyWarpInfo2.dst_warp_points_) == null) {
                    omwVar.f148030q = fArr3;
                    omwVar.f148031r = beautyWarpInfo2.all_dst_warp_points_;
                } else {
                    int[] iArr = {1, fArr.length};
                    Class cls = Float.TYPE;
                    omwVar.f148030q = (float[][]) Array.newInstance((Class<?>) cls, iArr);
                    float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, 1, fArr2.length);
                    omwVar.f148031r = fArr4;
                    omwVar.f148030q[0] = fArr;
                    fArr4[0] = fArr2;
                }
                omwVar.f148037x = this.warpInfo.liquefy_info;
                setLandmarks(singleFaceInfoArr, faceAttributeArr);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void setLandmarks(SingleFaceInfo[] singleFaceInfoArr, FaceAttribute[] faceAttributeArr) {
        for (int i = 0; i < faceAttributeArr.length; i++) {
            BeautyWarpInfo beautyWarpInfo = this.warpInfo;
            float[][] fArr = beautyWarpInfo.warped_landmarks68_;
            if (fArr != null) {
                SingleFaceInfo singleFaceInfo = singleFaceInfoArr[i];
                float[] fArr2 = fArr[i];
                singleFaceInfo.landmarks_68_ = fArr2;
                faceAttributeArr[i].warped_landmarks68_ = fArr2;
            }
            float[][] fArr3 = beautyWarpInfo.warped_landmarks96_;
            if (fArr3 != null) {
                SingleFaceInfo singleFaceInfo2 = singleFaceInfoArr[i];
                float[] fArr4 = fArr3[i];
                singleFaceInfo2.landmarks_96_ = fArr4;
                faceAttributeArr[i].warped_landmarks96_ = fArr4;
            }
            float[][] fArr5 = beautyWarpInfo.warped_landmarks104_;
            if (fArr5 != null) {
                SingleFaceInfo singleFaceInfo3 = singleFaceInfoArr[i];
                float[] fArr6 = fArr5[i];
                singleFaceInfo3.landmarks_104_ = fArr6;
                faceAttributeArr[i].warped_landmarks104_ = fArr6;
            }
            float[][] fArr7 = beautyWarpInfo.warped_landmarks240_;
            if (fArr7 != null) {
                SingleFaceInfo singleFaceInfo4 = singleFaceInfoArr[i];
                float[] fArr8 = fArr7[i];
                singleFaceInfo4.landmarks_240_ = fArr8;
                faceAttributeArr[i].warped_landmarks240_ = fArr8;
            }
            float[][] fArr9 = beautyWarpInfo.warped_landmarks106_;
            if (fArr9 != null) {
                SingleFaceInfo singleFaceInfo5 = singleFaceInfoArr[i];
                float[] fArr10 = fArr9[i];
                singleFaceInfo5.landmarks_106_ = fArr10;
                faceAttributeArr[i].warped_landmarks106_ = fArr10;
            }
        }
    }

    private float[] transformLandMark104Points(float[] fArr) {
        float f;
        float f2;
        if (fArr != null && fArr.length != 0) {
            PointF pointF = new PointF(fArr[0], fArr[104]);
            PointF pointF2 = new PointF(fArr[18], fArr[122]);
            PointF pointF3 = new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
            for (int i = 0; i < 18; i++) {
                int i2 = i + 104;
                PointF pointF4 = new PointF(fArr[i], fArr[i2]);
                if (i < 9) {
                    f2 = i;
                } else {
                    if (i > 9) {
                        f2 = 18.0f - i;
                    } else {
                        f = 1.0f;
                    }
                    float f3 = 1.0f - f;
                    fArr[i] = (pointF3.x * f3) + (pointF4.x * f);
                    fArr[i2] = (f3 * pointF3.y) + (f * pointF4.y);
                }
                f = ((1.0f - (f2 / 8.0f)) * 0.12f) + 1.0f;
                float f4 = 1.0f - f;
                fArr[i] = (pointF3.x * f4) + (pointF4.x * f);
                fArr[i2] = (f4 * pointF3.y) + (f * pointF4.y);
            }
        }
        return fArr;
    }

    public synchronized void clearFaceWarpMapParams() {
        HashMap<String, Float> map = this.warpLevelParams.params;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public void loadWrapConfig(String str) {
        tuf.m192743a().m192745c(str);
    }

    public void process(omw omwVar) {
        if (omwVar == null || omwVar.m168299n() <= 0) {
            return;
        }
        XCameraWarpLevelParams[] xCameraWarpLevelParamsArr = this.xCameraWarpParams;
        if (xCameraWarpLevelParamsArr == null || xCameraWarpLevelParamsArr.length < omwVar.m168299n()) {
            this.xCameraWarpParams = new XCameraWarpLevelParams[omwVar.m168299n()];
            this.warpLevel1Array = new float[omwVar.m168299n()];
            this.warpLevel2Array = new float[omwVar.m168299n()];
        }
        SingleFaceInfo[] singleFaceInfoArr = omwVar.m168304s().facesinfo_;
        FaceAttribute[] faceAttributeArr = omwVar.m168304s().faces_attributes_;
        if (this.warpType == 10) {
            SingleFaceInfo[] singleFaceInfoArr2 = {omwVar.m168304s().facesinfo_[0]};
            FaceAttribute[] faceAttributeArr2 = {omwVar.m168304s().faces_attributes_[0]};
            this.xCameraWarpParams = new XCameraWarpLevelParams[1];
            this.warpLevel1Array = new float[1];
            this.warpLevel2Array = new float[1];
            singleFaceInfoArr = singleFaceInfoArr2;
            faceAttributeArr = faceAttributeArr2;
        }
        processSingleWarpPoint(omwVar, singleFaceInfoArr, faceAttributeArr);
    }

    public void release() {
        tuf.m192743a().m192746d();
        this.warpParamMap.clear();
    }

    public void setFaceBeautyValue(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i = this.warpType;
        if (i == 10 || i == 103 || i == 104) {
            changeCameraXValue(str, f);
        } else {
            changeBeautyValue(str, f);
        }
    }

    public synchronized void setMapParams(String str, float f) {
        try {
            XCameraWarpLevelParams xCameraWarpLevelParams = this.warpLevelParams;
            if (xCameraWarpLevelParams.params == null) {
                xCameraWarpLevelParams.params = new HashMap<>();
            }
            this.warpLevelParams.params.put(str, Float.valueOf(f));
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setScaleFactor(float f) {
        this.warpParams.scale_factor_ = f;
    }

    public void setWarpType(int i) {
        this.warpType = i;
        if (this.warpParamMap.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.warpParamMap.put(Integer.valueOf(i), new XCameraWarpLevelParams());
    }
}
