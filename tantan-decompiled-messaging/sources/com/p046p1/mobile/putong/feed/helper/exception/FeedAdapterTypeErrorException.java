package com.p046p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAdapterTypeErrorException extends FeedException {
    public FeedAdapterTypeErrorException(String str) {
        super(str);
    }

    public static void reportFeedAdapterTypeErrorException(String str) {
        CrashHelper.m81297d(new FeedAdapterTypeErrorException("msg: " + str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())), 10);
    }
}
