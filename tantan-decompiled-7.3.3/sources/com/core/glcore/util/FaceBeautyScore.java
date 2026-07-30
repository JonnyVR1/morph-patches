package com.core.glcore.util;

import android.text.TextUtils;
import android.util.Log;
import com.momocv.SingleFaceInfo;
import com.momocv.beautyscore.BeautyScore;
import com.momocv.beautyscore.BeautyScoreInfo;
import com.momocv.beautyscore.BeautyScoreParams;
import com.momocv.videoprocessor.VideoInfo;
import p153l.omw;
import p153l.umw;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
public class FaceBeautyScore {
    private static final String TAG = "com.core.glcore.util.FaceBeautyScore";
    private BeautyScore mBeautyScore;
    private BeautyScoreInfo mBeautyScoreInfo;
    private BeautyScoreParams mBeautyScoreParams;
    private float maxValidDegree = 15.0f;

    public FaceBeautyScore() {
        BeautyScore beautyScore = new BeautyScore();
        this.mBeautyScore = beautyScore;
        beautyScore.Create();
        this.mBeautyScoreParams = new BeautyScoreParams();
        this.mBeautyScoreInfo = new BeautyScoreInfo();
    }

    private boolean isValid(omw omwVar, float f) {
        SingleFaceInfo[] singleFaceInfoArr;
        float[] fArr;
        VideoInfo videoInfoM168304s = omwVar.m168304s();
        if (videoInfoM168304s == null || (singleFaceInfoArr = videoInfoM168304s.facesinfo_) == null || singleFaceInfoArr.length <= 0) {
            Log.e(TAG, "facesinfo_ is null");
        } else {
            SingleFaceInfo singleFaceInfo = singleFaceInfoArr[0];
            if (singleFaceInfo != null && (fArr = singleFaceInfo.euler_angles_) != null && Math.abs(fArr[0]) <= f && Math.abs(singleFaceInfo.euler_angles_[1]) <= f) {
                return true;
            }
        }
        return false;
    }

    public float calculateImageFaceBeautyScore(umw umwVar, omw omwVar, int i) {
        if (!isValid(omwVar, this.maxValidDegree)) {
            return -1.0f;
        }
        BeautyScoreParams beautyScoreParams = this.mBeautyScoreParams;
        beautyScoreParams.rotate_degree_ = i;
        beautyScoreParams.restore_degree_ = 0;
        beautyScoreParams.fliped_show_ = false;
        beautyScoreParams.coord_96pt_ = omwVar.m168304s().facesinfo_[0].orig_landmarks_96_;
        if (this.mBeautyScore.ProcessFrame(umwVar.m196796b(), this.mBeautyScoreParams, this.mBeautyScoreInfo)) {
            return this.mBeautyScoreInfo.beauty_score;
        }
        return -1.0f;
    }

    public boolean loadBeautyScoreModel(String str) {
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("beautyScoreModelPath 是空的！");
            return false;
        }
        BeautyScore beautyScore = this.mBeautyScore;
        if (beautyScore != null) {
            return beautyScore.LoadModel(str);
        }
        wg3.m206174a("beautyScoreModelPath 已经被销毁！");
        return false;
    }

    public void release() {
        BeautyScore beautyScore = this.mBeautyScore;
        if (beautyScore != null) {
            beautyScore.Release();
        }
        this.mBeautyScore = null;
    }

    public void setMaxValidDegree(float f) {
        if (f < 0.0f || f >= 90.0f) {
            return;
        }
        this.maxValidDegree = f;
    }
}
