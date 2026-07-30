package com.momo.xeengine.somanager;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface IXEngineSOLoader {

    @Keep
    public interface LoaderCallback {
        void onFailed(String str);

        void onProcess(int i, double d);

        void onSuccess();
    }

    boolean checkEngineSO(LoaderCallback loaderCallback);
}
