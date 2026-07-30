package com.sina.weibo.sdk.web.param;

import android.content.Context;
import android.os.Bundle;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.web.WebRequestType;

/* JADX INFO: loaded from: classes11.dex */
public class AuthWebViewRequestParam extends BaseWebViewRequestParam {
    public AuthWebViewRequestParam() {
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public void childFillBundle(Bundle bundle) {
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public String getRequestUrl() {
        return getBaseData().getUrl();
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public boolean hasExtraTask() {
        return super.hasExtraTask();
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public void transformChildBundle(Bundle bundle) {
    }

    @Override // com.sina.weibo.sdk.web.param.BaseWebViewRequestParam
    public void updateRequestUrl(String str) {
    }

    public AuthWebViewRequestParam(AuthInfo authInfo, WebRequestType webRequestType, String str, String str2, String str3, Context context) {
        super(authInfo, webRequestType, str, str2, str3, context);
    }
}
