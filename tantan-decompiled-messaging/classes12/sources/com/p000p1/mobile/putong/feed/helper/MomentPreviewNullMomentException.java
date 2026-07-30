package com.p000p1.mobile.putong.feed.helper;

import com.p000p1.mobile.putong.feed.helper.exception.FeedException;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentPreviewNullMomentException extends FeedException {
    public MomentPreviewNullMomentException(String str) {
        super(str);
    }

    public static void reportNullMoment(String str, String str2, String str3) {
        CrashHelper.d(new MomentPreviewNullMomentException("Moment id: " + str + " from: " + str2 + " otherId: " + str3 + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())), MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }
}
