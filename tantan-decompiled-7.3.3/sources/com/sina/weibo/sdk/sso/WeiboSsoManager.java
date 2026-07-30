package com.sina.weibo.sdk.sso;

import android.content.Context;
import android.text.TextUtils;
import com.sina.weibo.sdk.utils.LogUtil;
import com.weibo.ssosdk.InterfaceC14843a;
import com.weibo.ssosdk.WeiboSsoSdk;
import p153l.pwp0;
import p153l.ra00;

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
            WeiboSsoSdk.m86425i().m86429m(new InterfaceC14843a() { // from class: com.sina.weibo.sdk.sso.WeiboSsoManager.1
                @Override // com.weibo.ssosdk.InterfaceC14843a
                public void handler(WeiboSsoSdk.C14842d c14842d) {
                    if (c14842d == null) {
                        LogUtil.m81661d(WeiboSsoManager.TAG, "VisitorLoginInfo is null.");
                    } else {
                        WeiboSsoManager.this.aid = c14842d.m86431a();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.m81662e(TAG, e.getMessage());
        }
    }

    public String getAid(Context context, String str) {
        LogUtil.m81661d(TAG, "getAid()");
        if (TextUtils.isEmpty(this.aid)) {
            init(context, str);
        }
        return this.aid;
    }

    public String getMfp(Context context) {
        return ra00.m180677n(context);
    }

    public void init(Context context, String str) {
        LogUtil.m81661d(TAG, "init config");
        pwp0 pwp0Var = new pwp0();
        pwp0Var.m174070m(context);
        pwp0Var.m174069l(str);
        pwp0Var.m174071n("1478195010");
        pwp0Var.m174072o("1000_0001");
        WeiboSsoSdk.m86426j(pwp0Var);
        initAid();
    }

    private WeiboSsoManager() {
    }
}
