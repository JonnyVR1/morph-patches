package io.agora.rtc2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.projection.MediaProjection;
import android.os.SystemClock;
import io.agora.base.VideoFrame;
import io.agora.mediaplayer.IMediaPlayer;
import io.agora.mediaplayer.IMediaPlayerCacheManager;
import io.agora.rtc2.audio.AdvancedAudioOptions;
import io.agora.rtc2.audio.AgoraRhythmPlayerConfig;
import io.agora.rtc2.audio.AudioTrackConfig;
import io.agora.rtc2.audio.IAudioSpectrumObserver;
import io.agora.rtc2.internal.AudioEncodedFrameObserverConfig;
import io.agora.rtc2.internal.AudioRecordingConfiguration;
import io.agora.rtc2.internal.EncryptionConfig;
import io.agora.rtc2.internal.LastmileProbeConfig;
import io.agora.rtc2.internal.RtcEngineImpl;
import io.agora.rtc2.live.LiveTranscoding;
import io.agora.rtc2.proxy.LocalAccessPointConfiguration;
import io.agora.rtc2.video.AgoraFocalLengthInfo;
import io.agora.rtc2.video.AgoraImage;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.rtc2.video.BeautyOptions;
import io.agora.rtc2.video.CameraCapturerConfiguration;
import io.agora.rtc2.video.ChannelMediaRelayConfiguration;
import io.agora.rtc2.video.CodecCapInfo;
import io.agora.rtc2.video.ColorEnhanceOptions;
import io.agora.rtc2.video.ContentInspectConfig;
import io.agora.rtc2.video.EncodedVideoFrameInfo;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import io.agora.rtc2.video.FaceShapeBeautyOptions;
import io.agora.rtc2.video.FilterEffectOptions;
import io.agora.rtc2.video.IFaceInfoObserver;
import io.agora.rtc2.video.IVideoEncodedFrameObserver;
import io.agora.rtc2.video.IVideoFrameObserver;
import io.agora.rtc2.video.ImageTrackOptions;
import io.agora.rtc2.video.LowLightEnhanceOptions;
import io.agora.rtc2.video.SegmentationProperty;
import io.agora.rtc2.video.SnapshotConfig;
import io.agora.rtc2.video.VideoCanvas;
import io.agora.rtc2.video.VideoDenoiserOptions;
import io.agora.rtc2.video.VideoEncoderConfiguration;
import io.agora.rtc2.video.VideoSubscriptionOptions;
import io.agora.rtc2.video.VirtualBackgroundSource;
import io.agora.rtc2.video.WatermarkOptions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RtcEngine {
    protected static RtcEngineImpl mInstance;

    public static synchronized RtcEngine create(RtcEngineConfig rtcEngineConfig) throws Exception {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (rtcEngineConfig != null && rtcEngineConfig.mContext != null && RtcEngineImpl.initializeNativeLibs(rtcEngineConfig.mNativeLibPath)) {
            RtcEngineImpl rtcEngineImpl = mInstance;
            if (rtcEngineImpl == null) {
                RtcEngineImpl rtcEngineImpl2 = new RtcEngineImpl(rtcEngineConfig);
                mInstance = rtcEngineImpl2;
                rtcEngineImpl2.recordCreateEngineTimeStamp(jUptimeMillis, SystemClock.uptimeMillis());
                return mInstance;
            }
            if (rtcEngineConfig.mAppId.equals(rtcEngineImpl.getAppId())) {
                mInstance.reinitialize(rtcEngineConfig);
            } else {
                mInstance.leaveChannel();
                mInstance.doDestroy();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                RtcEngineImpl rtcEngineImpl3 = new RtcEngineImpl(rtcEngineConfig);
                mInstance = rtcEngineImpl3;
                rtcEngineImpl3.recordCreateEngineTimeStamp(jUptimeMillis2, SystemClock.uptimeMillis());
            }
            return mInstance;
        }
        return null;
    }

    public static synchronized void destroy() {
        RtcEngineImpl rtcEngineImpl = mInstance;
        if (rtcEngineImpl == null) {
            return;
        }
        rtcEngineImpl.doDestroy();
        mInstance = null;
        System.gc();
    }

    public static String getErrorDescription(int i) {
        return !RtcEngineImpl.initializeNativeLibs() ? "" : RtcEngineImpl.nativeGetErrorDescription(i);
    }

    @Deprecated
    public static String getMediaEngineVersion() {
        return !RtcEngineImpl.initializeNativeLibs() ? "" : RtcEngineImpl.nativeGetMediaEngineVersion();
    }

    @Deprecated
    public static int getRecommendedEncoderType() {
        return 0;
    }

    public static String getSdkVersion() {
        return !RtcEngineImpl.initializeNativeLibs() ? "" : RtcEngineImpl.nativeGetSdkVersion();
    }

    public void addHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        mInstance.addHandler(iRtcEngineEventHandler);
    }

    @Deprecated
    public abstract int addVideoWatermark(AgoraImage agoraImage);

    public abstract int addVideoWatermark(String str, WatermarkOptions watermarkOptions);

    public abstract int adjustAudioMixingPlayoutVolume(int i);

    public abstract int adjustAudioMixingPublishVolume(int i);

    public abstract int adjustAudioMixingVolume(int i);

    public abstract int adjustCustomAudioPlayoutVolume(int i, int i2);

    public abstract int adjustCustomAudioPublishVolume(int i, int i2);

    public abstract int adjustPlaybackSignalVolume(int i);

    public abstract int adjustRecordingSignalVolume(int i);

    public abstract int adjustUserPlaybackSignalVolume(int i, int i2);

    public abstract int clearVideoWatermarks();

    public abstract int complain(String str, String str2);

    public abstract int configRhythmPlayer(AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    public abstract int createCustomAudioTrack(Constants.AudioTrackType audioTrackType, AudioTrackConfig audioTrackConfig);

    public abstract int createCustomEncodedVideoTrack(EncodedVideoTrackOptions encodedVideoTrackOptions);

    public abstract int createCustomVideoTrack();

    public abstract int createDataStream(DataStreamConfig dataStreamConfig);

    public abstract int createDataStream(boolean z, boolean z2);

    public abstract IMediaPlayer createMediaPlayer();

    public abstract AgoraMediaRecorder createMediaRecorder(RecorderStreamInfo recorderStreamInfo);

    public abstract int destroyCustomAudioTrack(int i);

    public abstract int destroyCustomEncodedVideoTrack(int i);

    public abstract int destroyCustomVideoTrack(int i);

    public abstract void destroyMediaRecorder(AgoraMediaRecorder agoraMediaRecorder);

    public abstract int disableAudio();

    public abstract int disableAudioSpectrumMonitor();

    public abstract int disableVideo();

    public abstract int enableAudio();

    public abstract int enableAudioSpectrumMonitor(int i);

    public abstract int enableAudioVolumeIndication(int i, int i2, boolean z);

    public abstract int enableContentInspect(boolean z, ContentInspectConfig contentInspectConfig);

    public abstract int enableCustomAudioLocalPlayback(int i, boolean z);

    @Deprecated
    public abstract int enableDualStreamMode(boolean z);

    @Deprecated
    public abstract int enableDualStreamMode(boolean z, SimulcastStreamConfig simulcastStreamConfig);

    public abstract int enableEncryption(boolean z, EncryptionConfig encryptionConfig);

    public abstract int enableExtension(String str, String str2, ExtensionInfo extensionInfo, boolean z);

    public abstract int enableExtension(String str, String str2, boolean z);

    public abstract int enableExtension(String str, String str2, boolean z, Constants.MediaSourceType mediaSourceType);

    public abstract int enableExternalAudioSourceLocalPlayback(boolean z);

    public abstract int enableFaceDetection(boolean z);

    @Deprecated
    public abstract boolean enableHighPerfWifiMode(boolean z);

    public abstract int enableInEarMonitoring(boolean z);

    public abstract int enableInEarMonitoring(boolean z, int i);

    public abstract int enableInstantMediaRendering();

    public abstract int enableLocalAudio(boolean z);

    public abstract int enableLocalVideo(boolean z);

    public abstract int enableSoundPositionIndication(boolean z);

    public abstract int enableSpatialAudio(boolean z);

    public abstract int enableVideo();

    public abstract int enableVideoImageSource(boolean z, ImageTrackOptions imageTrackOptions);

    public abstract int enableVirtualBackground(boolean z, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty);

    public abstract int enableVirtualBackground(boolean z, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty, Constants.MediaSourceType mediaSourceType);

    public abstract int enableVoiceAITuner(boolean z, Constants.VOICE_AI_TUNER_TYPE voice_ai_tuner_type);

    public abstract int enableWebSdkInteroperability(boolean z);

    public abstract int enableWirelessAccelerate(boolean z);

    public abstract DeviceInfo getAudioDeviceInfo();

    public abstract IAudioEffectManager getAudioEffectManager();

    public abstract int getAudioMixingCurrentPosition();

    public abstract int getAudioMixingDuration();

    public abstract int getAudioMixingPlayoutVolume();

    public abstract int getAudioMixingPublishVolume();

    public abstract int getAudioTrackCount();

    public abstract String getCallId();

    public abstract float getCameraMaxZoomFactor();

    public abstract int getConnectionState();

    public abstract long getCurrentMonotonicTimeInMs();

    public abstract int getEffectCurrentPosition(int i);

    public abstract int getEffectDuration(String str);

    public abstract double getEffectsVolume();

    public abstract String getExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3);

    public abstract String getExtensionProperty(String str, String str2, String str3);

    public abstract String getExtensionProperty(String str, String str2, String str3, Constants.MediaSourceType mediaSourceType);

    public abstract FaceShapeAreaOptions getFaceShapeAreaOptions(int i);

    public abstract FaceShapeAreaOptions getFaceShapeAreaOptions(int i, Constants.MediaSourceType mediaSourceType);

    public abstract FaceShapeBeautyOptions getFaceShapeBeautyOptions();

    public abstract FaceShapeBeautyOptions getFaceShapeBeautyOptions(Constants.MediaSourceType mediaSourceType);

    public abstract IH265Transcoder getH265Transcoder();

    public abstract IMediaPlayerCacheManager getMediaPlayerCacheManager();

    public abstract long getNativeHandle();

    public abstract long getNativeMediaPlayer(int i);

    public abstract int getNetworkType();

    public abstract long getNtpWallTimeInMs();

    public abstract String getParameter(String str, String str2);

    public abstract String getParameters(String str);

    public abstract int getUserInfoByUid(int i, UserInfo userInfo);

    public abstract int getUserInfoByUserAccount(String str, UserInfo userInfo);

    public abstract int getVolumeOfEffect(int i);

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraExposurePositionSupported();

    public abstract boolean isCameraExposureSupported();

    public abstract boolean isCameraFaceDetectSupported();

    public abstract boolean isCameraFocusSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract boolean isFeatureAvailableOnDevice(int i);

    public abstract boolean isSpeakerphoneEnabled();

    public abstract boolean isTextureEncodeSupported();

    public abstract int joinChannel(String str, String str2, int i, ChannelMediaOptions channelMediaOptions);

    public abstract int joinChannel(String str, String str2, String str3, int i);

    public abstract int joinChannelWithUserAccount(String str, String str2, String str3);

    public abstract int joinChannelWithUserAccount(String str, String str2, String str3, ChannelMediaOptions channelMediaOptions);

    public abstract int leaveChannel();

    public abstract int leaveChannel(LeaveChannelOptions leaveChannelOptions);

    public abstract int loadExtensionProvider(String str);

    @Deprecated
    public abstract void monitorBluetoothHeadsetEvent(boolean z);

    @Deprecated
    public abstract void monitorHeadsetEvent(boolean z);

    public abstract int muteAllRemoteAudioStreams(boolean z);

    public abstract int muteAllRemoteVideoStreams(boolean z);

    public abstract int muteLocalAudioStream(boolean z);

    public abstract int muteLocalVideoStream(boolean z);

    public abstract int muteRecordingSignal(boolean z);

    public abstract int muteRemoteAudioStream(int i, boolean z);

    public abstract int muteRemoteVideoStream(int i, boolean z);

    public abstract int pauseAllChannelMediaRelay();

    public abstract int pauseAllEffects();

    public abstract int pauseAudio();

    public abstract int pauseAudioMixing();

    public abstract int pauseEffect(int i);

    public abstract int playAllEffects(int i, double d, double d2, double d3, boolean z);

    public abstract int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z);

    public abstract int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z, int i3);

    public abstract int preloadChannel(String str, String str2, int i);

    public abstract int preloadChannelWithUserAccount(String str, String str2, String str3);

    public abstract int preloadEffect(int i, String str);

    public abstract int preloadEffect(int i, String str, int i2);

    public abstract int pullPlaybackAudioFrame(ByteBuffer byteBuffer, int i);

    public abstract int pullPlaybackAudioFrame(byte[] bArr, int i);

    @Deprecated
    public abstract int pushExternalAudioFrame(ByteBuffer byteBuffer, long j, int i);

    public abstract int pushExternalAudioFrame(ByteBuffer byteBuffer, long j, int i, int i2, Constants.BytesPerSample bytesPerSample, int i3);

    @Deprecated
    public abstract int pushExternalAudioFrame(byte[] bArr, long j);

    public abstract int pushExternalAudioFrame(byte[] bArr, long j, int i, int i2, Constants.BytesPerSample bytesPerSample, int i3);

    @Deprecated
    public abstract int pushExternalEncodedVideoFrame(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo);

    public abstract int pushExternalEncodedVideoFrameById(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo, int i);

    @Deprecated
    public abstract boolean pushExternalVideoFrame(VideoFrame videoFrame);

    @Deprecated
    public abstract boolean pushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame);

    public abstract int pushExternalVideoFrameById(VideoFrame videoFrame, int i);

    public abstract int pushExternalVideoFrameById(AgoraVideoFrame agoraVideoFrame, int i);

    public abstract AgoraFocalLengthInfo[] queryCameraFocalLengthCapability();

    public abstract CodecCapInfo[] queryCodecCapability();

    public abstract int queryDeviceScore();

    public abstract int queryScreenCaptureCapability();

    public abstract int rate(String str, int i, String str2);

    public abstract int registerAudioEncodedFrameObserver(AudioEncodedFrameObserverConfig audioEncodedFrameObserverConfig, IAudioEncodedFrameObserver iAudioEncodedFrameObserver);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int registerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver);

    public abstract int registerExtension(String str, String str2, Constants.MediaSourceType mediaSourceType);

    public abstract int registerFaceInfoObserver(IFaceInfoObserver iFaceInfoObserver);

    public abstract int registerLocalUserAccount(String str, String str2);

    public abstract int registerMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i);

    public abstract int registerVideoEncodedFrameObserver(IVideoEncodedFrameObserver iVideoEncodedFrameObserver);

    public abstract int registerVideoFrameObserver(IVideoFrameObserver iVideoFrameObserver);

    public void removeHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        mInstance.removeHandler(iRtcEngineEventHandler);
    }

    public abstract int renewToken(String str);

    public abstract int resumeAllChannelMediaRelay();

    public abstract int resumeAllEffects();

    public abstract int resumeAudio();

    public abstract int resumeAudioMixing();

    public abstract int resumeEffect(int i);

    public abstract int selectAudioTrack(int i);

    public abstract int sendAudioMetadata(byte[] bArr);

    public abstract int sendCustomReportMessage(String str, String str2, String str3, String str4, int i);

    public abstract int sendStreamMessage(int i, byte[] bArr);

    public abstract int setAINSMode(boolean z, int i);

    public abstract int setAVSyncSource(String str, int i);

    public abstract int setAdvancedAudioOptions(AdvancedAudioOptions advancedAudioOptions);

    public abstract int setAudioEffectParameters(int i, int i2, int i3);

    public abstract int setAudioEffectPreset(int i);

    public abstract int setAudioMixingDualMonoMode(Constants.AudioMixingDualMonoMode audioMixingDualMonoMode);

    public abstract int setAudioMixingPitch(int i);

    public abstract int setAudioMixingPlaybackSpeed(int i);

    public abstract int setAudioMixingPosition(int i);

    public abstract int setAudioProfile(int i);

    public abstract int setAudioProfile(int i, int i2);

    public abstract int setAudioScenario(int i);

    public abstract int setBeautyEffectOptions(boolean z, BeautyOptions beautyOptions);

    public abstract int setBeautyEffectOptions(boolean z, BeautyOptions beautyOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setCameraAutoFocusFaceModeEnabled(boolean z);

    public abstract int setCameraCapturerConfiguration(CameraCapturerConfiguration cameraCapturerConfiguration);

    public abstract int setCameraExposureFactor(int i);

    public abstract int setCameraExposurePosition(float f, float f2);

    public abstract int setCameraFocusPositionInPreview(float f, float f2);

    public abstract int setCameraTorchOn(boolean z);

    public abstract int setCameraZoomFactor(float f);

    public abstract int setChannelProfile(int i);

    public abstract int setClientRole(int i);

    public abstract int setClientRole(int i, ClientRoleOptions clientRoleOptions);

    public abstract int setCloudProxy(int i);

    public abstract int setColorEnhanceOptions(boolean z, ColorEnhanceOptions colorEnhanceOptions);

    public abstract int setColorEnhanceOptions(boolean z, ColorEnhanceOptions colorEnhanceOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setDefaultAudioRoutetoSpeakerphone(boolean z);

    public abstract int setDirectCdnStreamingAudioConfiguration(int i);

    public abstract int setDirectCdnStreamingVideoConfiguration(VideoEncoderConfiguration videoEncoderConfiguration);

    public abstract int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode);

    public abstract int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode, SimulcastStreamConfig simulcastStreamConfig);

    public abstract int setEarMonitoringAudioFrameParameters(int i, int i2, int i3, int i4);

    public abstract int setEffectPosition(int i, int i2);

    public abstract int setEffectsVolume(double d);

    public abstract int setEnableSpeakerphone(boolean z);

    public abstract int setExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3, String str4);

    public abstract int setExtensionProperty(String str, String str2, String str3, String str4);

    public abstract int setExtensionProperty(String str, String str2, String str3, String str4, Constants.MediaSourceType mediaSourceType);

    public abstract int setExtensionProviderProperty(String str, String str2, String str3);

    public abstract int setExternalAudioSink(boolean z, int i, int i2);

    @Deprecated
    public abstract int setExternalAudioSource(boolean z, int i, int i2);

    @Deprecated
    public abstract int setExternalAudioSource(boolean z, int i, int i2, boolean z2, boolean z3);

    public abstract int setExternalMediaProjection(MediaProjection mediaProjection);

    public abstract int setExternalRemoteEglContext(Object obj);

    public abstract int setExternalVideoSource(boolean z, boolean z2, Constants.ExternalVideoSourceType externalVideoSourceType);

    public abstract int setExternalVideoSource(boolean z, boolean z2, Constants.ExternalVideoSourceType externalVideoSourceType, EncodedVideoTrackOptions encodedVideoTrackOptions);

    public abstract int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions);

    public abstract int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setFaceShapeBeautyOptions(boolean z, FaceShapeBeautyOptions faceShapeBeautyOptions);

    public abstract int setFaceShapeBeautyOptions(boolean z, FaceShapeBeautyOptions faceShapeBeautyOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setFilterEffectOptions(boolean z, FilterEffectOptions filterEffectOptions);

    public abstract int setFilterEffectOptions(boolean z, FilterEffectOptions filterEffectOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setHeadphoneEQParameters(int i, int i2);

    public abstract int setHeadphoneEQPreset(int i);

    public abstract int setHighPriorityUserList(int[] iArr, int i);

    public abstract int setHighQualityAudioParameters(boolean z, boolean z2, boolean z3);

    public abstract int setInEarMonitoringVolume(int i);

    public abstract int setLocalAccessPoint(LocalAccessPointConfiguration localAccessPointConfiguration);

    @Deprecated
    public abstract int setLocalPublishFallbackOption(int i);

    public abstract int setLocalPublishFallbackOption(Constants.StreamFallbackOptions streamFallbackOptions);

    @Deprecated
    public abstract int setLocalRenderMode(int i);

    public abstract int setLocalRenderMode(int i, int i2);

    public abstract int setLocalRenderTargetFps(Constants.VideoSourceType videoSourceType, int i);

    @Deprecated
    public abstract int setLocalVideoMirrorMode(int i);

    public abstract int setLocalVoiceEqualization(Constants.AUDIO_EQUALIZATION_BAND_FREQUENCY audio_equalization_band_frequency, int i);

    public abstract int setLocalVoiceFormant(double d);

    public abstract int setLocalVoicePitch(double d);

    public abstract int setLocalVoiceReverb(Constants.AUDIO_REVERB_TYPE audio_reverb_type, int i);

    public abstract int setLogFile(String str);

    public abstract int setLogFileSize(long j);

    public abstract int setLogFilter(int i);

    public abstract int setLogLevel(int i);

    public abstract int setLowlightEnhanceOptions(boolean z, LowLightEnhanceOptions lowLightEnhanceOptions);

    public abstract int setLowlightEnhanceOptions(boolean z, LowLightEnhanceOptions lowLightEnhanceOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setMixedAudioFrameParameters(int i, int i2, int i3);

    public abstract int setParameters(String str);

    public abstract int setPlaybackAudioFrameBeforeMixingParameters(int i, int i2);

    public abstract int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4);

    @Deprecated
    public abstract void setPreferHeadset(boolean z);

    public abstract int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4);

    @Deprecated
    public abstract int setRemoteDefaultVideoStreamType(int i);

    public abstract int setRemoteDefaultVideoStreamType(Constants.VideoStreamType videoStreamType);

    @Deprecated
    public abstract int setRemoteRenderMode(int i, int i2);

    public abstract int setRemoteRenderMode(int i, int i2, int i3);

    public abstract int setRemoteRenderTargetFps(int i);

    @Deprecated
    public abstract int setRemoteSubscribeFallbackOption(int i);

    public abstract int setRemoteSubscribeFallbackOption(Constants.StreamFallbackOptions streamFallbackOptions);

    public abstract int setRemoteUserPriority(int i, int i2);

    public abstract int setRemoteUserSpatialAudioParams(int i, SpatialAudioParams spatialAudioParams);

    @Deprecated
    public abstract int setRemoteVideoStreamType(int i, int i2);

    public abstract int setRemoteVideoStreamType(int i, Constants.VideoStreamType videoStreamType);

    public abstract int setRemoteVideoSubscriptionOptions(int i, VideoSubscriptionOptions videoSubscriptionOptions);

    public abstract int setRemoteVoicePosition(int i, double d, double d2);

    public abstract int setRouteInCommunicationMode(int i);

    public abstract int setScreenCaptureScenario(Constants.ScreenScenarioType screenScenarioType);

    public abstract int setSimulcastConfig(SimulcastConfig simulcastConfig);

    public abstract int setSubscribeAudioAllowlist(int[] iArr);

    public abstract int setSubscribeAudioBlocklist(int[] iArr);

    public abstract int setSubscribeVideoAllowlist(int[] iArr);

    public abstract int setSubscribeVideoBlocklist(int[] iArr);

    public abstract int setVideoDenoiserOptions(boolean z, VideoDenoiserOptions videoDenoiserOptions);

    public abstract int setVideoDenoiserOptions(boolean z, VideoDenoiserOptions videoDenoiserOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration);

    public abstract int setVideoQoEPreference(Constants.QoEPreference qoEPreference);

    public abstract int setVideoQualityParameters(boolean z);

    public abstract int setVideoScenario(Constants.VideoScenario videoScenario);

    public abstract int setVoiceBeautifierParameters(int i, int i2, int i3);

    public abstract int setVoiceBeautifierPreset(int i);

    public abstract int setVoiceConversionParameters(int i, int i2, int i3);

    public abstract int setVoiceConversionPreset(int i);

    public abstract int setVolumeOfEffect(int i, double d);

    public abstract int setupAudioAttributes(AudioAttributes audioAttributes);

    public abstract int setupLocalVideo(VideoCanvas videoCanvas);

    public abstract int setupRemoteVideo(VideoCanvas videoCanvas);

    public abstract int startAudioMixing(String str, boolean z, int i);

    public abstract int startAudioMixing(String str, boolean z, int i, int i2);

    public abstract int startAudioRecording(AudioRecordingConfiguration audioRecordingConfiguration);

    public abstract int startAudioRecording(String str, int i);

    public abstract int startCameraCapture(Constants.VideoSourceType videoSourceType, CameraCapturerConfiguration cameraCapturerConfiguration);

    public abstract int startDirectCdnStreaming(IDirectCdnStreamingEventHandler iDirectCdnStreamingEventHandler, String str, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    public abstract int startEchoTest(EchoTestConfiguration echoTestConfiguration);

    public abstract int startLastmileProbeTest(LastmileProbeConfig lastmileProbeConfig);

    public abstract int startLocalAudioMixer(LocalAudioMixerConfiguration localAudioMixerConfiguration);

    public abstract int startLocalVideoTranscoder(LocalTranscoderConfiguration localTranscoderConfiguration);

    public abstract int startMediaRenderingTracing();

    public abstract int startOrUpdateChannelMediaRelay(ChannelMediaRelayConfiguration channelMediaRelayConfiguration);

    public abstract int startPlaybackDeviceTest(String str);

    public abstract int startPreview();

    public abstract int startPreview(Constants.VideoSourceType videoSourceType);

    public abstract int startRecordingDeviceTest(int i);

    public abstract int startRhythmPlayer(String str, String str2, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    public abstract int startRtmpStreamWithTranscoding(String str, LiveTranscoding liveTranscoding);

    public abstract int startRtmpStreamWithoutTranscoding(String str);

    public abstract int startScreenCapture(ScreenCaptureParameters screenCaptureParameters);

    public abstract int stopAllEffects();

    public abstract int stopAudioMixing();

    public abstract int stopAudioRecording();

    public abstract int stopCameraCapture(Constants.VideoSourceType videoSourceType);

    public abstract int stopChannelMediaRelay();

    public abstract int stopDirectCdnStreaming();

    public abstract int stopEchoTest();

    public abstract int stopEffect(int i);

    public abstract int stopLastmileProbeTest();

    public abstract int stopLocalAudioMixer();

    public abstract int stopLocalVideoTranscoder();

    public abstract int stopPlaybackDeviceTest();

    public abstract int stopPreview();

    public abstract int stopPreview(Constants.VideoSourceType videoSourceType);

    public abstract int stopRecordingDeviceTest();

    public abstract int stopRhythmPlayer();

    public abstract int stopRtmpStream(String str);

    public abstract int stopScreenCapture();

    public abstract int switchCamera();

    public abstract int switchCamera(String str);

    public abstract int takeSnapshot(int i, SnapshotConfig snapshotConfig);

    public abstract int takeSnapshot(int i, String str);

    public abstract int unRegisterAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver);

    public abstract int unloadAllEffects();

    public abstract int unloadEffect(int i);

    public abstract int unregisterMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i);

    public abstract int updateChannelMediaOptions(ChannelMediaOptions channelMediaOptions);

    public abstract int updateDirectCdnStreamingMediaOptions(DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    public abstract int updateLocalAudioMixerConfiguration(LocalAudioMixerConfiguration localAudioMixerConfiguration);

    public abstract int updateLocalTranscoderConfiguration(LocalTranscoderConfiguration localTranscoderConfiguration);

    public abstract int updatePreloadChannelToken(String str);

    public abstract int updateRtmpTranscoding(LiveTranscoding liveTranscoding);

    public abstract int updateScreenCaptureParameters(ScreenCaptureParameters screenCaptureParameters);

    public abstract String uploadLogFile();

    public abstract int writeLog(int i, String str, Object... objArr);

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) throws Exception {
        RtcEngineConfig rtcEngineConfig;
        SystemClock.uptimeMillis();
        rtcEngineConfig = new RtcEngineConfig();
        rtcEngineConfig.mContext = context;
        rtcEngineConfig.mAppId = str;
        rtcEngineConfig.mEventHandler = iRtcEngineEventHandler;
        return create(rtcEngineConfig);
    }
}
