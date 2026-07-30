package com.sina.weibo.sdk.net;

import com.sina.weibo.sdk.exception.WeiboException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface RequestListener {
    void onComplete(String str);

    void onWeiboException(WeiboException weiboException);
}
