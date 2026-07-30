package com.p046p1.mobile.putong.feed.helper;

import com.p046p1.mobile.putong.feed.helper.exception.FeedException;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class MomentPreviewNullMomentException extends FeedException {
    public MomentPreviewNullMomentException(String str) {
        super(str);
    }

    public static void reportNullMoment(String str, String str2, String str3) {
        CrashHelper.m81297d(new MomentPreviewNullMomentException("Moment id: " + str + " from: " + str2 + " otherId: " + str3 + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())), 1000);
    }
}
