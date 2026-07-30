package com.cosmos.photon.baseim.p025im;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.cosmos.mdlog.MDLog;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class IMJConnectionManager implements IConnectionManager {
    private static final String TAG = "IMJConnectionManager";
    private static volatile boolean isSoLoaded = false;
    private static volatile LibraryLoader libraryLoader;
    private boolean isStarted = false;
    private long mNativePtr;

    public interface LibraryLoader {
        void loadLibrary(Context context, String str) throws UnsatisfiedLinkError;
    }

    public IMJConnectionManager(Context context) {
        if (!isSoLoaded) {
            if (libraryLoader != null) {
                try {
                    libraryLoader.loadLibrary(context, "c++_shared");
                    libraryLoader.loadLibrary(context, "coded");
                    libraryLoader.loadLibrary(context, "mdlog");
                    libraryLoader.loadLibrary(context, "cosmos-im");
                    isSoLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    isSoLoaded = false;
                    Log.e(TAG, "error 1", e);
                }
            } else {
                try {
                    System.loadLibrary("c++_shared");
                    System.loadLibrary("coded");
                    System.loadLibrary("mdlog");
                    System.loadLibrary("cosmos-im");
                    isSoLoaded = true;
                } catch (UnsatisfiedLinkError e2) {
                    isSoLoaded = false;
                    Log.e(TAG, "error 2", e2);
                }
            }
        }
        NetUtil.init(context);
        AppEvent.initScreenListener(context);
        this.mNativePtr = nativeCreate();
    }

    private native long nativeCreate();

    private native String nativeGetCFlag(long j);

    private native void nativeNotifySyncMsgSaved(long j, String str, long j2);

    private native void nativeNotifySyncMsgSavedForMap(long j, Map<String, Long> map);

    private native void nativePost(long j, String str);

    private native void nativeRegisterActionHandler(long j, String str, IMessageHandler iMessageHandler);

    private native void nativeRelease(long j);

    private native void nativeRemoveActionHandler(long j, String str);

    private native void nativeRemoveAllActionHandler(long j);

    private native void nativeSend(long j, SendTask sendTask, int i, String str);

    private native void nativeSetAddressProvider(long j, IMJConnectionAddressProvider iMJConnectionAddressProvider);

    private native void nativeSetAuthInfo(long j, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7);

    private native void nativeSetIMJEventListener(long j, IMJEventListener iMJEventListener);

    private native void nativeStartIMJ(long j);

    private native void nativeStopIMJ(long j);

    public static void setLibraryLoader(LibraryLoader libraryLoader2) {
        libraryLoader = libraryLoader2;
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public String getCFlag() {
        return nativeGetCFlag(this.mNativePtr);
    }

    public native void nativeSetTrafficReporter(long j, TrafficReporter trafficReporter);

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void notifySyncMsgSaved(Map<String, Long> map) {
        if (!this.isStarted || map == null || map.size() <= 0) {
            return;
        }
        nativeNotifySyncMsgSavedForMap(this.mNativePtr, map);
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void post(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        nativePost(this.mNativePtr, str);
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void registerActionHandler(String str, IMessageHandler iMessageHandler) {
        if (str == null || iMessageHandler == null) {
            return;
        }
        nativeRegisterActionHandler(this.mNativePtr, str, iMessageHandler);
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void release() {
        MDLog.m7449i(TAG, "connectionManagerNative release");
        this.isStarted = false;
        nativeRelease(this.mNativePtr);
        this.mNativePtr = 0L;
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void removeActionHandler(String str) {
        if (str != null) {
            nativeRemoveActionHandler(this.mNativePtr, str);
        }
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void removeAllActionHandler() {
        nativeRemoveAllActionHandler(this.mNativePtr);
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void send(SendTask sendTask) {
        if (sendTask == null) {
            return;
        }
        if (this.isStarted) {
            nativeSend(this.mNativePtr, sendTask, sendTask.getType(), sendTask.getId());
        } else {
            sendTask.failed();
        }
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void setAddressProvider(IMJConnectionAddressProvider iMJConnectionAddressProvider) {
        if (iMJConnectionAddressProvider != null) {
            nativeSetAddressProvider(this.mNativePtr, iMJConnectionAddressProvider);
        }
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void setAuthInfo(AuthInfo authInfo) {
        if (authInfo != null) {
            nativeSetAuthInfo(this.mNativePtr, authInfo.getUsername(), authInfo.getCflag(), authInfo.getUid(), authInfo.getToken(), authInfo.getAppKey(), authInfo.getCt(), authInfo.getVersion(), authInfo.getExtraData());
        }
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void setIMJEventListener(IMJEventListener iMJEventListener) {
        if (iMJEventListener != null) {
            nativeSetIMJEventListener(this.mNativePtr, iMJEventListener);
        }
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void setTrafficReporter(TrafficReporter trafficReporter) {
        if (trafficReporter != null) {
            nativeSetTrafficReporter(this.mNativePtr, trafficReporter);
        }
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void startIMJ() {
        MDLog.m7449i(TAG, "connectionManagerNative startIMJ");
        this.isStarted = true;
        nativeStartIMJ(this.mNativePtr);
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void stopIMJ() {
        MDLog.m7449i(TAG, "connectionManagerNative stopIMJ");
        this.isStarted = false;
        nativeStopIMJ(this.mNativePtr);
    }

    @Override // com.cosmos.photon.baseim.p025im.IConnectionManager
    public void notifySyncMsgSaved(String str, long j) {
        if (this.isStarted) {
            nativeNotifySyncMsgSaved(this.mNativePtr, str, j);
        }
    }
}
