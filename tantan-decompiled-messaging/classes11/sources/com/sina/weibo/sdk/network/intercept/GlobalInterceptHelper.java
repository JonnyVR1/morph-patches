package com.sina.weibo.sdk.network.intercept;

import com.sina.weibo.sdk.network.IRequestIntercept;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GlobalInterceptHelper {
    private static GlobalInterceptHelper globalInterceptHelper;
    private HashMap<String, IRequestIntercept> globalIntercept;

    private GlobalInterceptHelper() {
        HashMap<String, IRequestIntercept> map = new HashMap<>();
        this.globalIntercept = map;
        map.put(GuestParamInterception.class.getName(), new GuestParamInterception());
        this.globalIntercept.put(CommonParamInterception.class.getName(), new CommonParamInterception());
    }

    public static GlobalInterceptHelper init() {
        if (globalInterceptHelper == null) {
            globalInterceptHelper = new GlobalInterceptHelper();
        }
        return globalInterceptHelper;
    }

    public void addIntercept(String str, IRequestIntercept iRequestIntercept) {
        this.globalIntercept.put(str, iRequestIntercept);
    }

    public HashMap<String, IRequestIntercept> getGlobalIntercept() {
        HashMap<String, IRequestIntercept> map = this.globalIntercept;
        return map == null ? new HashMap<>() : map;
    }

    public void removeIntercept(String str) {
        if (this.globalIntercept.containsKey(str)) {
            this.globalIntercept.remove(str);
        }
    }
}
