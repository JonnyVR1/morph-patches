package com.sina.weibo.sdk.sso;

import android.content.Context;
import android.text.TextUtils;
import com.sina.weibo.sdk.utils.LogUtil;
import com.weibo.ssosdk.WeiboSsoSdk;
import com.weibo.ssosdk.a;
import l.lnp0;
import l.u100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
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
            WeiboSsoSdk.i().m(new a() { // from class: com.sina.weibo.sdk.sso.WeiboSsoManager.1
                public void handler(WeiboSsoSdk.d dVar) {
                    if (dVar == null) {
                        LogUtil.m10829d(WeiboSsoManager.TAG, "VisitorLoginInfo is null.");
                    } else {
                        WeiboSsoManager.this.aid = dVar.a();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.m10830e(TAG, e.getMessage());
        }
    }

    public String getAid(Context context, String str) {
        LogUtil.m10829d(TAG, "getAid()");
        if (TextUtils.isEmpty(this.aid)) {
            init(context, str);
        }
        return this.aid;
    }

    public String getMfp(Context context) {
        return u100.n(context);
    }

    public void init(Context context, String str) {
        LogUtil.m10829d(TAG, "init config");
        lnp0 lnp0Var = new lnp0();
        lnp0Var.m(context);
        lnp0Var.l(str);
        lnp0Var.n("1478195010");
        lnp0Var.o("1000_0001");
        WeiboSsoSdk.j(lnp0Var);
        initAid();
    }

    private WeiboSsoManager() {
    }
}
