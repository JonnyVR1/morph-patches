package com.momo.momortc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.opengl.EGLContext;
import android.util.Log;
import android.view.SurfaceView;
import androidx.core.app.NotificationCompat;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.momortc.live.MMLiveTranscoding;
import com.momo.momortc.media.HeadSetReceiver;
import com.momo.rtcbase.EglBase;
import com.momo.rtcbase.EglBase14;
import com.momo.rtcbase.VideoCanvas;
import com.momo.rtcbase.VideoFrame;
import com.momo.rtcbase.voiceengine.WebRtcAudioManager;
import com.momo.rtcbase.voiceengine.WebRtcAudioRecord;
import com.momo.rtcbase.voiceengine.WebRtcAudioTrack;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import org.eclipse.jetty.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ii5;

/* JADX INFO: loaded from: classes6.dex */
public class MMRtcEngineImpl extends MMRtcEngine implements IAudioEffectManager {
    private static final int MaxReConnect = 5;
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private AudioManager audioManager;
    private int currentRole;
    private boolean earBack;
    private boolean hasBluetoothHeadset;
    private boolean hasWiredHeadset;
    private boolean isDemo;
    private String mAppId;
    private Context mContext;
    private long mEngine;
    private String mIpAddr;
    private boolean mIsRobust;
    private IMMRtcEngineEventInterface mListener;
    private int mSslport;
    private int mTcpPort;
    private boolean middleGroundSignal;
    private int preRole;
    private int reconnect;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private final Object sync;
    private final Object syncAudio;
    private HeadSetReceiver wiredHeadsetReceiver;
    private EGLContext preEGLContext = null;
    private EglBase14.Context EglBase14EglContext = null;
    private boolean mAudioMediarouter = false;
    private boolean mAudioRouterFix = false;
    private boolean mSteroAudioCapture = false;

    public MMRtcEngineImpl(Context context, String str, IMMRtcEngineEventInterface iMMRtcEngineEventInterface) {
        this.savedAudioMode = -2;
        Object obj = new Object();
        this.sync = obj;
        this.syncAudio = new Object();
        this.reconnect = 0;
        this.isDemo = false;
        this.earBack = false;
        this.mIpAddr = "39.105.107.230";
        this.mSslport = 0;
        this.mTcpPort = CommandMessage.COMMAND_GET_PUSH_STATUS;
        this.mIsRobust = true;
        this.middleGroundSignal = false;
        this.currentRole = -1;
        this.preRole = -1;
        this.mContext = context;
        synchronized (obj) {
            this.mAppId = str;
            this.mListener = iMMRtcEngineEventInterface;
            this.mEngine = nativeInit(iMMRtcEngineEventInterface, str);
        }
        AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
        this.audioManager = audioManager;
        this.savedAudioMode = audioManager.getMode();
        this.savedIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
        this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
    }

    public static /* synthetic */ int access$408(MMRtcEngineImpl mMRtcEngineImpl) {
        int i = mMRtcEngineImpl.reconnect;
        mMRtcEngineImpl.reconnect = i + 1;
        return i;
    }

