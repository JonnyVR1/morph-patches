package com.momo.xeengine.somanager;

import android.content.res.AssetManager;
import androidx.annotation.Keep;
import com.momo.xeengine.XELogger;
import com.momo.xeengine.XEnginePreferences;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class XEngineSOManager {
    private static IXEngineSOLoader engineSOLoader = null;
    private static boolean isEngineSOLoaded = false;

    public static boolean check(IXEngineSOLoader.LoaderCallback loaderCallback) {
        if (loadEngineSO()) {
            return true;
        }
        IXEngineSOLoader iXEngineSOLoader = engineSOLoader;
        if (iXEngineSOLoader != null) {
            return iXEngineSOLoader.checkEngineSO(loaderCallback);
        }
        loaderCallback.onFailed("native lib load failed");
        return false;
    }

    private static native void engineNativeInit(AssetManager assetManager);

    public static synchronized boolean loadEngineSO() {
        if (isEngineSOLoaded) {
            return true;
        }
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("cvcontainer");
            System.loadLibrary("xeengine");
            engineNativeInit(XEnginePreferences.getContext().getAssets());
            isEngineSOLoaded = true;
        } catch (Throwable th) {
            XELogger.m21225e("引擎SO加载失败:" + th);
        }
        return isEngineSOLoaded;
    }

    public static void setEngineSOLoader(IXEngineSOLoader iXEngineSOLoader) {
        engineSOLoader = iXEngineSOLoader;
    }
}
