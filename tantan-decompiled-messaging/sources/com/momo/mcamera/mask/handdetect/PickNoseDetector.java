package com.momo.mcamera.mask.handdetect;

import com.immomo.mmutil.task.C3804c;
import com.momocv.MMFrame;
import com.momocv.handdetectlandmark.HandDetectLandmark;
import com.momocv.handdetectlandmark.HandDetectLandmarkParams;
import com.momocv.handdetectlandmark.HandDetectLandmarkPostInfo;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class PickNoseDetector {
    private static volatile boolean isLoadedModel = false;
    public static volatile String path = null;
    private static volatile boolean resetPath = false;
    private static volatile boolean startLoad = false;
    public HandDetectLandmark handDetectLandmark;
    public HandDetectLandmarkParams handDetectLandmarkParams;
    public HandDetectLandmarkPostInfo handDetectLandmarkPostInfo = new HandDetectLandmarkPostInfo();
    private MMFrame mmFrame;

    private void loadModel(boolean z) {
        if (z) {
            startLoad = true;
            isLoadedModel = this.handDetectLandmark.LoadModel(path);
            if (isLoadedModel) {
                return;
            }
            String.format("pick noise model is invalid:%s", path);
            return;
        }
        if (path == null || startLoad || isLoadedModel) {
            return;
        }
        startLoad = true;
        C3804c.m18444d(2, new Runnable() { // from class: com.momo.mcamera.mask.handdetect.PickNoseDetector.1
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = PickNoseDetector.isLoadedModel = PickNoseDetector.this.handDetectLandmark.LoadModel(PickNoseDetector.path);
                if (PickNoseDetector.isLoadedModel) {
                    return;
                }
                String.format("pick noise model is invalid:%s", PickNoseDetector.path);
            }
        });
    }

    public static void resetPath(String str) {
        if (str == null || str.equals(path)) {
            return;
        }
        path = str;
        resetPath = true;
    }

    public synchronized HandDetectLandmarkPostInfo process(pjw pjwVar, int i, boolean z) {
        try {
            if (resetPath) {
                HandDetectLandmark handDetectLandmark = this.handDetectLandmark;
                if (handDetectLandmark != null) {
                    handDetectLandmark.Release();
                    this.handDetectLandmark = null;
                }
                isLoadedModel = false;
                startLoad = false;
                resetPath = false;
            }
            if (pjwVar.m169950n() < 1) {
                return null;
            }
            if (this.handDetectLandmark == null) {
                this.handDetectLandmark = new HandDetectLandmark();
            }
            loadModel(z);
            if (this.mmFrame == null) {
                this.mmFrame = new MMFrame();
            }
            if (this.handDetectLandmarkParams == null) {
                this.handDetectLandmarkParams = new HandDetectLandmarkParams();
            }
            MMFrame mMFrame = this.mmFrame;
            mMFrame.format_ = i;
            mMFrame.width_ = pjwVar.m169956t();
            MMFrame mMFrame2 = this.mmFrame;
            mMFrame2.height_ = pjwVar.f149899f;
            byte[] bArr = pjwVar.f149900g;
            mMFrame2.data_ptr_ = bArr;
            mMFrame2.data_len_ = bArr.length;
            mMFrame2.step_ = pjwVar.m169956t();
            HandDetectLandmarkParams handDetectLandmarkParams = this.handDetectLandmarkParams;
            handDetectLandmarkParams.rotate_degree_ = pjwVar.f149895b;
            handDetectLandmarkParams.fliped_show_ = pjwVar.f149894a;
            handDetectLandmarkParams.restore_degree_ = pjwVar.f149896c;
            if (pjwVar.m169946j(0) != null) {
                this.handDetectLandmarkParams.orig_landmarks_222_ = pjwVar.m169946j(0).m220023q();
            }
            if (!isLoadedModel) {
                return null;
            }
            pjwVar.m169936B(this.handDetectLandmarkParams);
            this.handDetectLandmark.ProcessFrame(this.mmFrame, this.handDetectLandmarkParams, this.handDetectLandmarkPostInfo);
            return this.handDetectLandmarkPostInfo;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void release() {
        try {
            HandDetectLandmark handDetectLandmark = this.handDetectLandmark;
            if (handDetectLandmark != null) {
                handDetectLandmark.Release();
            }
            this.handDetectLandmark = null;
            startLoad = false;
            isLoadedModel = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public HandDetectLandmarkPostInfo process(pjw pjwVar) {
        return process(pjwVar, 17, false);
    }
}
