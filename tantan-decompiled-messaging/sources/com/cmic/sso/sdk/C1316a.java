package com.cmic.sso.sdk;

import com.cmic.sso.sdk.p014a.C1317a;
import com.cmic.sso.sdk.p021d.C1359a;
import com.cmic.sso.sdk.p022e.C1363c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a */
/* JADX INFO: loaded from: classes.dex */
public class C1316a {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, Object> f5476a;

    public C1316a(int i) {
        this.f5476a = new ConcurrentHashMap<>(i);
    }

    /* JADX INFO: renamed from: a */
    public C1359a m6956a() {
        C1359a c1359a = (C1359a) this.f5476a.get("logBean");
        return c1359a != null ? c1359a : new C1359a();
    }

    /* JADX INFO: renamed from: b */
    public C1317a m6967b() {
        C1317a c1317a = (C1317a) this.f5476a.get("current_config");
        if (c1317a != null) {
            return c1317a;
        }
        C1363c.m7232a("UmcConfigBean为空", "请核查");
        return new C1317a.a().m7000a();
    }

    /* JADX INFO: renamed from: c */
    public int m6971c(String str) {
        return m6965b(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m6964a(String str) {
        if (str != null) {
            return (byte[]) this.f5476a.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m6961a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f5476a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m6962a(String str, boolean z) {
        if (str != null) {
            this.f5476a.put(str, Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6959a(String str, int i) {
        if (str != null) {
            this.f5476a.put(str, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6960a(String str, long j) {
        if (str != null) {
            this.f5476a.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6958a(C1359a c1359a) {
        if (c1359a != null) {
            this.f5476a.put("logBean", c1359a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6963a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return;
        }
        this.f5476a.put(str, bArr);
    }

    /* JADX INFO: renamed from: a */
    public void m6957a(C1317a c1317a) {
        if (c1317a != null) {
            this.f5476a.put("current_config", c1317a);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m6969b(String str, String str2) {
        return (str == null || !this.f5476a.containsKey(str)) ? str2 : (String) this.f5476a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m6970b(String str, boolean z) {
        return (str == null || !this.f5476a.containsKey(str)) ? z : ((Boolean) this.f5476a.get(str)).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public int m6965b(String str, int i) {
        return (str == null || !this.f5476a.containsKey(str)) ? i : ((Integer) this.f5476a.get(str)).intValue();
    }

    /* JADX INFO: renamed from: b */
    public long m6966b(String str, long j) {
        return (str == null || !this.f5476a.containsKey(str)) ? j : ((Long) this.f5476a.get(str)).longValue();
    }

    /* JADX INFO: renamed from: b */
    public String m6968b(String str) {
        return m6969b(str, "");
    }
}
