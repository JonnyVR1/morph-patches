package com.p074ss.bytertc.engine.handler;

import android.annotation.SuppressLint;
import com.p074ss.bytertc.engine.SysStats;
import com.p074ss.bytertc.engine.data.AudioRoute;
import com.p074ss.bytertc.engine.data.AudioVADType;
import com.p074ss.bytertc.engine.data.DeadLockMsg;
import com.p074ss.bytertc.engine.data.FrameUpdateInfo;
import com.p074ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.p074ss.bytertc.engine.data.LocalAudioStreamError;
import com.p074ss.bytertc.engine.data.LocalAudioStreamState;
import com.p074ss.bytertc.engine.data.RecordingInfo;
import com.p074ss.bytertc.engine.data.RecordingProgress;
import com.p074ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.p074ss.bytertc.engine.data.RemoteAudioState;
import com.p074ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.data.StreamSyncInfoConfig;
import com.p074ss.bytertc.engine.data.VideoDenoiseMode;
import com.p074ss.bytertc.engine.data.VideoDenoiseModeChangedReason;
import com.p074ss.bytertc.engine.data.VideoFrameInfo;
import com.p074ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.p074ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.p074ss.bytertc.engine.live.MixedStreamTaskErrorCode;
import com.p074ss.bytertc.engine.live.MixedStreamTaskEvent;
import com.p074ss.bytertc.engine.live.MixedStreamTaskInfo;
import com.p074ss.bytertc.engine.live.SingleStreamTaskErrorCode;
import com.p074ss.bytertc.engine.live.SingleStreamTaskEvent;
import com.p074ss.bytertc.engine.type.AudioAEDType;
import com.p074ss.bytertc.engine.type.AudioDeviceType;
import com.p074ss.bytertc.engine.type.AudioDumpStatus;
import com.p074ss.bytertc.engine.type.AudioRecordingErrorCode;
import com.p074ss.bytertc.engine.type.AudioRecordingState;
import com.p074ss.bytertc.engine.type.EchoTestResult;
import com.p074ss.bytertc.engine.type.EffectErrorType;
import com.p074ss.bytertc.engine.type.FirstFramePlayState;
import com.p074ss.bytertc.engine.type.FirstFrameSendState;
import com.p074ss.bytertc.engine.type.HardwareEchoDetectionResult;
import com.p074ss.bytertc.engine.type.LocalProxyError;
import com.p074ss.bytertc.engine.type.LocalProxyState;
import com.p074ss.bytertc.engine.type.LocalProxyType;
import com.p074ss.bytertc.engine.type.LocalVideoStreamError;
import com.p074ss.bytertc.engine.type.LocalVideoStreamState;
import com.p074ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.p074ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.p074ss.bytertc.engine.type.PerformanceAlarmMode;
import com.p074ss.bytertc.engine.type.PerformanceAlarmReason;
import com.p074ss.bytertc.engine.type.PublicStreamErrorCode;
import com.p074ss.bytertc.engine.type.RecordingErrorCode;
import com.p074ss.bytertc.engine.type.RecordingState;
import com.p074ss.bytertc.engine.type.RemoteStreamSwitch;
import com.p074ss.bytertc.engine.type.RemoteVideoState;
import com.p074ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.p074ss.bytertc.engine.type.RenderError;
import com.p074ss.bytertc.engine.type.RtcUser;
import com.p074ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.p074ss.bytertc.engine.type.SnapshotErrorCode;
import com.p074ss.bytertc.engine.type.SourceWantedData;
import com.p074ss.bytertc.engine.type.VideoDeviceType;
import com.p074ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"DefaultLocale"})
public abstract class IRTCEngineEventHandler {
    public void onActiveSpeaker(String str, String str2) {
    }

