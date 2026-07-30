package com.tencent.open.p104a;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.open.a.c */
/* JADX INFO: loaded from: classes2.dex */
class C14352c implements InterfaceC14356g {

    /* JADX INFO: renamed from: a */
    private String f60172a;

    /* JADX INFO: renamed from: b */
    private int f60173b;

    /* JADX INFO: renamed from: c */
    private int f60174c;

    /* JADX INFO: renamed from: d */
    private int f60175d;

    /* JADX INFO: renamed from: e */
    private String f60176e;

    /* JADX INFO: renamed from: f */
    private Map<String, List<String>> f60177f = new HashMap();

    public C14352c(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        Map<String, List<String>> headerFields;
        this.f60172a = str;
        this.f60173b = i;
        this.f60174c = i2;
        this.f60175d = i3;
        this.f60176e = str2;
        if (httpURLConnection == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return;
        }
        this.f60177f.putAll(headerFields);
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: a */
    public String mo84221a() {
        return this.f60172a;
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: b */
    public int mo84222b() {
        return this.f60173b;
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: c */
    public int mo84223c() {
        return this.f60174c;
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: d */
    public int mo84224d() {
        return this.f60175d;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + "\ncontent = [" + this.f60172a + "]\nresponseSize = " + this.f60173b + "\nrequestSize = " + this.f60174c + "\nresultCode = " + this.f60175d + "\nerrorMsg = " + this.f60176e;
    }
}
