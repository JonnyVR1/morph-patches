package com.cmic.sso.sdk.p017c.p020c;

import android.net.Network;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p017c.p019b.AbstractC1371g;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1376c {

    /* JADX INFO: renamed from: a */
    String f5680a;

    /* JADX INFO: renamed from: b */
    private final String f5681b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f5682c;

    /* JADX INFO: renamed from: d */
    private final String f5683d;

    /* JADX INFO: renamed from: e */
    private boolean f5684e;

    /* JADX INFO: renamed from: f */
    private final String f5685f;

    /* JADX INFO: renamed from: g */
    private Network f5686g;

    /* JADX INFO: renamed from: h */
    private long f5687h;

    /* JADX INFO: renamed from: i */
    private final String f5688i;

    /* JADX INFO: renamed from: j */
    private int f5689j;

    /* JADX INFO: renamed from: k */
    private final AbstractC1371g f5690k;

    private C1376c(String str, Map<String, String> map, AbstractC1371g abstractC1371g, String str2, String str3) {
        this.f5684e = false;
        this.f5681b = str;
        this.f5690k = abstractC1371g;
        this.f5682c = map == null ? new HashMap<>() : map;
        this.f5680a = abstractC1371g == null ? "" : abstractC1371g.mo7179b().toString();
        this.f5683d = str2;
        this.f5685f = str3;
        this.f5688i = abstractC1371g != null ? abstractC1371g.mo7156a() : "";
        m7221k();
    }

    /* JADX INFO: renamed from: k */
    private void m7221k() {
        this.f5682c.put("sdkVersion", AuthnHelper.SDK_VERSION);
        this.f5682c.put("Content-Type", "application/json");
        this.f5682c.put("CMCC-EncryptType", "STD");
        this.f5682c.put("traceId", this.f5685f);
        this.f5682c.put("appid", this.f5688i);
        this.f5682c.put("connection", HttpHeaders.KEEP_ALIVE);
    }

    /* JADX INFO: renamed from: a */
    public void m7225a(String str, String str2) {
        this.f5682c.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m7227b() {
        return this.f5684e;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m7228c() {
        return this.f5682c;
    }

    /* JADX INFO: renamed from: d */
    public String m7229d() {
        return this.f5680a;
    }

    /* JADX INFO: renamed from: e */
    public String m7230e() {
        return this.f5683d;
    }

    /* JADX INFO: renamed from: f */
    public String m7231f() {
        return this.f5685f;
    }

    /* JADX INFO: renamed from: g */
    public Network m7232g() {
        return this.f5686g;
    }

    /* JADX INFO: renamed from: h */
    public long m7233h() {
        return this.f5687h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m7234i() {
        int i = this.f5689j;
        this.f5689j = i + 1;
        return i < 2;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC1371g m7235j() {
        return this.f5690k;
    }

    /* JADX INFO: renamed from: a */
    public String m7222a() {
        return this.f5681b;
    }

    /* JADX INFO: renamed from: a */
    public void m7226a(boolean z) {
        this.f5684e = z;
    }

    /* JADX INFO: renamed from: a */
    public void m7224a(Network network) {
        this.f5686g = network;
    }

    /* JADX INFO: renamed from: a */
    public void m7223a(long j) {
        this.f5687h = j;
    }

    public C1376c(String str, AbstractC1371g abstractC1371g, String str2, String str3) {
        this(str, null, abstractC1371g, str2, str3);
    }
}
