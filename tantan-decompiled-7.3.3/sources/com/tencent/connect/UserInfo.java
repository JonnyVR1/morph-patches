package com.tencent.connect;

import android.content.Context;
import com.tencent.connect.auth.C13975c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.IUiListener;

/* JADX INFO: loaded from: classes12.dex */
public class UserInfo extends BaseApi {
    public static final String GRAPH_OPEN_ID = "oauth2.0/m_me";

    public UserInfo(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void getOpenId(IUiListener iUiListener) {
        HttpUtils.requestAsync(this.f58031c, C14553h.m85587a(), GRAPH_OPEN_ID, m83328a(), "GET", new BaseApi.TempRequestListener(iUiListener));
    }

    public void getUserInfo(IUiListener iUiListener) {
        HttpUtils.requestAsync(this.f58031c, C14553h.m85587a(), "user/get_simple_userinfo", m83328a(), "GET", new BaseApi.TempRequestListener(iUiListener));
    }

    public UserInfo(Context context, C13975c c13975c, QQToken qQToken) {
        super(c13975c, qQToken);
    }
}
