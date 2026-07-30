package com.momo.mcamera.mask.detect;

import com.momocv.express.ExpressInfo;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public interface IPatternDetect {

    public interface ExpressDetectListener {
        void onExpressDetect(ExpressInfo expressInfo);
    }

    void detect();

    void setExpressDetectListener(ExpressDetectListener expressDetectListener);

    void setMMCVInfo(omw omwVar);

    void setModelPath(String str);

    void startDetect();

    void stopDetect();
}
