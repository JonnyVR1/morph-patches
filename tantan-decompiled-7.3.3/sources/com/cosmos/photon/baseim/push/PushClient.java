package com.cosmos.photon.baseim.push;

import android.content.Context;
import p153l.ylc0;

/* JADX INFO: loaded from: classes.dex */
public class PushClient {
    private long nativePtr = nativeCreate();

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("coded");
            System.loadLibrary("mdlog");
            System.loadLibrary("protobuf");
            System.loadLibrary("cosmos-im");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            Context context = PushContextHolder.sContext;
            if (context != null) {
                ylc0.m216566a(context, "c++_shared");
                ylc0.m216566a(PushContextHolder.sContext, "coded");
                ylc0.m216566a(PushContextHolder.sContext, "mdlog");
                ylc0.m216566a(PushContextHolder.sContext, "protobuf");
                ylc0.m216566a(PushContextHolder.sContext, "cosmos-im");
            }
        }
    }

    private native void nativeAddPshLtBlackList(long j, String str);

    private native void nativeAuth(long j, String str, String str2, String str3, int i, String str4);

    private native void nativeConnect(long j, String str, int i);

    private native long nativeCreate();

    private native void nativeDisconnect(long j);

    private native void nativeNotifyMessageSaved(long j, String str, long j2);

    private native void nativeRegisterPacketReceiver(long j, int i, PacketReceiver packetReceiver);

    private native void nativeRelease(long j);

    private native void nativeRemoveAllPacketReceiver(long j);

    private native void nativeRemovePacketReceiver(long j, int i);

    private native void nativeRemovePshLtBlackList(long j, String str);

    private native void nativeSendProbePacket(long j);

    private native void nativeSendSyncRequest(long j, String str);

    private native void nativeSetConnectStateChangeListener(long j, ConnectStateChangeListener connectStateChangeListener);

    private native void nativeStartKeepAlive(long j);

    private native void nativeStartSync(long j);

    private native void nativeStopKeepAlive(long j);

    private native void nativeStopSync(long j);

    public void addPshLtBlackList(String str) {
        nativeAddPshLtBlackList(this.nativePtr, str);
    }

    public void auth(PushAuthInfo pushAuthInfo) {
        nativeAuth(this.nativePtr, pushAuthInfo.appId, pushAuthInfo.token, pushAuthInfo.deviceId, pushAuthInfo.version, pushAuthInfo.clientType);
    }

    public void connect(String str, int i) {
        nativeConnect(this.nativePtr, str, i);
    }

    public void disconnect() {
        nativeDisconnect(this.nativePtr);
    }

    public void notifyMessageSaved(String str, long j) {
        nativeNotifyMessageSaved(this.nativePtr, str, j);
    }

    public void registerPacketReceiver(int i, PacketReceiver packetReceiver) {
        if (packetReceiver != null) {
            nativeRegisterPacketReceiver(this.nativePtr, i, packetReceiver);
        }
    }

    public void release() {
        long j = this.nativePtr;
        if (j != 0) {
            nativeRelease(j);
            this.nativePtr = 0L;
        }
    }

    public void removeAllPacketReceiver() {
        nativeRemoveAllPacketReceiver(this.nativePtr);
    }

    public void removePacketReceiver(int i) {
        nativeRemovePacketReceiver(this.nativePtr, i);
    }

    public void removePshLtBlackList(String str) {
        nativeRemovePshLtBlackList(this.nativePtr, str);
    }

    public void sendProbePacket() {
        nativeSendProbePacket(this.nativePtr);
    }

    public void sendSyncRequest(String str) {
        nativeSendSyncRequest(this.nativePtr, str);
    }

    public void setConnectStateChangeListener(ConnectStateChangeListener connectStateChangeListener) {
        nativeSetConnectStateChangeListener(this.nativePtr, connectStateChangeListener);
    }

    public void startKeepAlive() {
        nativeStartKeepAlive(this.nativePtr);
    }

    public void startSync() {
        nativeStartSync(this.nativePtr);
    }

    public void stopKeepAlive() {
        nativeStopKeepAlive(this.nativePtr);
    }

    public void stopSync() {
        nativeStopSync(this.nativePtr);
    }
}
