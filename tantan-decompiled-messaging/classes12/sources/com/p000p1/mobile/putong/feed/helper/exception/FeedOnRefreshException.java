package com.p000p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedOnRefreshException extends FeedException {
    public FeedOnRefreshException(String str) {
        super(str);
    }

    public static void reportFeedOnRefreshException() {
        CrashHelper.d(new FeedOnRefreshException("ActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())), 100);
    }
}
