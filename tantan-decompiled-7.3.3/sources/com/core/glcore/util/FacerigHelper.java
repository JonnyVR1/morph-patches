package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;
import com.momocv.SingleFaceInfo;
import com.momocv.facerigv3.FaceRigV3;
import com.momocv.facerigv3.FacerigV3Params;
import com.momocv.videoprocessor.VideoInfo;
import com.momocv.videoprocessor.VideoParams;
import com.momocv.videoprocessor.VideoProcessor;
import p153l.evf;
import p153l.lnw;
import p153l.omw;
import p153l.umw;

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

    public static synchronized evf process(umw umwVar, lnw lnwVar) {
        return processFacrigFrame(umwVar, lnwVar, null);
    }

    private static synchronized evf processFacrigFrame(umw umwVar, lnw lnwVar, omw omwVar) {
        SingleFaceInfo singleFaceInfo;
        float[] fArr;
        float[] fArr2;
        FaceRigHandler faceRigHandler2;
        if (umwVar.m196797c() != 0 && umwVar.m196799e() != 0 && umwVar.m196795a() != null && umwVar.m196795a().length != 0) {
            if (umwVar.m196796b().format_ == 17 && umwVar.m196795a().length < umwVar.m196799e() * umwVar.m196797c() * 1.5f) {
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
                MDLog.m7445e("FacerigHelper", "cv model is null");
                return null;
            }
            if (!mLoadMode) {
                return null;
            }
            lnwVar.m155018m(0);
            lnwVar.m155029x(1);
            evf evfVar = new evf();
            VideoInfo videoInfo = new VideoInfo();
            FacerigV3Params facerigV3Params = new FacerigV3Params();
            facerigV3Params.rotate_degree_ = lnwVar.m155010e();
            facerigV3Params.restore_degree_ = lnwVar.m155009d();
            facerigV3Params.fliped_show_ = lnwVar.m155012g();
            if (omwVar != null) {
                omwVar.m168285B(lnwVar.m155008c());
            }
            mVideoProcessor.ProcessFrame(umwVar.m196796b(), (VideoParams) lnwVar.m155008c(), videoInfo);
            evfVar.m122799c(videoInfo);
            SingleFaceInfo[] singleFaceInfoArr = videoInfo.facesinfo_;
            if (singleFaceInfoArr != null && singleFaceInfoArr.length > 0 && (fArr = (singleFaceInfo = singleFaceInfoArr[0]).orig_landmarks_96_) != null && fArr.length > 0 && (fArr2 = singleFaceInfo.euler_angles_) != null && fArr2.length > 2) {
                facerigV3Params.orig_landmarks_96_ = fArr;
                facerigV3Params.face_processor_eulers_ = fArr2;
                mFaceRigV3.ProcessFrame(umwVar.m196796b(), facerigV3Params, evfVar.f96000a);
            }
            return evfVar;
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

    public static synchronized evf process(umw umwVar, lnw lnwVar, omw omwVar) {
        return processFacrigFrame(umwVar, lnwVar, omwVar);
    }
}
