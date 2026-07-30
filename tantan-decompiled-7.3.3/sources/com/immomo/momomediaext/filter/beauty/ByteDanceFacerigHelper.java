package com.immomo.momomediaext.filter.beauty;

import com.core.glcore.util.FaceRigHandler;
import com.cosmos.mdlog.MDLog;
import com.momocv.SingleFaceInfo;
import com.momocv.facerigv3.FaceRigV3;
import com.momocv.facerigv3.FacerigV3Params;
import p153l.evf;
import p153l.lnw;
import p153l.omw;
import p153l.umw;

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

    public static synchronized evf processFacrigFrame(umw umwVar, lnw lnwVar, omw omwVar) {
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
                MDLog.m7445e("FacerigHelper", "cv model is null");
                return null;
            }
            if (!mLoadMode) {
                return null;
            }
            evf evfVar = new evf();
            FacerigV3Params facerigV3Params = new FacerigV3Params();
            facerigV3Params.rotate_degree_ = lnwVar.m155010e();
            facerigV3Params.restore_degree_ = lnwVar.m155009d();
            facerigV3Params.fliped_show_ = lnwVar.m155012g();
            evfVar.m122799c(omwVar.f148024k);
            SingleFaceInfo[] singleFaceInfoArr = omwVar.f148024k.facesinfo_;
            if (singleFaceInfoArr != null && singleFaceInfoArr.length > 0 && (fArr = (singleFaceInfo = singleFaceInfoArr[0]).orig_landmarks_96_) != null && fArr.length > 0 && (fArr2 = singleFaceInfo.euler_angles_) != null && fArr2.length > 2) {
                float[] fArrTransBytePoint96ToOriginal96 = ByteToMMUtils.transBytePoint96ToOriginal96(singleFaceInfo.orig_landmarks_96_, lnwVar.m155012g() ? 90 : 270, lnwVar.m155012g(), umwVar.m196799e(), umwVar.m196797c(), omwVar.f148003A);
                singleFaceInfo.orig_landmarks_96_ = fArrTransBytePoint96ToOriginal96;
                facerigV3Params.orig_landmarks_96_ = fArrTransBytePoint96ToOriginal96;
                facerigV3Params.face_processor_eulers_ = singleFaceInfo.euler_angles_;
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
