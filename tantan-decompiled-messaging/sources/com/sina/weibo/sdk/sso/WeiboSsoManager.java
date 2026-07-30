package com.sina.weibo.sdk.sso;

import android.content.Context;
import android.text.TextUtils;
import com.sina.weibo.sdk.utils.LogUtil;
import com.weibo.ssosdk.InterfaceC14695a;
import com.weibo.ssosdk.WeiboSsoSdk;
import p149l.lnp0;
import p149l.u100;

/* JADX INFO: loaded from: classes11.dex */
public final class WeiboSsoManager {
    private static final String TAG = "WeiboSsoManager";
    private String aid;

    public static class Instance {
        private static final WeiboSsoManager instance = new WeiboSsoManager();

        private Instance() {
        }
    }

    public static synchronized WeiboSsoManager getInstance() {
        return Instance.instance;
    }

    private void initAid() {
        try {
            WeiboSsoSdk.m85254i().m85258m(new InterfaceC14695a() { // from class: com.sina.weibo.sdk.sso.WeiboSsoManager.1
                @Override // com.weibo.ssosdk.InterfaceC14695a
                public void handler(WeiboSsoSdk.C14694d c14694d) {
                    if (c14694d == null) {
                        LogUtil.m80478d(WeiboSsoManager.TAG, "VisitorLoginInfo is null.");
                    } else {
                        WeiboSsoManager.this.aid = c14694d.m85260a();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.m80479e(TAG, e.getMessage());
        }
    }

    public String getAid(Context context, String str) {
        LogUtil.m80478d(TAG, "getAid()");
        if (TextUtils.isEmpty(this.aid)) {
            init(context, str);
        }
        return this.aid;
    }

    public String getMfp(Context context) {
        return u100.m191382n(context);
    }

    public void init(Context context, String str) {
        LogUtil.m80478d(TAG, "init config");
        lnp0 lnp0Var = new lnp0();
        lnp0Var.m150702m(context);
        lnp0Var.m150701l(str);
        lnp0Var.m150703n("1478195010");
        lnp0Var.m150704o("1000_0001");
        WeiboSsoSdk.m85255j(lnp0Var);
        initAid();
    }

    private WeiboSsoManager() {
    }
}
