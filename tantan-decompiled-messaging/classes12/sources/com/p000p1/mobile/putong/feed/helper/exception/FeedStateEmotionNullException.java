package com.p000p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateEmotionNullException extends FeedException {
    public FeedStateEmotionNullException(String str) {
        super(str);
    }

    public static void reportFeedStateEmotionNullException(String str, Boolean bool) {
        CrashHelper.c(new FeedStateEmotionNullException("FollowConfigsUtils stateEmotionListData json is \n" + str + "\nlistIsNull: " + bool + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
