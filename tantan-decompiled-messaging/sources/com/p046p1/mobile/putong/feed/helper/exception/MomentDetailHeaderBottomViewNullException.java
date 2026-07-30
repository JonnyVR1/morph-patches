package com.p046p1.mobile.putong.feed.helper.exception;

import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailHeaderBottomViewNullException extends FeedException {
    public MomentDetailHeaderBottomViewNullException(String str) {
        super(str);
    }

    public static void reportContentViewNull(Moment moment) {
        StringBuilder sb = new StringBuilder("Moment id: ");
        sb.append(moment == null ? "null" : moment.f56011id);
        sb.append("\nmoment.owner:");
        sb.append(moment != null ? moment.owner : "null");
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.m81296c(new MomentDetailHeaderBottomViewNullException(sb.toString()));
    }
}
