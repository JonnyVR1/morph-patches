package com.momo.mcamera.mask.handdetect;

import com.immomo.mmutil.task.C3949c;
import com.momocv.MMFrame;
import com.momocv.handdetectlandmark.HandDetectLandmark;
import com.momocv.handdetectlandmark.HandDetectLandmarkParams;
import com.momocv.handdetectlandmark.HandDetectLandmarkPostInfo;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
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
        C3949c.m19427d(2, new Runnable() { // from class: com.momo.mcamera.mask.handdetect.PickNoseDetector.1
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

    public synchronized HandDetectLandmarkPostInfo process(omw omwVar, int i, boolean z) {
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
            if (omwVar.m168299n() < 1) {
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
            mMFrame.width_ = omwVar.m168305t();
            MMFrame mMFrame2 = this.mmFrame;
            mMFrame2.height_ = omwVar.f148019f;
            byte[] bArr = omwVar.f148020g;
            mMFrame2.data_ptr_ = bArr;
            mMFrame2.data_len_ = bArr.length;
            mMFrame2.step_ = omwVar.m168305t();
            HandDetectLandmarkParams handDetectLandmarkParams = this.handDetectLandmarkParams;
            handDetectLandmarkParams.rotate_degree_ = omwVar.f148015b;
            handDetectLandmarkParams.fliped_show_ = omwVar.f148014a;
            handDetectLandmarkParams.restore_degree_ = omwVar.f148016c;
            if (omwVar.m168295j(0) != null) {
                this.handDetectLandmarkParams.orig_landmarks_222_ = omwVar.m168295j(0).m164786q();
            }
            if (!isLoadedModel) {
                return null;
            }
            omwVar.m168285B(this.handDetectLandmarkParams);
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

    public HandDetectLandmarkPostInfo process(omw omwVar) {
        return process(omwVar, 17, false);
    }
}
