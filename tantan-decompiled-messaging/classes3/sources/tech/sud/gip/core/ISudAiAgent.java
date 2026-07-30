package tech.sud.gip.core;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ISudAiAgent {
    void pauseAudio();

    void pushAudio(ByteBuffer byteBuffer, int i);

    void sendText(String str);

    void setISudListenerAiAgent(ISudListenerAiAgent iSudListenerAiAgent);

    void stopAudio();
}
