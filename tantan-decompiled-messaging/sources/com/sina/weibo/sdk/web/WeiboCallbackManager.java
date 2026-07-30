package com.sina.weibo.sdk.web;

import android.text.TextUtils;
import com.sina.weibo.sdk.auth.WbAuthListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class WeiboCallbackManager {
    private static WeiboCallbackManager sInstance;
    private Map<String, WbAuthListener> mWeiboAuthListenerMap = new HashMap();

    private WeiboCallbackManager() {
    }

    public static synchronized WeiboCallbackManager getInstance() {
        try {
            if (sInstance == null) {
                sInstance = new WeiboCallbackManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    public String genCallbackKey() {
        return String.valueOf(System.currentTimeMillis());
    }

    public synchronized WbAuthListener getWeiboAuthListener(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mWeiboAuthListenerMap.get(str);
    }

    public synchronized void removeWeiboAuthListener(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mWeiboAuthListenerMap.remove(str);
    }

    public synchronized void setWeiboAuthListener(String str, WbAuthListener wbAuthListener) {
        if (!TextUtils.isEmpty(str) && wbAuthListener != null) {
            this.mWeiboAuthListenerMap.put(str, wbAuthListener);
        }
    }
}
