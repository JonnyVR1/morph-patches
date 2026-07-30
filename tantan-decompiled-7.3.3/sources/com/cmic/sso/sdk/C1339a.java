package com.cmic.sso.sdk;

import com.cmic.sso.sdk.p015a.C1340a;
import com.cmic.sso.sdk.p022d.C1382a;
import com.cmic.sso.sdk.p023e.C1386c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a */
/* JADX INFO: loaded from: classes.dex */
public class C1339a {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, Object> f5513a;

    public C1339a(int i) {
        this.f5513a = new ConcurrentHashMap<>(i);
    }

    /* JADX INFO: renamed from: a */
    public C1382a m7010a() {
        C1382a c1382a = (C1382a) this.f5513a.get("logBean");
        return c1382a != null ? c1382a : new C1382a();
    }

    /* JADX INFO: renamed from: b */
    public C1340a m7021b() {
        C1340a c1340a = (C1340a) this.f5513a.get("current_config");
        if (c1340a != null) {
            return c1340a;
        }
        C1386c.m7286a("UmcConfigBean为空", "请核查");
        return new C1340a.a().m7054a();
    }

    /* JADX INFO: renamed from: c */
    public int m7025c(String str) {
        return m7019b(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m7018a(String str) {
        if (str != null) {
            return (byte[]) this.f5513a.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m7015a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f5513a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m7016a(String str, boolean z) {
        if (str != null) {
            this.f5513a.put(str, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7013a(String str, int i) {
        if (str != null) {
            this.f5513a.put(str, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7014a(String str, long j) {
        if (str != null) {
            this.f5513a.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7012a(C1382a c1382a) {
        if (c1382a != null) {
            this.f5513a.put("logBean", c1382a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7017a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return;
        }
        this.f5513a.put(str, bArr);
    }

    /* JADX INFO: renamed from: a */
    public void m7011a(C1340a c1340a) {
        if (c1340a != null) {
            this.f5513a.put("current_config", c1340a);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7023b(String str, String str2) {
        return (str == null || !this.f5513a.containsKey(str)) ? str2 : (String) this.f5513a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m7024b(String str, boolean z) {
        return (str == null || !this.f5513a.containsKey(str)) ? z : ((Boolean) this.f5513a.get(str)).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public int m7019b(String str, int i) {
        return (str == null || !this.f5513a.containsKey(str)) ? i : ((Integer) this.f5513a.get(str)).intValue();
    }

    /* JADX INFO: renamed from: b */
    public long m7020b(String str, long j) {
        return (str == null || !this.f5513a.containsKey(str)) ? j : ((Long) this.f5513a.get(str)).longValue();
    }

    /* JADX INFO: renamed from: b */
    public String m7022b(String str) {
        return m7023b(str, "");
    }
}