    public static boolean initializeNativeLibs() {
        try {
            System.loadLibrary("cosmosffmpeg");
            System.loadLibrary("MomoSoundAndroid");
            System.loadLibrary(NotificationCompat.CATEGORY_EVENT);
            System.loadLibrary("yuvutils");
            System.loadLibrary("MomoRtc");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private native void nativeAddPublishStreamUrl(long j, String str, boolean z);

    private native int nativeAdjustAudioMixingVolume(long j, float f);

    private native int nativeAdjustPlaybackSignalVolume(long j, long j2);

    private native int nativeAdjustRecordingSignalVolume(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeCreateConnectWithSignalServer(long j, String str, int i, int i2);

    private native void nativeDestroy(long j);

    private native int nativeEnableAudioPreProcess(long j, boolean z);

    private native int nativeEnableAudioVolumeIndication(long j, long j2, long j3);

    private native int nativeEnableInEarMonitoring(long j, boolean z);

    private native int nativeEnableLocalAudio(long j, boolean z);

    private native long nativeGetAudioMixingCurrentPosition(long j);

    private native long nativeGetAudioMixingDuration(long j);

    public static native String nativeGetChatEngineVersion();

    private native float nativeGetEffectsVolume(long j);

    public static native String nativeGetErrorDescription(int i);

    private native void nativeGetRoomList(long j, long j2);

    private native int nativeGetSabineEnable(long j);

    public static native String nativeGetSdkVersion();

    private native long nativeInit(IMMRtcEngineEventInterface iMMRtcEngineEventInterface, String str);

    private native boolean nativeIsSpeakerphoneEnabled(long j);

    private native int nativeJoinChannel(long j, byte[] bArr, String str, String str2, String str3, long j2, String str4, long j3);

    private native int nativeLeaveChannel(long j);

    private native int nativeMuteAllRemoteAudioStreams(long j, boolean z);

    private native int nativeMuteAllRemoteVideoStreams(long j, boolean z);

    private native int nativeMuteLocalAudioStream(long j, boolean z);

    private native int nativeMuteLocalMsgStream(long j, boolean z);

    private native int nativeMuteLocalVideoStream(long j, boolean z);

    private native int nativeMuteRemoteAudioStream(long j, long j2, boolean z);

    private native int nativeMuteRemoteMsgStream(long j, long j2, boolean z);

    private native int nativeMuteRemoteVideoStream(long j, long j2, boolean z);

    private native int nativePauseAllEffects(long j);

    private native int nativePauseAudioMixing(long j);

    private native int nativePauseEffect(long j, int i);

    private native int nativePlayEffect(long j, int i, String str, int i2, double d, double d2, double d3, boolean z);

    private native int nativePreloadEffect(long j, int i, String str);

    private native boolean nativePushExternalVideoFrame(long j, VideoFrame.Buffer buffer, EglBase.Context context, long j2);

    private native void nativeRegisterAudioFrameObserver(long j, IAudioFrameObserver iAudioFrameObserver);

    private native void nativeRemovePublishStreamUrl(long j, String str);

    private native int nativeRenewToken(long j, String str);

    private native int nativeResumeAllEffects(long j);

    private native int nativeResumeAudioMixing(long j);

    private native int nativeResumeEffect(long j, int i);

    private native int nativeSetAudioAECEnable(long j, boolean z);

    private native int nativeSetAudioAGCEnable(long j, boolean z);

    private native int nativeSetAudioANSEnable(long j, boolean z);

    private native int nativeSetAudioANSLevel(long j, int i);

    private native int nativeSetAudioLevel(long j, int i);

    private native int nativeSetAudioMixingPitch(long j, float f);

    private native int nativeSetAudioMixingPosition(long j, long j2);

    private native int nativeSetAudioProfile(long j, int i);

    private native void nativeSetChannalNum(long j, int i);

    private native int nativeSetChannelProfile(long j, int i);

    private native int nativeSetClientRole(long j, int i);

    private native int nativeSetDefaultAudioRouteToSpeakerphone(long j, boolean z);

    private native int nativeSetDefaultMuteAllRemoteAudioStreams(long j, boolean z);

    private native int nativeSetEffectsVolume(long j, float f);

    private native int nativeSetEnableSpeakerphone(long j, boolean z);

    private native void nativeSetExpandCartonParams(long j, int i, int i2);

    private native int nativeSetHeadset(long j, boolean z);

    private native int nativeSetInEarMonitoringVolume(long j, float f);

    private native void nativeSetListener(long j, IMMRtcEngineEventInterface iMMRtcEngineEventInterface);

    private native void nativeSetLiveTranscoding(long j, String str);

    private native int nativeSetLogFile(long j, String str);

    private native int nativeSetLogFilter(long j, long j2);

    private native int nativeSetParameters(long j, String str);

    private native int nativeSetRemoteRenderMode(long j, long j2, int i);

    private native int nativeSetRoomMode(long j, int i);

    private native int nativeSetSei(long j, byte[] bArr);

    private native int nativeSetVideoResolution(long j, int i, int i2, int i3, int i4);

    private native int nativeSetVolumeOfEffect(long j, int i, float f);

    private native int nativeSetupRemoteVideo(long j, SurfaceView surfaceView, int i, int i2);

    private native boolean nativeSharedContext(long j, EglBase.Context context);

    private native int nativeStartAudioMixing(long j, String str, boolean z, boolean z2, long j2);

    private native int nativeStartChannelMediaRelay(long j, long j2, String str);

    private native int nativeStopAllEffects(long j);

    private native int nativeStopAudioMixing(long j);

    private native int nativeStopChannelMediaRelay(long j, long j2, String str);

    private native int nativeStopEffect(long j, int i);

    private native int nativeUnloadEffect(long j, int i);

    private native boolean nativeUpdateContext(long j, EglBase.Context context);

    private native int nativeforwardDownlinkAudio(long j, long j2, boolean z);

    private native int nativesendStreamMessage(long j, int i, String str);

    private void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        ii5.m136342l(this.mContext, broadcastReceiver, intentFilter);
    }

    private void setMicrophoneMute(boolean z) {
        if (this.audioManager.isMicrophoneMute() == z) {
            return;
        }
        this.audioManager.setMicrophoneMute(z);
    }

    private void setSpeakerphoneOn(boolean z) {
        if (this.audioManager.isSpeakerphoneOn() == z) {
            return;
        }
        this.audioManager.setSpeakerphoneOn(z);
    }

    private void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.mContext.unregisterReceiver(broadcastReceiver);
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean IsInEarMonitoring() {
        synchronized (this.syncAudio) {
            try {
                HeadSetReceiver headSetReceiver = this.wiredHeadsetReceiver;
                if (headSetReceiver == null) {
                    return false;
                }
                return headSetReceiver.isEarBack();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int addPublishStreamUrl(String str, boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j != 0) {
                    nativeAddPublishStreamUrl(j, str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int adjustAudioMixingVolume(float f) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeAdjustAudioMixingVolume(j, f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int adjustPlaybackSignalVolume(long j) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeAdjustPlaybackSignalVolume(j2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int adjustRecordingSignalVolume(long j) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeAdjustRecordingSignalVolume(j2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void changeToSpeaker() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.hasWiredHeadset = HeadSetReceiver.hasWiredHeadset(this.audioManager);
        this.hasBluetoothHeadset = HeadSetReceiver.hasBluetoothHeadset();
        synchronized (this.syncAudio) {
            try {
                HeadSetReceiver.requestAudioFocus(this.mContext);
                HeadSetReceiver headSetReceiver = new HeadSetReceiver(this.audioManager);
                this.wiredHeadsetReceiver = headSetReceiver;
                headSetReceiver.setMediaRouter(this.mAudioMediarouter, this.mAudioRouterFix);
                this.wiredHeadsetReceiver.autoSetHeadsetOn(this.audioManager, false, true);
                registerReceiver(this.wiredHeadsetReceiver, intentFilter);
                boolean z = this.earBack;
                if (z) {
                    this.wiredHeadsetReceiver.setEarBack(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int clearVideoWatermarks() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int complain(String str, String str2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int createDataStream(boolean z, boolean z2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int disableAudio() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int disableLastmileTest() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int disableVideo() {
        return 0;
    }

    public void doDestroy() {
        synchronized (this.sync) {
            nativeDestroy(this.mEngine);
            this.reconnect = 0;
            this.mEngine = 0L;
        }
        this.preEGLContext = null;
        this.EglBase14EglContext = null;
        this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
        this.audioFocusChangeListener = null;
        setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
        setMicrophoneMute(this.savedIsMicrophoneMute);
        this.audioManager.setMode(this.savedAudioMode);
        synchronized (this.syncAudio) {
            try {
                HeadSetReceiver headSetReceiver = this.wiredHeadsetReceiver;
                if (headSetReceiver != null) {
                    headSetReceiver.autoSetHeadsetOn(this.audioManager, false, false);
                    unregisterReceiver(this.wiredHeadsetReceiver);
                    HeadSetReceiver.abandonAudioFocus();
                    this.wiredHeadsetReceiver.release();
                    this.wiredHeadsetReceiver = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.audioManager = null;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableAudio() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableAudioPreProcess(boolean z) {
        long j = this.mEngine;
        if (j != 0) {
            return nativeEnableAudioPreProcess(j, z);
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableAudioQualityIndication(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableAudioVolumeIndication(long j, long j2) {
        synchronized (this.sync) {
            try {
                long j3 = this.mEngine;
                if (j3 == 0) {
                    return 0;
                }
                return nativeEnableAudioVolumeIndication(j3, j, j2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableDualStreamMode(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean enableHighPerfWifiMode(boolean z) {
        return false;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableInEarMonitoring(boolean z) {
        synchronized (this.syncAudio) {
            try {
                HeadSetReceiver headSetReceiver = this.wiredHeadsetReceiver;
                if (headSetReceiver != null) {
                    headSetReceiver.setEarBack(z);
                } else {
                    this.earBack = z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableLastmileTest() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableLocalAudio(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeEnableLocalAudio(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableLocalVideo(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void enableMiddleGroundSignal(boolean z) {
        this.middleGroundSignal = z;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableRecap(int i) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableTransportQualityIndication(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableVideo() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int enableWebSdkInteroperability(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int forwardDownlinkAudio(long j, boolean z) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeforwardDownlinkAudio(j2, j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public IAudioEffectManager getAudioEffectManager() {
        return this;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public long getAudioMixingCurrentPosition() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0L;
                }
                return nativeGetAudioMixingCurrentPosition(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public long getAudioMixingDuration() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0L;
                }
                return nativeGetAudioMixingDuration(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public String getCallId() {
        return null;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public float getCameraMaxZoomFactor() {
        return 0.0f;
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public float getEffectsVolume() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0.0f;
                }
                return nativeGetEffectsVolume(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public long getNativeHandle() {
        return this.mEngine;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public String getParameter(String str, String str2) {
        return "";
    }

    @Override // com.momo.momortc.MMRtcEngine
    public String getParameters(String str) {
        return "";
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void getRoomList(long j) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 != 0) {
                    nativeGetRoomList(j2, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine, com.momo.momortc.IAudioEffectManager
    public int getSabineEnable() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeGetSabineEnable(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean isCameraAutoFocusFaceModeSupported() {
        return false;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean isCameraFocusSupported() {
        return false;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean isSpeakerphoneEnabled() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return false;
                }
                return nativeIsSpeakerphoneEnabled(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public boolean isTextureEncodeSupported() {
        return false;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int joinChannel(final String str, final String str2, String str3, long j, final String str4, final String str5, String str6, long j2) {
        changeToSpeaker();
        synchronized (this.sync) {
            try {
                long j3 = this.mEngine;
                if (j3 != 0) {
                    nativeJoinChannel(j3, null, str, str2, str3, j, str6, j2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.isDemo) {
            MMRtcHttpUtils.getInstance().postSignalDispatchEx(this.mAppId, str, str4, str5, str2, new MMRtcHttpUtils.MMRtcHttpCallback() { // from class: com.momo.momortc.MMRtcEngineImpl.1
                @Override // com.momo.momortc.MMRtcHttpUtils.MMRtcHttpCallback
                public void onError(int i, String str7) {
                    int i2 = MMRtcEngineImpl.this.reconnect;
                    MMRtcEngineImpl mMRtcEngineImpl = MMRtcEngineImpl.this;
                    if (i2 >= 5) {
                        mMRtcEngineImpl.mListener.onHttpError(i, str7);
                        MMRtcEngineImpl.this.mListener.onError(HttpStatus.SERVICE_UNAVAILABLE_503);
                        return;
                    }
                    MMRtcEngineImpl.access$408(mMRtcEngineImpl);
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    MMRtcHttpUtils.getInstance().postSignalDispatchEx(MMRtcEngineImpl.this.mAppId, str, str4, str5, str2, this, MMRtcEngineImpl.this.middleGroundSignal);
                    MMRtcEngineImpl.this.mListener.onHttpError(i, str7);
                }

                @Override // com.momo.momortc.MMRtcHttpUtils.MMRtcHttpCallback
                public void onSuccess(int i, String str7) {
                    try {
                        JSONObject jSONObject = new JSONObject(new JSONObject(str7).getJSONObject("data").getString(LovePlanetStage.result));
                        String string = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                        int i2 = jSONObject.getInt(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
                        int i3 = jSONObject.getInt("sslPort");
                        synchronized (MMRtcEngineImpl.this.sync) {
                            try {
                                if (MMRtcEngineImpl.this.mEngine != 0) {
                                    MMRtcEngineImpl mMRtcEngineImpl = MMRtcEngineImpl.this;
                                    mMRtcEngineImpl.nativeCreateConnectWithSignalServer(mMRtcEngineImpl.mEngine, string, i2, i3);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        MMRtcEngineImpl.this.mListener.onHttpError(i, "json error");
                        MMRtcEngineImpl.this.mListener.onError(599);
                    }
                }
            }, this.middleGroundSignal);
            return 0;
        }
        this.mIpAddr = "39.105.107.230";
        this.mTcpPort = CommandMessage.COMMAND_SET_NOTIFICATION_TYPE;
        this.mSslport = 0;
        long j4 = this.mEngine;
        if (j4 == 0) {
            return 0;
        }
        nativeCreateConnectWithSignalServer(j4, "39.105.107.230", CommandMessage.COMMAND_SET_NOTIFICATION_TYPE, 0);
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int leaveChannel() {
        int iNativeLeaveChannel;
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                iNativeLeaveChannel = j != 0 ? nativeLeaveChannel(j) : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iNativeLeaveChannel;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public String makeQualityReportUrl(String str, int i, int i2, int i3) {
        return null;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int monitorAudioRouteChange(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void monitorConnectionEvent(boolean z) {
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteAllRemoteAudioStreams(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeMuteAllRemoteAudioStreams(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteAllRemoteVideoStreams(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeMuteLocalVideoStream(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteLocalAudioStream(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeMuteLocalAudioStream(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteLocalMsgStream(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeMuteLocalMsgStream(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteLocalVideoStream(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeMuteLocalVideoStream(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteRemoteAudioStream(long j, boolean z) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeMuteRemoteAudioStream(j2, j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteRemoteMsgStream(long j, boolean z) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeMuteRemoteMsgStream(j2, j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int muteRemoteVideoStream(int i, boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeMuteRemoteVideoStream(j, i, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int pauseAllEffects() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativePauseAllEffects(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int pauseAudio() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int pauseAudioMixing() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativePauseAudioMixing(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int pauseEffect(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativePauseEffect(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativePlayEffect(j, i, str, i2, d, d2, d3, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int playRecap() {
        return 0;
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int preloadEffect(int i, String str) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativePreloadEffect(j, i, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int pushExternalAudioFrame(byte[] bArr, long j) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public synchronized boolean pushExternalVideoFrame(VideoFrame videoFrame, EglBase.Context context) throws Throwable {
        try {
            try {
                try {
                    synchronized (this.sync) {
                        try {
                            long j = this.mEngine;
                            if (j == 0) {
                                return false;
                            }
                            nativePushExternalVideoFrame(j, videoFrame.getBuffer(), context, videoFrame.getTimestampNs());
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int rate(String str, int i, String str2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int refreshRecordingServiceStatus() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j != 0) {
                    nativeRegisterAudioFrameObserver(j, iAudioFrameObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public void reinitialize(Context context, String str, IMMRtcEngineEventInterface iMMRtcEngineEventInterface) {
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int removeInjectStreamUrl(String str) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int removePublishStreamUrl(String str) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j != 0) {
                    nativeRemovePublishStreamUrl(j, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int renewToken(String str) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeRenewToken(j, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int resumeAllEffects() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeResumeAllEffects(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int resumeAudio() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int resumeAudioMixing() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeResumeAudioMixing(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int resumeEffect(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeResumeEffect(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int sendStreamMessage(int i, String str) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativesendStreamMessage(j, i, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setApiCallMode(int i) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioAECEnable(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetAudioAECEnable(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioAGCEnable(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetAudioAGCEnable(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioANSEnable(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetAudioANSEnable(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioANSLevel(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetAudioANSLevel(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioLevel(int i) {
        if (this.mEngine != 0) {
            if (i == 0) {
                WebRtcAudioRecord.setAudioSource(7);
                WebRtcAudioTrack.setAudioContentType(1);
                WebRtcAudioTrack.setAudioTrackUsageAttribute(2);
                this.audioManager.setMode(3);
                enableAudioPreProcess(false);
            } else {
                WebRtcAudioRecord.setAudioSource(1);
                WebRtcAudioTrack.setAudioContentType(2);
                WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
                this.audioManager.setMode(0);
                enableAudioPreProcess(true);
            }
        }
        return nativeSetAudioLevel(this.mEngine, i);
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioMixingPitch(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetAudioMixingPitch(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioMixingPosition(long j) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeSetAudioMixingPosition(j2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setAudioProfile(int i, int i2) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j != 0) {
                    nativeSetAudioProfile(j, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mAudioRouterFix = false;
        if (i == 5) {
            setChannalNum(2);
        } else {
            setChannalNum(1);
        }
        if (i2 == 3) {
            this.mAudioMediarouter = true;
            this.mAudioRouterFix = true;
        } else {
            this.mAudioMediarouter = false;
            this.mAudioRouterFix = false;
        }
        if (i == 0) {
            this.mAudioMediarouter = false;
            this.mAudioRouterFix = true;
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setCameraAutoFocusFaceModeEnabled(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setCameraFocusPositionInPreview(float f, float f2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setCameraTorchOn(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setCameraZoomFactor(float f) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void setChannalNum(int i) {
        if (i == 1) {
            WebRtcAudioManager.setStereoOutput(false);
            WebRtcAudioManager.setStereoInput(false);
            synchronized (this.sync) {
                try {
                    long j = this.mEngine;
                    if (j != 0) {
                        nativeSetChannalNum(j, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        WebRtcAudioManager.setStereoOutput(true);
        if (this.mSteroAudioCapture) {
            WebRtcAudioManager.setStereoInput(true);
        } else {
            WebRtcAudioManager.setStereoInput(false);
        }
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 != 0) {
                    nativeSetChannalNum(j2, i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setChannelProfile(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetChannelProfile(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setClientRole(int i) {
        synchronized (this.sync) {
            try {
                this.currentRole = i;
                this.preRole = i;
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetClientRole(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setDefaultAudioRoutetoSpeakerphone(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetDefaultAudioRouteToSpeakerphone(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetDefaultMuteAllRemoteAudioStreams(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        return 0;
    }

    public void setDemo(String str, int i, int i2) {
        this.mIpAddr = str;
        try {
            this.mTcpPort = i;
            this.mSslport = i2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.isDemo = true;
    }

    public void setEarBack(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j != 0) {
                    nativeEnableInEarMonitoring(j, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int setEffectsVolume(float f) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetEffectsVolume(j, f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setEnableSpeakerphone(boolean z) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetEnableSpeakerphone(j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setEncryptionMode(String str) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setEncryptionSecret(String str) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void setExpandCartonParams(int i, int i2) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j != 0) {
                    nativeSetExpandCartonParams(j, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setExternalAudioSource(boolean z, int i, int i2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3) {
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setHeadset(boolean z) {
        long j = this.mEngine;
        if (j != 0) {
            return nativeSetHeadset(j, z);
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setHighQualityAudioParameters(boolean z, boolean z2, boolean z3) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setInEarMonitoringVolume(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetInEarMonitoringVolume(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void setListener(IMMRtcEngineEventInterface iMMRtcEngineEventInterface) {
        synchronized (this.sync) {
            try {
                this.mListener = iMMRtcEngineEventInterface;
                long j = this.mEngine;
                if (j != 0) {
                    nativeSetListener(j, iMMRtcEngineEventInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLiveTranscoding(MMLiveTranscoding mMLiveTranscoding) {
        synchronized (this.sync) {
            try {
                if (this.mEngine != 0) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("SEIMsg", mMLiveTranscoding.getTranscodingExtraInfo());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", mMLiveTranscoding.getWidth());
                        jSONObject2.put("height", mMLiveTranscoding.getHeight());
                        jSONObject2.put("videoFps", mMLiveTranscoding.getVideoFramerate());
                        jSONObject2.put("gopSize", mMLiveTranscoding.getVideoGop());
                        jSONObject2.put("bitRate", mMLiveTranscoding.getVideoBitrate());
                        jSONObject2.put("audioSampleRate", mMLiveTranscoding.getAudioSampleRate());
                        jSONObject2.put("audioChannel", mMLiveTranscoding.getAudioChannels());
                        jSONObject2.put("audioBitRate", mMLiveTranscoding.getAudioBitrate());
                        jSONObject2.put("audioSampleFmt", 0);
                        jSONObject2.put("audioFrameSize", 1024);
                        jSONObject.put("Canvas", jSONObject2);
                        JSONArray jSONArray = new JSONArray();
                        for (MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser : mMLiveTranscoding.getTranscodingUserMap().values()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("userID", mMLiveTranscodingUser.uid);
                            jSONObject3.put(BaseSei.f13930X, mMLiveTranscodingUser.posx);
                            jSONObject3.put(BaseSei.f13931Y, mMLiveTranscodingUser.posy);
                            jSONObject3.put("w", mMLiveTranscodingUser.width);
                            jSONObject3.put("h", mMLiveTranscodingUser.height);
                            jSONArray.put(jSONObject3);
                        }
                        jSONObject.put(BaseSei.INFO, jSONArray);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    nativeSetLiveTranscoding(this.mEngine, jSONObject.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLocalRenderMode(int i) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLocalVideoMirrorMode(int i) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLocalVoiceEqualization(int i, int i2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLocalVoicePitch(double d) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLocalVoiceReverb(int i, int i2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLogFile(String str) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetLogFile(j, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setLogFilter(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetLogFilter(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setMixedAudioFrameParameters(int i, int i2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setParameters(String str) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetParameters(j, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setProfile(String str, boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setRemoteDefaultVideoStreamType(int i) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setRemoteRenderMode(long j, int i) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeSetRemoteRenderMode(j2, j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setRemoteVideoStreamType(int i, int i2) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void setRobustSignal(boolean z) {
        this.mIsRobust = z;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setRoomMode(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j != 0) {
                    nativeSetRoomMode(j, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setSei(byte[] bArr) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetSei(j, bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSharedContext(EglBase.Context context) {
        synchronized (this.sync) {
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setSpeakerphoneVolume(int i) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void setSteroAudioCapture(boolean z) {
        this.mSteroAudioCapture = z;
        if (z) {
            setChannalNum(2);
        } else {
            setChannalNum(1);
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setTextureId(int i, EGLContext eGLContext, int i2, int i3, long j) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setVideoProfile(int i, int i2, int i3, int i4) {
        Log.e("MMRtcEngineImpl", "resetCodec setVideoProfile width= " + i + ";height= " + i2 + ";framerate=" + i3 + ";bitrate=" + i4);
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetVideoResolution(j, i, i2, i3, i4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setVideoQualityParameters(boolean z) {
        return 0;
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int setVolumeOfEffect(int i, float f) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeSetVolumeOfEffect(j, i, f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setupLocalVideo(VideoCanvas videoCanvas) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setupRemoteVideo(VideoCanvas videoCanvas) {
        synchronized (this.sync) {
            try {
                if (this.mEngine == 0) {
                    return 0;
                }
                Log.e("nativeSetupRemoteVideo", "setupRemoteVideo uid " + videoCanvas.uid + " view " + videoCanvas.view.hashCode());
                return nativeSetupRemoteVideo(this.mEngine, videoCanvas.view, videoCanvas.renderMode, videoCanvas.uid);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int startAudioMixing(String str, boolean z, boolean z2, long j) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeStartAudioMixing(j2, str, z, z2, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int startAudioRecording(String str, int i) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int startChannelMediaRelay(long j, String str) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeStartChannelMediaRelay(j2, j, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int startEchoTest() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int startPlayingStream(String str) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int startPreview() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int startRecordingService(String str) {
        return 0;
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int stopAllEffects() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeStopAllEffects(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int stopAudioMixing() {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeStopAudioMixing(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int stopAudioRecording() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int stopChannelMediaRelay(long j, String str) {
        synchronized (this.sync) {
            try {
                long j2 = this.mEngine;
                if (j2 == 0) {
                    return 0;
                }
                return nativeStopChannelMediaRelay(j2, j, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int stopEchoTest() {
        return 0;
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int stopEffect(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeStopEffect(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int stopPlayingStream() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int stopPreview() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int stopRecordingService(String str) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int switchCamera() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public void switchView(int i, int i2) {
    }

    @Override // com.momo.momortc.IAudioEffectManager
    public int unloadEffect(int i) {
        synchronized (this.sync) {
            try {
                long j = this.mEngine;
                if (j == 0) {
                    return 0;
                }
                return nativeUnloadEffect(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int updateSharedContext(EGLContext eGLContext) {
        boolean zNativeUpdateContext;
        synchronized (this.sync) {
            try {
                if (this.mEngine != 0 && this.preEGLContext != eGLContext) {
                    this.preEGLContext = eGLContext;
                    EglBase14.Context context = new EglBase14.Context(eGLContext);
                    this.EglBase14EglContext = context;
                    if (this.preEGLContext == null) {
                        nativeSharedContext(this.mEngine, context);
                    }
                }
                zNativeUpdateContext = nativeUpdateContext(this.mEngine, this.EglBase14EglContext);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zNativeUpdateContext ? 1 : 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int useExternalAudioDevice() {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setTextureId(int i, javax.microedition.khronos.egl.EGLContext eGLContext, int i2, int i3, long j) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int updateSharedContext(javax.microedition.khronos.egl.EGLContext eGLContext) {
        return 0;
    }

    @Override // com.momo.momortc.MMRtcEngine
    public int setVideoProfile(int i, boolean z) {
        return 0;
    }
}
