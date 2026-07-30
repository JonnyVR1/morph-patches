package com.tencent.connect;

import android.content.Context;
import com.tencent.connect.auth.C13812c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.IUiListener;

/* JADX INFO: loaded from: classes13.dex */
public class UserInfo extends BaseApi {
    public static final String GRAPH_OPEN_ID = "oauth2.0/m_me";

    public UserInfo(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void getOpenId(IUiListener iUiListener) {
        HttpUtils.requestAsync(this.f57183c, C14390h.m84404a(), GRAPH_OPEN_ID, m82145a(), "GET", new BaseApi.TempRequestListener(iUiListener));
    }

    public void getUserInfo(IUiListener iUiListener) {
        HttpUtils.requestAsync(this.f57183c, C14390h.m84404a(), "user/get_simple_userinfo", m82145a(), "GET", new BaseApi.TempRequestListener(iUiListener));
    }

    public UserInfo(Context context, C13812c c13812c, QQToken qQToken) {
        super(c13812c, qQToken);
    }
}
