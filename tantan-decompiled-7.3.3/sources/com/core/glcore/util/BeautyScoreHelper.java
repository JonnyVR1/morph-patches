package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.task.C3949c;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes.dex */
public class BeautyScoreHelper {
    private static String TAG = "BeautyScoreHelper";
    private static omw beautyScoreCvInfo = null;
    private static umw beautyScoreFrame = null;
    private static String beautyScoreModelPath = null;
    private static boolean beautyScoreProcessDone = true;
    private static int beautyScoreRotateDegree = 0;
    private static float[] beautyScores = null;
    private static int checkedBeautyScoreFrameNumber = 0;
    private static FaceBeautyScore faceBeautyScore = null;
    private static float maxValidDegree = 15.0f;

    public static /* synthetic */ int access$508() {
        int i = checkedBeautyScoreFrameNumber;
        checkedBeautyScoreFrameNumber = i + 1;
        return i;
    }

    public static void detectBeautyScore(umw umwVar, omw omwVar, int i) {
        float[] fArr;
        if (omwVar == null || omwVar.m168299n() <= 0) {
            MDLog.m7443d(TAG, "no face");
            return;
        }
        if (!beautyScoreProcessDone) {
            MDLog.m7443d(TAG, "BeautyScore previous frame processing");
            return;
        }
        beautyScoreProcessDone = false;
        beautyScoreFrame = umwVar;
        beautyScoreRotateDegree = i;
        beautyScoreCvInfo = omwVar;
        if (faceBeautyScore == null && beautyScoreModelPath != null) {
            FaceBeautyScore faceBeautyScore2 = new FaceBeautyScore();
            faceBeautyScore = faceBeautyScore2;
            try {
                if (!faceBeautyScore2.loadBeautyScoreModel(beautyScoreModelPath)) {
                    MDLog.m7445e(TAG, "The beauty mode lode failed !!!" + beautyScoreModelPath);
                }
            } catch (Exception unused) {
                MDLog.m7445e(TAG, "The beauty mode lode failed !!!" + beautyScoreModelPath);
            }
            faceBeautyScore.setMaxValidDegree(maxValidDegree);
        }
        if (faceBeautyScore == null || (fArr = beautyScores) == null || checkedBeautyScoreFrameNumber >= fArr.length) {
            beautyScoreProcessDone = true;
        } else {
            C3949c.m19427d(2, new Runnable() { // from class: com.core.glcore.util.BeautyScoreHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    float fCalculateImageFaceBeautyScore = BeautyScoreHelper.faceBeautyScore.calculateImageFaceBeautyScore(BeautyScoreHelper.beautyScoreFrame, BeautyScoreHelper.beautyScoreCvInfo, BeautyScoreHelper.beautyScoreRotateDegree);
                    if (fCalculateImageFaceBeautyScore >= 0.0f) {
                        BeautyScoreHelper.beautyScores[BeautyScoreHelper.access$508()] = fCalculateImageFaceBeautyScore;
                    }
                    boolean unused2 = BeautyScoreHelper.beautyScoreProcessDone = true;
                }
            });
        }
    }

    public static float[] getBeautyScore() {
        return beautyScores;
    }

    public static void release() {
        FaceBeautyScore faceBeautyScore2 = faceBeautyScore;
        if (faceBeautyScore2 != null) {
            faceBeautyScore2.release();
            faceBeautyScore = null;
        }
        checkedBeautyScoreFrameNumber = 0;
        beautyScores = null;
        MDLog.m7449i(TAG, "BeautyScoreHelper release !!!");
    }

    public static void resetBeautyScore() {
        checkedBeautyScoreFrameNumber = 0;
    }

    public static void setBeautyScore(float[] fArr) {
        beautyScores = fArr;
    }

    public static void setBeautyScoreModelPath(String str) {
        MDLog.m7449i(TAG, "beautyScoreModelPath:" + str);
        beautyScoreModelPath = str;
    }
}
