package com.sina.weibo.sdk.share;

import com.sina.weibo.sdk.api.StoryObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface TransResourceCallback {
    void onTransFinish(StoryObject storyObject);

    void onTransFinish(TransResourceResult transResourceResult);
}
