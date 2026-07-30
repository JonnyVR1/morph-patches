package com.p074ss.bytertc.engine;

/* JADX INFO: loaded from: classes11.dex */
public interface IMetadataObserver {
    void onMetadataReceived(byte[] bArr, String str, long j);

    byte[] onReadyToSendMetadata(long j);
}
