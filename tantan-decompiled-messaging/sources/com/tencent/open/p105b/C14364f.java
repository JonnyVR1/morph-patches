package com.tencent.open.p105b;

import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14392j;

/* JADX INFO: renamed from: com.tencent.open.b.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14364f {
    /* JADX INFO: renamed from: a */
    public static int m84271a(String str) {
        int iM84424a;
        if (C14390h.m84404a() == null || (iM84424a = C14392j.m84415a(C14390h.m84404a(), str).m84424a("Common_BusinessReportFrequency")) == 0) {
            return 100;
        }
        return iM84424a;
    }

    /* JADX INFO: renamed from: a */
    public static int m84270a() {
        int iM84424a = C14392j.m84415a(C14390h.m84404a(), (String) null).m84424a("Common_HttpRetryCount");
        if (iM84424a == 0) {
            return 2;
        }
        return iM84424a;
    }
}
