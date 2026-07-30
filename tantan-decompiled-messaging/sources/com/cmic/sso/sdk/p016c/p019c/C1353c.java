package com.cmic.sso.sdk.p016c.p019c;

import android.net.Network;
import com.cmic.sso.sdk.auth.AuthnHelper;
import com.cmic.sso.sdk.p016c.p018b.AbstractC1348g;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1353c {

    /* JADX INFO: renamed from: a */
    String f5643a;

    /* JADX INFO: renamed from: b */
    private final String f5644b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f5645c;

    /* JADX INFO: renamed from: d */
    private final String f5646d;

    /* JADX INFO: renamed from: e */
    private boolean f5647e;

    /* JADX INFO: renamed from: f */
    private final String f5648f;

    /* JADX INFO: renamed from: g */
    private Network f5649g;

    /* JADX INFO: renamed from: h */
    private long f5650h;

    /* JADX INFO: renamed from: i */
    private final String f5651i;

    /* JADX INFO: renamed from: j */
    private int f5652j;

    /* JADX INFO: renamed from: k */
    private final AbstractC1348g f5653k;

    private C1353c(String str, Map<String, String> map, AbstractC1348g abstractC1348g, String str2, String str3) {
        this.f5647e = false;
        this.f5644b = str;
        this.f5653k = abstractC1348g;
        this.f5645c = map == null ? new HashMap<>() : map;
        this.f5643a = abstractC1348g == null ? "" : abstractC1348g.mo7125b().toString();
        this.f5646d = str2;
        this.f5648f = str3;
        this.f5651i = abstractC1348g != null ? abstractC1348g.mo7102a() : "";
        m7167k();
    }

    /* JADX INFO: renamed from: k */
    private void m7167k() {
        this.f5645c.put("sdkVersion", AuthnHelper.SDK_VERSION);
        this.f5645c.put("Content-Type", "application/json");
        this.f5645c.put("CMCC-EncryptType", "STD");
        this.f5645c.put("traceId", this.f5648f);
        this.f5645c.put("appid", this.f5651i);
        this.f5645c.put("connection", HttpHeaders.KEEP_ALIVE);
    }

    /* JADX INFO: renamed from: a */
    public void m7171a(String str, String str2) {
        this.f5645c.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m7173b() {
        return this.f5647e;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m7174c() {
        return this.f5645c;
    }

    /* JADX INFO: renamed from: d */
    public String m7175d() {
        return this.f5643a;
    }

    /* JADX INFO: renamed from: e */
    public String m7176e() {
        return this.f5646d;
    }

    /* JADX INFO: renamed from: f */
    public String m7177f() {
        return this.f5648f;
    }

    /* JADX INFO: renamed from: g */
    public Network m7178g() {
        return this.f5649g;
    }

    /* JADX INFO: renamed from: h */
    public long m7179h() {
        return this.f5650h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m7180i() {
        int i = this.f5652j;
        this.f5652j = i + 1;
        return i < 2;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC1348g m7181j() {
        return this.f5653k;
    }

    /* JADX INFO: renamed from: a */
    public String m7168a() {
        return this.f5644b;
    }

    /* JADX INFO: renamed from: a */
    public void m7172a(boolean z) {
        this.f5647e = z;
    }

    /* JADX INFO: renamed from: a */
    public void m7170a(Network network) {
        this.f5649g = network;
    }

    /* JADX INFO: renamed from: a */
    public void m7169a(long j) {
        this.f5650h = j;
    }

    public C1353c(String str, AbstractC1348g abstractC1348g, String str2, String str3) {
        this(str, null, abstractC1348g, str2, str3);
    }
}
