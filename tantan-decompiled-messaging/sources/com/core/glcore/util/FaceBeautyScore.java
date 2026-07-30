package com.core.glcore.util;

import android.text.TextUtils;
import android.util.Log;
import com.momocv.SingleFaceInfo;
import com.momocv.beautyscore.BeautyScore;
import com.momocv.beautyscore.BeautyScoreInfo;
import com.momocv.beautyscore.BeautyScoreParams;
import com.momocv.videoprocessor.VideoInfo;
import p149l.ig3;
import p149l.pjw;
import p149l.vjw;

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

    private boolean isValid(pjw pjwVar, float f) {
        SingleFaceInfo[] singleFaceInfoArr;
        float[] fArr;
        VideoInfo videoInfoM169955s = pjwVar.m169955s();
        if (videoInfoM169955s == null || (singleFaceInfoArr = videoInfoM169955s.facesinfo_) == null || singleFaceInfoArr.length <= 0) {
            Log.e(TAG, "facesinfo_ is null");
        } else {
            SingleFaceInfo singleFaceInfo = singleFaceInfoArr[0];
            if (singleFaceInfo != null && (fArr = singleFaceInfo.euler_angles_) != null && Math.abs(fArr[0]) <= f && Math.abs(singleFaceInfo.euler_angles_[1]) <= f) {
                return true;
            }
        }
        return false;
    }

    public float calculateImageFaceBeautyScore(vjw vjwVar, pjw pjwVar, int i) {
        if (!isValid(pjwVar, this.maxValidDegree)) {
            return -1.0f;
        }
        BeautyScoreParams beautyScoreParams = this.mBeautyScoreParams;
        beautyScoreParams.rotate_degree_ = i;
        beautyScoreParams.restore_degree_ = 0;
        beautyScoreParams.fliped_show_ = false;
        beautyScoreParams.coord_96pt_ = pjwVar.m169955s().facesinfo_[0].orig_landmarks_96_;
        if (this.mBeautyScore.ProcessFrame(vjwVar.m198689b(), this.mBeautyScoreParams, this.mBeautyScoreInfo)) {
            return this.mBeautyScoreInfo.beauty_score;
        }
        return -1.0f;
    }

    public boolean loadBeautyScoreModel(String str) {
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("beautyScoreModelPath 是空的！");
            return false;
        }
        BeautyScore beautyScore = this.mBeautyScore;
        if (beautyScore != null) {
            return beautyScore.LoadModel(str);
        }
        ig3.m135964a("beautyScoreModelPath 已经被销毁！");
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
