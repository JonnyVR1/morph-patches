package tech.sud.gip.core;

import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ISudFSTAPP {
    boolean destroyMG();

    ISudAiAgent getAiAgent();

    @Deprecated
    String getGameState(String str);

    View getGameView();

    @Deprecated
    String getPlayerState(String str, String str2);

    void notifyStateChange(String str, String str2, ISudListenerNotifyStateChange iSudListenerNotifyStateChange);

    void pauseMG();

    void playMG();

    void pushAudio(ByteBuffer byteBuffer, int i);

    void reloadMG();

    void startMG();

    void stopMG();

    void updateCode(String str, ISudListenerNotifyStateChange iSudListenerNotifyStateChange);
}
