package com.momo.mcamera.mask.gesture;

import android.os.SystemClock;
import com.core.glcore.p023cv.MMCVBoxes;
import com.core.glcore.util.XEEngineHelper;
import com.momo.xeengine.p044cv.bean.XEGestureInfo;
import com.momo.xeengine.p044cv.bean.XEHandInfo;
import com.momocv.MMBox;
import com.momocv.handgesture.HandGestureInfo;
import java.util.ArrayList;
import p149l.fpx;
import p149l.pjw;
import p149l.tuk;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class NewHandGestureDetector extends CVDetector {
    private vjw mmFrame = new vjw();

    private tuk getDetector() {
        return tuk.m190698e();
    }

    private void processNewGestureData(MMBox[] mMBoxArr) {
        ArrayList arrayList = new ArrayList();
        if (mMBoxArr != null && mMBoxArr.length > 0) {
            ArrayList arrayList2 = new ArrayList(mMBoxArr.length);
            for (MMBox mMBox : mMBoxArr) {
                if (mMBox != null) {
                    XEGestureInfo xEGestureInfo = new XEGestureInfo();
                    xEGestureInfo.type = mMBox.class_name_;
                    xEGestureInfo.bounds = new float[]{mMBox.f14764x_, mMBox.f14765y_, mMBox.width_, mMBox.height_};
                    xEGestureInfo.score = mMBox.score_;
                    arrayList2.add(xEGestureInfo);
                }
            }
            XEHandInfo xEHandInfo = new XEHandInfo();
            xEHandInfo.gestures = arrayList2;
            arrayList.add(xEHandInfo);
        }
        XEEngineHelper.setHandInfos(arrayList);
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void setDetectInterval(int i) {
    }

    public void setHandGestureType(int i) {
        getDetector().m190704j(i);
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void setMMCVInfo(pjw pjwVar) {
        SystemClock.uptimeMillis();
        MMCVBoxes mMCVBoxes = new MMCVBoxes();
        this.mmFrame.m198695h(17);
        this.mmFrame.m198699l(pjwVar.f149898e);
        this.mmFrame.m198700m(pjwVar.f149898e);
        this.mmFrame.m198697j(pjwVar.f149899f);
        byte[] bArr = pjwVar.f149900g;
        this.mmFrame.m198694g(bArr);
        this.mmFrame.m198693f(bArr == null ? 0 : bArr.length);
        getDetector().m181373b(pjwVar.f149896c);
        getDetector().m181374c(pjwVar.f149895b);
        getDetector().m181372a(pjwVar.f149894a);
        HandGestureInfo handGestureInfo = (HandGestureInfo) getDetector().m190702h(this.mmFrame.m198689b());
        if (handGestureInfo != null) {
            if (fpx.m122681a()) {
                processNewGestureData(handGestureInfo.hand_gesture_results_);
            }
            mMCVBoxes.setDetectResult(handGestureInfo.hand_gesture_results_);
            CVDetector.GestureDetectorListener gestureDetectorListener = this.gestureDetectorListener;
            if (gestureDetectorListener != null) {
                gestureDetectorListener.gestureDetect(mMCVBoxes);
            }
        }
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void startDetect() {
        getDetector().m190700d();
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void stopDetect() {
        cancel();
        getDetector().m190703i();
    }
}
