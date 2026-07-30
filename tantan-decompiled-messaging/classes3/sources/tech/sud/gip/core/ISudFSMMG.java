package tech.sud.gip.core;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ISudFSMMG {
    void onExpireCode(ISudFSMStateHandle iSudFSMStateHandle, String str);

    void onGameDestroyed();

    void onGameLoadingProgress(int i, int i2, int i3);

    void onGameLog(String str);

    void onGameStarted();

    void onGameStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2);

    void onGetGameCfg(ISudFSMStateHandle iSudFSMStateHandle, String str);

    void onGetGameViewInfo(ISudFSMStateHandle iSudFSMStateHandle, String str);

    void onPlayerStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2, String str3);
}
