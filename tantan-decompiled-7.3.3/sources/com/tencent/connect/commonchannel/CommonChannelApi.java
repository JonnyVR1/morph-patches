package com.tencent.connect.commonchannel;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.connect.C13965a;
import com.tencent.connect.auth.C13975c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.utils.C14559n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

/* JADX INFO: loaded from: classes12.dex */
public class CommonChannelApi extends BaseApi {
    public static final String SCHEME_HEADER = "mqqapi://open_connect/common_channel";

    public CommonChannelApi(C13975c c13975c, QQToken qQToken) {
        super(c13975c, qQToken);
    }

    /* JADX INFO: renamed from: a */
    private boolean m83343a(Bundle bundle) {
        return bundle != null && bundle.containsKey(Constants.PARAM_SRC_ID) && bundle.containsKey(Constants.PARAM_EXT_DATA);
    }

    public int launchQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (iUiListener == null) {
            return -5;
        }
        if (C13965a.m83167a("UniversalApi", iUiListener)) {
            return -6;
        }
        if (!m83343a(bundle)) {
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, Constants.MSG_PARAM_ERROR));
            return -5;
        }
        StringBuilder sb = new StringBuilder(SCHEME_HEADER);
        m83335a(sb, activity);
        String string = bundle.getString(Constants.PARAM_EXT_DATA);
        m83336a(sb, "exsvr_userinfo", C14559n.m85694k(string));
        m83336a(sb, Constants.PARAM_EXT_DATA, C14559n.m85694k(string));
        m83336a(sb, Constants.PARAM_SRC_ID, String.valueOf(bundle.getInt(Constants.PARAM_SRC_ID, 0)));
        Intent intent = new Intent();
        intent.setData(Uri.parse(sb.toString()));
        intent.setPackage("com.tencent.mobileqq");
        intent.putExtra(Constants.FOR_RESULT, true);
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setFlags(335544320);
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_COMMON_CHANNEL, iUiListener);
        m83330a(activity, Constants.REQUEST_COMMON_CHANNEL, intent, false);
        return 0;
    }

    public CommonChannelApi(QQToken qQToken) {
        super(qQToken);
    }
}
