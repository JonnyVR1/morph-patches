package io.agora.rtc2.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.projection.MediaProjection;
import android.net.wifi.WifiManager;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import io.agora.base.VideoFrame;
import io.agora.base.internal.BuildConfig;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.mediaplayer.IMediaPlayer;
import io.agora.mediaplayer.IMediaPlayerAudioFrameObserver;
import io.agora.mediaplayer.IMediaPlayerCacheManager;
import io.agora.mediaplayer.IMediaPlayerObserver;
import io.agora.mediaplayer.IMediaPlayerVideoFrameObserver;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.rtc2.AgoraMediaRecorder;
import io.agora.rtc2.ChannelMediaOptions;
import io.agora.rtc2.ClientRoleOptions;
import io.agora.rtc2.Constants;
import io.agora.rtc2.DataStreamConfig;
import io.agora.rtc2.DeviceInfo;
import io.agora.rtc2.DirectCdnStreamingMediaOptions;
import io.agora.rtc2.EchoTestConfiguration;
import io.agora.rtc2.EncodedVideoTrackOptions;
import io.agora.rtc2.ExtensionInfo;
import io.agora.rtc2.IAudioEffectManager;
import io.agora.rtc2.IAudioEncodedFrameObserver;
import io.agora.rtc2.IAudioFrameObserver;
import io.agora.rtc2.IDirectCdnStreamingEventHandler;
import io.agora.rtc2.IH265Transcoder;
import io.agora.rtc2.IH265TranscoderObserver;
import io.agora.rtc2.IMediaRecorderCallback;
import io.agora.rtc2.IMetadataObserver;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.LeaveChannelOptions;
import io.agora.rtc2.LocalAudioMixerConfiguration;
import io.agora.rtc2.LocalTranscoderConfiguration;
import io.agora.rtc2.RecorderStreamInfo;
import io.agora.rtc2.RtcConnection;
import io.agora.rtc2.RtcEngineConfig;
import io.agora.rtc2.RtcEngineInternal;
import io.agora.rtc2.ScreenCaptureParameters;
import io.agora.rtc2.SimulcastConfig;
import io.agora.rtc2.SimulcastStreamConfig;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.UserInfo;
import io.agora.rtc2.audio.AdvancedAudioOptions;
import io.agora.rtc2.audio.AgoraRhythmPlayerConfig;
import io.agora.rtc2.audio.AudioTrackConfig;
import io.agora.rtc2.audio.IAudioSpectrumObserver;
import io.agora.rtc2.live.LiveTranscoding;
import io.agora.rtc2.proxy.LocalAccessPointConfiguration;
import io.agora.rtc2.video.AgoraFocalLengthInfo;
import io.agora.rtc2.video.AgoraImage;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.rtc2.video.BeautyOptions;
import io.agora.rtc2.video.CameraCapturerConfiguration;
import io.agora.rtc2.video.ChannelMediaInfo;
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
import io.agora.rtc2.video.LowLightEnhanceOptions;
import io.agora.rtc2.video.SegmentationProperty;
import io.agora.rtc2.video.SnapshotConfig;
import io.agora.rtc2.video.VideoCanvas;
import io.agora.rtc2.video.VideoDenoiserOptions;
import io.agora.rtc2.video.VideoEncoderConfiguration;
import io.agora.rtc2.video.VideoSubscriptionOptions;
import io.agora.rtc2.video.VirtualBackgroundSource;
import io.agora.rtc2.video.WatermarkOptions;
import io.agora.utils2.internal.Connectivity;
import io.agora.utils2.internal.Logging;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class RtcEngineImpl extends RtcEngineInternal implements IAudioEffectManager {
    public static final String TAG = "RtcEngine";
    private static boolean sLibLoaded = false;
    private String mAppId;
    private WeakReference<Context> mContext;
    private long mNativeHandle;
    private static ConcurrentHashMap<String, ExtensionLoadState> mLoadedExtensions = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<AgoraMediaRecorder, Pair<String, Object>> mMediaRecorders = new ConcurrentHashMap<>();
    private static final String[] PRELOAD_EXTENSIONS = {"agora_clear_vision_extension", "agora_segmentation_extension", "agora_screen_capture_extension", "agora_audio_beauty_extension", "agora_spatial_audio_extension", "video_enc", "video_dec", "agora_video_decoder_extension", "agora_video_encoder_extension", "agora_video_av1_decoder_extension", "agora_video_av1_encoder_extension", "agora_content_inspect_extension", "agora_video_quality_analyzer_extension", "agora_face_detection_extension", "agora_ai_noise_suppression_extension", "agora_ai_noise_suppression_ll_extension", "agora_ai_echo_cancellation_extension", "agora_ai_echo_cancellation_ll_extension", "agora_metakit_extension", "agora_face_capture_extension", "agora_lip_sync_extension", "agora_rtm_loader_extension", "agora_portrait_rhythm_extension"};
    static String nativeLibraryName = "agora-rtc-sdk";
    static String nativeLibraryPrefix = ShareConstants.SO_PATH;
    static String nativeLibrarySurffix = ".so";
    private int mExSourceAudioSampleRate = 0;
    private int mExSourceAudioChannels = 0;
    private int mExSinkAudioSampleRate = 0;
    private int mExSinkAudioChannels = 0;
    private int mPushVideoFrameInvalidCnt = 0;
    private final ConcurrentHashMap<IRtcEngineEventHandler, RtcEngineEventHandlerProxy> mRtcHandlers = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Pair<String, Object>, ArrayList<RtcEngineEventHandlerProxy>> mRtcExHandlerMap = new ConcurrentHashMap<>();
    private WifiManager.WifiLock mWifiLock = null;

    public enum ExtensionLoadState {
        LOADED,
        LOAD_FAIL
    }

    public static class InitResult {
        private long nativeHandle;
        private int retVal;

        @CalledByNative("InitResult")
        public InitResult(int i, long j) {
            this.retVal = i;
            this.nativeHandle = j;
        }
    }

    public RtcEngineImpl(RtcEngineConfig rtcEngineConfig) throws Exception {
        this.mNativeHandle = 0L;
        this.mContext = null;
        this.mAppId = null;
        this.mAppId = rtcEngineConfig.mAppId;
        if (rtcEngineConfig.mAutoRegisterAgoraExtensions) {
            rtcEngineConfig.mExtensionList.addAll(Arrays.asList(PRELOAD_EXTENSIONS));
        }
        for (String str : rtcEngineConfig.mExtensionList) {
            Logging.m87222i(TAG, "load extension: " + str);
            safeLoadLibrary(rtcEngineConfig.mNativeLibPath, str);
        }
        this.mContext = new WeakReference<>(rtcEngineConfig.mContext);
        addHandler(rtcEngineConfig.mEventHandler);
        InitResult initResult = (InitResult) nativeObjectInit(rtcEngineConfig);
        if (initResult.retVal != 0) {
            ig3.m135964a(String.format(Locale.getDefault(), "cannot initialize Agora Rtc Engine, error=%d", Integer.valueOf(Math.abs(initResult.retVal))));
            throw null;
        }
        this.mNativeHandle = initResult.nativeHandle;
    }

    private void addHandlerExKey(Pair<String, Object> pair, IRtcEngineEventHandler iRtcEngineEventHandler) {
        ArrayList<RtcEngineEventHandlerProxy> arrayList = this.mRtcExHandlerMap.get(pair);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (RtcEngineEventHandlerProxy rtcEngineEventHandlerProxy : arrayList) {
            if (rtcEngineEventHandlerProxy.getHandler() == iRtcEngineEventHandler) {
                arrayList.remove(rtcEngineEventHandlerProxy);
                break;
            }
        }
        arrayList.add(new RtcEngineEventHandlerProxy(iRtcEngineEventHandler));
        this.mRtcExHandlerMap.put(pair, arrayList);
    }

    private boolean checkRelayConfiguration(ChannelMediaRelayConfiguration channelMediaRelayConfiguration) {
        if (channelMediaRelayConfiguration == null || channelMediaRelayConfiguration.getSrcChannelMediaInfo() == null || channelMediaRelayConfiguration.getDestChannelMediaInfos() == null || channelMediaRelayConfiguration.getDestChannelMediaInfos().isEmpty()) {
            return false;
        }
        for (ChannelMediaInfo channelMediaInfo : channelMediaRelayConfiguration.getDestChannelMediaInfos().values()) {
            if (channelMediaInfo == null || TextUtils.isEmpty(channelMediaInfo.getChannelName())) {
                return false;
            }
        }
        return true;
    }

    private void doMonitorSystemEvent(Context context) {
        WifiManager.WifiLock wifiLock;
        if (Connectivity.getNetworkType(context) == 2 && (wifiLock = this.mWifiLock) != null) {
            wifiLock.acquire();
            Logging.m87222i(TAG, "hp connection mode detected");
        }
    }

    private void doStopMonitorSystemEvent() {
        WifiManager.WifiLock wifiLock = this.mWifiLock;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.mWifiLock.release();
        Logging.m87222i(TAG, "hp connection mode ended");
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String getChannelId(RtcConnection rtcConnection) {
        if (rtcConnection != null) {
            return rtcConnection.channelId;
        }
        return null;
    }

    public static String getNativeLibFullPath(String str, String str2) {
        String str3 = nativeLibraryPrefix + str2 + nativeLibrarySurffix;
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String str4 = File.separator;
        if (str.endsWith(str4)) {
            return str.concat(str3);
        }
        return str + str4 + str3;
    }

    private int[] getRect(WatermarkOptions.Rectangle rectangle) {
        int[] iArr = new int[4];
        if (rectangle != null) {
            iArr[0] = rectangle.f63371x;
            iArr[1] = rectangle.f63372y;
            iArr[2] = rectangle.width;
            iArr[3] = rectangle.height;
        }
        return iArr;
    }

    public static int getUserId(RtcConnection rtcConnection) {
        if (rtcConnection != null) {
            return rtcConnection.localUid;
        }
        return 0;
    }

    public static synchronized boolean initializeNativeLibs(String str) {
        if (!sLibLoaded) {
            int i = 0;
            while (true) {
                List<String> list = BuildConfig.so_list;
                if (i >= list.size()) {
                    sLibLoaded = safeLoadLibrary(str, nativeLibraryName);
                    break;
                }
                boolean zSafeLoadLibrary = safeLoadLibrary(str, list.get(i));
                sLibLoaded = zSafeLoadLibrary;
                if (!zSafeLoadLibrary) {
                    return zSafeLoadLibrary;
                }
                i++;
            }
        }
        return sLibLoaded;
    }

    private native int nativeAddVideoWatermark(long j, String str, boolean z, int[] iArr, int[] iArr2);

    private native int nativeAddVideoWatermarkEx(long j, String str, boolean z, int[] iArr, int[] iArr2, String str2, int i);

    private native int nativeAdjustAudioMixingPlayoutVolume(long j, int i);

    private native int nativeAdjustAudioMixingPublishVolume(long j, int i);

    private native int nativeAdjustAudioMixingVolume(long j, int i);

    private native int nativeAdjustCustomAudioPlayoutVolume(long j, int i, int i2);

    private native int nativeAdjustCustomAudioPublishVolume(long j, int i, int i2);

    private native int nativeAdjustPlaybackSignalVolume(long j, int i);

    private native int nativeAdjustRecordingSignalVolume(long j, int i, String str, int i2);

    private native int nativeAdjustUserPlaybackSignalVolume(long j, int i, int i2, String str, int i3);

    private native int nativeClearVideoWatermarkEx(long j, String str, int i);

    private native int nativeClearVideoWatermarks(long j);

    private native int nativeComplain(long j, String str, String str2);

    private native int nativeConfigRhythmPlayer(long j, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    private native int nativeCreateCustomAudioTrack(long j, int i, boolean z, boolean z2);

    private native int nativeCreateCustomEncodedVideoTrack(long j, EncodedVideoTrackOptions encodedVideoTrackOptions);

    private native int nativeCreateCustomVideoTrack(long j);

    private native int nativeCreateDataStream(long j, boolean z, boolean z2, String str, int i);

    private native int nativeCreateDataStream2(long j, boolean z, boolean z2, String str, int i);

    private native int nativeCreateH265Transcoder(long j);

    private native int nativeCreateMediaPlayer(long j);

    private static native int nativeDestroy(long j);

    private native int nativeDestroyCustomAudioTrack(long j, int i);

    private native int nativeDestroyCustomEncodedVideoTrack(long j, int i);

    private native int nativeDestroyCustomVideoTrack(long j, int i);

    private native int nativeDisableAudioSpectrumMonitor(long j);

    private native int nativeDisableVideo(long j);

    private native int nativeEnableAudio(long j, boolean z);

    private native int nativeEnableAudioSpectrumMonitor(long j, int i);

    private native int nativeEnableAudioVolumeIndication(long j, int i, int i2, boolean z, String str, int i3);

    private native int nativeEnableContentInspect(long j, boolean z, byte[] bArr, String str, int i);

    private native int nativeEnableCustomAudioLocalPlayback(long j, int i, boolean z);

    private native int nativeEnableDualStreamModeEx(long j, boolean z, SimulcastStreamConfig simulcastStreamConfig, String str, int i);

    private native int nativeEnableEncryption(long j, boolean z, int i, String str, byte[] bArr, boolean z2);

    private native int nativeEnableEncryptionEx(long j, boolean z, int i, String str, byte[] bArr, boolean z2, String str2, int i2);

    private native int nativeEnableExtension(long j, String str, String str2, boolean z, int i);

    private native int nativeEnableExtension2(long j, String str, String str2, boolean z, int i, int i2, String str3, int i3);

    private native int nativeEnableExternalAudioSourceLocalPlayback(long j, boolean z);

    private native int nativeEnableFaceDetection(long j, boolean z);

    private native int nativeEnableInEarMonitoring(long j, boolean z, int i);

    private native int nativeEnableInstantMediaRendering(long j);

    private native int nativeEnableLocalAudio(long j, boolean z);

    private native int nativeEnableLocalVideo(long j, boolean z);

    private native int nativeEnableSoundPositionIndication(long j, boolean z);

    private native int nativeEnableSpatialAudio(long j, boolean z);

    private native int nativeEnableVideo(long j);

    private native int nativeEnableVideoImageSource(long j, boolean z, String str, int i, int i2);

    private native int nativeEnableVirtualBackground(long j, boolean z, int i, int i2, String str, int i3, int i4, float f, int i5);

    private native int nativeEnableVoiceAITuner(long j, boolean z, int i);

    private native DeviceInfo nativeGetAudioDeviceInfo(long j);

    private native int nativeGetAudioMixingCurrentPosition(long j);

    private native int nativeGetAudioMixingDuration(long j);

    private native int nativeGetAudioMixingPlayoutVolume(long j);

    private native int nativeGetAudioMixingPublishVolume(long j);

    private native int nativeGetAudioTrackCount(long j);

    private native String nativeGetCallId(long j);

    private native String nativeGetCallIdEx(long j, String str, int i);

    private native boolean nativeGetCameraAutoFocusFaceModeSupported(long j);

    private native boolean nativeGetCameraExposurePositionSupported(long j);

    private native boolean nativeGetCameraExposureSupported(long j);

    private native boolean nativeGetCameraFaceDetectSupported(long j);

    private native boolean nativeGetCameraFocusSupported(long j);

    private native float nativeGetCameraMaxZoomFactor(long j);

    private native boolean nativeGetCameraTorchSupported(long j);

    private native boolean nativeGetCameraZoomSupported(long j);

    private native int nativeGetConnectionState(long j, String str, int i);

    private native long nativeGetCurrentMonotonicTimeInMs(long j);

    private native int nativeGetEffectCurrentPosition(long j, int i);

    private native int nativeGetEffectDuration(long j, String str);

    private native double nativeGetEffectsVolume(long j);

    public static native String nativeGetErrorDescription(int i);

    private native String nativeGetExtensionProperty(long j, String str, String str2, String str3, int i);

    private native String nativeGetExtensionProperty2(long j, String str, String str2, String str3, int i, int i2, String str4, int i3);

    private native FaceShapeAreaOptions nativeGetFaceShapeAreaOptions(long j, int i, int i2);

    private native FaceShapeBeautyOptions nativeGetFaceShapeBeautyOptions(long j, int i);

    public static native String nativeGetMediaEngineVersion();

    private native long nativeGetMediaPlayer(long j, int i);

    private native int nativeGetNetworkType(long j);

    private native long nativeGetNtpWallTimeInMs(long j);

    private native String nativeGetParameter(long j, String str, String str2);

    private native String nativeGetParameters(long j, String str);

    private native String nativeGetProfile(long j);

    private native long nativeGetRtcEngine(long j);

    public static native String nativeGetSdkVersion();

    private native int nativeGetUserInfoByUid(long j, int i, UserInfo userInfo);

    private native int nativeGetUserInfoByUidEx(long j, int i, UserInfo userInfo, String str, int i2);

    private native int nativeGetUserInfoByUserAccount(long j, String str, UserInfo userInfo);

    private native int nativeGetUserInfoByUserAccountEx(long j, String str, UserInfo userInfo, String str2, int i);

    private native int nativeGetVolumeOfEffect(long j, int i);

    private native int nativeH265TranscoderEnableTranscode(long j, String str, String str2, int i);

    private native int nativeH265TranscoderQueryChannel(long j, String str, String str2, int i);

    private native int nativeH265TranscoderRegisterObserver(long j, IH265TranscoderObserver iH265TranscoderObserver);

    private native int nativeH265TranscoderTriggerTranscode(long j, String str, String str2, int i);

    private native int nativeH265TranscoderUnregisterObserver(long j, IH265TranscoderObserver iH265TranscoderObserver);

    private native int nativeInitMediaPlayerCacheManager(long j);

    private native boolean nativeIsFeatureAvailableOnDevice(long j, int i);

    private native boolean nativeIsSpeakerphoneEnabled(long j);

    private native int nativeJoinChannel(long j, String str, String str2, String str3, int i);

    private native int nativeJoinChannel2(long j, String str, String str2, int i, ChannelMediaOptions channelMediaOptions);

    private native int nativeJoinChannelEx(long j, String str, String str2, int i, ChannelMediaOptions channelMediaOptions);

    private native int nativeJoinChannelWithUserAccount(long j, String str, String str2, String str3, ChannelMediaOptions channelMediaOptions);

    private native int nativeJoinChannelWithUserAccountEx(long j, String str, String str2, String str3, ChannelMediaOptions channelMediaOptions);

    private native int nativeLeaveChannel(long j, LeaveChannelOptions leaveChannelOptions);

    private native int nativeLeaveChannelEx(long j, String str, int i, LeaveChannelOptions leaveChannelOptions);

    private native int nativeLeaveChannelWithUserAccountEx(long j, String str, String str2, LeaveChannelOptions leaveChannelOptions);

    private native int nativeLoadExtensionProvider(long j, String str);

    private native String nativeMakeQualityReportUrl(long j, String str, String str2, String str3, int i);

    private native int nativeMediaPlayerAdjustPlayoutVolume(long j, int i, int i2);

    private native int nativeMediaPlayerAdjustPublishSignalVolume(long j, int i, int i2);

    private native int nativeMediaPlayerChangePlaybackSpeed(long j, int i, int i2);

    private native int nativeMediaPlayerDestroy(long j, int i);

    private native int nativeMediaPlayerEnableAutoRemoveCache(long j, boolean z);

    private native int nativeMediaPlayerEnableAutoSwitchAgoraCDN(long j, int i, boolean z);

    private native int nativeMediaPlayerGetAgoraCDNLineCount(long j, int i);

    private native String nativeMediaPlayerGetCacheDir(long j);

    private native int nativeMediaPlayerGetCacheFileCount(long j);

    private native int nativeMediaPlayerGetCurrentAgoraCDNIndex(long j, int i);

    private native long nativeMediaPlayerGetDuration(long j, int i);

    private native int nativeMediaPlayerGetMaxCacheFileCount(long j);

    private native long nativeMediaPlayerGetMaxCacheFileSize(long j);

    private native boolean nativeMediaPlayerGetMute(long j, int i);

    private native long nativeMediaPlayerGetPlayPosition(long j, int i);

    private native String nativeMediaPlayerGetPlaySrc(long j, int i);

    private native int nativeMediaPlayerGetPlayoutVolume(long j, int i);

    private native int nativeMediaPlayerGetPublishSignalVolume(long j, int i);

    private native int nativeMediaPlayerGetState(long j, int i);

    private native int nativeMediaPlayerGetStreamCount(long j, int i);

    private native MediaStreamInfo nativeMediaPlayerGetStreamInfo(long j, int i, int i2);

    private native int nativeMediaPlayerMute(long j, int i, boolean z);

    private native int nativeMediaPlayerOpen(long j, int i, String str, long j2);

    private native int nativeMediaPlayerOpenWithAgoraCDNSrc(long j, int i, String str, long j2);

    private native int nativeMediaPlayerOpenWithSource(long j, int i, MediaPlayerSource mediaPlayerSource);

    private native int nativeMediaPlayerPause(long j, int i);

    private native int nativeMediaPlayerPlay(long j, int i);

    private native int nativeMediaPlayerPlayPreloadedSrc(long j, int i, String str);

    private native int nativeMediaPlayerPreloadSrc(long j, int i, String str, long j2);

    private native int nativeMediaPlayerRegisterAudioFrameObserver(long j, int i, IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i2);

    private native int nativeMediaPlayerRegisterPlayerObserver(long j, int i, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeMediaPlayerRegisterVideoFrameObserver(long j, int i, IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver);

    private native int nativeMediaPlayerRemoveAllCaches(long j);

    private native int nativeMediaPlayerRemoveCacheByUri(long j, String str);

    private native int nativeMediaPlayerRemoveOldCache(long j);

    private native int nativeMediaPlayerRenewAgoraCDNSrcToken(long j, int i, String str, long j2);

    private native int nativeMediaPlayerResume(long j, int i);

    private native int nativeMediaPlayerSeek(long j, int i, long j2);

    private native int nativeMediaPlayerSelectAudioTrack(long j, int i, int i2);

    private native int nativeMediaPlayerSelectInternalSubtitle(long j, int i, int i2);

    private native int nativeMediaPlayerSelectMultiAudioTrack(long j, int i, int i2, int i3);

    private native int nativeMediaPlayerSetAudioDualMonoMode(long j, int i, int i2);

    private native int nativeMediaPlayerSetAudioPitch(long j, int i, int i2);

    private native int nativeMediaPlayerSetCacheDir(long j, String str);

    private native int nativeMediaPlayerSetExternalSubtitle(long j, int i, String str);

    private native int nativeMediaPlayerSetLoopCount(long j, int i, int i2);

    private native int nativeMediaPlayerSetMaxCacheFileCount(long j, int i);

    private native int nativeMediaPlayerSetMaxCacheFileSize(long j, long j2);

    private native int nativeMediaPlayerSetPlayerOption(long j, int i, String str, int i2);

    private native int nativeMediaPlayerSetPlayerOptionString(long j, int i, String str, String str2);

    private native int nativeMediaPlayerSetRenderMode(long j, int i, int i2);

    private native int nativeMediaPlayerSetSpatialAudioParams(long j, int i, SpatialAudioParams spatialAudioParams);

    private native int nativeMediaPlayerSetView(long j, int i, View view);

    private native int nativeMediaPlayerStop(long j, int i);

    private native int nativeMediaPlayerSwitchAgoraCDNLineByIndex(long j, int i, int i2);

    private native int nativeMediaPlayerSwitchAgoraCDNSrc(long j, int i, String str, boolean z);

    private native int nativeMediaPlayerSwitchSrc(long j, int i, String str, boolean z);

    private native int nativeMediaPlayerTakeScreenshot(long j, int i, String str);

    private native int nativeMediaPlayerUnRegisterPlayerObserver(long j, int i, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeMediaPlayerUnloadSrc(long j, int i, String str);

    private native int nativeMuteAllRemoteAudioStreams(long j, boolean z, String str, int i);

    private native int nativeMuteAllRemoteVideoStreams(long j, boolean z, String str, int i);

    private native int nativeMuteLocalAudioStream(long j, boolean z, String str, int i);

    private native int nativeMuteLocalVideoStream(long j, boolean z, String str, int i);

    private native int nativeMuteRecordingSignal(long j, boolean z, String str, int i);

    private native int nativeMuteRemoteAudioStream(long j, int i, boolean z, String str, int i2);

    private native int nativeMuteRemoteVideoStream(long j, int i, boolean z, String str, int i2);

    private native Object nativeObjectInit(RtcEngineConfig rtcEngineConfig);

    private native int nativePauseAllChannelMediaRelay(long j, String str, int i);

    private native int nativePauseAllEffects(long j);

    private native int nativePauseAudio(long j);

    private native int nativePauseAudioMixing(long j);

    private native int nativePauseEffect(long j, int i);

    private native int nativePlayAllEffects(long j, int i, double d, double d2, double d3, boolean z);

    private native int nativePlayEffectWithFilePath(long j, int i, String str, int i2, double d, double d2, double d3, boolean z, int i3);

    private native int nativePreloadChannel(long j, String str, String str2, int i);

    private native int nativePreloadChannelWithUserAccount(long j, String str, String str2, String str3);

    private native int nativePreloadEffect(long j, int i, String str, int i2);

    private native int nativePullAudioFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativePushExternalAgoraVideoFrame(long j, int i, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, EGLContext eGLContext, android.opengl.EGLContext eGLContext2, long j3, float[] fArr, int i9, int i10);

    private native int nativePushExternalAudioFrameRawData(long j, ByteBuffer byteBuffer, long j2, int i, int i2, int i3, int i4);

    private native int nativePushExternalEncodedVideoFrame(long j, ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo, int i);

    private native AgoraFocalLengthInfo[] nativeQueryCameraFocalLengthCapability(long j);

    private native CodecCapInfo[] nativeQueryCodecCapability(long j);

    private native int nativeQueryDeviceScore(long j);

    private native int nativeQueryScreenCaptureCapability(long j);

    private native int nativeRate(long j, String str, int i, String str2);

    private native int nativeRecordCreateEngineTimeStamp(long j, long j2, long j3);

    private native int nativeRegisterAudioFrameObserver(long j, IAudioFrameObserver iAudioFrameObserver);

    private native int nativeRegisterAudioSpectrumObserver(long j, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeRegisterExtension(long j, String str, String str2, int i);

    private native int nativeRegisterFaceInfoObserver(long j, IFaceInfoObserver iFaceInfoObserver);

    private native int nativeRegisterLocalUserAccount(long j, String str, String str2);

    private native int nativeRegisterMediaMetadataObserver(long j, Object obj, int i);

    private native int nativeRegisterMediaPlayerAudioSpectrumObserver(long j, int i, IAudioSpectrumObserver iAudioSpectrumObserver, int i2);

    private native int nativeRegisterVideoEncodedFrameObserver(long j, IVideoEncodedFrameObserver iVideoEncodedFrameObserver);

    private native int nativeRegisterVideoFrameObserver(long j, IVideoFrameObserver iVideoFrameObserver);

    private native int nativeReleaseRecorder(long j, int i, String str, boolean z);

    private native int nativeRenewToken(long j, String str);

    private native int nativeResumeAllChannelMediaRelay(long j, String str, int i);

    private native int nativeResumeAllEffects(long j);

    private native int nativeResumeAudio(long j);

    private native int nativeResumeAudioMixing(long j);

    private native int nativeResumeEffect(long j, int i);

    private native int nativeSelectAudioTrack(long j, int i);

    private native int nativeSendAudioMetadata(long j, byte[] bArr, String str, int i);

    private native int nativeSendCustomReportMessage(long j, String str, String str2, String str3, String str4, int i, String str5, int i2);

    private native int nativeSendStreamMessage(long j, int i, byte[] bArr, String str, int i2);

    private native int nativeSetAVSyncSource(long j, String str, int i);

    private native int nativeSetAdvancedAudioOptions(long j, int i);

    private native int nativeSetApiCallMode(long j, int i);

    private native int nativeSetAudioEffectParameters(long j, int i, int i2, int i3);

    private native int nativeSetAudioEffectPreset(long j, int i);

    private native int nativeSetAudioMixingDualMonoMode(long j, int i);

    private native int nativeSetAudioMixingPitch(long j, int i);

    private native int nativeSetAudioMixingPlaybackSpeed(long j, int i);

    private native int nativeSetAudioMixingPosition(long j, int i);

    private native int nativeSetAudioProfile(long j, int i);

    private native int nativeSetAudioProfileScenario(long j, int i, int i2);

    private native int nativeSetAudioScenario(long j, int i);

    private native int nativeSetBeautyEffectOptions(long j, boolean z, int i, float f, float f2, float f3, float f4, int i2);

    private native int nativeSetCameraAutoFocusFaceModeEnabled(long j, boolean z);

    private native int nativeSetCameraCapturerConfiguration(long j, CameraCapturerConfiguration cameraCapturerConfiguration);

    private native int nativeSetCameraExposureFactor(long j, int i);

    private native int nativeSetCameraExposurePosition(long j, float f, float f2);

    private native int nativeSetCameraFocusPositionInPreview(long j, float f, float f2);

    private native int nativeSetCameraTorchOn(long j, boolean z);

    private native int nativeSetCameraZoomFactor(long j, float f);

    private native int nativeSetChannelProfile(long j, int i);

    private native int nativeSetClientRole(long j, int i, Object obj);

    private native int nativeSetCloudProxy(long j, int i);

    private native int nativeSetColorEnhanceOptions(long j, boolean z, float f, float f2, int i);

    private native int nativeSetDefaultAudioRoutetoSpeakerphone(long j, boolean z);

    private native int nativeSetDirectCdnStreamingAudioConfiguration(long j, int i);

    private native int nativeSetDirectCdnStreamingVideoConfiguration(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private native int nativeSetDualStreamModeEx(long j, int i, SimulcastStreamConfig simulcastStreamConfig, String str, int i2);

    private native int nativeSetEarMonitoringAudioFrameParameters(long j, int i, int i2, int i3, int i4);

    private native int nativeSetEffectPosition(long j, int i, int i2);

    private native int nativeSetEffectsVolume(long j, double d);

    private native int nativeSetEnableSpeakerphone(long j, boolean z);

    private native int nativeSetExtensionProperty(long j, String str, String str2, String str3, String str4, int i);

    private native int nativeSetExtensionProperty2(long j, String str, String str2, String str3, String str4, int i, int i2, String str5, int i3);

    private native int nativeSetExtensionProviderProperty(long j, String str, String str2, String str3);

    private native int nativeSetExternalAudioSink(long j, boolean z, int i, int i2);

    private native int nativeSetExternalAudioSource(long j, boolean z, int i, int i2, boolean z2, boolean z3);

    private native int nativeSetExternalMediaProjection(long j, MediaProjection mediaProjection);

    private native int nativeSetExternalRemoteEglContext(long j, Object obj);

    private native int nativeSetExternalVideoSource(long j, boolean z, boolean z2, int i, EncodedVideoTrackOptions encodedVideoTrackOptions);

    private native int nativeSetFaceShapeAreaOptions(long j, int i, int i2, int i3);

    private native int nativeSetFaceShapeBeautyOptions(long j, boolean z, int i, int i2, int i3);

    private native int nativeSetFilterEffectOptions(long j, boolean z, String str, float f, int i);

    private native int nativeSetHeadphoneEQParameters(long j, int i, int i2);

    private native int nativeSetHeadphoneEQPreset(long j, int i);

    private native int nativeSetHighPriorityUserList(long j, int[] iArr, int i, String str, int i2);

    private native int nativeSetInEarMonitoringVolume(long j, int i);

    private native int nativeSetLocalAccessPoint(long j, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str, int i, Object obj, boolean z);

    private native int nativeSetLocalRenderMode(long j, int i, int i2);

    private native int nativeSetLocalVideoMirrorMode(long j, int i);

    private native int nativeSetLocalVoiceEqualization(long j, int i, int i2);

    private native int nativeSetLocalVoiceFormant(long j, double d);

    private native int nativeSetLocalVoicePitch(long j, double d);

    private native int nativeSetLocalVoiceReverb(long j, int i, int i2);

    private native int nativeSetLogFile(long j, String str);

    private native int nativeSetLogFileSize(long j, long j2);

    private native int nativeSetLogFilter(long j, int i);

    private native int nativeSetLogLevel(long j, int i);

    private native int nativeSetLowlightEnhanceOptions(long j, boolean z, int i, int i2, int i3);

    private native int nativeSetMediaRecorderObserver(long j, Object obj, int i, String str, boolean z, int i2);

    private native int nativeSetMixedAudioFrameParameters(long j, int i, int i2, int i3);

    private native int nativeSetParameters(long j, String str);

    private native int nativeSetParametersEx(long j, String str, String str2, int i);

    private native int nativeSetPlaybackAudioFrameBeforeMixingParameters(long j, int i, int i2);

    private native int nativeSetPlaybackAudioFrameParameters(long j, int i, int i2, int i3, int i4);

    private native int nativeSetProfile(long j, String str, boolean z);

    private native int nativeSetRecordingAudioFrameParameters(long j, int i, int i2, int i3, int i4);

    private native int nativeSetRemoteDefaultVideoStreamType(long j, int i);

    private native int nativeSetRemoteRenderMode(long j, int i, int i2, int i3, String str, int i4);

    private native int nativeSetRemoteSubscribeFallbackOption(long j, int i);

    private native int nativeSetRemoteUserPriority(long j, int i, int i2);

    private native int nativeSetRemoteUserSpatialAudioParams(long j, int i, SpatialAudioParams spatialAudioParams, String str, int i2);

    private native int nativeSetRemoteVideoStreamType(long j, int i, int i2, String str, int i3);

    private native int nativeSetRemoteVideoSubscriptionOptions(long j, int i, VideoSubscriptionOptions videoSubscriptionOptions, String str, int i2);

    private native int nativeSetRemoteVoicePosition(long j, int i, double d, double d2, String str, int i2);

    private native int nativeSetRouteInCommunicationMode(long j, int i);

    private native int nativeSetScreenCaptureScenario(long j, int i);

    private native int nativeSetSimulcastConfigEx(long j, SimulcastConfig.StreamLayerConfig[] streamLayerConfigArr, String str, int i);

    private native int nativeSetSubscribeAudioBlacklist(long j, int[] iArr, String str, int i);

    private native int nativeSetSubscribeAudioWhitelist(long j, int[] iArr, String str, int i);

    private native int nativeSetSubscribeVideoBlacklist(long j, int[] iArr, String str, int i);

    private native int nativeSetSubscribeVideoWhitelist(long j, int[] iArr, String str, int i);

    private native int nativeSetVideoDenoiserOptions(long j, boolean z, int i, int i2, int i3);

    private native int nativeSetVideoEncoderConfiguration(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, String str, int i12);

    private native int nativeSetVoiceBeautifierParameters(long j, int i, int i2, int i3);

    private native int nativeSetVoiceBeautifierPreset(long j, int i);

    private native int nativeSetVoiceConversionParameters(long j, int i, int i2, int i3);

    private native int nativeSetVoiceConversionPreset(long j, int i);

    private native int nativeSetVolumeOfEffect(long j, int i, double d);

    private native int nativeSetupAudioAttributeContext(long j, AudioAttributes audioAttributes);

    private native int nativeSetupLocalVideo(long j, View view, SurfaceTexture surfaceTexture, int i, int i2, int i3, int i4, int[] iArr, int i5, boolean z, int i6, int i7);

    private native int nativeSetupRemoteVideo(long j, View view, SurfaceTexture surfaceTexture, int i, int i2, int i3, int i4, int[] iArr, int i5, boolean z, String str, int i6, int i7);

    private native int nativeStartAudioMixing(long j, String str, boolean z, int i, int i2);

    private native int nativeStartAudioRecording(long j, String str, int i);

    private native int nativeStartAudioRecording2(long j, String str, boolean z, int i, int i2, int i3, int i4);

    private native int nativeStartCameraCapture(long j, int i, CameraCapturerConfiguration cameraCapturerConfiguration);

    private native int nativeStartDirectCdnStreaming(long j, Object obj, String str, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    private native int nativeStartEchoTestWithConfig(long j, View view, boolean z, boolean z2, String str, String str2, int i);

    private native int nativeStartLastmileProbeTest(long j, boolean z, boolean z2, int i, int i2);

    private native int nativeStartLocalAudioMixer(long j, byte[] bArr);

    private native int nativeStartLocalVideoTranscoder(long j, byte[] bArr);

    private native int nativeStartMediaRenderingTracing(long j);

    private native int nativeStartMediaRenderingTracingEx(long j, String str, int i);

    private native int nativeStartOrUpdateChannelMediaRelay(long j, ChannelMediaInfo channelMediaInfo, ChannelMediaInfo[] channelMediaInfoArr, String str, int i);

    private native int nativeStartPlaybackDeviceTest(long j, String str);

    private native int nativeStartPreview(long j);

    private native int nativeStartPreviewForSourceType(long j, int i);

    private native int nativeStartRecording(long j, String str, int i, int i2, int i3, int i4, int i5, String str2, boolean z, int i6, int i7, int i8, int i9, int i10, int i11, int i12);

    private native int nativeStartRecordingDeviceTest(long j, int i);

    private native int nativeStartRhythmPlayer(long j, String str, String str2, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    private native int nativeStartRtmpStreamWithTranscoding(long j, String str, byte[] bArr, String str2, int i);

    private native int nativeStartRtmpStreamWithoutTranscoding(long j, String str, String str2, int i);

    private native int nativeStartScreenCapture(long j, ScreenCaptureParameters screenCaptureParameters);

    private native int nativeStopAllEffects(long j);

    private native int nativeStopAudioMixing(long j);

    private native int nativeStopAudioRecording(long j);

    private native int nativeStopCameraCapture(long j, int i);

    private native int nativeStopChannelMediaRelay(long j, String str, int i);

    private native int nativeStopDirectCdnStreaming(long j);

    private native int nativeStopEchoTest(long j);

    private native int nativeStopEffect(long j, int i);

    private native int nativeStopLastmileProbeTest(long j);

    private native int nativeStopLocalAudioMixer(long j);

    private native int nativeStopLocalVideoTranscoder(long j);

    private native int nativeStopPlaybackDeviceTest(long j);

    private native int nativeStopPreview(long j);

    private native int nativeStopPreviewForSourceType(long j, int i);

    private native int nativeStopRecording(long j, int i, String str, boolean z, int i2);

    private native int nativeStopRecordingDeviceTest(long j);

    private native int nativeStopRhythmPlayer(long j);

    private native int nativeStopRtmpStream(long j, String str, String str2, int i);

    private native int nativeStopScreenCapture(long j);

    private native int nativeSwitchCamera(long j);

    private native int nativeSwitchCameraId(long j, String str);

    private native int nativeTakeSnapshot(long j, int i, String str, String str2, int i2);

    private native int nativeTakeSnapshot2(long j, int i, String str, int i2, String str2, int i3);

    private native int nativeUnRegisterAudioSpectrumObserver(long j, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeUnRegisterMediaPlayerAudioSpectrumObserver(long j, int i, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeUnloadAllEffects(long j);

    private native int nativeUnloadEffect(long j, int i);

    private native int nativeUnregisterMediaMetadataObserver(long j, Object obj, int i);

    private native int nativeUpdateChannelMediaOptions(long j, ChannelMediaOptions channelMediaOptions, String str, int i);

    private native int nativeUpdateDirectCdnStreamingMediaOptions(long j, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    private native int nativeUpdateLocalAudioMixerConfiguration(long j, byte[] bArr);

    private native int nativeUpdateLocalTranscoderConfiguration(long j, byte[] bArr);

    private native int nativeUpdatePreloadChannelToken(long j, String str);

    private native int nativeUpdateRtmpTranscoding(long j, byte[] bArr, String str, int i);

    private native int nativeUpdateScreenCaptureParameters(long j, ScreenCaptureParameters screenCaptureParameters);

    private native String nativeUploadLogFile(long j);

    private native int nativeWriteLog(long j, int i, String str);

    private native int nativeregisterAudioEncodedFrameObserver(long j, IAudioEncodedFrameObserver iAudioEncodedFrameObserver, int i, int i2);

    private native int nativesetAINSMode(long j, boolean z, int i);

    private native int nativesetLocalRenderTargetFps(long j, int i, int i2);

    private native int nativesetRemoteRenderTargetFps(long j, int i);

    private native int nativesetVideoQoEPreference(long j, int i);

    private native int nativesetVideoScenario(long j, int i);

    @CalledByNative
    private void onLogEvent(int i, String str) {
    }

    public static synchronized boolean preloadExtensions(String str, String[] strArr) {
        try {
            String[] strArr2 = PRELOAD_EXTENSIONS;
            if (strArr == null || strArr.length <= 0) {
                strArr = strArr2;
            }
            boolean zSafeLoadLibrary = false;
            for (String str2 : strArr) {
                Logging.m87222i(TAG, "load extension: " + str2);
                zSafeLoadLibrary = safeLoadLibrary(str, str2);
                if (!zSafeLoadLibrary) {
                    return zSafeLoadLibrary;
                }
            }
            return zSafeLoadLibrary;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    private static boolean safeLoadLibrary(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                System.loadLibrary(str2);
            } else {
                System.load(getNativeLibFullPath(str, str2));
            }
            return true;
        } catch (NullPointerException e) {
            e = e;
            e.getMessage();
            return false;
        } catch (SecurityException e2) {
            e = e2;
            e.getMessage();
            return false;
        } catch (Exception e3) {
            e = e3;
            e.getMessage();
            return false;
        } catch (UnsatisfiedLinkError e4) {
            e = e4;
            e.getMessage();
            return false;
        }
    }

    private int setParameter(String str, int i) {
        return setParameters(formatString("{\"%s\":%d}", str, Integer.valueOf(i)));
    }

    private int setParameterObject(String str, String str2) {
        return setParameters(formatString("{\"%s\":%s}", str, str2));
    }

    private int setUidCompatibleMode(boolean z) {
        return setParameter("rtc.api.set_uid_compatible_mode", z);
    }

    private static String toStringUserId(int i) {
        return RtcEngineMessage.toStringUserId(i);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f A[RETURN] */
    private int validatePushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (agoraVideoFrame == null) {
            return -2;
        }
        int i7 = agoraVideoFrame.format;
        if (i7 == 10 || i7 == 11) {
            return 0;
        }
        byte[] bArr = agoraVideoFrame.buf;
        if (bArr == null || bArr.length == 0) {
            return -2;
        }
        if (i7 != 1) {
            if (i7 == 2 || i7 == 4) {
                int i8 = agoraVideoFrame.stride;
                i = (((agoraVideoFrame.height * i8) * 4) - agoraVideoFrame.cropRight) - (agoraVideoFrame.cropBottom * i8);
            } else {
                if (i7 == 3) {
                    int i9 = agoraVideoFrame.stride;
                    i2 = i9 % 2 == 0 ? i9 : i9 + 1;
                    int i10 = agoraVideoFrame.height;
                    i5 = (i9 * i10) + (((i10 + 1) / 2) * i2);
                    i6 = agoraVideoFrame.cropRight;
                } else {
                    if (i7 != 16) {
                        return -2;
                    }
                    int i11 = agoraVideoFrame.stride;
                    i2 = (i11 + 1) / 2;
                    int i12 = agoraVideoFrame.height;
                    i3 = ((i11 * i12) + ((i12 * i2) * 2)) - ((agoraVideoFrame.cropRight + 1) / 2);
                    i4 = agoraVideoFrame.cropBottom;
                }
                i = i3 - (i4 * i2);
            }
            if (bArr.length < i) {
                return -2;
            }
            return 0;
        }
        int i13 = agoraVideoFrame.stride;
        i2 = (i13 + 1) / 2;
        int i14 = agoraVideoFrame.height;
        i5 = (i13 * i14) + (((i14 + 1) / 2) * i2 * 2);
        i6 = (agoraVideoFrame.cropRight + 1) / 2;
        i3 = i5 - i6;
        i4 = (agoraVideoFrame.cropBottom + 1) / 2;
        i = i3 - (i4 * i2);
        if (bArr.length < i) {
            return -2;
        }
        return 0;
    }

    private boolean validateVideoRendererView(VideoCanvas videoCanvas) {
        if (videoCanvas == null) {
            return false;
        }
        View view = videoCanvas.view;
        if (view == null && videoCanvas.surfaceTexture == null) {
            return true;
        }
        if (view != null) {
            return (view instanceof SurfaceView) || (view instanceof TextureView);
        }
        return Objects.nonNull(videoCanvas.surfaceTexture);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized void addHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (iRtcEngineEventHandler != null) {
            this.mRtcHandlers.put(iRtcEngineEventHandler, new RtcEngineEventHandlerProxy(iRtcEngineEventHandler));
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized void addHandlerEx(IRtcEngineEventHandler iRtcEngineEventHandler, RtcConnection rtcConnection) {
        if (iRtcEngineEventHandler == null || rtcConnection == null) {
            return;
        }
        addHandlerExKey(Pair.create(getChannelId(rtcConnection), Integer.valueOf(getUserId(rtcConnection))), iRtcEngineEventHandler);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int addVideoWatermark(AgoraImage agoraImage) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (agoraImage != null && !TextUtils.isEmpty(agoraImage.url)) {
            WatermarkOptions watermarkOptions = new WatermarkOptions();
            String str = agoraImage.url;
            watermarkOptions.visibleInPreview = false;
            WatermarkOptions.Rectangle rectangle = new WatermarkOptions.Rectangle(agoraImage.f63367x, agoraImage.f63368y, agoraImage.width, agoraImage.height);
            watermarkOptions.positionInLandscapeMode = rectangle;
            watermarkOptions.positionInPortraitMode = rectangle;
            return addVideoWatermark(str, watermarkOptions);
        }
        return -2;
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int addVideoWatermarkEx(String str, WatermarkOptions watermarkOptions, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (str == null || TextUtils.isEmpty(str) || watermarkOptions == null) {
                    return -2;
                }
                int[] rect = getRect(watermarkOptions.positionInLandscapeMode);
                int[] rect2 = getRect(watermarkOptions.positionInPortraitMode);
                long j = this.mNativeHandle;
                if (rtcConnection == null) {
                    return nativeAddVideoWatermark(j, str, watermarkOptions.visibleInPreview, rect, rect2);
                }
                return nativeAddVideoWatermarkEx(j, str, watermarkOptions.visibleInPreview, rect, rect2, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustAudioMixingPlayoutVolume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeAdjustAudioMixingPlayoutVolume(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustAudioMixingPublishVolume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeAdjustAudioMixingPublishVolume(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustAudioMixingVolume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeAdjustAudioMixingVolume(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustCustomAudioPlayoutVolume(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeAdjustCustomAudioPlayoutVolume(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustCustomAudioPublishVolume(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeAdjustCustomAudioPublishVolume(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustPlaybackSignalVolume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeAdjustPlaybackSignalVolume(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustRecordingSignalVolume(int i) {
        return adjustRecordingSignalVolumeEx(i, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int adjustRecordingSignalVolumeEx(int i, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeAdjustRecordingSignalVolume(j, i, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustUserPlaybackSignalVolume(int i, int i2) {
        return adjustUserPlaybackSignalVolumeEx(i, i2, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int adjustUserPlaybackSignalVolumeEx(int i, int i2, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeAdjustUserPlaybackSignalVolume(j, i, i2, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void allowCaptureCurrentApp(ScreenCaptureParameters screenCaptureParameters) {
        if (Build.VERSION.SDK_INT >= 29 && this.mContext.get() != null) {
            ((AudioManager) getContext().getSystemService("audio")).setAllowedCapturePolicy(screenCaptureParameters.audioCaptureParameters.allowCaptureCurrentApp ? 1 : 3);
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int clearVideoWatermarkEx(RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeClearVideoWatermarkEx(j, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int clearVideoWatermarks() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeClearVideoWatermarks(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int complain(String str, String str2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeComplain(j, str, str2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int configRhythmPlayer(AgoraRhythmPlayerConfig agoraRhythmPlayerConfig) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (agoraRhythmPlayerConfig == null) {
            return -2;
        }
        return nativeConfigRhythmPlayer(j, agoraRhythmPlayerConfig);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createCustomAudioTrack(Constants.AudioTrackType audioTrackType, AudioTrackConfig audioTrackConfig) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeCreateCustomAudioTrack(j, Constants.AudioTrackType.getValue(audioTrackType), audioTrackConfig.enableLocalPlayback, audioTrackConfig.enableAudioProcessing);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createCustomEncodedVideoTrack(EncodedVideoTrackOptions encodedVideoTrackOptions) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeCreateCustomEncodedVideoTrack(j, encodedVideoTrackOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createCustomVideoTrack() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeCreateCustomVideoTrack(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createDataStream(DataStreamConfig dataStreamConfig) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return createDataStreamEx(dataStreamConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int createDataStreamEx(DataStreamConfig dataStreamConfig, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeCreateDataStream2(j, dataStreamConfig.ordered, dataStreamConfig.syncWithAudio, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized IMediaPlayer createMediaPlayer() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        int iNativeCreateMediaPlayer = nativeCreateMediaPlayer(j);
        if (iNativeCreateMediaPlayer < 0) {
            return null;
        }
        return new MediaPlayerImpl(this, iNativeCreateMediaPlayer);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized AgoraMediaRecorder createMediaRecorder(RecorderStreamInfo recorderStreamInfo) {
        if (this.mNativeHandle == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        AgoraMediaRecorder agoraMediaRecorder = new AgoraMediaRecorder(this, recorderStreamInfo);
        mMediaRecorders.put(agoraMediaRecorder, Pair.create(recorderStreamInfo.channelId, Integer.valueOf(recorderStreamInfo.uid)));
        return agoraMediaRecorder;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int destroyCustomAudioTrack(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeDestroyCustomAudioTrack(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int destroyCustomEncodedVideoTrack(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeDestroyCustomEncodedVideoTrack(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int destroyCustomVideoTrack(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeDestroyCustomVideoTrack(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized void destroyMediaRecorder(AgoraMediaRecorder agoraMediaRecorder) {
        if (this.mNativeHandle != 0 && agoraMediaRecorder != null) {
            agoraMediaRecorder.release();
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int disableAudio() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableAudio(j, false);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int disableAudioSpectrumMonitor() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeDisableAudioSpectrumMonitor(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int disableVideo() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeDisableVideo(j);
    }

    public synchronized void doDestroy() {
        try {
            setExternalAudioSource(false, 0, 0, false, false);
            setExternalVideoSource(false, false, Constants.ExternalVideoSourceType.VIDEO_FRAME);
            Iterator<Map.Entry<AgoraMediaRecorder, Pair<String, Object>>> it = mMediaRecorders.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getKey().release();
            }
            mMediaRecorders.clear();
            MediaPlayerCacheManagerImpl.destroyMediaPlayerCacheManager();
            H265TranscoderImpl.destroyInstance();
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeDestroy(j);
                this.mNativeHandle = 0L;
                sLibLoaded = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableAudio() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableAudio(j, true);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableAudioSpectrumMonitor(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableAudioSpectrumMonitor(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableAudioVolumeIndication(int i, int i2, boolean z) {
        return enableAudioVolumeIndicationEx(i, i2, z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableAudioVolumeIndicationEx(int i, int i2, boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeEnableAudioVolumeIndication(j, i, i2, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableContentInspect(boolean z, ContentInspectConfig contentInspectConfig) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return enableContentInspectEx(z, contentInspectConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableContentInspectEx(boolean z, ContentInspectConfig contentInspectConfig, RtcConnection rtcConnection) throws Throwable {
        Throwable th;
        byte[] bArrMarshall;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!z) {
                    bArrMarshall = null;
                } else {
                    if (contentInspectConfig == null) {
                        return -7;
                    }
                    try {
                        bArrMarshall = new RtcEngineMessage.PContentInspectConfig().marshall(contentInspectConfig);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return nativeEnableContentInspect(this.mNativeHandle, z, bArrMarshall, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableCustomAudioLocalPlayback(int i, boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableCustomAudioLocalPlayback(j, i, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableDualStreamMode(boolean z) {
        return enableDualStreamMode(z, new SimulcastStreamConfig());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableDualStreamModeEx(boolean z, SimulcastStreamConfig simulcastStreamConfig, RtcConnection rtcConnection) throws Throwable {
        Throwable th;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (simulcastStreamConfig == null) {
                    try {
                        simulcastStreamConfig = new SimulcastStreamConfig();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return nativeEnableDualStreamModeEx(this.mNativeHandle, z, simulcastStreamConfig, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableEncryption(boolean z, EncryptionConfig encryptionConfig) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeEnableEncryption(j, z, encryptionConfig.encryptionMode.getValue(), encryptionConfig.encryptionKey, encryptionConfig.encryptionKdfSalt, encryptionConfig.datastreamEncryptionEnabled);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableEncryptionEx(boolean z, EncryptionConfig encryptionConfig, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeEnableEncryptionEx(j, z, encryptionConfig.encryptionMode.getValue(), encryptionConfig.encryptionKey, encryptionConfig.encryptionKdfSalt, encryptionConfig.datastreamEncryptionEnabled, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExtension(String str, String str2, ExtensionInfo extensionInfo, boolean z) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                if (extensionInfo == null) {
                    return -2;
                }
                return nativeEnableExtension2(j, str, str2, z, Constants.MediaSourceType.getValue(extensionInfo.mediaSourceType), extensionInfo.remoteUid, extensionInfo.channelId, extensionInfo.localUid);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExternalAudioSourceLocalPlayback(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableExternalAudioSourceLocalPlayback(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableFaceDetection(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableFaceDetection(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean enableHighPerfWifiMode(boolean z) {
        Context context = this.mContext.get();
        if (context == null) {
            return false;
        }
        if (!z) {
            this.mWifiLock = null;
        } else {
            if (context.checkPermission("android.permission.WAKE_LOCK", Process.myPid(), Process.myUid()) != 0) {
                Logging.m87224w(TAG, "Failed to enableHighPerfWifiMode, permission WAKE_LOCK not granted ");
                this.mWifiLock = null;
                return false;
            }
            if (this.mWifiLock == null) {
                this.mWifiLock = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).createWifiLock(3, "agora.voip.lock");
            }
        }
        return true;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableInEarMonitoring(boolean z) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return enableInEarMonitoring(z, 1);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableInstantMediaRendering() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableInstantMediaRendering(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableLocalAudio(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableLocalAudio(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableLocalVideo(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableLocalVideo(j, z);
    }

    public synchronized int enableRemoteVideo(boolean z, int i) {
        return setParameterObject("che.video.peer.receive", formatString("{\"enable\":%b, \"uid\":\"%s\"}", Boolean.valueOf(z), toStringUserId(i)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableSoundPositionIndication(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableSoundPositionIndication(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableSpatialAudio(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableSpatialAudio(j, z);
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int enableTransportQualityIndication(boolean z) {
        return setParameter("rtc.transport_quality_indication", z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVideo() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableVideo(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r11.getFps() > 0) goto L21;
     */
    @Override // io.agora.rtc2.RtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int enableVideoImageSource(boolean r10, io.agora.rtc2.video.ImageTrackOptions r11) throws java.lang.Throwable {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.mNativeHandle     // Catch: java.lang.Throwable -> L53
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lc
            monitor-exit(r9)
            r9 = -7
            return r9
        Lc:
            if (r10 == 0) goto L28
            if (r11 == 0) goto L25
            java.lang.String r0 = r11.getImageUrl()     // Catch: java.lang.Throwable -> L21
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L25
            int r0 = r11.getFps()     // Catch: java.lang.Throwable -> L21
            if (r0 > 0) goto L28
            goto L25
        L21:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L56
        L25:
            monitor-exit(r9)
            r9 = -2
            return r9
        L28:
            java.lang.String r0 = ""
            io.agora.rtc2.video.VideoEncoderConfiguration$MIRROR_MODE_TYPE r1 = io.agora.rtc2.video.VideoEncoderConfiguration.MIRROR_MODE_TYPE.MIRROR_MODE_DISABLED     // Catch: java.lang.Throwable -> L53
            int r1 = r1.getValue()     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L42
            java.lang.String r0 = r11.getImageUrl()     // Catch: java.lang.Throwable -> L21
            int r1 = r11.getFps()     // Catch: java.lang.Throwable -> L21
            int r11 = r11.getMirrorMode()     // Catch: java.lang.Throwable -> L21
            r8 = r11
            r7 = r1
        L40:
            r6 = r0
            goto L46
        L42:
            r11 = 0
            r7 = r11
            r8 = r1
            goto L40
        L46:
            long r3 = r9.mNativeHandle     // Catch: java.lang.Throwable -> L53
            r2 = r9
            r5 = r10
            int r9 = r2.nativeEnableVideoImageSource(r3, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r2)
            return r9
        L50:
            r0 = move-exception
        L51:
            r10 = r0
            goto L56
        L53:
            r0 = move-exception
            r2 = r9
            goto L51
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L50
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc2.internal.RtcEngineImpl.enableVideoImageSource(boolean, io.agora.rtc2.video.ImageTrackOptions):int");
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVirtualBackground(boolean z, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty, Constants.MediaSourceType mediaSourceType) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (virtualBackgroundSource == null) {
            if (z) {
                return -2;
            }
            virtualBackgroundSource = new VirtualBackgroundSource();
        }
        if (segmentationProperty == null) {
            if (z) {
                return -2;
            }
            segmentationProperty = new SegmentationProperty();
        }
        return nativeEnableVirtualBackground(this.mNativeHandle, z, virtualBackgroundSource.backgroundSourceType, virtualBackgroundSource.color, virtualBackgroundSource.source, virtualBackgroundSource.blurDegree, segmentationProperty.modelType, segmentationProperty.greenCapacity, Constants.MediaSourceType.getValue(mediaSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVoiceAITuner(boolean z, Constants.VOICE_AI_TUNER_TYPE voice_ai_tuner_type) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (voice_ai_tuner_type == null) {
            return -2;
        }
        return nativeEnableVoiceAITuner(j, z, voice_ai_tuner_type.getValue());
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableWebSdkInteroperability(boolean z) {
        return setParameters(String.format("{\"rtc.video.web_h264_interop_enable\":%b,\"che.video.web_h264_interop_enable\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableWirelessAccelerate(boolean z) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return setParameters(formatString("{\"rtc.video.wifi_acc_enable\":%s}", z ? "true" : "false"));
    }

    public synchronized void finalize() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroy(j);
        }
    }

    public String getAppId() {
        return this.mAppId;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized DeviceInfo getAudioDeviceInfo() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetAudioDeviceInfo(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public IAudioEffectManager getAudioEffectManager() {
        return this;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingCurrentPosition() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetAudioMixingCurrentPosition(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingDuration() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetAudioMixingDuration(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingPlayoutVolume() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetAudioMixingPlayoutVolume(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingPublishVolume() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetAudioMixingPublishVolume(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioTrackCount() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetAudioTrackCount(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getCallId() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetCallId(j);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized String getCallIdEx(RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetCallIdEx(j, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized float getCameraMaxZoomFactor() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return 1.0f;
        }
        return nativeGetCameraMaxZoomFactor(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getConnectionState() {
        return getConnectionStateEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int getConnectionStateEx(RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetConnectionState(j, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    public Context getContext() {
        return this.mContext.get();
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getCurrentMonotonicTimeInMs() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7L;
        }
        return nativeGetCurrentMonotonicTimeInMs(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getEffectCurrentPosition(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetEffectCurrentPosition(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getEffectDuration(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetEffectDuration(j, str);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized double getEffectsVolume() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        return nativeGetEffectsVolume(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0 || extensionInfo == null) {
                    return null;
                }
                return nativeGetExtensionProperty2(j, str, str2, str3, Constants.MediaSourceType.getValue(extensionInfo.mediaSourceType), extensionInfo.remoteUid, extensionInfo.channelId, extensionInfo.localUid);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeAreaOptions getFaceShapeAreaOptions(int i, Constants.MediaSourceType mediaSourceType) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetFaceShapeAreaOptions(j, i, Constants.MediaSourceType.getValue(mediaSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeBeautyOptions getFaceShapeBeautyOptions(Constants.MediaSourceType mediaSourceType) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeGetFaceShapeBeautyOptions(j, Constants.MediaSourceType.getValue(mediaSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized IH265Transcoder getH265Transcoder() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeCreateH265Transcoder(j) >= 0 ? H265TranscoderImpl.getInstance(this) : null;
    }

    @Override // io.agora.rtc2.RtcEngine
    public IMediaPlayerCacheManager getMediaPlayerCacheManager() {
        if (this.mNativeHandle == 0) {
            Logging.m87219e(TAG, "mNativeHandle is not init");
            return null;
        }
        IMediaPlayerCacheManager mediaPlayerCacheManager = MediaPlayerCacheManagerImpl.getMediaPlayerCacheManager(this);
        if (mediaPlayerCacheManager == null) {
            Logging.m87219e(TAG, "mediaPlayerCacheManager is not init");
        }
        return mediaPlayerCacheManager;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getNativeHandle() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetRtcEngine(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getNativeMediaPlayer(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetMediaPlayer(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getNetworkType() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetNetworkType(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getNtpWallTimeInMs() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetNtpWallTimeInMs(j);
    }

    public int getOSVersion() {
        return Build.VERSION.SDK_INT;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getParameter(String str, String str2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetParameter(j, str, str2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getParameters(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetParameters(j, str);
    }

    public synchronized String getProfile() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetProfile(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getUserInfoByUid(int i, UserInfo userInfo) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (userInfo == null) {
            Logging.m87219e(TAG, "Failed to getUserInfoByUid, userInfo null");
            return -2;
        }
        return nativeGetUserInfoByUid(j, i, userInfo);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int getUserInfoByUidEx(int i, UserInfo userInfo, RtcConnection rtcConnection) throws Throwable {
        Throwable th;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (userInfo != null) {
                    if (rtcConnection == null) {
                        return -2;
                    }
                    return nativeGetUserInfoByUidEx(this.mNativeHandle, i, userInfo, getChannelId(rtcConnection), getUserId(rtcConnection));
                }
                try {
                    Logging.m87219e(TAG, "Failed to getUserInfoByUidEx, userInfo null");
                    return -2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getUserInfoByUserAccount(String str, UserInfo userInfo) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (userInfo == null) {
            Logging.m87219e(TAG, "Failed to getUserInfoByUserAccount, userInfo null");
            return -2;
        }
        return nativeGetUserInfoByUserAccount(j, str, userInfo);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int getUserInfoByUserAccountEx(String str, UserInfo userInfo, RtcConnection rtcConnection) throws Throwable {
        Throwable th;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (userInfo != null) {
                    if (rtcConnection == null) {
                        return -2;
                    }
                    return nativeGetUserInfoByUserAccountEx(this.mNativeHandle, str, userInfo, getChannelId(rtcConnection), getUserId(rtcConnection));
                }
                try {
                    Logging.m87219e(TAG, "Failed to getUserInfoByUserAccountEx, userInfo null");
                    return -2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getVolumeOfEffect(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeGetVolumeOfEffect(j, i);
    }

    public synchronized int h265TranscoderEnableTranscode(String str, String str2, int i) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeH265TranscoderEnableTranscode(j, str, str2, i);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int h265TranscoderQueryChannel(String str, String str2, int i) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeH265TranscoderQueryChannel(j, str, str2, i);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int h265TranscoderRegisterObserver(IH265TranscoderObserver iH265TranscoderObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeH265TranscoderRegisterObserver(j, iH265TranscoderObserver);
    }

    public synchronized int h265TranscoderTriggerTranscode(String str, String str2, int i) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeH265TranscoderTriggerTranscode(j, str, str2, i);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int h265TranscoderUnregisterObserver(IH265TranscoderObserver iH265TranscoderObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeH265TranscoderUnregisterObserver(j, iH265TranscoderObserver);
    }

    public synchronized int initMediaPlayerCacheManager() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeInitMediaPlayerCacheManager(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraAutoFocusFaceModeSupported() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraAutoFocusFaceModeSupported(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraExposurePositionSupported() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraExposurePositionSupported(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraExposureSupported() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraExposureSupported(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraFaceDetectSupported() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraFaceDetectSupported(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraFocusSupported() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraFocusSupported(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraTorchSupported() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraTorchSupported(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraZoomSupported() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraZoomSupported(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isFeatureAvailableOnDevice(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return false;
        }
        return nativeIsFeatureAvailableOnDevice(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isSpeakerphoneEnabled() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return false;
        }
        return nativeIsSpeakerphoneEnabled(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isTextureEncodeSupported() {
        return true;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannel(String str, String str2, String str3, int i) throws Throwable {
        try {
            try {
                Context context = this.mContext.get();
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (context == null) {
                    return -7;
                }
                doMonitorSystemEvent(context);
                return nativeJoinChannel(this.mNativeHandle, str, str2, str3, i);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int joinChannelEx(String str, RtcConnection rtcConnection, ChannelMediaOptions channelMediaOptions, IRtcEngineEventHandler iRtcEngineEventHandler) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                String channelId = getChannelId(rtcConnection);
                if (channelId == null || channelId.isEmpty()) {
                    return -2;
                }
                int userId = getUserId(rtcConnection);
                int iNativeJoinChannelEx = nativeJoinChannelEx(this.mNativeHandle, str, channelId, userId, channelMediaOptions);
                if (iNativeJoinChannelEx == 0 && iRtcEngineEventHandler != null) {
                    this.mRtcExHandlerMap.remove(Pair.create(channelId, Integer.valueOf(userId)));
                    addHandlerEx(iRtcEngineEventHandler, rtcConnection);
                }
                return iNativeJoinChannelEx;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannelWithUserAccount(String str, String str2, String str3, ChannelMediaOptions channelMediaOptions) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeJoinChannelWithUserAccount(j, str, str2, str3, channelMediaOptions);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int joinChannelWithUserAccountEx(String str, String str2, String str3, ChannelMediaOptions channelMediaOptions, IRtcEngineEventHandler iRtcEngineEventHandler) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                int iNativeJoinChannelWithUserAccountEx = nativeJoinChannelWithUserAccountEx(j, str, str2, str3, channelMediaOptions);
                if (iNativeJoinChannelWithUserAccountEx == 0) {
                    this.mRtcExHandlerMap.remove(Pair.create(str2, str3));
                    addHandlerExKey(Pair.create(str2, str3), iRtcEngineEventHandler);
                }
                return iNativeJoinChannelWithUserAccountEx;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int leaveChannel(LeaveChannelOptions leaveChannelOptions) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        doStopMonitorSystemEvent();
        return nativeLeaveChannel(this.mNativeHandle, leaveChannelOptions);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int leaveChannelEx(RtcConnection rtcConnection, LeaveChannelOptions leaveChannelOptions) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeLeaveChannelEx(j, getChannelId(rtcConnection), getUserId(rtcConnection), leaveChannelOptions);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public int leaveChannelWithUserAccountEx(String str, String str2, LeaveChannelOptions leaveChannelOptions) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeLeaveChannelWithUserAccountEx(j, str, str2, leaveChannelOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int loadExtensionProvider(String str) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        ExtensionLoadState extensionLoadState = mLoadedExtensions.get(str);
        ExtensionLoadState extensionLoadState2 = ExtensionLoadState.LOADED;
        if (extensionLoadState == extensionLoadState2) {
            return 0;
        }
        int iNativeLoadExtensionProvider = nativeLoadExtensionProvider(this.mNativeHandle, str);
        ConcurrentHashMap<String, ExtensionLoadState> concurrentHashMap = mLoadedExtensions;
        if (iNativeLoadExtensionProvider != 0) {
            extensionLoadState2 = ExtensionLoadState.LOAD_FAIL;
        }
        concurrentHashMap.put(str, extensionLoadState2);
        return iNativeLoadExtensionProvider;
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized String makeQualityReportUrl(String str, String str2, String str3, int i) throws Throwable {
        Throwable th;
        try {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeMakeQualityReportUrl(j, str, str2, str3, i);
                }
                try {
                    Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int mediaPlayerAdjustPlayoutVolume(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerAdjustPlayoutVolume)");
            return -7;
        }
        return nativeMediaPlayerAdjustPlayoutVolume(j, i, i2);
    }

    public synchronized int mediaPlayerAdjustPublishSignalVolume(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerAdjustPublishSignalVolume)");
            return -7;
        }
        return nativeMediaPlayerAdjustPublishSignalVolume(j, i, i2);
    }

    public synchronized int mediaPlayerCacheEnableAutoRemoveCache(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerEnableAutoRemoveCache(j, z);
    }

    public synchronized String mediaPlayerCacheGetCacheDir() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeMediaPlayerGetCacheDir(j);
    }

    public synchronized int mediaPlayerCacheGetCacheFileCount() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerGetCacheFileCount(j);
    }

    public synchronized int mediaPlayerCacheGetMaxCacheFileCount() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerGetMaxCacheFileCount(j);
    }

    public synchronized long mediaPlayerCacheGetMaxCacheFileSize() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7L;
        }
        return nativeMediaPlayerGetMaxCacheFileSize(j);
    }

    public synchronized int mediaPlayerCacheRemoveAllCaches() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerRemoveAllCaches(j);
    }

    public synchronized int mediaPlayerCacheRemoveCacheByUri(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerRemoveCacheByUri(j, str);
    }

    public synchronized int mediaPlayerCacheRemoveOldCache() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerRemoveOldCache(j);
    }

    public synchronized int mediaPlayerCacheSetCacheDir(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerSetCacheDir(j, str);
    }

    public synchronized int mediaPlayerCacheSetMaxCacheFileCount(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerSetMaxCacheFileCount(j, i);
    }

    public synchronized int mediaPlayerCacheSetMaxCacheFileSize(long j) {
        long j2 = this.mNativeHandle;
        if (j2 == 0) {
            return -7;
        }
        return nativeMediaPlayerSetMaxCacheFileSize(j2, j);
    }

    public synchronized int mediaPlayerChangePlaybackSpeed(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerChangePlaybackSpeed)");
            return -7;
        }
        return nativeMediaPlayerChangePlaybackSpeed(j, i, i2);
    }

    public synchronized int mediaPlayerDestroy(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSourceDestroy)");
            return -7;
        }
        return nativeMediaPlayerDestroy(j, i);
    }

    public synchronized int mediaPlayerEnableAutoSwitchAgoraCDN(int i, boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerEnableAutoSwitchAgoraCDN(j, i, z);
    }

    public synchronized int mediaPlayerGetAgoraCDNLineCount(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerGetAgoraCDNLineCount(j, i);
    }

    public synchronized int mediaPlayerGetCurrentAgoraCDNIndex(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerGetCurrentAgoraCDNIndex(j, i);
    }

    public synchronized long mediaPlayerGetDuration(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetDuration)");
            return -7L;
        }
        return nativeMediaPlayerGetDuration(j, i);
    }

    public synchronized boolean mediaPlayerGetMute(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerIsMuted)");
            return false;
        }
        return nativeMediaPlayerGetMute(j, i);
    }

    public synchronized long mediaPlayerGetPlayPosition(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPlayPosition)");
            return -7L;
        }
        return nativeMediaPlayerGetPlayPosition(j, i);
    }

    public synchronized String mediaPlayerGetPlaySrc(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPlaySrc)");
            return null;
        }
        return nativeMediaPlayerGetPlaySrc(j, i);
    }

    public synchronized int mediaPlayerGetPlayoutVolume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPlayoutVolume)");
            return -7;
        }
        return nativeMediaPlayerGetPlayoutVolume(j, i);
    }

    public synchronized int mediaPlayerGetPublishSignalVolume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPublishSignalVolume)");
            return -7;
        }
        return nativeMediaPlayerGetPublishSignalVolume(j, i);
    }

    public synchronized int mediaPlayerGetState(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetState)");
            return -7;
        }
        return nativeMediaPlayerGetState(j, i);
    }

    public synchronized int mediaPlayerGetStreamCount(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetStreamCount)");
            return -7;
        }
        return nativeMediaPlayerGetStreamCount(j, i);
    }

    public synchronized MediaStreamInfo mediaPlayerGetStreamInfo(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetStreamInfo)");
            return null;
        }
        return nativeMediaPlayerGetStreamInfo(j, i, i2);
    }

    public synchronized int mediaPlayerMute(int i, boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerMute)");
            return -7;
        }
        return nativeMediaPlayerMute(j, i, z);
    }

    public synchronized int mediaPlayerOpen(int i, String str, long j) throws Throwable {
        Throwable th;
        try {
            try {
                long j2 = this.mNativeHandle;
                if (j2 != 0) {
                    return nativeMediaPlayerOpen(j2, i, str, j);
                }
                try {
                    Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerOpen)");
                    return -7;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int mediaPlayerOpenWithAgoraCDNSrc(int i, String str, long j) throws Throwable {
        try {
            try {
                long j2 = this.mNativeHandle;
                if (j2 == 0) {
                    return -7;
                }
                return nativeMediaPlayerOpenWithAgoraCDNSrc(j2, i, str, j);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int mediaPlayerOpenWithMediaSource(int i, MediaPlayerSource mediaPlayerSource) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerOpenWithSource(j, i, mediaPlayerSource);
    }

    public synchronized int mediaPlayerPause(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerPause)");
            return -7;
        }
        return nativeMediaPlayerPause(j, i);
    }

    public synchronized int mediaPlayerPlay(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerPlay)");
            return -7;
        }
        return nativeMediaPlayerPlay(j, i);
    }

    public synchronized int mediaPlayerPlayPreloadedSrc(int i, String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerPlayPreloadedSrc(j, i, str);
    }

    public synchronized int mediaPlayerPreloadSrc(int i, String str, long j) throws Throwable {
        try {
            try {
                long j2 = this.mNativeHandle;
                if (j2 == 0) {
                    return -7;
                }
                return nativeMediaPlayerPreloadSrc(j2, i, str, j);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int mediaPlayerRegisterAudioFrameObserver(int i, IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i2) throws Throwable {
        Throwable th;
        try {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeMediaPlayerRegisterAudioFrameObserver(j, i, iMediaPlayerAudioFrameObserver, i2);
                }
                try {
                    Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerRegisterAudioFrameObserver)");
                    return -7;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int mediaPlayerRegisterPlayerObserver(int i, IMediaPlayerObserver iMediaPlayerObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerRegisterPlayerObserver)");
            return -7;
        }
        return nativeMediaPlayerRegisterPlayerObserver(j, i, iMediaPlayerObserver);
    }

    public synchronized int mediaPlayerRegisterVideoFrameObserver(int i, IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerRegisterVideoFrameObserver)");
            return -7;
        }
        return nativeMediaPlayerRegisterVideoFrameObserver(j, i, iMediaPlayerVideoFrameObserver);
    }

    public synchronized int mediaPlayerRenewAgoraCDNSrcToken(int i, String str, long j) throws Throwable {
        try {
            try {
                long j2 = this.mNativeHandle;
                if (j2 == 0) {
                    return -7;
                }
                return nativeMediaPlayerRenewAgoraCDNSrcToken(j2, i, str, j);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int mediaPlayerResume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerResume)");
            return -7;
        }
        return nativeMediaPlayerResume(j, i);
    }

    public synchronized int mediaPlayerSeek(int i, long j) throws Throwable {
        Throwable th;
        try {
            try {
                long j2 = this.mNativeHandle;
                if (j2 != 0) {
                    return nativeMediaPlayerSeek(j2, i, j);
                }
                try {
                    Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSeek)");
                    return -7;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int mediaPlayerSelectAudioTrack(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSelectAudioTrack)");
            return -7;
        }
        return nativeMediaPlayerSelectAudioTrack(j, i, i2);
    }

    public synchronized int mediaPlayerSelectInternalSubtitle(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSelectInternalSubtitle)");
            return -7;
        }
        return nativeMediaPlayerSelectInternalSubtitle(j, i, i2);
    }

    public synchronized int mediaPlayerSelectMultiAudioTrack(int i, int i2, int i3) throws Throwable {
        Throwable th;
        try {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeMediaPlayerSelectMultiAudioTrack(j, i, i2, i3);
                }
                try {
                    Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSelectAudioTrack)");
                    return -7;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int mediaPlayerSetAudioDualMonoMode(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetAudioDualMonoMode)");
            return -7;
        }
        return nativeMediaPlayerSetAudioDualMonoMode(j, i, i2);
    }

    public synchronized int mediaPlayerSetAudioPitch(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetAudioPitch)");
            return -7;
        }
        return nativeMediaPlayerSetAudioPitch(j, i, i2);
    }

    public synchronized int mediaPlayerSetExternalSubtitle(int i, String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetExternalSubtitle)");
            return -7;
        }
        return nativeMediaPlayerSetExternalSubtitle(j, i, str);
    }

    public synchronized int mediaPlayerSetLoopCount(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetLoopCount)");
            return -7;
        }
        return nativeMediaPlayerSetLoopCount(j, i, i2);
    }

    public synchronized int mediaPlayerSetPlayerOption(int i, String str, int i2) throws Throwable {
        Throwable th;
        try {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeMediaPlayerSetPlayerOption(j, i, str, i2);
                }
                try {
                    Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetPlayerOption)");
                    return -7;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int mediaPlayerSetPlayerOptionString(int i, String str, String str2) throws Throwable {
        Throwable th;
        try {
            try {
                long j = this.mNativeHandle;
                if (j != 0) {
                    return nativeMediaPlayerSetPlayerOptionString(j, i, str, str2);
                }
                try {
                    Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetPlayerOption)");
                    return -7;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public synchronized int mediaPlayerSetRenderMode(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetRenderMode)");
            return -7;
        }
        return nativeMediaPlayerSetRenderMode(j, i, i2);
    }

    public synchronized int mediaPlayerSetSpatialAudioParams(int i, SpatialAudioParams spatialAudioParams) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetSpatialAudioParams)");
            return -7;
        }
        return nativeMediaPlayerSetSpatialAudioParams(j, i, spatialAudioParams);
    }

    public synchronized int mediaPlayerSetView(int i, View view) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetView)");
            return -7;
        }
        return nativeMediaPlayerSetView(j, i, view);
    }

    public synchronized int mediaPlayerStop(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerStop)");
            return -7;
        }
        return nativeMediaPlayerStop(j, i);
    }

    public synchronized int mediaPlayerSwitchAgoraCDNLineByIndex(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerSwitchAgoraCDNLineByIndex(j, i, i2);
    }

    public synchronized int mediaPlayerSwitchAgoraCDNSrc(int i, String str, boolean z) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMediaPlayerSwitchAgoraCDNSrc(j, i, str, z);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int mediaPlayerSwitchSrc(int i, String str, boolean z) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMediaPlayerSwitchSrc(j, i, str, z);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized int mediaPlayerTakeScreenshot(int i, String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerTakeScreenshot)");
            return -7;
        }
        return nativeMediaPlayerTakeScreenshot(j, i, str);
    }

    public synchronized int mediaPlayerUnRegisterPlayerObserver(int i, IMediaPlayerObserver iMediaPlayerObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerUnRegisterPlayerObserver)");
            return -7;
        }
        return nativeMediaPlayerUnRegisterPlayerObserver(j, i, iMediaPlayerObserver);
    }

    public synchronized int mediaPlayerUnloadSrc(int i, String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeMediaPlayerUnloadSrc(j, i, str);
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int monitorAudioRouteChange(boolean z) {
        Logging.m87221i("API call monitorAudioRouteChange:" + z);
        return 0;
    }

    @Override // io.agora.rtc2.RtcEngine
    @TargetApi(11)
    @Deprecated
    public synchronized void monitorBluetoothHeadsetEvent(boolean z) {
        Logging.m87222i(TAG, "enter monitorBluetoothHeadsetEvent:" + z);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized void monitorHeadsetEvent(boolean z) {
        Logging.m87222i(TAG, "enter monitorHeadsetEvent:" + z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteAllRemoteAudioStreams(boolean z) {
        return muteAllRemoteAudioStreamsEx(z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteAllRemoteAudioStreamsEx(boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMuteAllRemoteAudioStreams(j, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteAllRemoteVideoStreams(boolean z) {
        return muteAllRemoteVideoStreamsEx(z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteAllRemoteVideoStreamsEx(boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMuteAllRemoteVideoStreams(j, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteLocalAudioStream(boolean z) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return muteLocalAudioStreamEx(z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteLocalAudioStreamEx(boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMuteLocalAudioStream(j, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteLocalVideoStream(boolean z) {
        return muteLocalVideoStreamEx(z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteLocalVideoStreamEx(boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMuteLocalVideoStream(j, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteRecordingSignal(boolean z) {
        return muteRecordingSignalEx(z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteRecordingSignalEx(boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMuteRecordingSignal(j, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteRemoteAudioStream(int i, boolean z) {
        return muteRemoteAudioStreamEx(i, z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteRemoteAudioStreamEx(int i, boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMuteRemoteAudioStream(j, i, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteRemoteVideoStream(int i, boolean z) {
        return muteRemoteVideoStreamEx(i, z, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteRemoteVideoStreamEx(int i, boolean z, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeMuteRemoteVideoStream(j, i, z, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public native int nativePushExternalVideoFrame(long j, VideoFrame videoFrame, int i);

    @CalledByNative
    public void onEvent(int i, byte[] bArr) {
        Iterator<Map.Entry<IRtcEngineEventHandler, RtcEngineEventHandlerProxy>> it = this.mRtcHandlers.entrySet().iterator();
        while (it.hasNext()) {
            RtcEngineEventHandlerProxy value = it.next().getValue();
            if (value == null) {
                it.remove();
            } else {
                value.handleEvent(i, bArr);
            }
        }
    }

    @CalledByNative
    public void onEventEx(String str, int i, String str2, int i2, byte[] bArr) {
        ArrayList<RtcEngineEventHandlerProxy> arrayList = !TextUtils.isEmpty(str2) ? this.mRtcExHandlerMap.get(Pair.create(str, str2)) : null;
        if (arrayList == null) {
            arrayList = this.mRtcExHandlerMap.get(Pair.create(str, Integer.valueOf(i)));
        }
        if (arrayList != null) {
            Iterator<RtcEngineEventHandlerProxy> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().handleEvent(i2, bArr);
            }
        } else {
            Log.e(TAG, "onEventEx: can't find exhandler for channelId=" + str + " uid=" + i);
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pauseAllChannelMediaRelay() {
        return pauseAllChannelMediaRelayEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int pauseAllChannelMediaRelayEx(RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativePauseAllChannelMediaRelay(j, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int pauseAllEffects() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativePauseAllEffects(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pauseAudio() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativePauseAudio(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pauseAudioMixing() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativePauseAudioMixing(j);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int pauseEffect(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativePauseEffect(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int playAllEffects(int i, double d, double d2, double d3, boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativePlayAllEffects(j, i, d, d2, d3, z);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z, int i3) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativePlayEffectWithFilePath(j, i, str, i2, d, d2, d3, z, i3);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int preloadChannel(String str, String str2, int i) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativePreloadChannel(j, str, str2, i);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int preloadChannelWithUserAccount(String str, String str2, String str3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativePreloadChannelWithUserAccount(j, str, str2, str3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int preloadEffect(int i, String str, int i2) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(str)) {
                    return -2;
                }
                return nativePreloadEffect(this.mNativeHandle, i, str, i2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pullPlaybackAudioFrame(ByteBuffer byteBuffer, int i) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (byteBuffer == null || byteBuffer.capacity() != i) {
                    return -2;
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("data must be direct buffer!");
                }
                return nativePullAudioFrame(this.mNativeHandle, byteBuffer, i, this.mExSinkAudioSampleRate, this.mExSinkAudioChannels);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(byte[] bArr, long j, int i, int i2, Constants.BytesPerSample bytesPerSample, int i3) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (bArr == null) {
            return -2;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocateDirect.put(bArr, 0, bArr.length);
        byteBufferAllocateDirect.flip();
        return nativePushExternalAudioFrameRawData(this.mNativeHandle, byteBufferAllocateDirect, j, i, Constants.BytesPerSample.getValue(bytesPerSample), i2, i3);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalEncodedVideoFrame(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo) {
        return pushExternalEncodedVideoFrameById(byteBuffer, encodedVideoFrameInfo, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalEncodedVideoFrameById(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo, int i) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("data must be direct buffer!");
                }
                return nativePushExternalEncodedVideoFrame(this.mNativeHandle, byteBuffer, encodedVideoFrameInfo, i);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean pushExternalVideoFrame(VideoFrame videoFrame) {
        int iPushExternalVideoFrameById = pushExternalVideoFrameById(videoFrame, 0);
        if (iPushExternalVideoFrameById == 0) {
            return true;
        }
        Logging.m87219e(TAG, "Failed to pushExternalVideoFrame, " + iPushExternalVideoFrameById);
        return false;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalVideoFrameById(AgoraVideoFrame agoraVideoFrame, int i) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        int iValidatePushExternalVideoFrame = validatePushExternalVideoFrame(agoraVideoFrame);
        if (iValidatePushExternalVideoFrame == 0) {
            return nativePushExternalAgoraVideoFrame(this.mNativeHandle, agoraVideoFrame.format, agoraVideoFrame.buf, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.cropLeft, agoraVideoFrame.cropTop, agoraVideoFrame.cropRight, agoraVideoFrame.cropBottom, agoraVideoFrame.rotation, agoraVideoFrame.timeStamp, agoraVideoFrame.eglContext10, agoraVideoFrame.eglContext14, agoraVideoFrame.textureID, agoraVideoFrame.transform, agoraVideoFrame.alphaStitchMode.value(), i);
        }
        int i2 = this.mPushVideoFrameInvalidCnt + 1;
        this.mPushVideoFrameInvalidCnt = i2;
        if (i2 % 150 == 1) {
            Logging.m87219e(TAG, "failed to push video frame: " + agoraVideoFrame);
        }
        return iValidatePushExternalVideoFrame;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized AgoraFocalLengthInfo[] queryCameraFocalLengthCapability() {
        return nativeQueryCameraFocalLengthCapability(this.mNativeHandle);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized CodecCapInfo[] queryCodecCapability() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return null;
        }
        return nativeQueryCodecCapability(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int queryDeviceScore() {
        return nativeQueryDeviceScore(this.mNativeHandle);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int queryScreenCaptureCapability() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeQueryScreenCaptureCapability(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int rate(String str, int i, String str2) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeRate(j, str, i, str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized void recordCreateEngineTimeStamp(long j, long j2) throws Throwable {
        RtcEngineImpl rtcEngineImpl;
        try {
            try {
                long j3 = this.mNativeHandle;
                if (j3 != 0) {
                    rtcEngineImpl = this;
                    rtcEngineImpl.nativeRecordCreateEngineTimeStamp(j3, j, j2);
                } else {
                    rtcEngineImpl = this;
                }
                return;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerAudioEncodedFrameObserver(AudioEncodedFrameObserverConfig audioEncodedFrameObserverConfig, IAudioEncodedFrameObserver iAudioEncodedFrameObserver) throws Throwable {
        Throwable th;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (audioEncodedFrameObserverConfig == null) {
                    try {
                        audioEncodedFrameObserverConfig = new AudioEncodedFrameObserverConfig();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return nativeregisterAudioEncodedFrameObserver(this.mNativeHandle, iAudioEncodedFrameObserver, audioEncodedFrameObserverConfig.postionType, audioEncodedFrameObserverConfig.encodingType);
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeRegisterAudioFrameObserver(j, iAudioFrameObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeRegisterAudioSpectrumObserver(j, iAudioSpectrumObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerExtension(String str, String str2, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeRegisterExtension(j, str, str2, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerFaceInfoObserver(IFaceInfoObserver iFaceInfoObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeRegisterFaceInfoObserver(j, iFaceInfoObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerLocalUserAccount(String str, String str2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeRegisterLocalUserAccount(j, str, str2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (iMetadataObserver == null) {
            Logging.m87219e(TAG, "Failed to registerMediaMetadataObserver, observer is null");
            return -2;
        }
        return nativeRegisterMediaMetadataObserver(j, iMetadataObserver, i);
    }

    public synchronized int registerMediaPlayerAudioSpectrumObserver(int i, IAudioSpectrumObserver iAudioSpectrumObserver, int i2) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeRegisterMediaPlayerAudioSpectrumObserver(j, i, iAudioSpectrumObserver, i2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerVideoEncodedFrameObserver(IVideoEncodedFrameObserver iVideoEncodedFrameObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeRegisterVideoEncodedFrameObserver(j, iVideoEncodedFrameObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerVideoFrameObserver(IVideoFrameObserver iVideoFrameObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeRegisterVideoFrameObserver(j, iVideoFrameObserver);
    }

    public synchronized void reinitialize(RtcEngineConfig rtcEngineConfig) {
        this.mRtcHandlers.clear();
        addHandler(rtcEngineConfig.mEventHandler);
    }

    public int releaseRecorder(String str, int i, boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeReleaseRecorder(j, i, str, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized void removeHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (iRtcEngineEventHandler != null) {
            this.mRtcHandlers.remove(iRtcEngineEventHandler);
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized void removeHandlerEx(IRtcEngineEventHandler iRtcEngineEventHandler, RtcConnection rtcConnection) {
        if (iRtcEngineEventHandler == null || rtcConnection == null) {
            return;
        }
        ArrayList<RtcEngineEventHandlerProxy> arrayList = this.mRtcExHandlerMap.get(Pair.create(getChannelId(rtcConnection), Integer.valueOf(getUserId(rtcConnection))));
        if (arrayList != null) {
            for (RtcEngineEventHandlerProxy rtcEngineEventHandlerProxy : arrayList) {
                if (rtcEngineEventHandlerProxy.getHandler() == iRtcEngineEventHandler) {
                    arrayList.remove(rtcEngineEventHandlerProxy);
                    break;
                }
            }
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int renewToken(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (str == null) {
            return -2;
        }
        return nativeRenewToken(j, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int resumeAllChannelMediaRelay() {
        return resumeAllChannelMediaRelayEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int resumeAllChannelMediaRelayEx(RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeResumeAllChannelMediaRelay(j, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int resumeAllEffects() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeResumeAllEffects(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int resumeAudio() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeResumeAudio(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int resumeAudioMixing() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeResumeAudioMixing(j);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int resumeEffect(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeResumeEffect(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int selectAudioTrack(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSelectAudioTrack(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public int sendAudioMetadata(byte[] bArr) {
        return sendAudioMetadataEx(bArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendAudioMetadataEx(byte[] bArr, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSendAudioMetadata(j, bArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int sendCustomReportMessage(String str, String str2, String str3, String str4, int i) {
        return sendCustomReportMessageEx(str, str2, str3, str4, i, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendCustomReportMessageEx(String str, String str2, String str3, String str4, int i, RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSendCustomReportMessage(j, str, str2, str3, str4, i, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int sendStreamMessage(int i, byte[] bArr) {
        return sendStreamMessageEx(i, bArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendStreamMessageEx(int i, byte[] bArr, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSendStreamMessage(j, i, bArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAINSMode(boolean z, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativesetAINSMode(j, z, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAVSyncSource(String str, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAVSyncSource(j, str, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAdvancedAudioOptions(AdvancedAudioOptions advancedAudioOptions) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAdvancedAudioOptions(j, advancedAudioOptions.audioProcessingChannels.getValue());
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setApiCallMode(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetApiCallMode(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioEffectParameters(int i, int i2, int i3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetAudioEffectParameters(j, i, i2, i3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioEffectPreset(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioEffectPreset(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingDualMonoMode(Constants.AudioMixingDualMonoMode audioMixingDualMonoMode) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioMixingDualMonoMode(j, Constants.AudioMixingDualMonoMode.getValue(audioMixingDualMonoMode));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingPitch(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioMixingPitch(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingPlaybackSpeed(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioMixingPlaybackSpeed(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingPosition(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioMixingPosition(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioProfile(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioProfile(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioScenario(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioScenario(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setBeautyEffectOptions(boolean z, BeautyOptions beautyOptions, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetBeautyEffectOptions(j, z, beautyOptions.lighteningContrastLevel, beautyOptions.lighteningLevel, beautyOptions.smoothnessLevel, beautyOptions.rednessLevel, beautyOptions.sharpnessLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraAutoFocusFaceModeEnabled(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetCameraAutoFocusFaceModeEnabled(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraCapturerConfiguration(CameraCapturerConfiguration cameraCapturerConfiguration) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (cameraCapturerConfiguration == null) {
            Logging.m87219e(TAG, "CameraCapturerConfiguration is null");
            return -2;
        }
        return nativeSetCameraCapturerConfiguration(j, cameraCapturerConfiguration);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraExposureFactor(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetCameraExposureFactor(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraExposurePosition(float f, float f2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetCameraExposurePosition(j, f, f2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraFocusPositionInPreview(float f, float f2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetCameraFocusPositionInPreview(j, f, f2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraTorchOn(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetCameraTorchOn(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraZoomFactor(float f) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetCameraZoomFactor(j, f);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setChannelProfile(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetChannelProfile(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setClientRole(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetClientRole(j, i, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCloudProxy(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetCloudProxy(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setColorEnhanceOptions(boolean z, ColorEnhanceOptions colorEnhanceOptions, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetColorEnhanceOptions(j, z, colorEnhanceOptions.strengthLevel, colorEnhanceOptions.skinProtectLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDefaultAudioRoutetoSpeakerphone(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetDefaultAudioRoutetoSpeakerphone(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDirectCdnStreamingAudioConfiguration(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetDirectCdnStreamingAudioConfiguration(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDirectCdnStreamingVideoConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                VideoEncoderConfiguration.VideoDimensions videoDimensions = videoEncoderConfiguration.dimensions;
                return nativeSetDirectCdnStreamingVideoConfiguration(j, videoDimensions.width, videoDimensions.height, videoEncoderConfiguration.frameRate, videoEncoderConfiguration.bitrate, videoEncoderConfiguration.minBitrate, videoEncoderConfiguration.orientationMode.getValue(), videoEncoderConfiguration.mirrorMode.getValue(), videoEncoderConfiguration.degradationPrefer.getValue());
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode) {
        return setDualStreamMode(simulcastStreamMode, new SimulcastStreamConfig());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setDualStreamModeEx(Constants.SimulcastStreamMode simulcastStreamMode, SimulcastStreamConfig simulcastStreamConfig, RtcConnection rtcConnection) throws Throwable {
        Throwable th;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (simulcastStreamConfig == null) {
                    try {
                        simulcastStreamConfig = new SimulcastStreamConfig();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return nativeSetDualStreamModeEx(this.mNativeHandle, Constants.SimulcastStreamMode.getValue(simulcastStreamMode), simulcastStreamConfig, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setEarMonitoringAudioFrameParameters(int i, int i2, int i3, int i4) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetEarMonitoringAudioFrameParameters(j, i, i2, i3, i4);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setEffectPosition(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetEffectPosition(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int setEffectsVolume(double d) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetEffectsVolume(j, d);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setEnableSpeakerphone(boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetEnableSpeakerphone(j, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3, String str4) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (extensionInfo == null) {
            return -2;
        }
        return nativeSetExtensionProperty2(j, str, str2, str3, str4, Constants.MediaSourceType.getValue(extensionInfo.mediaSourceType), extensionInfo.remoteUid, extensionInfo.channelId, extensionInfo.localUid);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProviderProperty(String str, String str2, String str3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetExtensionProviderProperty(j, str, str2, str3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalAudioSink(boolean z, int i, int i2) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                this.mExSinkAudioSampleRate = i;
                this.mExSinkAudioChannels = i2;
                return nativeSetExternalAudioSink(j, z, i, i2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalAudioSource(boolean z, int i, int i2, boolean z2, boolean z3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                this.mExSourceAudioSampleRate = i;
                this.mExSourceAudioChannels = i2;
                return nativeSetExternalAudioSource(j, z, i, i2, z2, z3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public int setExternalMediaProjection(MediaProjection mediaProjection) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (mediaProjection == null) {
            Logging.m87224w(TAG, "setExternalMediaProjection null");
        }
        return nativeSetExternalMediaProjection(this.mNativeHandle, mediaProjection);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    @Override // io.agora.rtc2.RtcEngine
    public int setExternalRemoteEglContext(Object obj) {
        boolean z;
        android.opengl.EGLContext eglContext;
        EGLContext eglContext2;
        boolean zEquals;
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (obj != null) {
            if (obj instanceof EglBase10.Context) {
                eglContext2 = ((EglBase10.Context) obj).getEglContext();
            } else {
                if (obj instanceof EglBase14.Context) {
                    eglContext = ((EglBase14.Context) obj).getEglContext();
                } else {
                    if (obj instanceof EGLContext) {
                        eglContext2 = (EGLContext) obj;
                    } else if (obj instanceof android.opengl.EGLContext) {
                        eglContext = (android.opengl.EGLContext) obj;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Logging.m87219e(TAG, "setExternalRemoteEglContext failure, eglContext Invalid.");
                        return -1;
                    }
                }
                zEquals = eglContext.equals(EGL14.EGL_NO_CONTEXT);
                z = !zEquals;
                if (!z) {
                    Logging.m87219e(TAG, "setExternalRemoteEglContext failure, eglContext Invalid.");
                    return -1;
                }
            }
            zEquals = eglContext2.equals(EGL10.EGL_NO_CONTEXT);
            z = !zEquals;
            if (!z) {
                Logging.m87219e(TAG, "setExternalRemoteEglContext failure, eglContext Invalid.");
                return -1;
            }
        }
        synchronized (this) {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetExternalRemoteEglContext(j, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalVideoSource(boolean z, boolean z2, Constants.ExternalVideoSourceType externalVideoSourceType, EncodedVideoTrackOptions encodedVideoTrackOptions) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetExternalVideoSource(j, z, z2, Constants.ExternalVideoSourceType.getValue(externalVideoSourceType), encodedVideoTrackOptions);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetFaceShapeAreaOptions(j, faceShapeAreaOptions.shapeArea, faceShapeAreaOptions.shapeIntensity, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeBeautyOptions(boolean z, FaceShapeBeautyOptions faceShapeBeautyOptions, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetFaceShapeBeautyOptions(j, z, faceShapeBeautyOptions.shapeStyle, faceShapeBeautyOptions.styleIntensity, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFilterEffectOptions(boolean z, FilterEffectOptions filterEffectOptions, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetFilterEffectOptions(j, z, filterEffectOptions.path, filterEffectOptions.strength, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHeadphoneEQParameters(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetHeadphoneEQParameters(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHeadphoneEQPreset(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetHeadphoneEQPreset(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHighPriorityUserList(int[] iArr, int i) {
        return setHighPriorityUserListEx(iArr, i, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setHighPriorityUserListEx(int[] iArr, int i, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetHighPriorityUserList(j, iArr, i, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHighQualityAudioParameters(boolean z, boolean z2, boolean z3) {
        return setParameterObject("che.audio.codec.hq", formatString("{\"fullband\":%b,\"stereo\":%b,\"fullBitrate\":%b}", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setInEarMonitoringVolume(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetInEarMonitoringVolume(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalAccessPoint(LocalAccessPointConfiguration localAccessPointConfiguration) throws Throwable {
        Throwable th;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (localAccessPointConfiguration.ipList == null) {
                    try {
                        localAccessPointConfiguration.ipList = new ArrayList<>();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (localAccessPointConfiguration.domainList == null) {
                    localAccessPointConfiguration.domainList = new ArrayList<>();
                }
                if (localAccessPointConfiguration.verifyDomainName == null) {
                    localAccessPointConfiguration.verifyDomainName = "";
                }
                if (localAccessPointConfiguration.advancedConfig == null) {
                    localAccessPointConfiguration.advancedConfig = new LocalAccessPointConfiguration.AdvancedConfigInfo();
                }
                return nativeSetLocalAccessPoint(this.mNativeHandle, localAccessPointConfiguration.ipList, localAccessPointConfiguration.domainList, localAccessPointConfiguration.verifyDomainName, localAccessPointConfiguration.mode, localAccessPointConfiguration.advancedConfig, localAccessPointConfiguration.disableAut);
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setLocalPublishFallbackOption(int i) {
        Constants.StreamFallbackOptions streamFallbackOptions;
        Constants.StreamFallbackOptions[] streamFallbackOptionsArrValues = Constants.StreamFallbackOptions.values();
        int length = streamFallbackOptionsArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                streamFallbackOptions = null;
                break;
            }
            streamFallbackOptions = streamFallbackOptionsArrValues[i2];
            if (streamFallbackOptions.getValue() == i) {
                break;
            }
            i2++;
        }
        if (streamFallbackOptions == null) {
            return -2;
        }
        return setLocalPublishFallbackOption(streamFallbackOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setLocalRenderMode(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetLocalRenderMode(j, i, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalRenderTargetFps(Constants.VideoSourceType videoSourceType, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativesetLocalRenderTargetFps(j, Constants.VideoSourceType.getValue(videoSourceType), i);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setLocalVideoMirrorMode(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (i != 0 && i != 1 && i != 2) {
            return -2;
        }
        return nativeSetLocalVideoMirrorMode(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoiceEqualization(Constants.AUDIO_EQUALIZATION_BAND_FREQUENCY audio_equalization_band_frequency, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (audio_equalization_band_frequency == null) {
            return -2;
        }
        return nativeSetLocalVoiceEqualization(j, audio_equalization_band_frequency.getValue(), i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoiceFormant(double d) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetLocalVoiceFormant(j, d);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoicePitch(double d) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetLocalVoicePitch(j, d);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoiceReverb(Constants.AUDIO_REVERB_TYPE audio_reverb_type, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (audio_reverb_type == null) {
            return -2;
        }
        return nativeSetLocalVoiceReverb(j, audio_reverb_type.getValue(), i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogFile(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetLogFile(j, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogFileSize(long j) {
        long j2 = this.mNativeHandle;
        if (j2 == 0) {
            return -7;
        }
        return nativeSetLogFileSize(j2, j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogFilter(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetLogFilter(j, i & 2063);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogLevel(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetLogLevel(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLowlightEnhanceOptions(boolean z, LowLightEnhanceOptions lowLightEnhanceOptions, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetLowlightEnhanceOptions(j, z, lowLightEnhanceOptions.lowlightEnhanceMode, lowLightEnhanceOptions.lowlightEnhanceLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public int setMediaRecorderObserver(IMediaRecorderCallback iMediaRecorderCallback, int i, String str, boolean z, int i2) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        Logging.m87218e("setMediaRecorderObserver streamtype is " + i2 + " channelId" + str);
        return nativeSetMediaRecorderObserver(this.mNativeHandle, iMediaRecorderCallback, i, str, z, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setMixedAudioFrameParameters(int i, int i2, int i3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetMixedAudioFrameParameters(j, i, i2, i3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setParameters(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetParameters(j, str);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setParametersEx(String str, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetParametersEx(j, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setPlaybackAudioFrameBeforeMixingParameters(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetPlaybackAudioFrameBeforeMixingParameters(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetPlaybackAudioFrameParameters(j, i, i2, i3, i4);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized void setPreferHeadset(boolean z) {
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setProfile(String str, boolean z) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetProfile(j, str, z);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetRecordingAudioFrameParameters(j, i, i2, i3, i4);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteDefaultVideoStreamType(Constants.VideoStreamType videoStreamType) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        setParameter("rtc.video.set_remote_default_video_stream_type", videoStreamType.getValue());
        return nativeSetRemoteDefaultVideoStreamType(this.mNativeHandle, videoStreamType.getValue());
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteRenderMode(int i, int i2) {
        return setRemoteRenderModeEx(i, i2, 2, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteRenderModeEx(int i, int i2, int i3, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetRemoteRenderMode(j, i, i2, i3, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteRenderTargetFps(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativesetRemoteRenderTargetFps(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteSubscribeFallbackOption(Constants.StreamFallbackOptions streamFallbackOptions) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (streamFallbackOptions.getValue() >= Constants.StreamFallbackOptions.STREAM_FALLBACK_OPTION_DISABLED.getValue() && streamFallbackOptions.getValue() <= Constants.StreamFallbackOptions.STREAM_FALLBACK_OPTION_VIDEO_STREAM_LAYER_6.getValue()) {
            setParameter("rtc.remote_subscribe_fallback_option", streamFallbackOptions.getValue());
            return nativeSetRemoteSubscribeFallbackOption(this.mNativeHandle, streamFallbackOptions.getValue());
        }
        return -2;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteUserPriority(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetRemoteUserPriority(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteUserSpatialAudioParams(int i, SpatialAudioParams spatialAudioParams) {
        return setRemoteUserSpatialAudioParamsEx(i, spatialAudioParams, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteUserSpatialAudioParamsEx(int i, SpatialAudioParams spatialAudioParams, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                if (spatialAudioParams == null) {
                    return -2;
                }
                return nativeSetRemoteUserSpatialAudioParams(j, i, spatialAudioParams, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteVideoStreamType(int i, int i2) {
        return setRemoteVideoStreamTypeEx(i, i2, (RtcConnection) null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteVideoStreamTypeEx(int i, Constants.VideoStreamType videoStreamType, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetRemoteVideoStreamType(j, i, videoStreamType.getValue(), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteVideoSubscriptionOptions(int i, VideoSubscriptionOptions videoSubscriptionOptions) {
        return setRemoteVideoSubscriptionOptionsEx(i, videoSubscriptionOptions, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteVideoSubscriptionOptionsEx(int i, VideoSubscriptionOptions videoSubscriptionOptions, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                if (videoSubscriptionOptions == null) {
                    return -2;
                }
                return nativeSetRemoteVideoSubscriptionOptions(j, i, videoSubscriptionOptions, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteVoicePosition(int i, double d, double d2) {
        return setRemoteVoicePositionEx(i, d, d2, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteVoicePositionEx(int i, double d, double d2, RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetRemoteVoicePosition(j, i, d, d2, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRouteInCommunicationMode(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetRouteInCommunicationMode(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setScreenCaptureScenario(Constants.ScreenScenarioType screenScenarioType) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetScreenCaptureScenario(j, Constants.ScreenScenarioType.getValue(screenScenarioType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSimulcastConfig(SimulcastConfig simulcastConfig) {
        return setSimulcastConfigEx(simulcastConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSimulcastConfigEx(SimulcastConfig simulcastConfig, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                if (simulcastConfig == null) {
                    return -2;
                }
                return nativeSetSimulcastConfigEx(j, simulcastConfig.configs, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeAudioAllowlist(int[] iArr) {
        return setSubscribeAudioAllowlistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeAudioAllowlistEx(int[] iArr, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetSubscribeAudioWhitelist(j, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeAudioBlocklist(int[] iArr) {
        return setSubscribeAudioBlocklistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeAudioBlocklistEx(int[] iArr, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetSubscribeAudioBlacklist(j, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeVideoAllowlist(int[] iArr) {
        return setSubscribeVideoAllowlistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeVideoAllowlistEx(int[] iArr, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetSubscribeVideoWhitelist(j, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeVideoBlocklist(int[] iArr) {
        return setSubscribeVideoBlocklistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeVideoBlocklistEx(int[] iArr, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetSubscribeVideoBlacklist(j, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setTextureId(int i, android.opengl.EGLContext eGLContext, int i2, int i3, long j) {
        return -4;
    }

    public synchronized int setTextureIdWithMatrix(int i, android.opengl.EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        return -4;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoDenoiserOptions(boolean z, VideoDenoiserOptions videoDenoiserOptions, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetVideoDenoiserOptions(j, z, videoDenoiserOptions.denoiserMode, videoDenoiserOptions.denoiserLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
        return setVideoEncoderConfigurationEx(videoEncoderConfiguration, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setVideoEncoderConfigurationEx(VideoEncoderConfiguration videoEncoderConfiguration, RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        VideoEncoderConfiguration.VideoDimensions videoDimensions = videoEncoderConfiguration.dimensions;
        return nativeSetVideoEncoderConfiguration(j, videoDimensions.width, videoDimensions.height, videoEncoderConfiguration.frameRate, videoEncoderConfiguration.bitrate, videoEncoderConfiguration.minBitrate, videoEncoderConfiguration.orientationMode.getValue(), videoEncoderConfiguration.mirrorMode.getValue(), videoEncoderConfiguration.degradationPrefer.getValue(), videoEncoderConfiguration.advanceOptions.compressionPreference.getValue(), videoEncoderConfiguration.advanceOptions.encodingPreference.getValue(), videoEncoderConfiguration.advanceOptions.encodeAlpha, videoEncoderConfiguration.codecType.getValue(), getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoQoEPreference(Constants.QoEPreference qoEPreference) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativesetVideoQoEPreference(j, Constants.QoEPreference.getValue(qoEPreference));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoQualityParameters(boolean z) {
        return setParameters(String.format("{\"rtc.video.prefer_frame_rate\":%b,\"che.video.prefer_frame_rate\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoScenario(Constants.VideoScenario videoScenario) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativesetVideoScenario(j, Constants.VideoScenario.getValue(videoScenario));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceBeautifierParameters(int i, int i2, int i3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetVoiceBeautifierParameters(j, i, i2, i3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceBeautifierPreset(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetVoiceBeautifierPreset(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceConversionParameters(int i, int i2, int i3) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetVoiceConversionParameters(j, i, i2, i3);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceConversionPreset(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetVoiceConversionPreset(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int setVolumeOfEffect(int i, double d) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetVolumeOfEffect(j, i, d);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setupAudioAttributes(AudioAttributes audioAttributes) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetupAudioAttributeContext(j, audioAttributes);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setupLocalVideo(VideoCanvas videoCanvas) {
        int[] iArr;
        try {
            long j = this.mNativeHandle;
            if (j == 0) {
                return -7;
            }
            if (videoCanvas == null) {
                return nativeSetupLocalVideo(j, null, null, 1, 0, 0, 0, null, 1, false, Constants.VideoModulePosition.getValue(Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER), 0);
            }
            if (!validateVideoRendererView(videoCanvas)) {
                return -2;
            }
            Rect rect = videoCanvas.rect;
            if (rect != null) {
                int i = rect.left;
                int i2 = rect.top;
                iArr = new int[]{i, i2, rect.right - i, rect.bottom - i2};
            } else {
                iArr = null;
            }
            return nativeSetupLocalVideo(this.mNativeHandle, videoCanvas.view, videoCanvas.surfaceTexture, videoCanvas.renderMode, videoCanvas.mirrorMode, videoCanvas.sourceType, videoCanvas.mediaPlayerId, iArr, videoCanvas.setupMode, videoCanvas.enableAlphaMask, Constants.VideoModulePosition.getValue(videoCanvas.position), videoCanvas.backgroundColor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setupRemoteVideo(VideoCanvas videoCanvas) {
        return setupRemoteVideoEx(videoCanvas, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setupRemoteVideoEx(VideoCanvas videoCanvas, RtcConnection rtcConnection) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (videoCanvas == null) {
            return -2;
        }
        if (!validateVideoRendererView(videoCanvas)) {
            return -2;
        }
        if (videoCanvas.uid == 0) {
            return -1;
        }
        return nativeSetupRemoteVideo(this.mNativeHandle, videoCanvas.view, videoCanvas.surfaceTexture, videoCanvas.renderMode, videoCanvas.mirrorMode, videoCanvas.uid, videoCanvas.subviewUid, getRect(videoCanvas.rect), videoCanvas.setupMode, videoCanvas.enableAlphaMask, getChannelId(rtcConnection), getUserId(rtcConnection), videoCanvas.backgroundColor);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioMixing(String str, boolean z, int i, int i2) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeStartAudioMixing(j, str, z, i, i2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioRecording(AudioRecordingConfiguration audioRecordingConfiguration) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(audioRecordingConfiguration.filePath)) {
                    return -2;
                }
                return nativeStartAudioRecording2(this.mNativeHandle, audioRecordingConfiguration.filePath, audioRecordingConfiguration.codec, audioRecordingConfiguration.sampleRate, audioRecordingConfiguration.fileRecordOption, audioRecordingConfiguration.quality, audioRecordingConfiguration.recordingChannel);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startCameraCapture(Constants.VideoSourceType videoSourceType, CameraCapturerConfiguration cameraCapturerConfiguration) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (cameraCapturerConfiguration == null) {
            return -2;
        }
        return nativeStartCameraCapture(j, Constants.VideoSourceType.getValue(videoSourceType), cameraCapturerConfiguration);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startDirectCdnStreaming(IDirectCdnStreamingEventHandler iDirectCdnStreamingEventHandler, String str, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeStartDirectCdnStreaming(j, iDirectCdnStreamingEventHandler, str, directCdnStreamingMediaOptions);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startEchoTest(EchoTestConfiguration echoTestConfiguration) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                Context context = this.mContext.get();
                if (context == null) {
                    return -7;
                }
                doMonitorSystemEvent(context);
                return nativeStartEchoTestWithConfig(this.mNativeHandle, echoTestConfiguration.view, echoTestConfiguration.enableAudio, echoTestConfiguration.enableVideo, echoTestConfiguration.token, echoTestConfiguration.channelId, echoTestConfiguration.intervalInSeconds);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startLastmileProbeTest(LastmileProbeConfig lastmileProbeConfig) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                Context context = this.mContext.get();
                if (context == null) {
                    return -7;
                }
                doMonitorSystemEvent(context);
                return nativeStartLastmileProbeTest(this.mNativeHandle, lastmileProbeConfig.probeUplink, lastmileProbeConfig.probeDownlink, lastmileProbeConfig.expectedUplinkBitrate, lastmileProbeConfig.expectedDownlinkBitrate);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startLocalAudioMixer(LocalAudioMixerConfiguration localAudioMixerConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeStartLocalAudioMixer(this.mNativeHandle, new RtcEngineMessage.PLocalAudioMixedTrackConfiguration().marshall(localAudioMixerConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startLocalVideoTranscoder(LocalTranscoderConfiguration localTranscoderConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeStartLocalVideoTranscoder(this.mNativeHandle, new RtcEngineMessage.PLocalLiveTranscoderConfiguration().marshall(localTranscoderConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startMediaRenderingTracing() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStartMediaRenderingTracing(j);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startMediaRenderingTracingEx(RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStartMediaRenderingTracingEx(j, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startOrUpdateChannelMediaRelay(ChannelMediaRelayConfiguration channelMediaRelayConfiguration) {
        return startOrUpdateChannelMediaRelayEx(channelMediaRelayConfiguration, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startOrUpdateChannelMediaRelayEx(ChannelMediaRelayConfiguration channelMediaRelayConfiguration, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!checkRelayConfiguration(channelMediaRelayConfiguration)) {
                    return -2;
                }
                Map<String, ChannelMediaInfo> destChannelMediaInfos = channelMediaRelayConfiguration.getDestChannelMediaInfos();
                ChannelMediaInfo[] channelMediaInfoArr = new ChannelMediaInfo[destChannelMediaInfos.size()];
                destChannelMediaInfos.values().toArray(channelMediaInfoArr);
                return nativeStartOrUpdateChannelMediaRelay(this.mNativeHandle, channelMediaRelayConfiguration.getSrcChannelMediaInfo(), channelMediaInfoArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startPlaybackDeviceTest(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStartPlaybackDeviceTest(j, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startPreview(Constants.VideoSourceType videoSourceType) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStartPreviewForSourceType(j, Constants.VideoSourceType.getValue(videoSourceType));
    }

    public int startRecording(String str, int i, int i2, int i3, int i4, int i5, String str2, boolean z, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStartRecording(j, str, i, i2, i3, i4, i5, str2, z, i6, i7, i8, i9, i10, i11, i12);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRecordingDeviceTest(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStartRecordingDeviceTest(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRhythmPlayer(String str, String str2, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || agoraRhythmPlayerConfig == null) {
                    return -2;
                }
                return nativeStartRhythmPlayer(this.mNativeHandle, str, str2, agoraRhythmPlayerConfig);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRtmpStreamWithTranscoding(String str, LiveTranscoding liveTranscoding) {
        return startRtmpStreamWithTranscodingEx(str, liveTranscoding, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startRtmpStreamWithTranscodingEx(String str, LiveTranscoding liveTranscoding, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (liveTranscoding == null) {
                    return -2;
                }
                return nativeStartRtmpStreamWithTranscoding(this.mNativeHandle, str, new RtcEngineMessage.PLiveTranscoding().marshall(liveTranscoding), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRtmpStreamWithoutTranscoding(String str) {
        return startRtmpStreamWithoutTranscodingEx(str, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startRtmpStreamWithoutTranscodingEx(String str, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeStartRtmpStreamWithoutTranscoding(j, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startScreenCapture(ScreenCaptureParameters screenCaptureParameters) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (screenCaptureParameters == null) {
            Logging.m87219e(TAG, "Failed to startScreenCapture, parameters null");
            return -2;
        }
        if (getOSVersion() < 21) {
            Logging.m87218e("current android version not support for screen capture!");
            return -2;
        }
        int i = 0;
        if (getOSVersion() < 29 && screenCaptureParameters.captureAudio) {
            Logging.m87218e("current android version not support for capture audio!");
            screenCaptureParameters.captureAudio = false;
            i = -3;
        }
        if (screenCaptureParameters.captureAudio) {
            allowCaptureCurrentApp(screenCaptureParameters);
        }
        int iNativeStartScreenCapture = nativeStartScreenCapture(this.mNativeHandle, screenCaptureParameters);
        return iNativeStartScreenCapture != 0 ? iNativeStartScreenCapture : i;
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int stopAllEffects() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopAllEffects(j);
    }

    public synchronized int stopAllRemoteVideo() {
        return setParameter("che.video.peer.stop_all_renders", true);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopAudioMixing() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopAudioMixing(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopAudioRecording() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopAudioRecording(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopCameraCapture(Constants.VideoSourceType videoSourceType) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopCameraCapture(j, Constants.VideoSourceType.getValue(videoSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopChannelMediaRelay() {
        return stopChannelMediaRelayEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int stopChannelMediaRelayEx(RtcConnection rtcConnection) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopChannelMediaRelay(j, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopDirectCdnStreaming() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopDirectCdnStreaming(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopEchoTest() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopEchoTest(j);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int stopEffect(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopEffect(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopLastmileProbeTest() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopLastmileProbeTest(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopLocalAudioMixer() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopLocalAudioMixer(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopLocalVideoTranscoder() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopLocalVideoTranscoder(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopPlaybackDeviceTest() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopPlaybackDeviceTest(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopPreview(Constants.VideoSourceType videoSourceType) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopPreviewForSourceType(j, Constants.VideoSourceType.getValue(videoSourceType));
    }

    public int stopRecording(String str, int i, boolean z, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopRecording(j, i, str, z, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopRecordingDeviceTest() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopRecordingDeviceTest(j);
    }

    public synchronized int stopRemoteVideo(int i) {
        return setParameter("che.video.peer.stop_video", toStringUserId(i));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopRhythmPlayer() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopRhythmPlayer(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopRtmpStream(String str) {
        return stopRtmpStreamEx(str, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int stopRtmpStreamEx(String str, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeStopRtmpStream(j, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopScreenCapture() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopScreenCapture(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int switchCamera() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSwitchCamera(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int takeSnapshot(int i, SnapshotConfig snapshotConfig) {
        return takeSnapshotEx((RtcConnection) null, i, snapshotConfig);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int takeSnapshotEx(RtcConnection rtcConnection, int i, SnapshotConfig snapshotConfig) throws Throwable {
        Throwable th;
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                if (snapshotConfig.filePath == null) {
                    try {
                        snapshotConfig.filePath = "";
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return nativeTakeSnapshot2(j, i, snapshotConfig.filePath, Constants.VideoModulePosition.getValue(snapshotConfig.position), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int unRegisterAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeUnRegisterAudioSpectrumObserver(j, iAudioSpectrumObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int unloadAllEffects() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeUnloadAllEffects(j);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int unloadEffect(int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeUnloadEffect(j, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int unregisterMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (iMetadataObserver == null) {
            Logging.m87219e(TAG, "Failed to unRegisterMediaMetadataObserver, observer null");
            return -2;
        }
        return nativeUnregisterMediaMetadataObserver(j, iMetadataObserver, i);
    }

    public synchronized int unregisterMediaPlayerAudioSpectrumObserver(int i, IAudioSpectrumObserver iAudioSpectrumObserver) {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerUnRegisterPlayerObserver)");
            return -7;
        }
        return nativeUnRegisterMediaPlayerAudioSpectrumObserver(j, i, iAudioSpectrumObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateChannelMediaOptions(ChannelMediaOptions channelMediaOptions) {
        return updateChannelMediaOptionsEx(channelMediaOptions, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int updateChannelMediaOptionsEx(ChannelMediaOptions channelMediaOptions, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeUpdateChannelMediaOptions(j, channelMediaOptions, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateDirectCdnStreamingMediaOptions(DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeUpdateDirectCdnStreamingMediaOptions(j, directCdnStreamingMediaOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateLocalAudioMixerConfiguration(LocalAudioMixerConfiguration localAudioMixerConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeUpdateLocalAudioMixerConfiguration(this.mNativeHandle, new RtcEngineMessage.PLocalAudioMixedTrackConfiguration().marshall(localAudioMixerConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateLocalTranscoderConfiguration(LocalTranscoderConfiguration localTranscoderConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeUpdateLocalTranscoderConfiguration(this.mNativeHandle, new RtcEngineMessage.PLocalLiveTranscoderConfiguration().marshall(localTranscoderConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updatePreloadChannelToken(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeUpdatePreloadChannelToken(j, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateRtmpTranscoding(LiveTranscoding liveTranscoding) {
        return updateRtmpTranscodingEx(liveTranscoding, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int updateRtmpTranscodingEx(LiveTranscoding liveTranscoding, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (liveTranscoding == null) {
                    return -2;
                }
                return nativeUpdateRtmpTranscoding(this.mNativeHandle, new RtcEngineMessage.PLiveTranscoding().marshall(liveTranscoding), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateScreenCaptureParameters(ScreenCaptureParameters screenCaptureParameters) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (screenCaptureParameters == null) {
            Logging.m87219e(TAG, "Failed to updateScreenCaptureParameters, parameters null");
            return -2;
        }
        if (getOSVersion() < 21) {
            Logging.m87218e("current android version not support for screen capture!");
            return -2;
        }
        int i = 0;
        if (getOSVersion() < 29 && screenCaptureParameters.captureAudio) {
            Logging.m87218e("current android version not support for capture audio!");
            screenCaptureParameters.captureAudio = false;
            i = -3;
        }
        if (screenCaptureParameters.captureAudio) {
            allowCaptureCurrentApp(screenCaptureParameters);
        }
        int iNativeUpdateScreenCaptureParameters = nativeUpdateScreenCaptureParameters(this.mNativeHandle, screenCaptureParameters);
        return iNativeUpdateScreenCaptureParameters != 0 ? iNativeUpdateScreenCaptureParameters : i;
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int updateSharedContext(android.opengl.EGLContext eGLContext) {
        return -4;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String uploadLogFile() {
        long j = this.mNativeHandle;
        if (j == 0) {
            Logging.m87219e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeUploadLogFile(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int writeLog(int i, String str, Object... objArr) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeWriteLog(this.mNativeHandle, i, String.format(str, objArr));
    }

    private int[] getRect(Rect rect) {
        if (rect == null) {
            return null;
        }
        int i = rect.left;
        int i2 = rect.top;
        return new int[]{i, i2, rect.right - i, rect.bottom - i2};
    }

    public static synchronized boolean initializeNativeLibs() {
        return initializeNativeLibs(null);
    }

    public static synchronized boolean preloadExtensions() {
        return preloadExtensions("", null);
    }

    private int setParameter(String str, String str2) {
        return setParameters(formatString("{\"%s\":\"%s\"}", str, str2));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int addVideoWatermark(String str, WatermarkOptions watermarkOptions) {
        return addVideoWatermarkEx(str, watermarkOptions, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createDataStream(boolean z, boolean z2) {
        return createDataStreamEx(z, z2, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int createDataStreamEx(boolean z, boolean z2, RtcConnection rtcConnection) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeCreateDataStream(j, z, z2, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableDualStreamMode(boolean z, SimulcastStreamConfig simulcastStreamConfig) {
        return enableDualStreamModeEx(z, simulcastStreamConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExtension(String str, String str2, boolean z) {
        return enableExtension(str, str2, z, Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableInEarMonitoring(boolean z, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeEnableInEarMonitoring(j, z, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVirtualBackground(boolean z, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty) {
        return enableVirtualBackground(z, virtualBackgroundSource, segmentationProperty, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getExtensionProperty(String str, String str2, String str3) {
        return getExtensionProperty(str, str2, str3, Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeAreaOptions getFaceShapeAreaOptions(int i) {
        return getFaceShapeAreaOptions(i, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeBeautyOptions getFaceShapeBeautyOptions() {
        return getFaceShapeBeautyOptions(Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannel(String str, String str2, int i, ChannelMediaOptions channelMediaOptions) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeJoinChannel2(j, str, str2, i, channelMediaOptions);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannelWithUserAccount(String str, String str2, String str3) {
        return joinChannelWithUserAccount(str, str2, str3, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int leaveChannel() {
        return leaveChannel(new LeaveChannelOptions());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int leaveChannelEx(RtcConnection rtcConnection) {
        return leaveChannelEx(rtcConnection, new LeaveChannelOptions());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public int leaveChannelWithUserAccountEx(String str, String str2) {
        return leaveChannelWithUserAccountEx(str, str2, new LeaveChannelOptions());
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z) {
        return playEffect(i, str, i2, d, d2, d3, z, 0);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int preloadEffect(int i, String str) {
        return preloadEffect(i, str, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pullPlaybackAudioFrame(byte[] bArr, int i) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (bArr != null && bArr.length == i) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            int iPullPlaybackAudioFrame = pullPlaybackAudioFrame(byteBufferAllocateDirect, i);
            if (iPullPlaybackAudioFrame == 0) {
                byteBufferAllocateDirect.get(bArr, 0, i);
            }
            return iPullPlaybackAudioFrame;
        }
        return -2;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(ByteBuffer byteBuffer, long j, int i, int i2, Constants.BytesPerSample bytesPerSample, int i3) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("data must be direct buffer!");
        }
        return nativePushExternalAudioFrameRawData(this.mNativeHandle, byteBuffer, j, i, Constants.BytesPerSample.getValue(bytesPerSample), i2, i3);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean pushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame) {
        return pushExternalVideoFrameById(agoraVideoFrame, 0) == 0;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalVideoFrameById(VideoFrame videoFrame, int i) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        if (videoFrame == null) {
            return -2;
        }
        return nativePushExternalVideoFrame(j, videoFrame, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioProfile(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetAudioProfileScenario(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setBeautyEffectOptions(boolean z, BeautyOptions beautyOptions) {
        return setBeautyEffectOptions(z, beautyOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setClientRole(int i, ClientRoleOptions clientRoleOptions) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetClientRole(j, i, clientRoleOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setColorEnhanceOptions(boolean z, ColorEnhanceOptions colorEnhanceOptions) {
        if (0 == this.mNativeHandle) {
            return -7;
        }
        return setColorEnhanceOptions(z, colorEnhanceOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode, SimulcastStreamConfig simulcastStreamConfig) {
        return setDualStreamModeEx(simulcastStreamMode, simulcastStreamConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProperty(String str, String str2, String str3, String str4) throws Throwable {
        try {
            try {
                return setExtensionProperty(str, str2, str3, str4, Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalAudioSource(boolean z, int i, int i2) {
        return setExternalAudioSource(z, i, i2, false, true);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalVideoSource(boolean z, boolean z2, Constants.ExternalVideoSourceType externalVideoSourceType) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return setExternalVideoSource(z, z2, externalVideoSourceType, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions) {
        return setFaceShapeAreaOptions(faceShapeAreaOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeBeautyOptions(boolean z, FaceShapeBeautyOptions faceShapeBeautyOptions) {
        return setFaceShapeBeautyOptions(z, faceShapeBeautyOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFilterEffectOptions(boolean z, FilterEffectOptions filterEffectOptions) {
        return setFilterEffectOptions(z, filterEffectOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalPublishFallbackOption(Constants.StreamFallbackOptions streamFallbackOptions) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return setParameter("rtc.local_publish_fallback_option", streamFallbackOptions.getValue());
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalRenderMode(int i, int i2) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSetLocalRenderMode(j, i, i2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLowlightEnhanceOptions(boolean z, LowLightEnhanceOptions lowLightEnhanceOptions) {
        return setLowlightEnhanceOptions(z, lowLightEnhanceOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteDefaultVideoStreamType(int i) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return setRemoteDefaultVideoStreamType(i == 0 ? Constants.VideoStreamType.VIDEO_STREAM_HIGH : Constants.VideoStreamType.VIDEO_STREAM_LOW);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteRenderMode(int i, int i2, int i3) {
        return setRemoteRenderModeEx(i, i2, i3, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteSubscribeFallbackOption(int i) {
        Constants.StreamFallbackOptions streamFallbackOptions;
        Constants.StreamFallbackOptions[] streamFallbackOptionsArrValues = Constants.StreamFallbackOptions.values();
        int length = streamFallbackOptionsArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                streamFallbackOptions = null;
                break;
            }
            streamFallbackOptions = streamFallbackOptionsArrValues[i2];
            if (streamFallbackOptions.getValue() == i) {
                break;
            }
            i2++;
        }
        if (streamFallbackOptions == null) {
            return -2;
        }
        return setRemoteSubscribeFallbackOption(streamFallbackOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteVideoStreamType(int i, Constants.VideoStreamType videoStreamType) {
        return setRemoteVideoStreamTypeEx(i, videoStreamType, (RtcConnection) null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    @Deprecated
    public synchronized int setRemoteVideoStreamTypeEx(int i, int i2, RtcConnection rtcConnection) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return setRemoteVideoStreamTypeEx(i, i2 == 0 ? Constants.VideoStreamType.VIDEO_STREAM_HIGH : Constants.VideoStreamType.VIDEO_STREAM_LOW, rtcConnection);
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setTextureId(int i, EGLContext eGLContext, int i2, int i3, long j) {
        return -4;
    }

    public synchronized int setTextureIdWithMatrix(int i, EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        return -4;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoDenoiserOptions(boolean z, VideoDenoiserOptions videoDenoiserOptions) {
        return setVideoDenoiserOptions(z, videoDenoiserOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioMixing(String str, boolean z, int i) {
        return startAudioMixing(str, z, i, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioRecording(String str, int i) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        return nativeStartAudioRecording(this.mNativeHandle, str, i);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startPreview() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStartPreview(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopPreview() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeStopPreview(j);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int switchCamera(String str) {
        long j = this.mNativeHandle;
        if (j == 0) {
            return -7;
        }
        return nativeSwitchCameraId(j, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int takeSnapshot(int i, String str) {
        return takeSnapshotEx((RtcConnection) null, i, str);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int takeSnapshotEx(RtcConnection rtcConnection, int i, String str) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeTakeSnapshot(j, i, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int updateSharedContext(EGLContext eGLContext) {
        return -4;
    }

    private int setParameter(String str, boolean z) {
        return setParameters(formatString("{\"%s\":%b}", str, Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExtension(String str, String str2, boolean z, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeEnableExtension(j, str, str2, z, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getExtensionProperty(String str, String str2, String str3, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return null;
                }
                return nativeGetExtensionProperty(j, str, str2, str3, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.IAudioEffectManager
    @Deprecated
    public synchronized int playEffect(int i, String str, int i2, double d, double d2, double d3) {
        return playEffect(i, str, i2, d, d2, d3, false);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(byte[] bArr, long j) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (bArr == null) {
            return -2;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocateDirect.put(bArr, 0, bArr.length);
        byteBufferAllocateDirect.flip();
        return pushExternalAudioFrame(byteBufferAllocateDirect, j, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProperty(String str, String str2, String str3, String str4, Constants.MediaSourceType mediaSourceType) throws Throwable {
        try {
            try {
                long j = this.mNativeHandle;
                if (j == 0) {
                    return -7;
                }
                return nativeSetExtensionProperty(j, str, str2, str3, str4, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(ByteBuffer byteBuffer, long j, int i) throws Throwable {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("data must be direct buffer!");
                }
                return nativePushExternalAudioFrameRawData(this.mNativeHandle, byteBuffer, j, this.mExSourceAudioSampleRate, 2, this.mExSourceAudioChannels, i);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
