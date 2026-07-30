package com.p069ss.bytertc.engine;

/* JADX INFO: loaded from: classes13.dex */
public interface IMetadataObserver {
    void onMetadataReceived(byte[] bArr, String str, long j);

    byte[] onReadyToSendMetadata(long j);
}