    public void onAudioAEDStateUpdate(AudioAEDType audioAEDType) {
    }

    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
    }

    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i) {
    }

    public void onAudioDumpStateChanged(AudioDumpStatus audioDumpStatus) {
    }

    public void onAudioFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onAudioMixingPlayingProgress(int i, long j) {
    }

    public void onAudioPlaybackDeviceTestVolume(int i) {
    }

    public void onAudioRecordingStateUpdate(AudioRecordingState audioRecordingState, AudioRecordingErrorCode audioRecordingErrorCode) {
    }

    public void onAudioRouteChanged(AudioRoute audioRoute) {
    }

    public void onAudioVADStateUpdate(AudioVADType audioVADType) {
    }

    public void onCloudProxyConnected(int i) {
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    public void onDeadLockError(DeadLockMsg deadLockMsg) {
    }

    public void onEchoTestResult(EchoTestResult echoTestResult) {
    }

    public void onEffectError(EffectErrorType effectErrorType, String str) {
    }

    public void onError(int i) {
    }

    public void onExperimentalCallback(String str) {
    }

    public void onExtensionAccessError(String str, String str2) {
    }

    public void onExternalScreenFrameUpdate(FrameUpdateInfo frameUpdateInfo) {
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
    }

    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onGetPeerOnlineStatus(String str, int i) {
    }

    public void onHardwareEchoDetectionResult(HardwareEchoDetectionResult hardwareEchoDetectionResult) {
    }

    public void onLicenseWillExpire(int i) {
    }

    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
    }

    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
    }

    public void onLoginResult(String str, int i, int i2) {
    }

    public void onLogout(int i) {
    }

    public void onMixedStreamEvent(MixedStreamTaskInfo mixedStreamTaskInfo, MixedStreamTaskEvent mixedStreamTaskEvent, MixedStreamTaskErrorCode mixedStreamTaskErrorCode) {
    }

    public void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i, int i2, double d, int i3, int i4) {
    }

    public void onNetworkDetectionStopped(NetworkDetectionStopReason networkDetectionStopReason) {
    }

    public void onNetworkTimeSynchronized() {
    }

    public void onNetworkTypeChanged(int i) {
    }

    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
    }

    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
    }

    public void onRecordingStateUpdate(StreamIndex streamIndex, RecordingState recordingState, RecordingErrorCode recordingErrorCode, RecordingInfo recordingInfo) {
    }

    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
    }

    public void onRemoteAudioPropertiesReportEx(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr) {
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
    }

    public void onRemoteRenderError(RemoteStreamKey remoteStreamKey, RenderError renderError, String str) {
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
    }

    public void onRemoteVideoSuperResolutionModeChanged(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
    }

    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
    }

    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
    }

    public void onScreenVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onServerMessageSendResult(long j, int i, ByteBuffer byteBuffer) {
    }

    public void onServerParamsSetResult(int i) {
    }

    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onSingleStreamEvent(String str, SingleStreamTaskEvent singleStreamTaskEvent, SingleStreamTaskErrorCode singleStreamTaskErrorCode) {
    }

    public void onSnapshotTakenToFile(RemoteStreamKey remoteStreamKey, String str, int i, int i2, SnapshotErrorCode snapshotErrorCode, long j) {
    }

    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, StreamSyncInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
    }

    public void onSysStats(SysStats sysStats) {
    }

    public void onUserBinaryMessageReceivedOutsideRoom(long j, String str, ByteBuffer byteBuffer) {
    }

    public void onUserMessageReceivedOutsideRoom(long j, String str, String str2) {
    }

    public void onUserMessageSendResultOutsideRoom(long j, int i) {
    }

    public void onUserStartAudioCapture(String str, String str2) {
    }

    public void onUserStartVideoCapture(String str, String str2) {
    }

    public void onUserStopAudioCapture(String str, String str2) {
    }

    public void onUserStopVideoCapture(String str, String str2) {
    }

    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
    }

    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
    }

    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i) {
    }

    public void onVideoFramePlayStateChanged(String str, RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onWarning(int i) {
    }

    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
    }

    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
    }
}
