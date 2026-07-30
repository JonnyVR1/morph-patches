package com.sina.weibo.sdk.net;

import com.sina.weibo.sdk.exception.WeiboException;

/* JADX INFO: loaded from: classes11.dex */
public interface RequestListener {
    void onComplete(String str);

    void onWeiboException(WeiboException weiboException);
}
