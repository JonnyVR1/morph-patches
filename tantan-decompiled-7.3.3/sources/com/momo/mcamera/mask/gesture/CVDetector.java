package com.momo.mcamera.mask.gesture;

import com.core.glcore.p024cv.MMCVBoxes;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class CVDetector {
    protected GestureDetectorListener gestureDetectorListener;

    public interface GestureDetectorListener {
        void gestureDetect(MMCVBoxes mMCVBoxes);
    }

    public void cancel() {
        this.gestureDetectorListener = null;
    }

    public void setDetectInterval(int i) {
    }

    public void setGestureDetectorListener(GestureDetectorListener gestureDetectorListener) {
        this.gestureDetectorListener = gestureDetectorListener;
    }

    public void startDetect() {
    }

    public void stopDetect() {
    }

    public void setMMCVInfo(omw omwVar) {
    }
}
