package com.tencent.open.p105b;

import android.content.Context;
import com.tencent.open.utils.C14390h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.open.b.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14365g {
    /* JADX INFO: renamed from: a */
    public static void m84272a() {
        Context contextM84404a = C14390h.m84404a();
        if (contextM84404a == null) {
            return;
        }
        contextM84404a.deleteDatabase("sdk_report.db");
    }

    /* JADX INFO: renamed from: b */
    public static List<Serializable> m84275b(String str) {
        return Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    public static void m84274a(String str, List<Serializable> list) {
    }

    /* JADX INFO: renamed from: a */
    public static void m84273a(String str) {
    }
}
