package com.momo.momortc;

import android.content.Context;
import android.opengl.EGLContext;
import com.momo.momortc.live.MMLiveTranscoding;
import com.momo.rtcbase.EglBase;
import com.momo.rtcbase.SurfaceViewRenderer;
import com.momo.rtcbase.VideoCanvas;
import com.momo.rtcbase.VideoFrame;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MMRtcEngine {
    public static final int MMRTC_LOG_MSGAddUrl = 20;
    public static final int MMRTC_LOG_MSGChangeRole = 36;
    public static final int MMRTC_LOG_MSGHeart = 13;
    public static final int MMRTC_LOG_MSGJoin = 14;
    public static final int MMRTC_LOG_MSGKeyExpired = 34;
    public static final int MMRTC_LOG_MSGKeyUpdate = 35;
    public static final int MMRTC_LOG_MSGLOGIN = 11;
    public static final int MMRTC_LOG_MSGLeave = 16;
    public static final int MMRTC_LOG_MSGLocalAudioMute = 23;
    public static final int MMRTC_LOG_MSGLocalVideoMute = 25;
    public static final int MMRTC_LOG_MSGONLogin = 12;
    public static final int MMRTC_LOG_MSGOnChangeRole = 37;
    public static final int MMRTC_LOG_MSGOnJoin = 15;
    public static final int MMRTC_LOG_MSGOnLeave = 17;
    public static final int MMRTC_LOG_MSGOnReJoin = 28;
    public static final int MMRTC_LOG_MSGOnStartPK = 30;
    public static final int MMRTC_LOG_MSGOnStopPK = 32;
    public static final int MMRTC_LOG_MSGPeerJoin = 18;
    public static final int MMRTC_LOG_MSGPeerLeave = 19;
    public static final int MMRTC_LOG_MSGPeerLost = 33;
    public static final int MMRTC_LOG_MSGReJoin = 27;
    public static final int MMRTC_LOG_MSGRemoteAudioMute = 24;
    public static final int MMRTC_LOG_MSGRemoteVideoMute = 26;
    public static final int MMRTC_LOG_MSGRemoveUrl = 21;
    public static final int MMRTC_LOG_MSGStartPK = 29;
    public static final int MMRTC_LOG_MSGStopPK = 31;
    public static final int MMRTC_LOG_MSGTranscoding = 22;
    public static final int MMRTC_LOG_PULL_WATCH = 4;
    public static final int MMRTC_LOG_PUSH_START = 1;
    public static final int MMRTC_LOG_PUSH_STOP = 2;
    public static final int MMRTC_LOG_PUSH_WATCH = 3;
    public static final int MMRTC_LOG_RECONNECT = 5;
    public static final int MMRTC_Log_MsgOnLicked = 38;
    public static int MMRTC_ROLE_AUDIENCE = 2;
    public static int MMRTC_ROLE_BROADCASTER = 1;
    private static MMRtcEngineImpl mInstance;

    public static SurfaceViewRenderer CreateRendererView(Context context) {
        return new SurfaceViewRenderer(context);
    }

    public static synchronized MMRtcEngine create(Context context, String str, IMMRtcEngineEventInterface iMMRtcEngineEventInterface) throws Exception {
        if (context != null) {
            try {
                if (MMRtcEngineImpl.initializeNativeLibs()) {
                    MMRtcEngineImpl mMRtcEngineImpl = mInstance;
                    if (mMRtcEngineImpl == null) {
                        mInstance = new MMRtcEngineImpl(context, str, iMMRtcEngineEventInterface);
                    } else {
                        mMRtcEngineImpl.reinitialize(context, str, iMMRtcEngineEventInterface);
                    }
                    return mInstance;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public static synchronized void destroy() {
        MMRtcEngineImpl mMRtcEngineImpl = mInstance;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.doDestroy();
            mInstance = null;
            System.gc();
        }
    }

    public static String getErrorDescription(int i) {
        return !MMRtcEngineImpl.initializeNativeLibs() ? "" : MMRtcEngineImpl.nativeGetErrorDescription(i);
    }

    public static MMRtcEngineImpl getInstance() {
        return mInstance;
    }

    public static String getMediaEngineVersion() {
        return !MMRtcEngineImpl.initializeNativeLibs() ? "" : MMRtcEngineImpl.nativeGetChatEngineVersion();
    }

    public static int getRecommendedEncoderType() {
        return 0;
    }

    public static String getSdkVersion() {
        return !MMRtcEngineImpl.initializeNativeLibs() ? "" : MMRtcEngineImpl.nativeGetSdkVersion();
    }

    public abstract boolean IsInEarMonitoring();

    public void addHandler(IMMRtcEngineEventInterface iMMRtcEngineEventInterface) {
        mInstance.addHandler(iMMRtcEngineEventInterface);
    }

    public abstract int addPublishStreamUrl(String str, boolean z);

    public abstract int adjustAudioMixingVolume(float f);

    public abstract int adjustPlaybackSignalVolume(long j);

    public abstract int adjustRecordingSignalVolume(long j);

    public abstract int clearVideoWatermarks();

    public abstract int complain(String str, String str2);

    public abstract int createDataStream(boolean z, boolean z2);

    public abstract int disableAudio();

    public abstract int disableLastmileTest();

    public abstract int disableVideo();

    public abstract int enableAudio();

    public abstract int enableAudioPreProcess(boolean z);

    public abstract int enableAudioQualityIndication(boolean z);

    public abstract int enableAudioVolumeIndication(long j, long j2);

    public abstract int enableDualStreamMode(boolean z);

    public abstract boolean enableHighPerfWifiMode(boolean z);

    public abstract int enableInEarMonitoring(boolean z);

    public abstract int enableLastmileTest();

    public abstract int enableLocalAudio(boolean z);

    public abstract int enableLocalVideo(boolean z);

    public abstract void enableMiddleGroundSignal(boolean z);

    public abstract int enableRecap(int i);

    public abstract int enableTransportQualityIndication(boolean z);

    public abstract int enableVideo();

    public abstract int enableWebSdkInteroperability(boolean z);

    public abstract int forwardDownlinkAudio(long j, boolean z);

    public abstract IAudioEffectManager getAudioEffectManager();

    public abstract long getAudioMixingCurrentPosition();

    public abstract long getAudioMixingDuration();

    public abstract String getCallId();

    public abstract float getCameraMaxZoomFactor();

    public abstract long getNativeHandle();

    public abstract String getParameter(String str, String str2);

    public abstract String getParameters(String str);

    public abstract void getRoomList(long j);

    public abstract int getSabineEnable();

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraFocusSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract boolean isSpeakerphoneEnabled();

    public abstract boolean isTextureEncodeSupported();

    public abstract int joinChannel(String str, String str2, String str3, long j, String str4, String str5, String str6, long j2);

    public abstract int leaveChannel();

    public abstract String makeQualityReportUrl(String str, int i, int i2, int i3);

    public abstract int monitorAudioRouteChange(boolean z);

    public abstract void monitorConnectionEvent(boolean z);

    public abstract int muteAllRemoteAudioStreams(boolean z);

    public abstract int muteAllRemoteVideoStreams(boolean z);

    public abstract int muteLocalAudioStream(boolean z);

    public abstract int muteLocalMsgStream(boolean z);

    public abstract int muteLocalVideoStream(boolean z);

    public abstract int muteRemoteAudioStream(long j, boolean z);

    public abstract int muteRemoteMsgStream(long j, boolean z);

    public abstract int muteRemoteVideoStream(int i, boolean z);

    public abstract int pauseAudio();

    public abstract int pauseAudioMixing();

    public abstract int playRecap();

    public abstract int pushExternalAudioFrame(byte[] bArr, long j);

    public abstract boolean pushExternalVideoFrame(VideoFrame videoFrame, EglBase.Context context);

    public abstract int rate(String str, int i, String str2);

    public abstract int refreshRecordingServiceStatus();

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int removeInjectStreamUrl(String str);

    public abstract int removePublishStreamUrl(String str);

    public abstract int renewToken(String str);

    public abstract int resumeAudio();

    public abstract int resumeAudioMixing();

    public abstract int sendStreamMessage(int i, String str);

    public abstract int setApiCallMode(int i);

    public abstract int setAudioAECEnable(boolean z);

    public abstract int setAudioAGCEnable(boolean z);

    public abstract int setAudioANSEnable(boolean z);

    public abstract int setAudioANSLevel(int i);

    public abstract int setAudioLevel(int i);

    public abstract int setAudioMixingPitch(int i);

    public abstract int setAudioMixingPosition(long j);

    public abstract int setAudioProfile(int i, int i2);

    public abstract int setCameraAutoFocusFaceModeEnabled(boolean z);

    public abstract int setCameraFocusPositionInPreview(float f, float f2);

    public abstract int setCameraTorchOn(boolean z);

    public abstract int setCameraZoomFactor(float f);

    public abstract void setChannalNum(int i);

    public abstract int setChannelProfile(int i);

    public abstract int setClientRole(int i);

    public abstract int setDefaultAudioRoutetoSpeakerphone(boolean z);

    public abstract int setDefaultMuteAllRemoteAudioStreams(boolean z);

    public abstract int setDefaultMuteAllRemoteVideoStreams(boolean z);

    public abstract int setEnableSpeakerphone(boolean z);

    public abstract int setEncryptionMode(String str);

    public abstract int setEncryptionSecret(String str);

    public abstract void setExpandCartonParams(int i, int i2);

    public abstract int setExternalAudioSource(boolean z, int i, int i2);

    public abstract void setExternalVideoSource(boolean z, boolean z2, boolean z3);

    public abstract int setHeadset(boolean z);

    public abstract int setHighQualityAudioParameters(boolean z, boolean z2, boolean z3);

    public abstract int setInEarMonitoringVolume(int i);

    public abstract void setListener(IMMRtcEngineEventInterface iMMRtcEngineEventInterface);

    public abstract int setLiveTranscoding(MMLiveTranscoding mMLiveTranscoding);

    public abstract int setLocalRenderMode(int i);

    public abstract int setLocalVideoMirrorMode(int i);

    public abstract int setLocalVoiceEqualization(int i, int i2);

    public abstract int setLocalVoicePitch(double d);

    public abstract int setLocalVoiceReverb(int i, int i2);

    public abstract int setLogFile(String str);

    public abstract int setLogFilter(int i);

    public abstract int setMixedAudioFrameParameters(int i, int i2);

    public abstract int setParameters(String str);

    public abstract int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4);

    public abstract int setProfile(String str, boolean z);

    public abstract int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4);

    public abstract int setRemoteDefaultVideoStreamType(int i);

    public abstract int setRemoteRenderMode(long j, int i);

    public abstract int setRemoteVideoStreamType(int i, int i2);

    public abstract void setRobustSignal(boolean z);

    public abstract int setRoomMode(int i);

    public abstract int setSei(byte[] bArr);

    public abstract int setSpeakerphoneVolume(int i);

    public abstract void setSteroAudioCapture(boolean z);

    public abstract int setTextureId(int i, EGLContext eGLContext, int i2, int i3, long j);

    public abstract int setTextureId(int i, javax.microedition.khronos.egl.EGLContext eGLContext, int i2, int i3, long j);

    public abstract int setVideoProfile(int i, int i2, int i3, int i4);

    public abstract int setVideoProfile(int i, boolean z);

    public abstract int setVideoQualityParameters(boolean z);

    public abstract int setupLocalVideo(VideoCanvas videoCanvas);

    public abstract int setupRemoteVideo(VideoCanvas videoCanvas);

    public abstract int startAudioMixing(String str, boolean z, boolean z2, long j);

    public abstract int startAudioRecording(String str, int i);

    public abstract int startChannelMediaRelay(long j, String str);

    public abstract int startEchoTest();

    public abstract int startPlayingStream(String str);

    public abstract int startPreview();

    public abstract int startRecordingService(String str);

    public abstract int stopAudioMixing();

    public abstract int stopAudioRecording();

    public abstract int stopChannelMediaRelay(long j, String str);

    public abstract int stopEchoTest();

    public abstract int stopPlayingStream();

    public abstract int stopPreview();

    public abstract int stopRecordingService(String str);

    public abstract int switchCamera();

    public abstract void switchView(int i, int i2);

    public abstract int updateSharedContext(EGLContext eGLContext);

    public abstract int updateSharedContext(javax.microedition.khronos.egl.EGLContext eGLContext);

    public abstract int useExternalAudioDevice();
}
