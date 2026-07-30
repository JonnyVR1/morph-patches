package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.MessageType;
import java.util.Collections;
import java.util.Date;
import p149l.au2;
import p149l.boq;
import p149l.ef2;
import p149l.liq;

/* JADX INFO: loaded from: classes11.dex */
public class FeedBackBridgeImplementation extends ef2 {
    @liq(key = "monitorContent")
    public void monitorContent(@NonNull boq boqVar, String str, String str2, String str3) {
        au2.m98912E(Collections.singletonList(new Date()), MessageType.feedback, 0L, null);
    }

    @liq(key = "monitor")
    public void monitor(@NonNull boq boqVar, String str, String str2) {
    }
}
