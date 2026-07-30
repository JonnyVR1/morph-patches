package com.p046p1.mobile.putong.feed.helper;

import com.p046p1.mobile.putong.feed.helper.exception.FeedException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.n500;
import p149l.vb4;

/* JADX INFO: loaded from: classes12.dex */
public class SdkInitFailException extends FeedException {
    public SdkInitFailException(String str) {
        super(str);
    }

    public static void reportSdkInitFail() {
        StringBuilder sb = new StringBuilder("CameraSdkHelper.loaded: ");
        sb.append(vb4.m197675i());
        sb.append(",CameraSdkHelper.inited: ");
        sb.append(vb4.f180804b);
        sb.append(",MoMediaManager.mAppId:");
        sb.append(NullChecker.m81303a(n500.f137181a) ? n500.f137181a.m19608a() : "null");
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.m81296c(new SdkInitFailException(sb.toString()));
    }
}
