package com.immomo.mmdns;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class DNSManager {
    private static Map<String, MDDNSEntrance> entranceMap = new HashMap(2);

    public static synchronized void destroy(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new RuntimeException("please call destory in main thread");
        }
        MDDNSEntrance mDDNSEntranceRemove = entranceMap.remove(str);
        if (mDDNSEntranceRemove != null) {
            mDDNSEntranceRemove.destroy();
        }
    }

    public static synchronized MDDNSEntrance getInstance(String str) {
        if (!entranceMap.containsKey(str)) {
            throw new RuntimeException("please call DNSManager#init first");
        }
        return entranceMap.get(str);
    }

    public static synchronized void init(Context context, IMDDNSConfig iMDDNSConfig, String str) {
        try {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new RuntimeException("please call init in main thread");
            }
            if (TextUtils.isEmpty(iMDDNSConfig.getAppId())) {
                throw new RuntimeException("please fill your appId in IMDDNSConfig imp");
            }
            NetUtil.init(context);
            MDDNSEntrance mDDNSEntrance = new MDDNSEntrance();
            if (TextUtils.isEmpty(str)) {
                str = DNSUtils.getCurrentProcessName(context);
            }
            mDDNSEntrance.initDNSConfig(context, iMDDNSConfig, iMDDNSConfig.getAppId() + "-" + str);
            mDDNSEntrance.openAll(true);
            entranceMap.put(iMDDNSConfig.getAppId(), mDDNSEntrance);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setLibraryLoader(MDDNSEntrance.LibraryLoader libraryLoader) {
        MDDNSEntrance.setLibraryLoader(libraryLoader);
    }

    public static void setWebConfig(WebConfig webConfig) {
        webConfig.getClass();
        WebDNSHandler.webConfig = webConfig;
    }

    public static void init(Context context, IMDDNSConfig iMDDNSConfig) {
        init(context, iMDDNSConfig, null);
    }

    public static void init(IMDDNSConfig iMDDNSConfig, MDDNSEntrance mDDNSEntrance) {
        entranceMap.put(iMDDNSConfig.getAppId(), mDDNSEntrance);
    }
}
