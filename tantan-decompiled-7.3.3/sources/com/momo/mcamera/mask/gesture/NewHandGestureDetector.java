package com.momo.mcamera.mask.gesture;

import android.os.SystemClock;
import com.core.glcore.p024cv.MMCVBoxes;
import com.core.glcore.util.XEEngineHelper;
import com.momo.xeengine.p049cv.bean.XEGestureInfo;
import com.momo.xeengine.p049cv.bean.XEHandInfo;
import com.momocv.MMBox;
import com.momocv.handgesture.HandGestureInfo;
import java.util.ArrayList;
import p153l.cyx;
import p153l.jxk;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class NewHandGestureDetector extends CVDetector {
    private umw mmFrame = new umw();

    private jxk getDetector() {
        return jxk.m147356e();
    }

    private void processNewGestureData(MMBox[] mMBoxArr) {
        ArrayList arrayList = new ArrayList();
        if (mMBoxArr != null && mMBoxArr.length > 0) {
            ArrayList arrayList2 = new ArrayList(mMBoxArr.length);
            for (MMBox mMBox : mMBoxArr) {
                if (mMBox != null) {
                    XEGestureInfo xEGestureInfo = new XEGestureInfo();
                    xEGestureInfo.type = mMBox.class_name_;
                    xEGestureInfo.bounds = new float[]{mMBox.f15483x_, mMBox.f15484y_, mMBox.width_, mMBox.height_};
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
        getDetector().m147362j(i);
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void setMMCVInfo(omw omwVar) {
        SystemClock.uptimeMillis();
        MMCVBoxes mMCVBoxes = new MMCVBoxes();
        this.mmFrame.m196802h(17);
        this.mmFrame.m196806l(omwVar.f148018e);
        this.mmFrame.m196807m(omwVar.f148018e);
        this.mmFrame.m196804j(omwVar.f148019f);
        byte[] bArr = omwVar.f148020g;
        this.mmFrame.m196801g(bArr);
        this.mmFrame.m196800f(bArr == null ? 0 : bArr.length);
        getDetector().m178571b(omwVar.f148016c);
        getDetector().m178572c(omwVar.f148015b);
        getDetector().m178570a(omwVar.f148014a);
        HandGestureInfo handGestureInfo = (HandGestureInfo) getDetector().m147360h(this.mmFrame.m196796b());
        if (handGestureInfo != null) {
            if (cyx.m113254a()) {
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
        getDetector().m147358d();
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector
    public void stopDetect() {
        cancel();
        getDetector().m147361i();
    }
}
