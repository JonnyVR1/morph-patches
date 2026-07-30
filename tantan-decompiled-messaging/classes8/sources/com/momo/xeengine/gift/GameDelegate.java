package com.momo.xeengine.gift;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
interface GameDelegate {
    public static final String BRIDGE_NAME = "GameDelegate";

    String getGameExtendParams(String str);

    void onGameError(String str);

    void onGameFinished(String str);

    String onGotoEvent(String str);

    void onReceivedEvent(String str);

    String onVideoProgress(String str);

    String onVideoStart(String str);

    String onVideoStop(String str);

    String setValidTouchAreas(String str);
}
