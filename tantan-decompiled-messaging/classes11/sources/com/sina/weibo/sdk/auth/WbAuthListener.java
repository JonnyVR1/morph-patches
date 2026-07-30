package com.sina.weibo.sdk.auth;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface WbAuthListener {
    void cancel();

    void onFailure(WbConnectErrorMessage wbConnectErrorMessage);

    void onSuccess(Oauth2AccessToken oauth2AccessToken);
}
