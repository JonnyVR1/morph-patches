package com.tencent.connect;

import android.content.Context;
import android.os.Bundle;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.open.SocialOperation;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.IUiListener;

/* JADX INFO: loaded from: classes13.dex */
public class UnionInfo extends BaseApi {
    public static final String URL_GET_UNION_ID = "https://openmobile.qq.com/oauth2.0/me";

    public UnionInfo(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void getUnionId(IUiListener iUiListener) {
        Bundle bundleM82145a = m82145a();
        bundleM82145a.putString(SocialOperation.GAME_UNION_ID, "1");
        HttpUtils.requestAsync(this.f57183c, C14390h.m84404a(), URL_GET_UNION_ID, bundleM82145a, "GET", new BaseApi.TempRequestListener(iUiListener));
    }
}
