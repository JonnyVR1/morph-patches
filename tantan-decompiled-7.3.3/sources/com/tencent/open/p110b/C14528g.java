package com.tencent.open.p110b;

import android.content.Context;
import com.tencent.open.utils.C14553h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.open.b.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14528g {
    /* JADX INFO: renamed from: a */
    public static void m85455a() {
        Context contextM85587a = C14553h.m85587a();
        if (contextM85587a == null) {
            return;
        }
        contextM85587a.deleteDatabase("sdk_report.db");
    }

    /* JADX INFO: renamed from: b */
    public static List<Serializable> m85458b(String str) {
        return Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    public static void m85457a(String str, List<Serializable> list) {
    }

    /* JADX INFO: renamed from: a */
    public static void m85456a(String str) {
    }
}
