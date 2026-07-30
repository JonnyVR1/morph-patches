package com.immomo.momomediaext.filter.beauty;

import com.core.glcore.util.FaceRigHandler;
import com.cosmos.mdlog.MDLog;
import com.momocv.SingleFaceInfo;
import com.momocv.facerigv3.FaceRigV3;
import com.momocv.facerigv3.FacerigV3Params;
import p149l.mkw;
import p149l.pjw;
import p149l.qtf;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class ByteDanceFacerigHelper {
    private static FaceRigHandler faceRigHandler = null;
    private static volatile boolean mFaceDetectLoadSucesss = false;
    private static volatile boolean mFaceRigLoadSucesss = false;
    private static FaceRigV3 mFaceRigV3 = null;
    private static volatile boolean mLoadMode = false;
    private static volatile boolean mLoadSucess = false;
    private static volatile boolean mUseAnimojiFaceRig = false;
    private static volatile boolean started;

    public static boolean isUseAnimojiFaceRig() {
        return mUseAnimojiFaceRig;
    }

    public static synchronized qtf processFacrigFrame(vjw vjwVar, mkw mkwVar, pjw pjwVar) {
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
            if (!mLoadMode && (faceRigHandler2 = faceRigHandler) != null) {
                final byte[] bArrOnLoadFaceRigModel = faceRigHandler2.onLoadFaceRigModel();
                if (bArrOnLoadFaceRigModel != null && bArrOnLoadFaceRigModel.length > 0) {
                    if (!mFaceRigLoadSucesss && !mFaceDetectLoadSucesss && !mLoadSucess) {
                        mLoadSucess = true;
                        new Thread(new Runnable() { // from class: com.immomo.momomediaext.filter.beauty.ByteDanceFacerigHelper.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean unused = ByteDanceFacerigHelper.mFaceRigLoadSucesss = ByteDanceFacerigHelper.mFaceRigV3.LoadModel(bArrOnLoadFaceRigModel);
                                boolean unused2 = ByteDanceFacerigHelper.mLoadSucess = false;
                                boolean unused3 = ByteDanceFacerigHelper.mLoadMode = true;
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
            qtf qtfVar = new qtf();
            FacerigV3Params facerigV3Params = new FacerigV3Params();
            facerigV3Params.rotate_degree_ = mkwVar.m155083e();
            facerigV3Params.restore_degree_ = mkwVar.m155082d();
            facerigV3Params.fliped_show_ = mkwVar.m155085g();
            qtfVar.m176414c(pjwVar.f149904k);
            SingleFaceInfo[] singleFaceInfoArr = pjwVar.f149904k.facesinfo_;
            if (singleFaceInfoArr != null && singleFaceInfoArr.length > 0 && (fArr = (singleFaceInfo = singleFaceInfoArr[0]).orig_landmarks_96_) != null && fArr.length > 0 && (fArr2 = singleFaceInfo.euler_angles_) != null && fArr2.length > 2) {
                float[] fArrTransBytePoint96ToOriginal96 = ByteToMMUtils.transBytePoint96ToOriginal96(singleFaceInfo.orig_landmarks_96_, mkwVar.m155085g() ? 90 : 270, mkwVar.m155085g(), vjwVar.m198692e(), vjwVar.m198690c(), pjwVar.f149883A);
                singleFaceInfo.orig_landmarks_96_ = fArrTransBytePoint96ToOriginal96;
                facerigV3Params.orig_landmarks_96_ = fArrTransBytePoint96ToOriginal96;
                facerigV3Params.face_processor_eulers_ = singleFaceInfo.euler_angles_;
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
        try {
            FaceRigV3 faceRigV3 = mFaceRigV3;
            if (faceRigV3 != null) {
                faceRigV3.Release();
                mFaceRigV3 = null;
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

    public static void setUseAnimojiFaceRig(boolean z) {
        mUseAnimojiFaceRig = z;
    }

    public static void unregisterFaceRigHandler() {
        faceRigHandler = null;
    }
}
