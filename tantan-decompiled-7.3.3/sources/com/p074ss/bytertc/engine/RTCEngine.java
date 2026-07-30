package com.p074ss.bytertc.engine;

import android.content.Intent;
import android.os.SystemClock;
import com.p074ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.p074ss.bytertc.engine.audio.IMediaPlayer;
import com.p074ss.bytertc.engine.audio.ISingScoringManager;
import com.p074ss.bytertc.engine.data.AlphaLayout;
import com.p074ss.bytertc.engine.data.AudioAlignmentMode;
import com.p074ss.bytertc.engine.data.AudioFormat;
import com.p074ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.p074ss.bytertc.engine.data.AudioProcessorMethod;
import com.p074ss.bytertc.engine.data.AudioPropertiesConfig;
import com.p074ss.bytertc.engine.data.AudioRecordingConfig;
import com.p074ss.bytertc.engine.data.AudioRenderType;
import com.p074ss.bytertc.engine.data.AudioRoute;
import com.p074ss.bytertc.engine.data.AudioSourceType;
import com.p074ss.bytertc.engine.data.CameraId;
import com.p074ss.bytertc.engine.data.CloudProxyInfo;
import com.p074ss.bytertc.engine.data.EarMonitorMode;
import com.p074ss.bytertc.engine.data.EchoTestConfig;
import com.p074ss.bytertc.engine.data.EffectBeautyMode;
import com.p074ss.bytertc.engine.data.EngineConfig;
import com.p074ss.bytertc.engine.data.MirrorType;
import com.p074ss.bytertc.engine.data.RTCLogConfig;
import com.p074ss.bytertc.engine.data.RecordingConfig;
import com.p074ss.bytertc.engine.data.RemoteMirrorType;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.data.SEICountPerFrame;
import com.p074ss.bytertc.engine.data.ScreenMediaType;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.data.StreamSyncInfoConfig;
import com.p074ss.bytertc.engine.data.VideoDenoiseMode;
import com.p074ss.bytertc.engine.data.VideoFrameData;
import com.p074ss.bytertc.engine.data.VideoOrientation;
import com.p074ss.bytertc.engine.data.VideoRotation;
import com.p074ss.bytertc.engine.data.VideoRotationMode;
import com.p074ss.bytertc.engine.data.VideoSimulcastMode;
import com.p074ss.bytertc.engine.data.VideoSourceType;
import com.p074ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.p074ss.bytertc.engine.data.ZoomConfigType;
import com.p074ss.bytertc.engine.data.ZoomDirectionType;
import com.p074ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p074ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p074ss.bytertc.engine.handler.RTCEncryptHandler;
import com.p074ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.p074ss.bytertc.engine.live.ClientMixedStreamConfig;
import com.p074ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.p074ss.bytertc.engine.live.IClientMixedStreamObserver;
import com.p074ss.bytertc.engine.live.MixedStreamConfig;
import com.p074ss.bytertc.engine.live.MixedStreamPushTargetConfig;
import com.p074ss.bytertc.engine.live.MixedStreamPushTargetType;
import com.p074ss.bytertc.engine.live.PushSingleStreamParam;
import com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.p074ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.p074ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.p074ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.p074ss.bytertc.engine.type.AnsMode;
import com.p074ss.bytertc.engine.type.AudioProfileType;
import com.p074ss.bytertc.engine.type.AudioScenarioType;
import com.p074ss.bytertc.engine.type.LocalProxyConfiguration;
import com.p074ss.bytertc.engine.type.MediaTypeEnhancementConfig;
import com.p074ss.bytertc.engine.type.MessageConfig;
import com.p074ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.p074ss.bytertc.engine.type.ProblemFeedbackOption;
import com.p074ss.bytertc.engine.type.PublishFallbackOption;
import com.p074ss.bytertc.engine.type.RecordingType;
import com.p074ss.bytertc.engine.type.RemoteUserPriority;
import com.p074ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.p074ss.bytertc.engine.type.TorchState;
import com.p074ss.bytertc.engine.type.VoiceChangerType;
import com.p074ss.bytertc.engine.type.VoiceEqualizationConfig;
import com.p074ss.bytertc.engine.type.VoiceReverbConfig;
import com.p074ss.bytertc.engine.type.VoiceReverbType;
import com.p074ss.bytertc.engine.utils.AudioFrame;
import com.p074ss.bytertc.engine.utils.EncodedAudioFrameData;
import com.p074ss.bytertc.engine.utils.EngineConfigCheck;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.utils.RTCEglContextChecker;
import com.p074ss.bytertc.engine.video.ISnapshotResultCallback;
import com.p074ss.bytertc.engine.video.IVideoDeviceManager;
import com.p074ss.bytertc.engine.video.IVideoEffect;
import com.p074ss.bytertc.engine.video.IVideoProcessor;
import com.p074ss.bytertc.engine.video.IVideoSink;
import com.p074ss.bytertc.engine.video.LocalVideoSinkConfig;
import com.p074ss.bytertc.engine.video.RTCWatermarkConfig;
import com.p074ss.bytertc.engine.video.RemoteVideoSinkConfig;
import com.p074ss.bytertc.engine.video.VideoCaptureConfig;
import com.p074ss.bytertc.engine.video.VideoDecoderConfig;
import com.p074ss.bytertc.engine.video.VideoPreprocessorConfig;
import com.p074ss.bytertc.ktv.IKTVManager;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class RTCEngine {
    private static final String TAG = "RtcVideo";
    protected static RTCEngineImpl mInstance;
    protected static RTCEngineImpl mInstanceEx;
    protected static RTCEglContextChecker mRtcEglContextChecker;
    protected static RTCNativeLibraryLoader mRtcNativeLibraryLoader;

    public static synchronized RTCEngine createRTCEngine(EngineConfig engineConfig, IRTCEngineEventHandler iRTCEngineEventHandler) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (EngineConfigCheck.checkValid(engineConfig) != 0) {
            LogUtil.m82084e(TAG, "createRTCEngine: engine config is invalid, error code is " + EngineConfigCheck.checkValid(engineConfig));
            return null;
        }
        if (engineConfig.parameters == null) {
            engineConfig.parameters = new JSONObject();
        }
        try {
            engineConfig.parameters.put("rtc.platform_init_elapse_ms", jElapsedRealtime);
        } catch (JSONException e) {
            LogUtil.m82084e(TAG, "error in obtain create engine time. " + e.getMessage());
        }
        if (!RTCEngineImpl.initializeNativeLibs(engineConfig.nativeLoadPath)) {
            LogUtil.m82084e(TAG, "createRTCEngine: fail to load native library");
            return null;
        }
        RTCEngineImpl rTCEngineImpl = mInstance;
        if (rTCEngineImpl != null) {
            return rTCEngineImpl;
        }
        try {
            RTCEngineImpl rTCEngineImpl2 = new RTCEngineImpl(engineConfig, iRTCEngineEventHandler, null, false, false);
            mInstance = rTCEngineImpl2;
            return rTCEngineImpl2;
        } catch (IllegalStateException e2) {
            LogUtil.m82084e(TAG, "createRTCEngine: throw exception " + e2.getMessage());
            return null;
        }
    }

    public static synchronized RTCEngine createRTCEngineMulti(EngineConfig engineConfig, IRTCEngineEventHandler iRTCEngineEventHandler) {
        if (EngineConfigCheck.checkValid(engineConfig) != 0) {
            LogUtil.m82084e(TAG, "createRTCEngine: engine config is invalid, error code is " + EngineConfigCheck.checkValid(engineConfig));
            return null;
        }
        if (!RTCEngineImpl.initializeNativeLibs(engineConfig.nativeLoadPath)) {
            LogUtil.m82084e(TAG, "createRTCEngine: fail to load native library");
            return null;
        }
        try {
            return new RTCEngineImpl(engineConfig, iRTCEngineEventHandler, null, false, true);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized void destroyRTCEngine() {
        RTCEngineImpl rTCEngineImpl = mInstance;
        if (rTCEngineImpl != null) {
            rTCEngineImpl.doDestroy(false);
            mInstance = null;
            mRtcNativeLibraryLoader = null;
            mRtcEglContextChecker = null;
            System.gc();
        }
    }

    public static synchronized void destroyRTCEngineMulti(RTCEngine rTCEngine) {
        if (rTCEngine != null) {
            try {
                if (rTCEngine == mInstance) {
                    destroyRTCEngine();
                } else {
                    ((RTCEngineImpl) rTCEngine).doDestroy(true);
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
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    public abstract int clearVideoWatermark(StreamIndex streamIndex);

    public abstract IGameRoom createGameRoom(String str, GameRoomConfig gameRoomConfig);

    public abstract RTCRoom createRTCRoom(String str);

    public abstract RTSRoom createRTSRoom(String str);

    public abstract int disableAlphaChannelVideoEncode(StreamIndex streamIndex);

    public abstract int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod);

    public abstract int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod);

    public abstract int enableAlphaChannelVideoEncode(StreamIndex streamIndex, AlphaLayout alphaLayout);

    public abstract int enableAudioAEDReport(int i);

    public abstract void enableAudioDecoding(boolean z);

    public abstract void enableAudioEncoding(boolean z);

    public abstract int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat);

    public abstract int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat);

    public abstract int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig);

    public abstract int enableAudioVADReport(int i);

    public abstract int enableCameraAutoExposureFaceMode(boolean z);

    public abstract int enableEffectBeauty(boolean z);

    public abstract int enableExternalSoundCard(boolean z);

    public abstract int enableLocalVoiceReverb(boolean z);

    public abstract int enablePlaybackDucking(boolean z);

    public abstract int enableVocalInstrumentBalance(boolean z);

    public abstract int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo);

    public abstract IRTCAudioDeviceManager getAudioDeviceManager();

    public abstract IAudioEffectPlayer getAudioEffectPlayer();

    public abstract AudioRoute getAudioRoute();

    public abstract float getCameraZoomMaxRatio();

    public abstract IKTVManager getKTVManager();

    public abstract IMediaPlayer getMediaPlayer(int i);

    public abstract long getNativeHandle();

    public abstract NetworkTimeInfo getNetworkTimeInfo();

    public abstract int getPeerOnlineStatus(String str);

    public abstract ISingScoringManager getSingScoringManager();

    public abstract IVideoDeviceManager getVideoDeviceManager();

    public abstract IVideoEffect getVideoEffectInterface();

    public abstract IWTNStream getWTNStream();

    public abstract boolean isCameraExposurePositionSupported();

    public abstract boolean isCameraFocusPositionSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract int login(String str, String str2);

    public abstract int logout();

    public abstract int muteAudioCapture(StreamIndex streamIndex, boolean z);

    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushClientMixedStreamExternalVideoFrame(String str, VideoFrameData videoFrameData);

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalEncodedAudioFrame(EncodedAudioFrameData encodedAudioFrameData);

    public abstract int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame);

    public abstract int pushExternalVideoFrame(VideoFrameData videoFrameData);

    public abstract int pushReferenceAudioPCMData(AudioFrame audioFrame);

    public abstract int pushScreenAudioFrame(AudioFrame audioFrame);

    public abstract int pushScreenVideoFrame(VideoFrameData videoFrameData);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor);

    public abstract int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver);

    public abstract int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig);

    public abstract void registerRemoteEncodedAudioFrameObserver(IRemoteEncodedAudioFrameObserver iRemoteEncodedAudioFrameObserver);

    public abstract int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver);

    public abstract int requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey);

    public abstract int sendPublicStreamSEIMessage(StreamIndex streamIndex, int i, byte[] bArr, int i2, SEICountPerFrame sEICountPerFrame);

    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame);

    public abstract long sendServerBinaryMessage(byte[] bArr);

    public abstract long sendServerMessage(String str);

    public abstract int sendStreamSyncInfo(byte[] bArr, StreamSyncInfoConfig streamSyncInfoConfig);

    public abstract long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig);

    public abstract long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig);

    public abstract int setAnsMode(AnsMode ansMode);

    public abstract int setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode);

    public abstract int setAudioProfile(AudioProfileType audioProfileType);

    public abstract int setAudioRenderType(AudioRenderType audioRenderType);

    public abstract int setAudioRoute(AudioRoute audioRoute);

    public abstract int setAudioScenario(AudioScenarioType audioScenarioType);

    public abstract int setAudioSourceType(AudioSourceType audioSourceType);

    public abstract int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f);

    public abstract int setBusinessId(String str);

    public abstract int setCameraAdaptiveMinimumFrameRate(int i);

    public abstract int setCameraExposureCompensation(float f);

    public abstract int setCameraExposurePosition(float f, float f2);

    public abstract int setCameraFocusPosition(float f, float f2);

    public abstract int setCameraTorch(TorchState torchState);

    public abstract int setCameraZoomRatio(float f);

    public abstract int setCaptureVolume(StreamIndex streamIndex, int i);

    public abstract int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig);

    public abstract int setClientMixedStreamObserver(IClientMixedStreamObserver iClientMixedStreamObserver);

    public abstract int setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler);

    public abstract int setDefaultAudioRoute(AudioRoute audioRoute);

    public abstract int setDummyCaptureImagePath(String str);

    public abstract int setEarMonitorMode(EarMonitorMode earMonitorMode);

    public abstract int setEarMonitorMode(EarMonitorMode earMonitorMode, int i);

    public abstract int setEarMonitorVolume(int i);

    public abstract int setEncryptInfo(int i, String str);

    public abstract int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler);

    public abstract int setLocalProxy(List<LocalProxyConfiguration> list);

    public abstract int setLocalSimulcastMode(VideoSimulcastMode videoSimulcastMode);

    public abstract int setLocalSimulcastMode(VideoSimulcastMode videoSimulcastMode, VideoEncoderConfig[] videoEncoderConfigArr);

    public abstract int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas);

    public abstract int setLocalVideoMirrorType(MirrorType mirrorType);

    @Deprecated
    public abstract int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i);

    public abstract int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, LocalVideoSinkConfig localVideoSinkConfig);

    public abstract int setLocalVoiceEqualization(VoiceEqualizationConfig voiceEqualizationConfig);

    public abstract int setLocalVoicePitch(int i);

    public abstract int setLocalVoiceReverbParam(VoiceReverbConfig voiceReverbConfig);

    public abstract int setPlaybackVolume(int i);

    public abstract int setPublishFallbackOption(PublishFallbackOption publishFallbackOption);

    public abstract int setRemoteAudioPlaybackVolume(RemoteStreamKey remoteStreamKey, int i);

    public abstract int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority);

    public abstract int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas);

    public abstract int setRemoteVideoMirrorType(RemoteStreamKey remoteStreamKey, RemoteMirrorType remoteMirrorType);

    @Deprecated
    public abstract int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i);

    public abstract int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, RemoteVideoSinkConfig remoteVideoSinkConfig);

    public abstract int setRemoteVideoSuperResolution(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode);

    public abstract int setRtcVideoEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler);

    public abstract int setRuntimeParameters(JSONObject jSONObject);

    public abstract int setScreenAudioSourceType(AudioSourceType audioSourceType);

    public abstract int setScreenAudioStreamIndex(StreamIndex streamIndex);

    public abstract int setScreenVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    public abstract int setServerParams(String str, String str2);

    public abstract int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    public abstract int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig);

    public abstract int setVideoCaptureRotation(VideoRotation videoRotation);

    public abstract int setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig);

    public abstract int setVideoDenoiser(VideoDenoiseMode videoDenoiseMode);

    public abstract int setVideoDigitalZoomConfig(ZoomConfigType zoomConfigType, float f);

    public abstract int setVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig, JSONObject jSONObject);

    public abstract int setVideoOrientation(VideoOrientation videoOrientation);

    public abstract int setVideoRotationMode(VideoRotationMode videoRotationMode);

    public abstract int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType);

    public abstract int setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig);

    public abstract int setVoiceChangerType(VoiceChangerType voiceChangerType);

    public abstract int setVoiceReverbType(VoiceReverbType voiceReverbType);

    public abstract int startAudioCapture();

    public abstract int startAudioRecording(AudioRecordingConfig audioRecordingConfig);

    public abstract int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver);

    public abstract int startClientMixedStream(String str, MixedStreamConfig mixedStreamConfig, ClientMixedStreamConfig clientMixedStreamConfig);

    public abstract int startCloudProxy(List<CloudProxyInfo> list);

    public abstract int startEchoTest(EchoTestConfig echoTestConfig, int i);

    public abstract int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType);

    public abstract int startHardwareEchoDetection(String str);

    public abstract int startNetworkDetection(boolean z, int i, boolean z2, int i2);

    public abstract int startPushMixedStream(String str, MixedStreamPushTargetConfig mixedStreamPushTargetConfig, MixedStreamConfig mixedStreamConfig);

    public abstract int startPushSingleStream(String str, PushSingleStreamParam pushSingleStreamParam);

    public abstract int startScreenCapture(ScreenMediaType screenMediaType, Intent intent);

    public abstract int startVideoCapture();

    public abstract int startVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType);

    public abstract int stopAudioCapture();

    public abstract int stopAudioRecording();

    public abstract int stopChorusCacheSync();

    public abstract int stopClientMixedStream(String str);

    public abstract int stopCloudProxy();

    public abstract int stopEchoTest();

    public abstract int stopFileRecording(StreamIndex streamIndex);

    public abstract int stopHardwareEchoDetection();

    public abstract int stopNetworkDetection();

    public abstract int stopPushMixedStream(String str, MixedStreamPushTargetType mixedStreamPushTargetType);

    public abstract int stopPushSingleStream(String str);

    public abstract int stopScreenCapture();

    public abstract int stopVideoCapture();

    public abstract int stopVideoDigitalZoomControl();

    public abstract int switchCamera(CameraId cameraId);

    public abstract long takeLocalSnapshot(StreamIndex streamIndex, ISnapshotResultCallback iSnapshotResultCallback);

    public abstract long takeRemoteSnapshot(RemoteStreamKey remoteStreamKey, ISnapshotResultCallback iSnapshotResultCallback);

    public abstract long takeSnapshotToFile(RemoteStreamKey remoteStreamKey, String str);

    public abstract int updateClientMixedStream(String str, MixedStreamConfig mixedStreamConfig, ClientMixedStreamConfig clientMixedStreamConfig);

    public abstract int updateLocalVideoCanvas(StreamIndex streamIndex, int i, int i2);

    public abstract int updateLoginToken(String str);

    public abstract int updatePushMixedStream(String str, MixedStreamPushTargetConfig mixedStreamPushTargetConfig, MixedStreamConfig mixedStreamConfig);

    public abstract int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, int i, int i2);

    public abstract int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, RemoteVideoRenderConfig remoteVideoRenderConfig);

    public abstract int updateScreenCapture(ScreenMediaType screenMediaType);
}
