package com.p074ss.bytertc.engine.video;

import com.p074ss.bytertc.engine.InternalExpressDetectConfig;
import com.p074ss.bytertc.engine.NativeRTCVideoFunctions;
import com.p074ss.bytertc.engine.data.VirtualBackgroundSource;
import com.p074ss.bytertc.engine.handler.RTCFaceDetectionObserver;
import com.p074ss.bytertc.engine.type.ErrorCode;
import com.p074ss.bytertc.engine.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes11.dex */
public class RTCVideoEffect extends IVideoEffect {
    private static final String TAG = "RTCVideoEffect";
    private IFaceDetectionObserver mFaceDetectionObserver;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private long mNativeEngine;
    private RTCFaceDetectionObserver mRTCFaceDetectionObserver;
    private final ReentrantReadWriteLock mReadWriteLock;

    public RTCVideoEffect(long j) {
        this.mNativeEngine = 0L;
        this.mRTCFaceDetectionObserver = null;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeEngine = j;
        this.mRTCFaceDetectionObserver = new RTCFaceDetectionObserver(this);
        LogUtil.m82086i(TAG, "create rtc video effect");
    }

    private boolean engineInvalid() {
        return this.mNativeEngine == 0;
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int appendEffectNodes(List<String> list) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "invalid, appendEffectNodes failed.");
                return ErrorCode.ERROR_CODE_KICKED_OUT;
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return NativeRTCVideoFunctions.nativeAppendVideoEffectNodes(this.mNativeEngine, strArr);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int applyStickerEffect(String str) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeApplyStickerEffect(this.mNativeEngine, str);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, applyStickerEffect failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void destroy() {
        LogUtil.m82086i(TAG, "dispose rtc video effect");
        this.mJniWriteLock.lock();
        try {
            this.mNativeEngine = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int disableFaceDetection() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "invalid, registerFaceDetectionObserver failed.");
                return ErrorCode.ERROR_CODE_KICKED_OUT;
            }
            this.mFaceDetectionObserver = null;
            return NativeRTCVideoFunctions.nativeDisableFaceDetection(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int disableVideoEffect() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeDisableVideoEffect(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "invalid, disableVideoEffect failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int disableVirtualBackground() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeDisableVirtualBackground(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "invalid, disableVirtualBackground failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int enableFaceDetection(IFaceDetectionObserver iFaceDetectionObserver, int i, String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "invalid, registerFaceDetectionObserver failed.");
                return ErrorCode.ERROR_CODE_KICKED_OUT;
            }
            this.mFaceDetectionObserver = iFaceDetectionObserver;
            return NativeRTCVideoFunctions.nativeEnableFaceDetection(this.mNativeEngine, this.mRTCFaceDetectionObserver, i, str);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int enableVideoEffect() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeEnableVideoEffect2(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "invalid, enableVideoEffect failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int enableVirtualBackground(String str, VirtualBackgroundSource virtualBackgroundSource) {
        String str2;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeEnableVirtualBackground(this.mNativeEngine, str, virtualBackgroundSource.sourceType.ordinal(), virtualBackgroundSource.sourceColor, (virtualBackgroundSource == null || (str2 = virtualBackgroundSource.sourcePath) == null) ? "" : str2);
            }
            LogUtil.m82084e(TAG, "invalid, enableVirtualBackground failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IFaceDetectionObserver getFaceDetectionObserver() {
        return this.mFaceDetectionObserver;
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public long getVideoEffectHandle() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeGetVideoEffectHandle(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, getVideoEffectHandle failed.");
            return -1006L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int initCVResource(String str, String str2) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeInitCVResource(this.mNativeEngine, str, str2);
            }
            LogUtil.m82084e(TAG, "invalid, initCVResource failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int removeEffectNodes(List<String> list) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "invalid, removeEffectNodes failed.");
                return ErrorCode.ERROR_CODE_KICKED_OUT;
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return NativeRTCVideoFunctions.nativeRemoveVideoEffectNodes(this.mNativeEngine, strArr);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int setAlgoModelResourceFinder(long j, long j2) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeSetVideoEffectAlgoModelResourceFinder(this.mNativeEngine, j, j2);
            }
            LogUtil.m82084e(TAG, "invalid, setAlgoModelResourceFinder failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int setColorFilter(String str) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeSetVideoEffectColorFilter(this.mNativeEngine, str);
            }
            LogUtil.m82084e(TAG, "invalid, setColorFilter failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int setColorFilterIntensity(float f) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeSetVideoEffectColorFilterIntensity(this.mNativeEngine, f);
            }
            LogUtil.m82084e(TAG, "invalid, setColorFilterIntensity failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int setEffectNodes(List<String> list) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "invalid, setEffectNodes failed.");
                return ErrorCode.ERROR_CODE_KICKED_OUT;
            }
            if (list == null) {
                LogUtil.m82087w(TAG, "effect_nodes is null, setting empty effect nodes.");
                list = new ArrayList<>();
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            return NativeRTCVideoFunctions.nativeSetVideoEffectNodes(this.mNativeEngine, strArr);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "invalid, setVideoEffectExpressionDetect failed.");
                return ErrorCode.ERROR_CODE_KICKED_OUT;
            }
            return NativeRTCVideoFunctions.nativeSetVideoEffectExpressionDetect(this.mNativeEngine, new InternalExpressDetectConfig(videoEffectExpressionConfig));
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.video.IVideoEffect
    public int updateEffectNode(String str, String str2, float f) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeUpdateVideoEffectNode(this.mNativeEngine, str, str2, f);
            }
            LogUtil.m82084e(TAG, "invalid, updateEffectNode failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
