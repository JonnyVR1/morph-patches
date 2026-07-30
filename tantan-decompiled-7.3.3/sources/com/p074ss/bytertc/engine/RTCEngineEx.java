package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.data.AudioContentTypeConfig;
import com.p074ss.bytertc.engine.data.AudioEncodeConfig;
import com.p074ss.bytertc.engine.data.EngineConfig;
import com.p074ss.bytertc.engine.data.RTCLogConfig;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.data.StreamPriority;
import com.p074ss.bytertc.engine.data.VideoFrameData;
import com.p074ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.p074ss.bytertc.engine.utils.EngineConfigCheck;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.video.VideoCaptureConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class RTCEngineEx extends RTCEngine {
    private static final String TAG = "RtcVideoEx";

    public static synchronized RTCEngineEx createRTCEngineEx(EngineConfig engineConfig, IRTCEngineEventHandler iRTCEngineEventHandler, IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx) {
        if (EngineConfigCheck.checkValid(engineConfig) != 0) {
            LogUtil.m82084e(TAG, "createRTCEngineEx: engine config is invalid, error code is " + EngineConfigCheck.checkValid(engineConfig));
            return null;
        }
        if (RTCEngine.mInstance != null || !RTCEngineImpl.initializeNativeLibs(engineConfig.nativeLoadPath)) {
            return null;
        }
        if (RTCEngine.mInstanceEx == null) {
            try {
                RTCEngine.mInstanceEx = new RTCEngineImpl(engineConfig, iRTCEngineEventHandler, iRTCEngineEventHandlerEx, true, false);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return RTCEngine.mInstanceEx;
    }

    public static synchronized RTCEngineEx createRTCEngineExMulti(EngineConfig engineConfig, IRTCEngineEventHandler iRTCEngineEventHandler, IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx) {
        if (EngineConfigCheck.checkValid(engineConfig) != 0) {
            LogUtil.m82084e(TAG, "createRTCEngine: engine config is invalid, error code is " + EngineConfigCheck.checkValid(engineConfig));
            return null;
        }
        if (!RTCEngineImpl.initializeNativeLibs(engineConfig.nativeLoadPath)) {
            LogUtil.m82084e(TAG, "createRTCEngine: fail to load native library");
            return null;
        }
        try {
            return new RTCEngineImpl(engineConfig, iRTCEngineEventHandler, iRTCEngineEventHandlerEx, true, true);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized void destroyRTCEngineEx() {
        RTCEngineImpl rTCEngineImpl = RTCEngine.mInstanceEx;
        if (rTCEngineImpl != null) {
            rTCEngineImpl.doDestroy(false);
            RTCEngine.mInstanceEx = null;
            RTCEngine.mRtcNativeLibraryLoader = null;
            RTCEngine.mRtcEglContextChecker = null;
            System.gc();
        }
    }

    public static synchronized void destroyRTCEngineExMulti(RTCEngineEx rTCEngineEx) {
        if (rTCEngineEx != null) {
            try {
                if (rTCEngineEx == RTCEngine.mInstanceEx) {
                    destroyRTCEngineEx();
                } else {
                    ((RTCEngineImpl) rTCEngineEx).doDestroy(true);
                    System.gc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getSDKVersion() {
        return !RTCEngineImpl.initializeNativeLibs() ? "" : RTCEngineImpl.getSdkVersion();
    }

    public static int setLogConfig(RTCLogConfig rTCLogConfig) {
        if (RTCEngineImpl.initializeNativeLibs()) {
            return RTCEngineImpl.setLogConfig(rTCLogConfig);
        }
        return -1;
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        LogUtil.m82086i(TAG, "set rtc native library loader" + rTCNativeLibraryLoader);
        RTCEngine.setRtcNativeLibraryLoader(rTCNativeLibraryLoader);
    }

    public abstract RTCRoomEx createRTCRoomEx(String str);

    public abstract int pushExternalVideoFrame(StreamIndex streamIndex, VideoFrameData videoFrameData);

    public abstract int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig);

    public abstract int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig);

    public abstract int setAudioSourceVolume(StreamIndex streamIndex, int i);

    public abstract int setCaptureVolume(int i);

    public abstract int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority);

    public abstract int setRtcVideoEventHandlerEx(IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx);

    public abstract int setScreenCaptureVolume(int i);

    public abstract int setVideoCaptureConfig(StreamIndex streamIndex, VideoCaptureConfig videoCaptureConfig);

    public abstract int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoEncoderConfig> list);

    public abstract int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig);

    public abstract int startVideoCapture(StreamIndex streamIndex, String str);

    public abstract int stopVideoCapture(StreamIndex streamIndex);
}
