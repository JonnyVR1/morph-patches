package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.MessageType;
import java.util.Collections;
import java.util.Date;
import p153l.aqq;
import p153l.lf2;
import p153l.lkq;
import p153l.qu2;

/* JADX INFO: loaded from: classes10.dex */
public class FeedBackBridgeImplementation extends lf2 {
    @lkq(key = "monitorContent")
    public void monitorContent(@NonNull aqq aqqVar, String str, String str2, String str3) {
        qu2.m178105E(Collections.singletonList(new Date()), MessageType.feedback, 0L, null);
    }

    @lkq(key = "monitor")
    public void monitor(@NonNull aqq aqqVar, String str, String str2) {
    }
}
