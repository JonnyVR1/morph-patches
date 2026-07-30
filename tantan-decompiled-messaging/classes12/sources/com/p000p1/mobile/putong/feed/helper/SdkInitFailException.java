package com.p000p1.mobile.putong.feed.helper;

import com.p000p1.mobile.putong.feed.helper.exception.FeedException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.n500;
import p007l.vb4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SdkInitFailException extends FeedException {
    public SdkInitFailException(String str) {
        super(str);
    }

    public static void reportSdkInitFail() {
        StringBuilder sb = new StringBuilder("CameraSdkHelper.loaded: ");
        sb.append(vb4.m15410i());
        sb.append(",CameraSdkHelper.inited: ");
        sb.append(vb4.f14135b);
        sb.append(",MoMediaManager.mAppId:");
        sb.append(NullChecker.a(n500.a) ? n500.a.a() : "null");
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.c(new SdkInitFailException(sb.toString()));
    }
}
