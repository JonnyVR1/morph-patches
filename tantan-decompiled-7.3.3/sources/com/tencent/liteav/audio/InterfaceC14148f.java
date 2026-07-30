package com.tencent.liteav.audio;

/* JADX INFO: renamed from: com.tencent.liteav.audio.f */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14148f {
    void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3);

    void onRecordError(int i, String str);

    void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3);

    void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z);
}
