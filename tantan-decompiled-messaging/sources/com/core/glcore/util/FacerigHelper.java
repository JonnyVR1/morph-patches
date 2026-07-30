package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;
import com.momocv.SingleFaceInfo;
import com.momocv.facerigv3.FaceRigV3;
import com.momocv.facerigv3.FacerigV3Params;
import com.momocv.videoprocessor.VideoInfo;
import com.momocv.videoprocessor.VideoParams;
import com.momocv.videoprocessor.VideoProcessor;
import p149l.mkw;
import p149l.pjw;
import p149l.qtf;
import p149l.vjw;

/* JADX INFO: loaded from: classes.dex */
public class FacerigHelper {
    private static FaceRigHandler faceRigHandler = null;
    private static volatile boolean mFaceDetectLoadSucesss = false;
    private static volatile boolean mFaceRigLoadSucesss = false;
    private static FaceRigV3 mFaceRigV3 = null;
    private static volatile boolean mLoadMode = false;
    private static volatile boolean mLoadSucess = false;
    private static volatile boolean mUseAnimojiFaceRig = false;
    private static VideoProcessor mVideoProcessor;
    private static volatile boolean started;

    public static boolean getUseAnimojiFaceRig() {
        return mUseAnimojiFaceRig;
    }

    public static boolean isUseFacerig() {
        return getUseAnimojiFaceRig();
    }

    public static synchronized qtf process(vjw vjwVar, mkw mkwVar) {
        return processFacrigFrame(vjwVar, mkwVar, null);
    }

    private static synchronized qtf processFacrigFrame(vjw vjwVar, mkw mkwVar, pjw pjwVar) {
        SingleFaceInfo singleFaceInfo;
        float[] fArr;
        float[] fArr2;
        FaceRigHandler faceRigHandler2;
        if (vjwVar.m198690c() != 0 && vjwVar.m198692e() != 0 && vjwVar.m198688a() != null && vjwVar.m198688a().length != 0) {
            if (vjwVar.m198689b().format_ == 17 && vjwVar.m198688a().length < vjwVar.m198692e() * vjwVar.m198690c() * 1.5f) {
                return null;
            }
            if (mFaceRigV3 == null) {
                mFaceRigV3 = new FaceRigV3();
            }
            if (mVideoProcessor == null) {
                mVideoProcessor = new VideoProcessor();
            }
            if (!mLoadMode && (faceRigHandler2 = faceRigHandler) != null) {
                final byte[] bArrOnLoadFaceRigModel = faceRigHandler2.onLoadFaceRigModel();
                final byte[] bArrOnLoadFaModel = faceRigHandler.onLoadFaModel();
                final byte[] bArrOnLoadFdModel = faceRigHandler.onLoadFdModel();
                if (bArrOnLoadFaceRigModel != null && bArrOnLoadFaceRigModel.length > 0 && bArrOnLoadFdModel != null && bArrOnLoadFdModel.length > 0 && bArrOnLoadFaModel != null && bArrOnLoadFaModel.length > 0) {
                    if (!mFaceRigLoadSucesss && !mFaceDetectLoadSucesss && !mLoadSucess) {
                        mLoadSucess = true;
                        new Thread(new Runnable() { // from class: com.core.glcore.util.FacerigHelper.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean unused = FacerigHelper.mFaceRigLoadSucesss = FacerigHelper.mFaceRigV3.LoadModel(bArrOnLoadFaceRigModel);
                                FacerigHelper.mVideoProcessor.LoadModel(bArrOnLoadFdModel, bArrOnLoadFaModel);
                                boolean unused2 = FacerigHelper.mLoadSucess = false;
                                boolean unused3 = FacerigHelper.mLoadMode = true;
                            }
                        }).start();
                    }
                }
                MDLog.m7391e("FacerigHelper", "cv model is null");
                return null;
            }
            if (!mLoadMode) {
                return null;
            }
            mkwVar.m155091m(0);
            mkwVar.m155102x(1);
            qtf qtfVar = new qtf();
            VideoInfo videoInfo = new VideoInfo();
            FacerigV3Params facerigV3Params = new FacerigV3Params();
            facerigV3Params.rotate_degree_ = mkwVar.m155083e();
            facerigV3Params.restore_degree_ = mkwVar.m155082d();
            facerigV3Params.fliped_show_ = mkwVar.m155085g();
            if (pjwVar != null) {
                pjwVar.m169936B(mkwVar.m155081c());
            }
            mVideoProcessor.ProcessFrame(vjwVar.m198689b(), (VideoParams) mkwVar.m155081c(), videoInfo);
            qtfVar.m176414c(videoInfo);
            SingleFaceInfo[] singleFaceInfoArr = videoInfo.facesinfo_;
            if (singleFaceInfoArr != null && singleFaceInfoArr.length > 0 && (fArr = (singleFaceInfo = singleFaceInfoArr[0]).orig_landmarks_96_) != null && fArr.length > 0 && (fArr2 = singleFaceInfo.euler_angles_) != null && fArr2.length > 2) {
                facerigV3Params.orig_landmarks_96_ = fArr;
                facerigV3Params.face_processor_eulers_ = fArr2;
                mFaceRigV3.ProcessFrame(vjwVar.m198689b(), facerigV3Params, qtfVar.f156323a);
            }
            return qtfVar;
        }
        return null;
    }

    public static void registerFaceRigHandler(FaceRigHandler faceRigHandler2) {
        faceRigHandler = faceRigHandler2;
    }

    public static synchronized void release() {
        if (started && faceRigHandler != null) {
            started = false;
            faceRigHandler.onStopFaceRigModel();
        }
    }

    public static synchronized void releseFaceRigInfo() {
        releseFaceRigInfoInner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void releseFaceRigInfoInner() {
        try {
            FaceRigV3 faceRigV3 = mFaceRigV3;
            if (faceRigV3 != null) {
                faceRigV3.Release();
                mFaceRigV3 = null;
            }
            VideoProcessor videoProcessor = mVideoProcessor;
            if (videoProcessor != null) {
                videoProcessor.Release();
                mVideoProcessor = null;
            }
            mFaceRigLoadSucesss = false;
            mFaceDetectLoadSucesss = false;
            mLoadSucess = false;
            mLoadMode = false;
            mUseAnimojiFaceRig = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public static void setIsSetFacerig(boolean z) {
        setUseAnimojiFaceRig(z);
    }

    public static void setUseAnimojiFaceRig(boolean z) {
        if (z) {
            DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_RIG);
            mUseAnimojiFaceRig = true;
        } else {
            mUseAnimojiFaceRig = false;
            DetectDelayStopHelper.getInstance().delayRelease(DetectDelayStopHelper.TYPE_DETECT_RIG, new Runnable() { // from class: com.core.glcore.util.FacerigHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    FacerigHelper.releseFaceRigInfoInner();
                }
            });
        }
    }

    public static void unregisterFaceRigHandler() {
        faceRigHandler = null;
    }

    public static synchronized qtf process(vjw vjwVar, mkw mkwVar, pjw pjwVar) {
        return processFacrigFrame(vjwVar, mkwVar, pjwVar);
    }
}
