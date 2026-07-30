package com.cosmos.photon.baseim.p024im;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes.dex */
public class TaskSender {
    private long nativePtr;

    private TaskSender(long j) {
        MDLog.m7395i("TaskSender", "TaskSender init : " + j);
        this.nativePtr = j;
    }

    private native void nativeSendPacketAsync(long j, byte[] bArr);

    private native IMJPacket nativeSendPacketSync(long j, byte[] bArr);

    public void sendPacketAsync(IPacket iPacket) {
        nativeSendPacketAsync(this.nativePtr, iPacket.getBody());
    }

    public IMJPacket sendPacketSync(IPacket iPacket) {
        return nativeSendPacketSync(this.nativePtr, iPacket.getBody());
    }
}
