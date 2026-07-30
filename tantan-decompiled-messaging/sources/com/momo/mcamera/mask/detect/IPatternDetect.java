package com.momo.mcamera.mask.detect;

import com.momocv.express.ExpressInfo;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public interface IPatternDetect {

    public interface ExpressDetectListener {
        void onExpressDetect(ExpressInfo expressInfo);
    }

    void detect();

    void setExpressDetectListener(ExpressDetectListener expressDetectListener);

    void setMMCVInfo(pjw pjwVar);

    void setModelPath(String str);

    void startDetect();

    void stopDetect();
}
