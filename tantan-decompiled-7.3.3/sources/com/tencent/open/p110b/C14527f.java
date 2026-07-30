package com.tencent.open.p110b;

import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14555j;

/* JADX INFO: renamed from: com.tencent.open.b.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14527f {
    /* JADX INFO: renamed from: a */
    public static int m85454a(String str) {
        int iM85607a;
        if (C14553h.m85587a() == null || (iM85607a = C14555j.m85598a(C14553h.m85587a(), str).m85607a("Common_BusinessReportFrequency")) == 0) {
            return 100;
        }
        return iM85607a;
    }

    /* JADX INFO: renamed from: a */
    public static int m85453a() {
        int iM85607a = C14555j.m85598a(C14553h.m85587a(), (String) null).m85607a("Common_HttpRetryCount");
        if (iM85607a == 0) {
            return 2;
        }
        return iM85607a;
    }
}
