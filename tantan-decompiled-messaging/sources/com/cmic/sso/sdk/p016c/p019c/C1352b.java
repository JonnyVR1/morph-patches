package com.cmic.sso.sdk.p016c.p019c;

import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p016c.p018b.AbstractC1342a;
import com.cmic.sso.sdk.p016c.p018b.C1346e;
import com.cmic.sso.sdk.p022e.C1363c;
import com.cmic.sso.sdk.p022e.C1376p;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C1352b extends C1353c {

    /* JADX INFO: renamed from: b */
    private final C1346e f5641b;

    /* JADX INFO: renamed from: c */
    private boolean f5642c;

    public C1352b(String str, C1346e c1346e, String str2, String str3) {
        super(str, c1346e, str2, str3);
        this.f5642c = false;
        this.f5641b = c1346e;
    }

    /* JADX INFO: renamed from: a */
    public void m7166a(C1316a c1316a) {
        String[] strArrM7302a;
        AbstractC1342a abstractC1342aM7140c = this.f5641b.m7140c();
        abstractC1342aM7140c.m7123u(c1316a.m6968b("socketip"));
        C1363c.m7234b("GetPrePhonescripParam", "socket socketip = " + c1316a.m6968b("socketip"));
        if (!this.f5642c) {
            if (c1316a.m6970b("isCloseIpv4", false)) {
                strArrM7302a = null;
            } else {
                strArrM7302a = C1376p.m7302a(true);
                abstractC1342aM7140c.m7119q(strArrM7302a[0]);
            }
            if (!c1316a.m6970b("isCloseIpv6", false)) {
                if (strArrM7302a == null) {
                    strArrM7302a = C1376p.m7302a(true);
                }
                abstractC1342aM7140c.m7120r(strArrM7302a[1]);
            }
            this.f5642c = true;
        }
        abstractC1342aM7140c.m7116n(abstractC1342aM7140c.m7156v(c1316a.m6968b("appkey")));
        this.f5641b.m7135a(abstractC1342aM7140c);
        this.f5641b.m7136a(true);
        this.f5643a = this.f5641b.mo7125b().toString();
    }
}
