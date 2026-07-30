package com.momo.mcamera.mask.detect;

import com.core.glcore.p024cv.MMCVBoxes;
import com.momocv.express.ExpressInfo;
import com.momocv.handdetectlandmark.HandDetectLandmarkPostInfo;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public interface IDetectManager {

    public interface IExpressDetectListener {
        void onExpressDetected(ExpressInfo expressInfo);
    }

    public interface IGestureDetectListener {
        void onGestureDetected(MMCVBoxes mMCVBoxes);
    }

    public interface IObjectDetectListener {
        void onObjectDetected(MMCVBoxes mMCVBoxes);
    }

    public interface IPickNoseDetectListener {
        void onPickNoseDetected(HandDetectLandmarkPostInfo handDetectLandmarkPostInfo);
    }

    void clearAllExpressDetectListener();

    void clearAllGestureDetectListener();

    void clearAllObjectDetectListener();

    void clearAllPickNoiseDetectListener();

    boolean isExpressDetectOpened();

    boolean isGestureDetectOpened();

    boolean isObjectDetectOpened();

    void registerExpressDetectListener(IExpressDetectListener iExpressDetectListener);

    void registerGestureDetectListener(IGestureDetectListener iGestureDetectListener);

    void registerObjectDetectListener(IObjectDetectListener iObjectDetectListener);

    void registerPickNoiseDetectListener(IPickNoseDetectListener iPickNoseDetectListener);

    void removeExpressDetectListener(IExpressDetectListener iExpressDetectListener);

    void removeGestureDetectListener(IGestureDetectListener iGestureDetectListener);

    void removeObjectDetectListener(IObjectDetectListener iObjectDetectListener);

    void removePickNoiseDetectListener(IPickNoseDetectListener iPickNoseDetectListener);

    void setExpressModelPath(String str);

    void setGestureDetectInterval(int i);

    void setGestureModelPath(String str);

    void setHandGestureType(int i);

    void setMMCVInfo(omw omwVar);

    void setObjectDetectInterval(int i);

    void setObjectModelPath(String str);

    void startExpressDetect();

    void startGestureDetect();

    void startObjectDetect();

    void stopExpressDetect();

    void stopGestureDetect();

    void stopObjectDetect();
}
