package com.p069ss.bytertc.engine.handler;

import android.util.Log;
import com.bytedance.realx.base.CalledByNative;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.engine.InternalLocalStreamStats;
import com.p069ss.bytertc.engine.InternalRTCUser;
import com.p069ss.bytertc.engine.InternalRemoteStreamStats;
import com.p069ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.p069ss.bytertc.engine.InternalSourceWantedData;
import com.p069ss.bytertc.engine.SysStats;
import com.p069ss.bytertc.engine.data.AudioRoute;
import com.p069ss.bytertc.engine.data.AudioVADType;
import com.p069ss.bytertc.engine.data.DeadLockMsg;
import com.p069ss.bytertc.engine.data.FrameUpdateInfo;
import com.p069ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.p069ss.bytertc.engine.data.LocalAudioStreamError;
import com.p069ss.bytertc.engine.data.LocalAudioStreamState;
import com.p069ss.bytertc.engine.data.RecordingInfo;
import com.p069ss.bytertc.engine.data.RecordingProgress;
import com.p069ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.p069ss.bytertc.engine.data.RemoteAudioState;
import com.p069ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.data.StreamKey;
import com.p069ss.bytertc.engine.data.StreamSyncInfoConfig;
import com.p069ss.bytertc.engine.data.VideoDenoiseMode;
import com.p069ss.bytertc.engine.data.VideoDenoiseModeChangedReason;
import com.p069ss.bytertc.engine.data.VideoFrameInfo;
import com.p069ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.p069ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.p069ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p069ss.bytertc.engine.live.MixedStreamTaskErrorCode;
import com.p069ss.bytertc.engine.live.MixedStreamTaskEvent;
import com.p069ss.bytertc.engine.live.MixedStreamTaskInfo;
import com.p069ss.bytertc.engine.live.SingleStreamTaskErrorCode;
import com.p069ss.bytertc.engine.live.SingleStreamTaskEvent;
import com.p069ss.bytertc.engine.type.AudioAEDType;
import com.p069ss.bytertc.engine.type.AudioDeviceType;
import com.p069ss.bytertc.engine.type.AudioDumpStatus;
import com.p069ss.bytertc.engine.type.AudioRecordingErrorCode;
import com.p069ss.bytertc.engine.type.AudioRecordingState;
import com.p069ss.bytertc.engine.type.EchoTestResult;
import com.p069ss.bytertc.engine.type.EffectErrorType;
import com.p069ss.bytertc.engine.type.FirstFramePlayState;
import com.p069ss.bytertc.engine.type.FirstFrameSendState;
import com.p069ss.bytertc.engine.type.HardwareEchoDetectionResult;
import com.p069ss.bytertc.engine.type.LocalProxyError;
import com.p069ss.bytertc.engine.type.LocalProxyState;
import com.p069ss.bytertc.engine.type.LocalProxyType;
import com.p069ss.bytertc.engine.type.LocalStreamStats;
import com.p069ss.bytertc.engine.type.LocalVideoStreamError;
import com.p069ss.bytertc.engine.type.LocalVideoStreamState;
import com.p069ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.p069ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.p069ss.bytertc.engine.type.PerformanceAlarmMode;
import com.p069ss.bytertc.engine.type.PerformanceAlarmReason;
import com.p069ss.bytertc.engine.type.PublicStreamErrorCode;
import com.p069ss.bytertc.engine.type.RecordingErrorCode;
import com.p069ss.bytertc.engine.type.RecordingState;
import com.p069ss.bytertc.engine.type.RemoteStreamStats;
import com.p069ss.bytertc.engine.type.RemoteStreamSwitch;
import com.p069ss.bytertc.engine.type.RemoteVideoState;
import com.p069ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.p069ss.bytertc.engine.type.RenderError;
import com.p069ss.bytertc.engine.type.RtcUser;
import com.p069ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.p069ss.bytertc.engine.type.SnapshotErrorCode;
import com.p069ss.bytertc.engine.type.SourceWantedData;
import com.p069ss.bytertc.engine.type.VideoDeviceType;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class RTCVideoEventHandler {
    private static final String TAG = "RtcVideoEventHandler";
    private static final String WEBRTC_MEDIA_STAT_KEY = "rtc_media_statistics";
    private static final String WEBRTC_MONITOR_TAG = "live_webrtc_monitor_log";
    private static final String WEBRTC_STATISTICS_KEY = "rtc_statistics";
    private static final String WEBRTC_TRANSPORT_STAT_KEY = "rtc_transport_statistics";
    private WeakReference<RTCEngineImpl> mRTCVideoImpl;
    private String mRoom;
    private String mSession;
    private String mUser;
    private State mState = State.IDLE;
    private long mJoinChannelTime = 0;

    public enum State {
        IDLE,
        IN_ROOM
    }

    public RTCVideoEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRTCVideoImpl = new WeakReference<>(rTCEngineImpl);
    }

    @CalledByNative
    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @CalledByNative
    public void onActiveSpeaker(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onActiveSpeaker");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onActiveSpeaker(str, str2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onActiveSpeaker callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioAEDStateUpdate(AudioAEDType audioAEDType) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioAEDStateUpdate");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioAEDStateUpdate(audioAEDType);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioAEDStateUpdate callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioDeviceStateChanged, AudioDeviceType: " + audioDeviceType + ", device_state: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioDeviceStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioDeviceWarning, AudioDeviceType: " + audioDeviceType + ", device_warning " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioDeviceWarning(str, audioDeviceType, i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioDeviceWarning callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioDumpStateChanged(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioDumpStateChanged...status: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            AudioDumpStatus audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_START_FAILURE;
            if (i != 0) {
                if (i == 1) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_START_SUCCESS;
                } else if (i == 2) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_STOP_FAILURE;
                } else if (i == 3) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_STOP_SUCCESS;
                } else if (i == 4) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_RUNNING_FAILURE;
                } else if (i == 5) {
                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_RUNNING_SUCCESS;
                }
            }
            rtcEngineHandler.onAudioDumpStateChanged(audioDumpStatus);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioDumpStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 != 0) {
            if (i2 == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i2 == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onAudioFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioFrameSendStateChanged,  state: " + i2);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 != 0) {
            if (i2 == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i2 == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onAudioMixingPlayingProgress(int i, long j) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioMixingPlayingProgress(i, j);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioMixingPlayingProgress callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioPlaybackDeviceTestVolume(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioPlaybackDeviceTestVolume");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioPlaybackDeviceTestVolume(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioPlaybackDeviceTestVolume callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioRecordingStateUpdate(int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioRecordingStateUpdate, state: " + i + ", errorCode: " + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioRecordingStateUpdate(AudioRecordingState.fromId(i), AudioRecordingErrorCode.fromId(i2));
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioRecordingStateUpdate callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioRouteChanged(AudioRoute audioRoute) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioRouteChanged...device: " + audioRoute.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioRouteChanged(audioRoute);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onAudioRouteChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onAudioVADStateUpdate(AudioVADType audioVADType) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onAudioVADStateUpdate");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onAudioVADStateUpdate(audioVADType);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLocalAudioPropertiesReport callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onCloudProxyConnected(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onCloudProxyConnected, interval: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onCloudProxyConnected(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onCloudProxyConnected callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onConnectionStateChanged(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onConnectionStateChanged, state: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onConnectionStateChanged(i, -1);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onConnectionStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onDeadLockError(DeadLockMsg deadLockMsg) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onDeadLockError...: " + deadLockMsg);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onDeadLockError(deadLockMsg);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onDeadLockError callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onEchoTestResult(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onEchoTestResult...error code: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            EchoTestResult echoTestResult = EchoTestResult.ECHO_TEST_SUCCESS;
            switch (i) {
                case 1:
                    echoTestResult = EchoTestResult.ECHO_TEST_TIMEOUT;
                    break;
                case 2:
                    echoTestResult = EchoTestResult.ECHO_TEST_INTERVAL_SHORT;
                    break;
                case 3:
                    echoTestResult = EchoTestResult.ECHO_TEST_AUDIO_DEVICE_ERROR;
                    break;
                case 4:
                    echoTestResult = EchoTestResult.ECHO_TEST_VIDEO_DEVICE_ERROR;
                    break;
                case 5:
                    echoTestResult = EchoTestResult.ECHO_TEST_AUDIO_RECEIVE_ERROR;
                    break;
                case 6:
                    echoTestResult = EchoTestResult.ECHO_TEST_VIDEO_RECEIVE_ERROR;
                    break;
                case 7:
                    echoTestResult = EchoTestResult.ECHO_TEST_INTERNAL_ERROR;
                    break;
            }
            rtcEngineHandler.onEchoTestResult(echoTestResult);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onEchoTestResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onEffectError(EffectErrorType effectErrorType, String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onEffectError error: " + effectErrorType + ", msg: " + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onEffectError(effectErrorType, str);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onEffectError callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onError(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onError...errorNum: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onError(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onError callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onExperimentalCallback(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onExperimentalCallback...param: " + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onExperimentalCallback(str);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onExperimentalCallback callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onExtensionAccessError(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        Log.e(TAG, "onExtensionAccessError...extensionName: " + str + " msg:" + str2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onExtensionAccessError(str, str2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onExtensionAccessError callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onExternalScreenFrameUpdate(FrameUpdateInfo frameUpdateInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onExternalScreenFrameUpdate, info: " + frameUpdateInfo.toString());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onExternalScreenFrameUpdate(frameUpdateInfo);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onExternalScreenFrameUpdate callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onFirstLocalAudioFrame...streamIndex: " + streamIndex.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstLocalAudioFrame(streamIndex);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onFirstLocalAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onFirstLocalVideoFrame...width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onFirstLocalVideoFrame callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onFirstRemoteAudioFrame...uid: " + remoteStreamKey.getUserId() + ", roomid: " + remoteStreamKey.getRoomId() + ", streamIndex: " + remoteStreamKey.getStreamIndex().value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstRemoteAudioFrame(remoteStreamKey);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onFirstRemoteAudioFrame callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onFirstRemoteVideoFrameDecoded...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onFirstRemoteVideoFrameDecoded callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onFirstRemoteVideoFrameRendered...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onFirstRemoteVideoFrameRendered callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onGetPeerOnlineStatus(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onGetPeerOnlineStatus: " + str + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onGetPeerOnlineStatus(str, i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onGetPeerOnlineStatus callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onHardwareEchoDetectionResult(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onHardwareEchoDetectionResult...result code: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            HardwareEchoDetectionResult hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_NORMAL;
            if (i == 0) {
                hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_CANCELED;
            } else if (i == 1) {
                hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_UNKNOWN;
            } else if (i == 3) {
                hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_POOR;
            }
            rtcEngineHandler.onHardwareEchoDetectionResult(hardwareEchoDetectionResult);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onHardwareEchoDetectionResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLicenseWillExpire(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onLicenseWillExpire, days: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLicenseWillExpire(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLicenseWillExpire callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onLocalAudioPropertiesReport");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLocalAudioPropertiesReport callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onLocalAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLocalAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onLocalProxyStateChanged...: " + localProxyType.value() + ", state: " + localProxyState.value() + ", error: " + localProxyError.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalProxyStateChanged(localProxyType, localProxyState, localProxyError);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLocalProxyStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLocalStreamStats(StreamIndex streamIndex, InternalLocalStreamStats internalLocalStreamStats) {
        IRTCEngineEventHandlerEx rtcEngineHandlerEx;
        LogUtil.m80900d(TAG, "onLocalStreamStats, streamIndex: " + streamIndex);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandlerEx = rTCEngineImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onLocalStreamStats(streamIndex, new LocalStreamStats(internalLocalStreamStats));
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onLocalStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onLocalVideoSizeChanged... streamIndex: " + streamIndex + ", frameInfo: " + videoFrameInfo);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLocalVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onLocalVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLocalVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLogReport(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            if (!WEBRTC_MONITOR_TAG.equals(str)) {
                LogUtil.m80903i(str, str2);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
                if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                    return;
                }
                rtcEngineHandler.onLogReport(str, jSONObject);
            } catch (JSONException e) {
                LogUtil.m80900d(TAG, "onLogReport...parse json catch exception: " + e.getMessage());
            }
        } catch (Exception e2) {
            LogUtil.m80901e(TAG, "onLogReport callback catch exception.\n" + e2.getMessage());
        }
    }

    @CalledByNative
    public void onLoginResult(String str, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "OnLoginResult: " + str + i + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLoginResult(str, i, i2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLoginResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onLogout(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onLogout: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onLogout(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onLogout callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onMixedStreamEvent(MixedStreamTaskInfo mixedStreamTaskInfo, MixedStreamTaskEvent mixedStreamTaskEvent, MixedStreamTaskErrorCode mixedStreamTaskErrorCode) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onMixedStreamEvent");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onMixedStreamEvent(mixedStreamTaskInfo, mixedStreamTaskEvent, mixedStreamTaskErrorCode);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onMixedStreamEvent callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkProbeResult(int i, int i2, int i3, double d, int i4, int i5) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onNetworkProbeResult: " + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + d + Constants.SEPARATOR_COMMA + i4 + Constants.SEPARATOR_COMMA + i5);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkDetectionResult(NetworkDetectionLinkType.values()[i], i2, i3, d, i4, i5);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onNetworkDetectionResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkProbeStopped(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onNetworkProbeStopped: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkDetectionStopped(NetworkDetectionStopReason.values()[i]);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onNetworkDetectionStopped callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkTimeSynchronized() {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onNetworkTimeSynchronized...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkTimeSynchronized();
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onNetworkTimeSynchronized callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onNetworkTypeChanged(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onNetworkTypeChanged, type: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkTypeChanged(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onNetworkTypeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onPerformanceAlarms(int i, String str, int i2, InternalSourceWantedData internalSourceWantedData) {
        PerformanceAlarmReason performanceAlarmReason;
        LogUtil.m80900d(TAG, "onPerformanceAlarms, level: " + i2 + ", data: " + internalSourceWantedData);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl != null) {
                if (i2 == 0) {
                    performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_FALLBACKED;
                } else if (i2 == 1) {
                    performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_RESUMED;
                } else if (i2 != 2) {
                    performanceAlarmReason = i2 != 3 ? PerformanceAlarmReason.PERFORMANCE_RESUMED : PerformanceAlarmReason.PERFORMANCE_RESUMED;
                } else {
                    performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_FALLBACKED;
                }
                IRTCEngineEventHandler rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler();
                if (rtcEngineHandler != null) {
                    rtcEngineHandler.onPerformanceAlarms(i == 0 ? PerformanceAlarmMode.NORMAL : PerformanceAlarmMode.SIMULCAST, str, performanceAlarmReason, new SourceWantedData(internalSourceWantedData));
                }
            }
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onPerformanceAlarms callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onPushPublicStreamError error(" + publicStreamErrorCode.value() + ") streamId:" + str2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onPushPublicStreamResult(str, str2, publicStreamErrorCode);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onPushPublicStreamError callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRecordingProgressUpdate, StreamIndex: " + streamIndex + ", progress.dur: " + recordingProgress.duration + ", progress.fileSize: " + recordingProgress.fileSize + ", info.filePath: " + recordingInfo.filePath);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRecordingProgressUpdate(streamIndex, recordingProgress, recordingInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRecordingProgressUpdate callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRecordingStateUpdate(StreamIndex streamIndex, int i, int i2, RecordingInfo recordingInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRecordingStateUpdate, StreamIndex: " + streamIndex + ", RecordingState: " + i + ", RecordingErrorCode: " + i2 + ", info.filePath: " + recordingInfo.filePath);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRecordingStateUpdate(streamIndex, RecordingState.fromId(i), RecordingErrorCode.fromId(i2), recordingInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRecordingStateUpdate callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRemoteAudioPropertiesReport");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRemoteAudioPropertiesReport callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteAudioPropertiesReportEx(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRemoteAudioPropertiesReport");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteAudioPropertiesReportEx(remoteAudioPropertiesInfoArr);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRemoteAudioPropertiesReport callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRemoteAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRemoteAudioStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteRenderError(RemoteStreamKey remoteStreamKey, RenderError renderError, String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRemoteRenderError, key: " + remoteStreamKey.toString() + ", error: ; message: " + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteRenderError(remoteStreamKey, renderError, str);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onRemoteRenderError callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteStreamStats(StreamKey streamKey, InternalRemoteStreamStats internalRemoteStreamStats) {
        IRTCEngineEventHandlerEx rtcEngineHandlerEx;
        LogUtil.m80900d(TAG, "onRemoteStreamStats, streamIndex: " + streamKey.getStreamIndex());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandlerEx = rTCEngineImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onRemoteStreamStats(new StreamKey(streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex()), new RemoteStreamStats(internalRemoteStreamStats));
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onRemoteStreamStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRemoteVideoSizeChanged... RemoteStreamKey: " + remoteStreamKey + ", frameInfo: " + videoFrameInfo);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRemoteVideoSizeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRemoteVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRemoteVideoStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onRemoteVideoSuperResolutionModeChanged(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onRemoteVideoSuperResolutionModeChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onRemoteVideoSuperResolutionModeChanged(remoteStreamKey, videoSuperResolutionMode, videoSuperResolutionModeChangedReason);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onRemoteVideoSuperResolutionModeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onSEIMessageReceived" + remoteStreamKey.getRoomId() + remoteStreamKey.getUserId());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSEIMessageReceived(remoteStreamKey, byteBuffer);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onSEIMessageReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onSEIStreamUpdate" + remoteStreamKey.getRoomId() + remoteStreamKey.getUserId());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSEIStreamUpdate(remoteStreamKey, SEIStreamUpdateEvent.values()[i]);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onSEIStreamUpdate callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onScreenVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onScreenVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onScreenVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onScreenVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onScreenVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onScreenVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onServerMessageSendResult(long j, int i, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onServerMessageSendResult: " + j + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onServerMessageSendResult(j, i, byteBuffer);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onServerMessageSendResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onServerParamsSetResult(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onServerParamsSetResult: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onServerParamsSetResult(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onServerParamsSetResult callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onSimulcastSubscribeFallback, uid: " + internalRemoteStreamSwitch.uid + ", before_video_index: " + internalRemoteStreamSwitch.beforeVideoIndex + ", after_video_index: " + internalRemoteStreamSwitch.afterVideoIndex + ", before_enable: " + internalRemoteStreamSwitch.beforeEnable + ", after_enable: " + internalRemoteStreamSwitch.afterEnable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSimulcastSubscribeFallback(new RemoteStreamSwitch(internalRemoteStreamSwitch));
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onNetworkTypeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSingleStreamEvent(String str, SingleStreamTaskEvent singleStreamTaskEvent, SingleStreamTaskErrorCode singleStreamTaskErrorCode) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onSingleStreamEvent");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSingleStreamEvent(str, singleStreamTaskEvent, singleStreamTaskErrorCode);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onSingleStreamEvent callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSnapshotTakenToFile(RemoteStreamKey remoteStreamKey, String str, int i, int i2, SnapshotErrorCode snapshotErrorCode, long j) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onSnapshotTakenToFile, streamKey: " + remoteStreamKey.toString() + " filePath: " + str + " width: " + i + " height: " + i2 + " errorCode: " + snapshotErrorCode.toString() + " taskId: " + j);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSnapshotTakenToFile(remoteStreamKey, str, i, i2, snapshotErrorCode, j);
        } catch (Exception e) {
            LogUtil.m80900d(TAG, "onSnapshotTakenToFile callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onStreamSyncInfoReceived");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onStreamSyncInfoReceived(remoteStreamKey, StreamSyncInfoConfig.SyncInfoStreamType.SYNC_INFO_STREAM_TYPE_AUDIO, byteBuffer);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onStreamSyncInfoReceived callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onSysStats(SysStats sysStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onSysStats... " + sysStats.toString());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onSysStats(sysStats);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onSysStats callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer, long j) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onUserBinaryMessageReceivedOutsideRoom: " + str + byteBuffer.capacity());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserBinaryMessageReceivedOutsideRoom(str, byteBuffer.duplicate());
            rtcEngineHandler.onUserBinaryMessageReceivedOutsideRoom(j, str, byteBuffer);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onUserBinaryMessageReceivedOutsideRoom callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageReceivedOutsideRoom(String str, String str2, long j) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onUserMessageReceivedOutsideRoom: " + str + str2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserMessageReceivedOutsideRoom(str, str2);
            rtcEngineHandler.onUserMessageReceivedOutsideRoom(j, str, str2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onUserMessageReceivedOutsideRoom callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserMessageSendResultOutsideRoom(long j, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onUserMessageSendResultOutsideRoom: " + j + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserMessageSendResultOutsideRoom(j, i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onUserMessageSendResultOutsideRoom callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserStartAudioCapture(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onUserStartAudioCapture... uid: " + str2 + ", roomId: " + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStartAudioCapture(str, str2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onUserStartAudioCapture callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserStartVideoCapture(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onUserStartVideoCapture... uid: " + str2 + ", roomId: " + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStartVideoCapture(str, str2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onUserStartVideoCapture callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserStopAudioCapture(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onUserStopAudioCapture... uid: " + str2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStopAudioCapture(str, str2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onUserStopAudioCapture callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onUserStopVideoCapture(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onUserStopVideoCapture... uid: " + str2 + ", roomId: " + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onUserStopVideoCapture(str, str2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onUserStopVideoCapture callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onVideoDenoiseModeChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoDenoiseModeChanged(videoDenoiseMode, videoDenoiseModeChangedReason);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onVideoDenoiseModeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onVideoDeviceStateChanged, VideoDeviceType: " + videoDeviceType + ", device_state: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoDeviceStateChanged(str, videoDeviceType, i, i2);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onVideoDeviceStateChanged callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onVideoDeviceWarning, VideoDeviceType: " + videoDeviceType + ", device_warning " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoDeviceWarning(str, videoDeviceType, i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onVideoDeviceWarning callback catch exception.\n" + e.getMessage());
        }
    }

    @CalledByNative
    public void onVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 != 0) {
            if (i2 == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i2 == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i2);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 != 0) {
            if (i2 == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i2 == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onWarning(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.m80900d(TAG, "onWarning, warnNum: " + i);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onWarning(i);
        } catch (Exception e) {
            LogUtil.m80901e(TAG, "onWarning callback catch exception.\n" + e.getMessage());
        }
    }

    public void setJoinChannelTime(long j) {
        this.mJoinChannelTime = j;
    }

    @CalledByNative
    public void onAudioFrameSendStateChanged(StreamKey streamKey, String str, int i) {
        IRTCEngineEventHandlerEx rtcEngineHandlerEx;
        LogUtil.m80900d(TAG, "onAudioFrameSendStateChanged,  state: " + i);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
        if (rTCEngineImpl == null || (rtcEngineHandlerEx = rTCEngineImpl.getRtcEngineHandlerEx()) == null) {
            return;
        }
        rtcEngineHandlerEx.onAudioFrameSendStateChanged(streamKey, str, firstFrameSendState);
    }

    @CalledByNative
    public void onAudioFramePlayStateChanged(StreamKey streamKey, String str, int i) {
        IRTCEngineEventHandlerEx rtcEngineHandlerEx;
        LogUtil.m80900d(TAG, "onAudioFramePlayStateChanged, user: " + streamKey.getUserId() + ", state: " + i);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandlerEx = rTCEngineImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onAudioFramePlayStateChanged(streamKey, str, firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onVideoFramePlayStateChanged(StreamKey streamKey, String str, int i) {
        IRTCEngineEventHandlerEx rtcEngineHandlerEx;
        LogUtil.m80900d(TAG, "onVideoFramePlayStateChanged, user: " + streamKey.getUserId() + ", state: " + i);
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i == 1) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            } else if (i == 2) {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandlerEx = rTCEngineImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onVideoFramePlayStateChanged(streamKey, str, firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    @CalledByNative
    public void onVideoFrameSendStateChanged(StreamKey streamKey, String str, int i) {
        IRTCEngineEventHandlerEx rtcEngineHandlerEx;
        LogUtil.m80900d(TAG, "onVideoFrameSendStateChanged, user: " + streamKey.getUserId() + ", state: " + i);
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i == 1) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            } else if (i == 2) {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRTCVideoImpl.get();
            if (rTCEngineImpl == null || (rtcEngineHandlerEx = rTCEngineImpl.getRtcEngineHandlerEx()) == null) {
                return;
            }
            rtcEngineHandlerEx.onVideoFrameSendStateChanged(streamKey, str, firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.m80901e(TAG, "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }
}
