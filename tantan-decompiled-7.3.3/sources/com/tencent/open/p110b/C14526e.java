package com.tencent.open.p110b;

import com.tencent.open.utils.C14559n;

/* JADX INFO: renamed from: com.tencent.open.b.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14526e {

    /* JADX INFO: renamed from: a */
    protected static C14526e f61062a;

    /* JADX INFO: renamed from: a */
    public void m85451a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C14529h.m85459a().m85461a(C14559n.m85651a(str, str4, str5, str3, str2, str6, "", str7, str8, "", "", ""), str2, false);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14526e m85448a() {
        try {
            if (f61062a == null) {
                f61062a = new C14526e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61062a;
    }

    /* JADX INFO: renamed from: a */
    public void m85450a(String str, String str2, String str3, String str4, String str5, String str6) {
        C14529h.m85459a().m85461a(C14559n.m85649a(str, str3, str4, str5, str2, str6), str2, true);
    }

    /* JADX INFO: renamed from: a */
    public void m85449a(int i, String str, String str2, String str3, String str4, Long l2, int i2, int i3, String str5) {
    }

    /* JADX INFO: renamed from: a */
    public void m85452a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C14529h.m85459a().m85461a(C14559n.m85651a(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }
}
