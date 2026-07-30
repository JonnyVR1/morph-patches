package com.momo.xeengine.script;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface ScriptBridge {

    public interface Callback {
        void call(String str);
    }

    void add(Object obj, String str);

    String call(String str, String str2, String str3);

    @Deprecated
    void regist(Object obj, String str);

    void remove(String str);

    void removeAll();

    @Deprecated
    void unregist(String str);

    @Deprecated
    void unregistAll();
}
