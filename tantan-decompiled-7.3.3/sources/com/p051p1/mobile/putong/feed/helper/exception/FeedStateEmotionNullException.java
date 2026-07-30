package com.p051p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateEmotionNullException extends FeedException {
    public FeedStateEmotionNullException(String str) {
        super(str);
    }

    public static void reportFeedStateEmotionNullException(String str, Boolean bool) {
        CrashHelper.m82479c(new FeedStateEmotionNullException("FollowConfigsUtils stateEmotionListData json is \n" + str + "\nlistIsNull: " + bool + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
