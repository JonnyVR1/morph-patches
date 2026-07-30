package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.liteav.audio.InterfaceC14148f;
import com.tencent.liteav.audio.TXCAudioEncoderConfig;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.structs.C14204a;
import com.tencent.liteav.basic.util.C14215f;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class TXCAudioEngineJNI {
    private static final String TAG = "TXCAudioEngineJNI";
    private static WeakReference<InterfaceC14148f> mAudioCaptureDataListener;
    private static InterfaceC14154a mAudioDumpingListener;

    /* JADX INFO: renamed from: com.tencent.liteav.audio.impl.TXCAudioEngineJNI$a */
    public interface InterfaceC14154a {
        void onLocalAudioWriteFailed();
    }

    static {
        C14215f.m84239f();
        nativeCacheClassForNative();
        mAudioDumpingListener = null;
        mAudioCaptureDataListener = null;
    }

    public static void InitTraeEngineLibrary(Context context) {
        if (context == null) {
            TXCLog.m84149e(TAG, "InitTraeEngineLibrary failed, context is null!");
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            String str2 = applicationInfo.dataDir + "/lib";
            String str3 = "/data/data/" + applicationInfo.packageName + "/lib";
            String strM84240g = C14215f.m84240g();
            if (strM84240g == null) {
                strM84240g = "";
            }
            nativeAppendLibraryPath("add_libpath:" + str);
            nativeAppendLibraryPath("add_libpath:".concat(str2));
            nativeAppendLibraryPath("add_libpath:".concat(str3));
            nativeAppendLibraryPath("add_libpath:".concat(strM84240g));
        } catch (UnsatisfiedLinkError e) {
            TXCLog.m84150e(TAG, "init trae engine library failed.", e);
        }
    }

    public static void SetAudioDumpingListener(InterfaceC14154a interfaceC14154a) {
        mAudioDumpingListener = interfaceC14154a;
    }

    public static StatusBucket getStatus(int i) {
        return nativeGetStatus(i);
    }

    public static native void nativeAppendLibraryPath(String str);

    public static native void nativeCacheClassForNative();

    public static boolean nativeCheckTraeEngine(Context context) {
        if (context == null) {
            TXCLog.m84149e(TAG, "nativeCheckTraeEngine failed, context is null!");
            return false;
        }
        if (C14215f.m84223a("traeimp-rtmp")) {
            TXCLog.m84149e(TAG, "link traeimp-rtmp success !");
            return true;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String str = applicationInfo.nativeLibraryDir;
        String str2 = applicationInfo.dataDir + "/lib";
        String str3 = "/data/data/" + applicationInfo.packageName + "/lib";
        String strM84240g = C14215f.m84240g();
        if (strM84240g == null) {
            strM84240g = "";
        }
        if (!new File(str + "/libtraeimp-rtmp.so").exists()) {
            TXCLog.m84156w(TAG, "nativeCheckTraeEngine load so error " + str + "/libtraeimp-rtmp.so");
            if (!new File(str2.concat("/libtraeimp-rtmp.so")).exists()) {
                TXCLog.m84156w(TAG, "nativeCheckTraeEngine load so error " + str2 + "/libtraeimp-rtmp.so");
                if (!new File(str3.concat("/libtraeimp-rtmp.so")).exists()) {
                    TXCLog.m84156w(TAG, "nativeCheckTraeEngine load so error " + str3 + "/libtraeimp-rtmp.so");
                    if (!new File(strM84240g.concat("/libtraeimp-rtmp.so")).exists()) {
                        TXCLog.m84156w(TAG, "nativeCheckTraeEngine load so error " + strM84240g + "/libtraeimp-rtmp.so");
                        TXCLog.m84149e(TAG, "nativeCheckTraeEngine failed, can not find trae libs !");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static native void nativeClean();

    public static native void nativeDeleteAudioSessionDuplicate();

    public static native void nativeEnableAudioEarMonitoring(boolean z);

    public static native void nativeEnableAudioVolumeEvaluation(boolean z, int i);

    public static native void nativeEnableAutoRestartDevice(boolean z);

    public static native void nativeEnableCaptureEOSMode(boolean z);

    public static native void nativeEnableEncodedDataCallback(boolean z);

    public static native void nativeEnableEncodedDataPackWithTRAEHeaderCallback(boolean z);

    public static native void nativeEnableMixMode(boolean z);

    public static native void nativeForceCallbackMixedPlayAudioFrame(boolean z);

    public static native int nativeGetEncoderChannels();

    public static native TXCAudioEncoderConfig nativeGetEncoderConfig();

    public static native int nativeGetEncoderSampleRate();

    public static native int nativeGetMixingPlayoutVolumeLevel();

    public static native int nativeGetRemotePlayoutVolumeLevel(String str);

    public static native int nativeGetSoftwareCaptureVolumeLevel();

    public static native StatusBucket nativeGetStatus(int i);

    public static native void nativeInitAudioDevice();

    public static native void nativeInitBeforeEngineCreate(Context context);

    public static native boolean nativeIsAudioDeviceCapturing();

    public static native boolean nativeIsAudioDevicePlaying();

    public static native boolean nativeIsRemoteAudioPlaying(String str);

    public static native void nativeMuteLocalAudio(boolean z);

    public static native void nativeMuteRemoteAudio(String str, boolean z);

    public static native void nativeMuteRemoteAudioInSpeaker(String str, boolean z);

    public static native void nativeNewAudioSessionDuplicate(Context context);

    public static native void nativeNotifySystemEarMonitoringInitializing();

    public static native void nativePauseAudioCapture(boolean z);

    public static native void nativePauseLocalAudio();

    public static native void nativeResumeAudioCapture();

    public static native void nativeResumeLocalAudio();

    public static native void nativeSendCustomPCMData(byte[] bArr, int i, long j, int i2, int i3);

    public static native void nativeSetAudioEarMonitoringVolume(int i);

    public static native void nativeSetAudioEncoderParam(int i, int i2);

    public static native void nativeSetAudioEngineCaptureDataCallback(boolean z);

    public static native void nativeSetAudioEngineCaptureRawDataCallback(boolean z);

    public static native void nativeSetAudioEngineEncodedDataCallback(boolean z);

    public static native void nativeSetAudioEngineRemoteStreamDataListener(String str, boolean z);

    public static native void nativeSetAudioPlayoutTunnelEnabled(boolean z);

    public static native void nativeSetAudioQuality(int i, int i2);

    public static native void nativeSetAudioRoute(int i);

    public static native void nativeSetCaptureDataCallbackFormat(int i, int i2, int i3);

    public static native void nativeSetCaptureVoiceChanger(int i);

    public static native void nativeSetEncoderChannels(int i);

    public static native void nativeSetEncoderFECPercent(float f);

    public static native void nativeSetEncoderSampleRate(int i);

    public static native void nativeSetEventCallbackEnabled(boolean z);

    public static native void nativeSetMaxSelectedPlayStreams(int i);

    public static native void nativeSetMixingPlayoutVolume(float f);

    public static native void nativeSetPlayoutDataCallbackFormat(int i, int i2, int i3);

    public static native void nativeSetPlayoutDataListener(boolean z);

    public static native void nativeSetPlayoutDevice(int i);

    public static native void nativeSetRecordReverb(int i);

    public static native void nativeSetRemoteAudioBlockThreshold(String str, long j);

    public static native void nativeSetRemoteAudioCacheParams(String str, boolean z, int i, int i2, int i3);

    public static native void nativeSetRemoteAudioJitterCycle(String str, long j);

    public static native void nativeSetRemotePlayoutVolume(String str, int i);

    public static native void nativeSetRemoteStreamDataCallbackFormat(String str, int i, int i2, int i3);

    public static native void nativeSetSoftAEC(int i);

    public static native void nativeSetSoftAGC(int i);

    public static native void nativeSetSoftANS(int i);

    public static native void nativeSetSoftwareCaptureVolume(float f);

    public static native void nativeSetSystemEarMonitoring(TXSystemAudioKit tXSystemAudioKit);

    public static native void nativeSetSystemVolumeType(int i);

    public static native void nativeSetTRAEConfig(String str);

    public static native void nativeStartLocalAudio(int i, boolean z);

    public static native int nativeStartLocalAudioDumping(int i, int i2, String str);

    public static native String nativeStartRemoteAudio(TXCAudioEngine tXCAudioEngine, boolean z, String str);

    public static native void nativeStopLocalAudio();

    public static native void nativeStopLocalAudioDumping();

    public static native void nativeStopRemoteAudio(String str);

    public static native void nativeUseSysAudioDevice(boolean z);

    public static void onError(String str, int i, String str2, String str3) {
        TXCAudioEngine.getInstance().onError(str, i, str2, str3);
    }

    public static void onEvent(String str, int i, String str2, String str3) {
        TXCAudioEngine.getInstance().onEvent(str, i, str2, str3);
    }

    public static void onLocalAudioWriteFail() {
        InterfaceC14154a interfaceC14154a = mAudioDumpingListener;
        if (interfaceC14154a != null) {
            interfaceC14154a.onLocalAudioWriteFailed();
        }
    }

    public static void onRecordEncData(byte[] bArr, long j, int i, int i2) {
        WeakReference<InterfaceC14148f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordEncData(bArr, j, i, i2, 16);
    }

    public static void onRecordError(int i, String str) {
        TXCLog.m84149e(TAG, "onRecordError: " + i + ", " + str);
        WeakReference<InterfaceC14148f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordError(i, str);
    }

    public static void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        WeakReference<InterfaceC14148f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordPcmData(bArr, j, i, i2, i3);
    }

    public static void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        WeakReference<InterfaceC14148f> weakReference = mAudioCaptureDataListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mAudioCaptureDataListener.get().onRecordRawPcmData(bArr, j, i, i2, i3, false);
    }

    public static void pauseAudioCapture(boolean z) {
        nativePauseAudioCapture(z);
    }

    public static void resumeAudioCapture() {
        nativeResumeAudioCapture();
    }

    public static void sendCustomPCMData(C14204a c14204a) {
        byte[] bArr = c14204a.f59307f;
        nativeSendCustomPCMData(bArr, bArr.length, c14204a.f59306e, c14204a.f59302a, c14204a.f59303b);
    }

    public static void setAudioCaptureDataListener(WeakReference<InterfaceC14148f> weakReference) {
        mAudioCaptureDataListener = weakReference;
        nativeSetAudioEngineCaptureDataCallback(weakReference != null);
        nativeSetAudioEngineCaptureRawDataCallback(mAudioCaptureDataListener != null);
        nativeSetAudioEngineEncodedDataCallback(mAudioCaptureDataListener != null);
    }

    public static void sendCustomPCMData(byte[] bArr, int i, int i2) {
        nativeSendCustomPCMData(bArr, bArr.length, 0L, i, i2);
    }
}
