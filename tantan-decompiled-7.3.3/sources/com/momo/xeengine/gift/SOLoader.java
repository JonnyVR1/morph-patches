package com.momo.xeengine.gift;

import com.momo.xeengine.somanager.XEngineSOManager;

/* JADX INFO: loaded from: classes8.dex */
class SOLoader {
    static boolean SUCCESS = false;

    public static synchronized boolean load() {
        if (!SUCCESS) {
            try {
                XEngineSOManager.loadEngineSO();
                System.loadLibrary("xmedia");
                System.loadLibrary("xegiftplayer");
                SUCCESS = true;
            } catch (Throwable unused) {
            }
        }
        return SUCCESS;
    }
}
