package io.agora.rtc2.internal;

import io.agora.rtc2.IH265Transcoder;
import io.agora.rtc2.IH265TranscoderObserver;

/* JADX INFO: loaded from: classes2.dex */
public class H265TranscoderImpl implements IH265Transcoder {
    protected static H265TranscoderImpl mInstance;
    private final RtcEngineImpl mRtcEngineImpl;

    private H265TranscoderImpl(RtcEngineImpl rtcEngineImpl) {
        this.mRtcEngineImpl = rtcEngineImpl;
    }

    public static synchronized void destroyInstance() {
        mInstance = null;
    }

    public static synchronized H265TranscoderImpl getInstance(RtcEngineImpl rtcEngineImpl) {
        try {
            if (mInstance == null) {
                mInstance = new H265TranscoderImpl(rtcEngineImpl);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mInstance;
    }

    @Override // io.agora.rtc2.IH265Transcoder
    public int enableTranscode(String str, String str2, int i) {
        return this.mRtcEngineImpl.h265TranscoderEnableTranscode(str, str2, i);
    }

    @Override // io.agora.rtc2.IH265Transcoder
    public int queryChannel(String str, String str2, int i) {
        return this.mRtcEngineImpl.h265TranscoderQueryChannel(str, str2, i);
    }

    @Override // io.agora.rtc2.IH265Transcoder
    public int registerTranscoderObserver(IH265TranscoderObserver iH265TranscoderObserver) {
        return this.mRtcEngineImpl.h265TranscoderRegisterObserver(iH265TranscoderObserver);
    }

    @Override // io.agora.rtc2.IH265Transcoder
    public int triggerTranscode(String str, String str2, int i) {
        return this.mRtcEngineImpl.h265TranscoderTriggerTranscode(str, str2, i);
    }

    @Override // io.agora.rtc2.IH265Transcoder
    public int unregisterTranscoderObserver(IH265TranscoderObserver iH265TranscoderObserver) {
        return this.mRtcEngineImpl.h265TranscoderUnregisterObserver(iH265TranscoderObserver);
    }
}
