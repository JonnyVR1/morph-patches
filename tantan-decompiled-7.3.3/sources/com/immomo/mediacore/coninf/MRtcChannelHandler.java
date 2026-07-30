package com.immomo.mediacore.coninf;

/* JADX INFO: loaded from: classes7.dex */
public interface MRtcChannelHandler {
    void onRequestChannelKey();

    void onStreamMessage(int i, int i2, byte[] bArr);

    void onStreamMessageError(int i, int i2, int i3, int i4, int i5);
}
