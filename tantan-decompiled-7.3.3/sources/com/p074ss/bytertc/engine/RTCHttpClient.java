package com.p074ss.bytertc.engine;

/* JADX INFO: loaded from: classes11.dex */
public interface RTCHttpClient {

    public interface RtcHttpCallback {
        void run(int i, String str);
    }

    void GetAsync(String str, RtcHttpCallback rtcHttpCallback, int i);

    void PostAsync(String str, String str2, RtcHttpCallback rtcHttpCallback, int i);
}
