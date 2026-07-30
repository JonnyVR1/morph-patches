package com.tencent.trtc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.trtc.impl.TRTCCloudImpl;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TRTCCloud {
    private static C14588a mTXLogListener;
    static WeakReference<TRTCCloud> sInstance;

    @Deprecated
    public interface BGMNotify {
        void onBGMComplete(int i);

        void onBGMProgress(long j, long j2);

        void onBGMStart(int i);
    }

    public static class TRTCViewMargin {
        public float bottomMargin;
        public float leftMargin;
        public float rightMargin;
        public float topMargin;

        public TRTCViewMargin(float f, float f2, float f3, float f4) {
            this.leftMargin = f;
            this.topMargin = f3;
            this.rightMargin = f2;
            this.bottomMargin = f4;
        }
    }

    public static void destroySharedInstance() {
        TRTCCloudImpl.destroySharedInstance();
    }

    public static String getSDKVersion() {
        return TXCCommonUtil.getSDKVersionStr();
    }

    public static void setConsoleEnabled(boolean z) {
        TXCLog.setConsoleEnabled(z);
    }

    public static void setLogCompressEnabled(boolean z) {
        TXCLog.setLogCompressEnabled(z);
    }

    public static void setLogDirPath(String str) {
        TXCLog.setLogDirPath(str);
    }

    public static void setLogLevel(int i) {
        TXCLog.setLevel(i);
    }

    public static void setLogListener(TRTCCloudListener.TRTCLogListener tRTCLogListener) {
        C14588a c14588a = mTXLogListener;
        if (c14588a != null) {
            c14588a.m85799a(null);
        }
        if (tRTCLogListener != null) {
            C14588a c14588a2 = new C14588a();
            mTXLogListener = c14588a2;
            c14588a2.m85799a(tRTCLogListener);
        } else {
            mTXLogListener = null;
        }
        TXCLog.setListener(mTXLogListener);
    }

    public static native void setNetEnv(int i);

    public static TRTCCloud sharedInstance(Context context) {
        return TRTCCloudImpl.sharedInstance(context);
    }

    public abstract void ConnectOtherRoom(String str);

    public abstract void DisconnectOtherRoom();

    public abstract void callExperimentalAPI(String str);

    public abstract TRTCCloud createSubCloud();

    public abstract void destroySubCloud(TRTCCloud tRTCCloud);

    public abstract void enableAudioEarMonitoring(boolean z);

    public abstract void enableAudioVolumeEvaluation(int i);

    public abstract void enableCustomAudioCapture(boolean z);

    public abstract void enableCustomVideoCapture(boolean z);

    public abstract int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract boolean enableTorch(boolean z);

    public abstract void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i);

    public abstract void exitRoom();

    public abstract int getAudioCaptureVolume();

    public abstract TXAudioEffectManager getAudioEffectManager();

    public abstract int getAudioPlayoutVolume();

    @Deprecated
    public abstract int getBGMDuration(String str);

    public abstract TXBeautyManager getBeautyManager();

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraFocusPositionInPreviewSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract void muteAllRemoteAudio(boolean z);

    public abstract void muteAllRemoteVideoStreams(boolean z);

    public abstract void muteLocalAudio(boolean z);

    public abstract void muteLocalVideo(boolean z);

    public abstract void muteRemoteAudio(String str, boolean z);

    public abstract void muteRemoteVideoStream(String str, boolean z);

    @Deprecated
    public abstract void pauseAudioEffect(int i);

    @Deprecated
    public abstract void pauseBGM();

    public abstract void pauseScreenCapture();

    @Deprecated
    public abstract void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam);

    @Deprecated
    public abstract void playBGM(String str, BGMNotify bGMNotify);

    @Deprecated
    public abstract void resumeAudioEffect(int i);

    @Deprecated
    public abstract void resumeBGM();

    public abstract void resumeScreenCapture();

    @Deprecated
    public abstract void selectMotionTmpl(String str);

    public abstract void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract boolean sendCustomCmdMsg(int i, byte[] bArr, boolean z, boolean z2);

    public abstract void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);

    public abstract boolean sendSEIMsg(byte[] bArr, int i);

    @Deprecated
    public abstract void setAllAudioEffectsVolume(int i);

    public abstract void setAudioCaptureVolume(int i);

    @Deprecated
    public abstract void setAudioEffectVolume(int i, int i2);

    public abstract void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener);

    public abstract void setAudioPlayoutVolume(int i);

    public abstract void setAudioQuality(int i);

    public abstract void setAudioRoute(int i);

    @Deprecated
    public abstract void setBGMPlayoutVolume(int i);

    @Deprecated
    public abstract int setBGMPosition(int i);

    @Deprecated
    public abstract void setBGMPublishVolume(int i);

    @Deprecated
    public abstract void setBGMVolume(int i);

    @Deprecated
    public abstract void setBeautyStyle(int i, int i2, int i3, int i4);

    @Deprecated
    public abstract void setChinLevel(int i);

    public abstract void setDebugViewMargin(String str, TRTCViewMargin tRTCViewMargin);

    public abstract void setDefaultStreamRecvMode(boolean z, boolean z2);

    @Deprecated
    public abstract void setEyeScaleLevel(int i);

    @Deprecated
    public abstract void setFaceShortLevel(int i);

    @Deprecated
    public abstract void setFaceSlimLevel(int i);

    @Deprecated
    public abstract void setFaceVLevel(int i);

    @Deprecated
    public abstract void setFilter(Bitmap bitmap);

    @Deprecated
    public abstract void setFilterConcentration(float f);

    public abstract void setFocusPosition(int i, int i2);

    public abstract void setGSensorMode(int i);

    @TargetApi(18)
    @Deprecated
    public abstract boolean setGreenScreenFile(String str);

    public abstract void setListener(TRTCCloudListener tRTCCloudListener);

    public abstract void setListenerHandler(Handler handler);

    public abstract int setLocalVideoRenderListener(int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    public abstract void setLocalViewFillMode(int i);

    public abstract void setLocalViewMirror(int i);

    public abstract void setLocalViewRotation(int i);

    @Deprecated
    public abstract void setMicVolumeOnMixing(int i);

    public abstract void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig);

    @Deprecated
    public abstract void setMotionMute(boolean z);

    public abstract void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam);

    @Deprecated
    public abstract void setNoseSlimLevel(int i);

    public abstract int setPriorRemoteVideoStreamType(int i);

    public abstract void setRemoteAudioVolume(String str, int i);

    public abstract void setRemoteSubStreamViewFillMode(String str, int i);

    public abstract void setRemoteSubStreamViewRotation(String str, int i);

    public abstract int setRemoteVideoRenderListener(String str, int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    public abstract int setRemoteVideoStreamType(String str, int i);

    public abstract void setRemoteViewFillMode(String str, int i);

    public abstract void setRemoteViewRotation(String str, int i);

    @Deprecated
    public abstract void setReverbType(int i);

    public abstract void setSystemVolumeType(int i);

    public abstract void setVideoEncoderMirror(boolean z);

    public abstract void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void setVideoEncoderRotation(int i);

    public abstract void setVideoMuteImage(Bitmap bitmap, int i);

    @Deprecated
    public abstract boolean setVoiceChangerType(int i);

    public abstract void setWatermark(Bitmap bitmap, int i, float f, float f2, float f3);

    public abstract void setZoom(int i);

    public abstract void showDebugView(int i);

    public abstract void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    public abstract int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams);

    public abstract void startLocalAudio();

    public abstract void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView);

    public abstract void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam);

    public abstract void startPublishing(String str, int i);

    public abstract void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView);

    public abstract void startRemoteView(String str, TXCloudVideoView tXCloudVideoView);

    public abstract void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams);

    public abstract void startSpeedTest(int i, String str, String str2);

    @Deprecated
    public abstract void stopAllAudioEffects();

    public abstract void stopAllRemoteView();

    @Deprecated
    public abstract void stopAudioEffect(int i);

    public abstract void stopAudioRecording();

    @Deprecated
    public abstract void stopBGM();

    public abstract void stopLocalAudio();

    public abstract void stopLocalPreview();

    public abstract void stopPublishCDNStream();

    public abstract void stopPublishing();

    public abstract void stopRemoteSubStreamView(String str);

    public abstract void stopRemoteView(String str);

    public abstract void stopScreenCapture();

    public abstract void stopSpeedTest();

    public abstract void switchCamera();

    public abstract void switchRole(int i);

    public abstract void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig);

    /* JADX INFO: renamed from: com.tencent.trtc.TRTCCloud$a */
    public static class C14588a implements TXCLog.InterfaceC14201a {

        /* JADX INFO: renamed from: a */
        private TRTCCloudListener.TRTCLogListener f61310a = null;

        @Override // com.tencent.liteav.basic.log.TXCLog.InterfaceC14201a
        /* JADX INFO: renamed from: a */
        public void mo84158a(int i, String str, String str2) {
            TRTCCloudListener.TRTCLogListener tRTCLogListener = this.f61310a;
            if (tRTCLogListener != null) {
                tRTCLogListener.onLog(str2, i, str);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m85799a(TRTCCloudListener.TRTCLogListener tRTCLogListener) {
            this.f61310a = tRTCLogListener;
        }
    }
}
