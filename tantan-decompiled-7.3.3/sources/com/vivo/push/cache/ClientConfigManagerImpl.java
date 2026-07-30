package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.model.C14766a;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.ContextDelegate;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ClientConfigManagerImpl implements InterfaceC14718d {
    private static final String TAG = "ClientConfigManager";
    private static volatile ClientConfigManagerImpl sClientConfigManagerImpl;
    private C14715a mAppConfigSettings;
    private Context mContext;
    private C14719e mPushConfigSettings;

    private ClientConfigManagerImpl(Context context) {
        this.mContext = ContextDelegate.getContext(context);
        this.mAppConfigSettings = new C14715a(this.mContext);
        this.mPushConfigSettings = new C14719e(this.mContext);
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
        C14715a c14715a = this.mAppConfigSettings;
        if (c14715a == null) {
            this.mAppConfigSettings = new C14715a(this.mContext);
        } else {
            c14715a.m85981c();
        }
    }

    private C14719e preparePushConfigSettings() {
        C14719e c14719e = this.mPushConfigSettings;
        if (c14719e == null) {
            this.mPushConfigSettings = new C14719e(this.mContext);
        } else {
            c14719e.m85981c();
        }
        return this.mPushConfigSettings;
    }

    public void clearPush() {
        this.mAppConfigSettings.m85982d();
    }

    public Set<String> getBlackEventList() {
        return null;
    }

    public String getSuitTag() {
        return preparePushConfigSettings().m85985c("CSPT");
    }

    public String getValueByKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mPushConfigSettings.m85981c();
        return this.mPushConfigSettings.m85985c(str);
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
        C14795p.m86192d(TAG, " initWhiteLogList ".concat(String.valueOf(hashSet)));
        return hashSet;
    }

    public boolean isCancleBroadcastReceiver() {
        int i;
        String strM85985c = preparePushConfigSettings().m85985c("PSM");
        if (TextUtils.isEmpty(strM85985c)) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strM85985c);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                i = 0;
            }
        }
        return (i & 4) != 0;
    }

    public boolean isDebug() {
        this.mAppConfigSettings.m85981c();
        return C14715a.m85970a(this.mAppConfigSettings.m85973b());
    }

    public boolean isEnablePush() {
        prepareAppConfig();
        C14766a c14766aM85975c = this.mAppConfigSettings.m85975c(this.mContext.getPackageName());
        if (c14766aM85975c != null) {
            return "1".equals(c14766aM85975c.m86089b());
        }
        return true;
    }

    @Override // com.vivo.push.cache.InterfaceC14718d
    public boolean isInBlackList(long j) {
        String strM85985c = preparePushConfigSettings().m85985c("BL");
        if (!TextUtils.isEmpty(strM85985c)) {
            for (String str : strM85985c.split(Constants.SEPARATOR_COMMA)) {
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
        return C14715a.m85970a(i);
    }
}
