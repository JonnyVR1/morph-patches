package p149l;

import android.view.View;
import java.nio.ByteBuffer;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudAiAgent;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.core.ISudListenerNotifyStateChange;

/* JADX INFO: loaded from: classes.dex */
public abstract class dmg0 implements ISudFSTAPP {
    @Override // tech.sud.gip.core.ISudFSTAPP
    public boolean destroyMG() {
        return false;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final ISudAiAgent getAiAgent() {
        return null;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public String getGameState(String str) {
        return null;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public View getGameView() {
        return null;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public String getPlayerState(String str, String str2) {
        return null;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void pauseMG() {
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void playMG() {
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void reloadMG() {
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void startMG() {
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void stopMG() {
    }

    /* JADX INFO: renamed from: a */
    public void mo112474a(agg0 agg0Var) {
    }

    /* JADX INFO: renamed from: b */
    public void mo112475b(GameInfo gameInfo, String str) {
    }

    /* JADX INFO: renamed from: c */
    public void mo112476c(GameInfo gameInfo, String str) {
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void pushAudio(ByteBuffer byteBuffer, int i) {
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void updateCode(String str, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public void notifyStateChange(String str, String str2, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
    }
}
