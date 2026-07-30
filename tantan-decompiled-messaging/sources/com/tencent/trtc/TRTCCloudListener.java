package com.tencent.trtc;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TRTCCloudListener {

    public interface TRTCAudioFrameListener {
        void onCapturedRawAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onLocalProcessedAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onMixedPlayAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onRemoteUserAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, String str);
    }

    public static abstract class TRTCLogListener {
        public abstract void onLog(String str, int i, String str2);
    }

    public interface TRTCSnapshotListener {
        void onSnapshotComplete(Bitmap bitmap);
    }

    public interface TRTCVideoRenderListener {
        void onRenderVideoFrame(String str, int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);
    }

    @Deprecated
    public void onAudioEffectFinished(int i, int i2) {
    }

    public void onAudioRouteChanged(int i, int i2) {
    }

    public void onCameraDidReady() {
    }

    public void onConnectOtherRoom(String str, int i, String str2) {
    }

    public void onConnectionLost() {
    }

    public void onConnectionRecovery() {
    }

    public void onDisConnectOtherRoom(int i, String str) {
    }

    public void onEnterRoom(long j) {
    }

    public void onError(int i, String str, Bundle bundle) {
    }

    public void onExitRoom(int i) {
    }

    public void onFirstAudioFrame(String str) {
    }

    public void onFirstVideoFrame(String str, int i, int i2, int i3) {
    }

    public void onMicDidReady() {
    }

    public void onMissCustomCmdMsg(String str, int i, int i2, int i3) {
    }

    public void onNetworkQuality(TRTCCloudDef.TRTCQuality tRTCQuality, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
    }

    public void onRecvCustomCmdMsg(String str, int i, int i2, byte[] bArr) {
    }

    public void onRecvSEIMsg(String str, byte[] bArr) {
    }

    public void onRemoteUserEnterRoom(String str) {
    }

    public void onRemoteUserLeaveRoom(String str, int i) {
    }

    public void onScreenCapturePaused() {
    }

    public void onScreenCaptureResumed() {
    }

    public void onScreenCaptureStarted() {
    }

    public void onScreenCaptureStopped(int i) {
    }

    public void onSendFirstLocalAudioFrame() {
    }

    public void onSendFirstLocalVideoFrame(int i) {
    }

    public void onSetMixTranscodingConfig(int i, String str) {
    }

    public void onSpeedTest(TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult, int i, int i2) {
    }

    public void onStartPublishCDNStream(int i, String str) {
    }

    public void onStartPublishing(int i, String str) {
    }

    public void onStatistics(TRTCStatistics tRTCStatistics) {
    }

    public void onStopPublishCDNStream(int i, String str) {
    }

    public void onStopPublishing(int i, String str) {
    }

    public void onSwitchRole(int i, String str) {
    }

    public void onSwitchRoom(int i, String str) {
    }

    public void onTryToReconnect() {
    }

    public void onUserAudioAvailable(String str, boolean z) {
    }

    @Deprecated
    public void onUserEnter(String str) {
    }

    @Deprecated
    public void onUserExit(String str, int i) {
    }

    public void onUserSubStreamAvailable(String str, boolean z) {
    }

    public void onUserVideoAvailable(String str, boolean z) {
    }

    public void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i) {
    }

    public void onWarning(int i, String str, Bundle bundle) {
    }
}
