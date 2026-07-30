package com.p046p1.mobile.putong.feed.helper;

import com.p046p1.mobile.putong.feed.helper.exception.FeedException;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class MomentUserNullException extends FeedException {
    public MomentUserNullException(String str) {
        super(str);
    }

    public static void reportNulAlllUserMoment(String str, String str2) {
        CrashHelper.m81297d(new MomentUserNullException("All user is Null and the request user id is: " + str + "\nurl:" + str2 + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())), 100);
    }

    public static void reportNullUserMoment(String str, String str2, String str3) {
        CrashHelper.m81296c(new MomentUserNullException("Moment id: " + str + "User id: " + str2 + "Url: " + str3 + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }

    public static void reportNullUserMoment(String str) {
        CrashHelper.m81296c(new MomentUserNullException("User id: " + str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
