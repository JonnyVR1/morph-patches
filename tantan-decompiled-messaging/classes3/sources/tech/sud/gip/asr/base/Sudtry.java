package tech.sud.gip.asr.base;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface Sudtry {
    void handleGameASR(String str);

    void pushAudio(ByteBuffer byteBuffer, int i);

    void stopASR(boolean z);
}
