package com.tencent.liteav.audio.impl.Record;

/* JADX INFO: renamed from: com.tencent.liteav.audio.impl.Record.c */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14153c {
    void onAudioRecordError(int i, String str);

    void onAudioRecordPCM(byte[] bArr, int i, long j);

    void onAudioRecordStart();

    void onAudioRecordStop();
}
