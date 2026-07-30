package com.cmic.sso.sdk.p017c.p020c;

import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p017c.p019b.AbstractC1365a;
import com.cmic.sso.sdk.p017c.p019b.C1369e;
import com.cmic.sso.sdk.p023e.C1386c;
import com.cmic.sso.sdk.p023e.C1399p;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C1375b extends C1376c {

    /* JADX INFO: renamed from: b */
    private final C1369e f5678b;

    /* JADX INFO: renamed from: c */
    private boolean f5679c;

    public C1375b(String str, C1369e c1369e, String str2, String str3) {
        super(str, c1369e, str2, str3);
        this.f5679c = false;
        this.f5678b = c1369e;
    }

    /* JADX INFO: renamed from: a */
    public void m7220a(C1339a c1339a) {
        String[] strArrM7356a;
        AbstractC1365a abstractC1365aM7194c = this.f5678b.m7194c();
        abstractC1365aM7194c.m7177u(c1339a.m7022b("socketip"));
        C1386c.m7288b("GetPrePhonescripParam", "socket socketip = " + c1339a.m7022b("socketip"));
        if (!this.f5679c) {
            if (c1339a.m7024b("isCloseIpv4", false)) {
                strArrM7356a = null;
            } else {
                strArrM7356a = C1399p.m7356a(true);
                abstractC1365aM7194c.m7173q(strArrM7356a[0]);
            }
            if (!c1339a.m7024b("isCloseIpv6", false)) {
                if (strArrM7356a == null) {
                    strArrM7356a = C1399p.m7356a(true);
                }
                abstractC1365aM7194c.m7174r(strArrM7356a[1]);
            }
            this.f5679c = true;
        }
        abstractC1365aM7194c.m7170n(abstractC1365aM7194c.m7210v(c1339a.m7022b("appkey")));
        this.f5678b.m7189a(abstractC1365aM7194c);
        this.f5678b.m7190a(true);
        this.f5680a = this.f5678b.mo7179b().toString();
    }
}
