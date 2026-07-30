package com.core.glcore.util;

import android.os.Build;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.momo.xeengine.p044cv.bean.CVBodyInfo;
import com.momocv.MMJoint;
import com.momocv.bodylandmark.BodyLandmark;
import com.momocv.bodylandmark.BodyLandmarkParams;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import java.util.ArrayList;
import p149l.mkw;
import p149l.vjw;

/* JADX INFO: loaded from: classes.dex */
public class BodyLandHelper {
    private static BodyLandmark bodyLandmark = null;
    private static int exitOpenCL = -1;
    private static volatile boolean isWhiteList = false;
    private static String modelPath = null;
    private static int qualcommCPU = -1;
    private static volatile boolean useBodyLand;

    public static String getModelPath() {
        return modelPath;
    }

    public static boolean isUseBodyLand() {
        return useBodyLand;
    }

    public static synchronized void process(vjw vjwVar, mkw mkwVar, BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        try {
            if (modelPath != null && bodyLandmarkPostInfo != null) {
                if (bodyLandmark == null) {
                    BodyLandmark bodyLandmark2 = new BodyLandmark();
                    bodyLandmark = bodyLandmark2;
                    bodyLandmark2.LoadModel(modelPath);
                }
                BodyLandmark bodyLandmark3 = bodyLandmark;
                if (bodyLandmark3 != null) {
                    bodyLandmark3.ProcessFrame(vjwVar.m198689b(), (BodyLandmarkParams) mkwVar.m155081c(), bodyLandmarkPostInfo);
                }
                return;
            }
            MDLog.m7391e(MDLogTag.MOMENT_CV_TAG, "The BodyLand modelPath is null or bodyLandmarkPostInfo is null !!!");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void release() {
        releaseBodyLandmark();
        modelPath = null;
        useBodyLand = false;
        isWhiteList = false;
        MDLog.m7391e(MDLogTag.MOMENT_CV_TAG, "The BodyLandHelper release !!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void releaseBodyLandmark() {
        BodyLandmark bodyLandmark2 = bodyLandmark;
        if (bodyLandmark2 != null) {
            bodyLandmark2.Release();
            bodyLandmark = null;
        }
    }

    public static boolean rightHardware() {
        int i = exitOpenCL;
        if (i != 0 && qualcommCPU != 0) {
            if (i == -1) {
                exitOpenCL = FileUtil.exist("/system/vendor/lib/libOpenCL.so") ? 1 : 0;
            }
            if (qualcommCPU == -1) {
                String string = FileUtil.readString("/proc/cpuinfo");
                if (TextUtils.isEmpty(string)) {
                    qualcommCPU = 0;
                } else {
                    qualcommCPU = (string.toLowerCase().contains("qualcomm") || string.toLowerCase().contains("qcom")) ? 1 : 0;
                }
                String str = Build.HARDWARE;
                if (qualcommCPU == 0 && !TextUtils.isEmpty(str)) {
                    qualcommCPU = (str.toLowerCase().contains("qualcomm") || str.toLowerCase().contains("qcom")) ? 1 : 0;
                }
            }
            if (exitOpenCL == 1 && qualcommCPU == 1) {
                return true;
            }
        }
        return false;
    }

    public static void setBodyInfos(BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        if (bodyLandmarkPostInfo == null) {
            XEEngineHelper.setBodyInfos(null);
            return;
        }
        MMJoint[][] mMJointArr = bodyLandmarkPostInfo.multi_person_;
        if (mMJointArr == null) {
            XEEngineHelper.setBodyInfos(null);
            return;
        }
        ArrayList arrayList = new ArrayList(mMJointArr.length);
        for (MMJoint[] mMJointArr2 : mMJointArr) {
            int length = mMJointArr2.length;
            CVBodyInfo cVBodyInfo = new CVBodyInfo();
            cVBodyInfo.joints = new ArrayList(length);
            for (MMJoint mMJoint : mMJointArr2) {
                if (mMJoint != null) {
                    CVBodyInfo.Joint joint = new CVBodyInfo.Joint();
                    joint.f14568x = mMJoint.f14759x_;
                    joint.f14569y = mMJoint.f14760y_;
                    joint.score = mMJoint.score_;
                    cVBodyInfo.joints.add(joint);
                }
            }
            arrayList.add(cVBodyInfo);
        }
        XEEngineHelper.setBodyInfos(arrayList);
    }

    public static synchronized void setModelTypeAndPath(boolean z, String str) {
        if (isWhiteList == z && modelPath == str) {
            return;
        }
        if (FileUtil.exist(str)) {
            BodyLandmark bodyLandmark2 = bodyLandmark;
            if (bodyLandmark2 != null) {
                bodyLandmark2.Release();
                bodyLandmark = null;
            }
            modelPath = str;
            isWhiteList = z;
        }
    }

    public static synchronized void setUseBodyLand(boolean z) {
        try {
            if (z) {
                useBodyLand = true;
                DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_BODY);
            } else {
                DetectDelayStopHelper.getInstance().delayRelease(DetectDelayStopHelper.TYPE_DETECT_BODY, new Runnable() { // from class: com.core.glcore.util.BodyLandHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean unused = BodyLandHelper.useBodyLand = false;
                        BodyLandHelper.releaseBodyLandmark();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
