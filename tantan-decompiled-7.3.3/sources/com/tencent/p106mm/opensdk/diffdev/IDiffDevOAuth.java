package com.tencent.p106mm.opensdk.diffdev;

/* JADX INFO: loaded from: classes2.dex */
public interface IDiffDevOAuth {
    void addListener(OAuthListener oAuthListener);

    boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener);

    void detach();

    void removeAllListeners();

    void removeListener(OAuthListener oAuthListener);

    boolean stopAuth();
}
