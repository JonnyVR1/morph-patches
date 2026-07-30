package com.p051p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAdapterTypeErrorException extends FeedException {
    public FeedAdapterTypeErrorException(String str) {
        super(str);
    }

    public static void reportFeedAdapterTypeErrorException(String str) {
        CrashHelper.m82480d(new FeedAdapterTypeErrorException("msg: " + str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())), 10);
    }
}
