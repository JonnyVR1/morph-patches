package com.tencent.open.p109a;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.open.a.c */
/* JADX INFO: loaded from: classes2.dex */
class C14515c implements InterfaceC14519g {

    /* JADX INFO: renamed from: a */
    private String f61020a;

    /* JADX INFO: renamed from: b */
    private int f61021b;

    /* JADX INFO: renamed from: c */
    private int f61022c;

    /* JADX INFO: renamed from: d */
    private int f61023d;

    /* JADX INFO: renamed from: e */
    private String f61024e;

    /* JADX INFO: renamed from: f */
    private Map<String, List<String>> f61025f = new HashMap();

    public C14515c(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        Map<String, List<String>> headerFields;
        this.f61020a = str;
        this.f61021b = i;
        this.f61022c = i2;
        this.f61023d = i3;
        this.f61024e = str2;
        if (httpURLConnection == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return;
        }
        this.f61025f.putAll(headerFields);
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: a */
    public String mo85404a() {
        return this.f61020a;
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: b */
    public int mo85405b() {
        return this.f61021b;
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: c */
    public int mo85406c() {
        return this.f61022c;
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: d */
    public int mo85407d() {
        return this.f61023d;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + "\ncontent = [" + this.f61020a + "]\nresponseSize = " + this.f61021b + "\nrequestSize = " + this.f61022c + "\nresultCode = " + this.f61023d + "\nerrorMsg = " + this.f61024e;
    }
}
