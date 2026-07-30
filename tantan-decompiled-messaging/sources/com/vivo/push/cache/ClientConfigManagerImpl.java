package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.model.C14618a;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.ContextDelegate;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ClientConfigManagerImpl implements InterfaceC14570d {
    private static final String TAG = "ClientConfigManager";
    private static volatile ClientConfigManagerImpl sClientConfigManagerImpl;
    private C14567a mAppConfigSettings;
    private Context mContext;
    private C14571e mPushConfigSettings;

    private ClientConfigManagerImpl(Context context) {
        this.mContext = ContextDelegate.getContext(context);
        this.mAppConfigSettings = new C14567a(this.mContext);
        this.mPushConfigSettings = new C14571e(this.mContext);
    }

    public static synchronized ClientConfigManagerImpl getInstance(Context context) {
        try {
            if (sClientConfigManagerImpl == null) {
                sClientConfigManagerImpl = new ClientConfigManagerImpl(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sClientConfigManagerImpl;
    }

    private void prepareAppConfig() {
        C14567a c14567a = this.mAppConfigSettings;
        if (c14567a == null) {
            this.mAppConfigSettings = new C14567a(this.mContext);
        } else {
            c14567a.m84810c();
        }
    }

    private C14571e preparePushConfigSettings() {
        C14571e c14571e = this.mPushConfigSettings;
        if (c14571e == null) {
            this.mPushConfigSettings = new C14571e(this.mContext);
        } else {
            c14571e.m84810c();
        }
        return this.mPushConfigSettings;
    }

    public void clearPush() {
        this.mAppConfigSettings.m84811d();
    }

    public Set<String> getBlackEventList() {
        return null;
    }

    public String getSuitTag() {
        return preparePushConfigSettings().m84814c("CSPT");
    }

    public String getValueByKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mPushConfigSettings.m84810c();
        return this.mPushConfigSettings.m84814c(str);
    }

    public Set<Long> getWhiteLogList() {
        HashSet hashSet = new HashSet();
        String valueByKey = getValueByKey("WLL");
        if (!TextUtils.isEmpty(valueByKey)) {
            for (String str : valueByKey.split(Constants.SEPARATOR_COMMA)) {
                try {
                    hashSet.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        C14647p.m85021d(TAG, " initWhiteLogList ".concat(String.valueOf(hashSet)));
        return hashSet;
    }

    public boolean isCancleBroadcastReceiver() {
        int i;
        String strM84814c = preparePushConfigSettings().m84814c("PSM");
        if (TextUtils.isEmpty(strM84814c)) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strM84814c);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                i = 0;
            }
        }
        return (i & 4) != 0;
    }

    public boolean isDebug() {
        this.mAppConfigSettings.m84810c();
        return C14567a.m84799a(this.mAppConfigSettings.m84802b());
    }

    public boolean isEnablePush() {
        prepareAppConfig();
        C14618a c14618aM84804c = this.mAppConfigSettings.m84804c(this.mContext.getPackageName());
        if (c14618aM84804c != null) {
            return "1".equals(c14618aM84804c.m84918b());
        }
        return true;
    }

    @Override // com.vivo.push.cache.InterfaceC14570d
    public boolean isInBlackList(long j) {
        String strM84814c = preparePushConfigSettings().m84814c("BL");
        if (!TextUtils.isEmpty(strM84814c)) {
            for (String str : strM84814c.split(Constants.SEPARATOR_COMMA)) {
                try {
                    if (!TextUtils.isEmpty(str) && Long.parseLong(str) == j) {
                        return true;
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean isDebug(int i) {
        return C14567a.m84799a(i);
    }
}
