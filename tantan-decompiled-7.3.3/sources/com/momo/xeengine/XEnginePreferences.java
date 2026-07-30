package com.momo.xeengine;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.momo.xeengine.somanager.XEngineSOManager;
import com.momo.xeengine.xnative.XEnginePreferencesNative;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class XEnginePreferences extends XEnginePreferencesNative {
    private static String APP_ID = null;
    private static String APP_KEY = null;
    public static final long ARCHIVE_TIME = 1774582256;
    private static String DEFAULT_FONT_PATH = null;
    private static boolean IS_INTERNATIONAL = false;
    public static final String VERSION = "5.0.7";
    public static final int VERSION_NUM = 507;
    private static AnalyticsCallback analyticsCallback;
    private static ClientInfoProvider clientInfoProvider;

    @SuppressLint({"StaticFieldLeak"})
    private static Context sContext;

    private XEnginePreferences() {
        throw new RuntimeException("Stub!");
    }

    public static void AddEngineModule(IXEngineModule iXEngineModule) {
        XEngineModuleManager.AddEngineModule(iXEngineModule);
    }

    public static void checkEngineEnv() throws XEngineException {
        if (sContext == null) {
            throw new XEngineException(XEngineException.CONTEXT_NOT_SET);
        }
        try {
            if (!XEngineSOManager.loadEngineSO()) {
                throw new XEngineException(XEngineException.LIBRARY_LOAD_ERROR);
            }
            try {
                if (ARCHIVE_TIME == XEnginePreferencesNative.getEngineSoArchiveTime()) {
                } else {
                    throw new XEngineException(XEngineException.LIBRARY_VERSION_ERROR);
                }
            } catch (Throwable unused) {
                throw new XEngineException(XEngineException.LIBRARY_VERSION_ERROR);
            }
        } catch (Throwable unused2) {
            throw new XEngineException(XEngineException.LIBRARY_LOAD_ERROR);
        }
    }

    public static AnalyticsCallback getAnalyticsCallback() {
        return analyticsCallback;
    }

    public static String getAppId() {
        return APP_ID;
    }

    public static String getAppKey() {
        return APP_KEY;
    }

    public static ClientInfoProvider getClientInfoProvider() {
        return clientInfoProvider;
    }

    public static Context getContext() {
        return sContext;
    }

    public static String getDefaultFontPath() {
        return DEFAULT_FONT_PATH;
    }

    public static void initSDK(Context context, @Nullable String str, @Nullable String str2, boolean z) {
        setApplicationContext(context);
        APP_ID = str;
        APP_KEY = str2;
        IS_INTERNATIONAL = z;
    }

    public static boolean isInternational() {
        return IS_INTERNATIONAL;
    }

    public static void setAnalyticsCallback(AnalyticsCallback analyticsCallback2) {
        analyticsCallback = analyticsCallback2;
    }

    public static void setApplicationContext(Context context) {
        if (sContext != null || context == null) {
            return;
        }
        sContext = context.getApplicationContext();
    }

    public static void setClientInfoProvider(ClientInfoProvider clientInfoProvider2) {
        clientInfoProvider = clientInfoProvider2;
    }

    public static void setDefaultFontPath(String str) {
        DEFAULT_FONT_PATH = str;
    }
}
