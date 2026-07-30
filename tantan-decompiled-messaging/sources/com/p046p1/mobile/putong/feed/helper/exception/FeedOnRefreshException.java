package com.p046p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class FeedOnRefreshException extends FeedException {
    public FeedOnRefreshException(String str) {
        super(str);
    }

    public static void reportFeedOnRefreshException() {
        CrashHelper.m81297d(new FeedOnRefreshException("ActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())), 100);
    }
}
