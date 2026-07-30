package com.p069ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.engine.InternalExpressDetectInfo;
import com.p069ss.bytertc.engine.InternalRectangle;
import com.p069ss.bytertc.engine.video.ExpressionDetectInfo;
import com.p069ss.bytertc.engine.video.ExpressionDetectResult;
import com.p069ss.bytertc.engine.video.FaceDetectionResult;
import com.p069ss.bytertc.engine.video.IFaceDetectionObserver;
import com.p069ss.bytertc.engine.video.RTCVideoEffect;
import com.p069ss.bytertc.engine.video.Rectangle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class RTCFaceDetectionObserver {
    private static final String TAG = "RTCFaceDetectionObserver";
    private WeakReference<RTCVideoEffect> mVideoEffect;

    public RTCFaceDetectionObserver(RTCVideoEffect rTCVideoEffect) {
        this.mVideoEffect = new WeakReference<>(rTCVideoEffect);
    }

    @CalledByNative
    public void OnExpressionDetectResult(int i, int i2, InternalExpressDetectInfo[] internalExpressDetectInfoArr) {
        RTCVideoEffect rTCVideoEffect;
        WeakReference<RTCVideoEffect> weakReference = this.mVideoEffect;
        IFaceDetectionObserver faceDetectionObserver = (weakReference == null || (rTCVideoEffect = weakReference.get()) == null) ? null : rTCVideoEffect.getFaceDetectionObserver();
        if (faceDetectionObserver == null) {
            return;
        }
        ExpressionDetectResult expressionDetectResult = new ExpressionDetectResult();
        expressionDetectResult.detectResult = i;
        if (i != 0 || internalExpressDetectInfoArr == null || i2 <= 0) {
            expressionDetectResult.detectInfo = null;
        } else {
            expressionDetectResult.detectInfo = new ExpressionDetectInfo[i2];
            expressionDetectResult.faceCount = i2;
            for (int i3 = 0; i3 < i2; i3++) {
                InternalExpressDetectInfo internalExpressDetectInfo = internalExpressDetectInfoArr[i3];
                expressionDetectResult.detectInfo[i3] = new ExpressionDetectInfo(internalExpressDetectInfo.age, internalExpressDetectInfo.boyProb, internalExpressDetectInfo.attractive, internalExpressDetectInfo.happyScore, internalExpressDetectInfo.sadScore, internalExpressDetectInfo.angryScore, internalExpressDetectInfo.surpriseScore, internalExpressDetectInfo.arousal, internalExpressDetectInfo.valence);
            }
        }
        faceDetectionObserver.onExpressionDetectResult(expressionDetectResult);
    }

    @CalledByNative
    public void OnFaceDetectResult(int i, int i2, int i3, int i4, InternalRectangle[] internalRectangleArr, long j) {
        RTCVideoEffect rTCVideoEffect;
        WeakReference<RTCVideoEffect> weakReference = this.mVideoEffect;
        IFaceDetectionObserver faceDetectionObserver = (weakReference == null || (rTCVideoEffect = weakReference.get()) == null) ? null : rTCVideoEffect.getFaceDetectionObserver();
        if (faceDetectionObserver == null) {
            return;
        }
        FaceDetectionResult faceDetectionResult = new FaceDetectionResult();
        faceDetectionResult.imageWidth = i2;
        faceDetectionResult.imageHeight = i3;
        faceDetectionResult.frameTimestampUs = j;
        faceDetectionResult.detectResult = i;
        if (internalRectangleArr == null || internalRectangleArr.length <= 0) {
            faceDetectionResult.faces = null;
        } else {
            faceDetectionResult.faces = new Rectangle[internalRectangleArr.length];
            for (int i5 = 0; i5 < i4; i5++) {
                Rectangle[] rectangleArr = faceDetectionResult.faces;
                InternalRectangle internalRectangle = internalRectangleArr[i5];
                rectangleArr[i5] = new Rectangle(internalRectangle.f55605x, internalRectangle.f55606y, internalRectangle.width, internalRectangle.height);
            }
        }
        faceDetectionObserver.onFaceDetectResult(faceDetectionResult);
    }
}
